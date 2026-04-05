import fatec.poo.model.Pessoa;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Aplic {


    public static void main(String[] args) 
    {
       String Cpf, Cgc, nomePesFis, nomePesJud;
       int anoAt, anoInsPesFis, anoInsPesJud, opcao, opcaoComp;
       double taxaInc, base, compras;
       DecimalFormat objDF = new DecimalFormat("#,##0.00");
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Digite o Ano Atual: ");
       anoAt = entrada.nextInt();
       entrada.nextLine();
       
       System.out.println("Digite o nome da Pessoa Fisica: ");
       nomePesFis = entrada.nextLine();
       System.out.println("Digite o CPF da Pessoa Fisica: ");
       Cpf = entrada.nextLine();
       System.out.println("Digite o ano de Inscricao da Pessoa Fisica: ");
       anoInsPesFis = entrada.nextInt();
       System.out.println("Digite a base do bonus da Pessoa Fisica: ");
       base = entrada.nextDouble();
       PessoaFisica objPf = new PessoaFisica(Cpf, nomePesFis, anoInsPesFis);
       objPf.setBase(base);
       
       System.out.println("Digite o nome da Pessoa Juridica: ");
       entrada.nextLine();
       nomePesJud = entrada.nextLine();
       System.out.println("Digite o CGC da Pessoa Juridica: ");
       Cgc = entrada.nextLine();
       System.out.println("Digite o ano de Inscricao da Pessoa Juridica: ");
       anoInsPesJud = entrada.nextInt();
       System.out.println("Digite a taxa de Incentivo da Pessoa Juridica: ");
       taxaInc = entrada.nextDouble();
       PessoaJuridica objPJ = new PessoaJuridica(Cgc, nomePesJud, anoInsPesJud);
       objPJ.setTaxaIncentivo(taxaInc);
       
       do {
           System.out.println("----------------------------------");
           System.out.println("\n1 - Consultar Dados da Pessoa Fisica\n2- Consultar Dados da Pessoa Juridica\n3- Adicionar Compras\n4- Sair");
           opcao = entrada.nextInt();
       switch(opcao) {
           case 1:
       System.out.println("\n\nNome da Pessoa Fisica: " + objPf.getNome());
       System.out.println("CPF da Pessoa Fisica: " + objPf.getCpf());
       System.out.println("Ano de Inscricao da Pessoa Fisica: " + objPf.getAnoInscricao());
       System.out.println("CPF da Pessoa Fisica: " + objPf.getCpf());
       System.out.println("Bonus da Pessoa Fisica: " + objDF.format(objPf.calcBonus(anoAt)));
       System.out.println("Total de Compras da Pessoa Fisica: " + objDF.format(objPf.getTotalCompras()));
        break;
        
           case 2:
               System.out.println("Nome da Pessoa Juridica: " + objPJ.getNome());
               System.out.println("CGC da Pessoa Juridica: " + objPJ.getCgc());
               System.out.println("Ano de Inscricao da Pessoa Juridica: " + objPJ.getAnoInscricao());
               System.out.println("Taxa de Incentivo da Pessoa Juridica: " + objDF.format(objPJ.getTaxaIncentivo()));
               System.out.println("Total de Compras da Pessoa Juridica: " + objPJ.getTotalCompras());
               break;
               
           case 3:
               System.out.println("Deseja adicionar compras à qual pessoa? (1 - Fisica/ 2 - Juridica)");
               entrada.nextLine();
               opcaoComp = entrada.nextInt();
               if (opcaoComp == 1)
               {
                   System.out.println("Digite o valor a adicionar: ");
                   compras = entrada.nextDouble();
                   objPJ.addCompras(compras);
               }
               else
               {
                   System.out.println("Digite o valor a adicionar: ");
                   compras = entrada.nextDouble();
                   objPf.addCompras(compras);
               }
               
           case 4:
               break;
       }
       }
       while (opcao < 4);
    }
    
    
    
}
