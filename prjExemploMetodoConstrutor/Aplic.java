import java.util.Scanner;


public class Aplic 
{

    public static void main(String[] args) 
    {
       Scanner entrada = new Scanner(System.in);
        double medAlt, medBase;
        int opcao;
        String unidade;
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        
        System.out.print("Digite a medida da Altura: ");
        medAlt = entrada.nextDouble();
        
        System.out.print("Digite a medida da Base: ");
        medBase = entrada.nextDouble();
        
        
        Retangulo objRet = new Retangulo(unidade);
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        
        OUTER:
        do {
            System.out.println("\n\n1- Consultar Area\n2- Consultar Perimetro\n3- Consultar Diagonal\n4 - Sair");
            System.out.print("\nDigite a opcao = ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 4:
                    break OUTER;
                case 1:
                    System.out.println("Area do Retangulo = " + objRet.calcArea() + " " + objRet.getUnidade() + "²");
                    break;
                case 2:
                    System.out.println("Perimetro do Retangulo = " + objRet.calcPerimetro() + " " + objRet.getUnidade());
                    break;
                case 3:
                    System.out.println("Diagonal do Retangulo = " + objRet.calcDiagonal() + " " + objRet.getUnidade());
                    break;
            }
        }
            while (opcao < 4);
        }
    }