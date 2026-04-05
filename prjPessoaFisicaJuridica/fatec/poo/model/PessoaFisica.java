
package fatec.poo.model;

public class PessoaFisica extends Pessoa {
    
    private String cpf;
    private double base;
    
    public PessoaFisica(String cpf, String nome, int anoInscricao)
    {
        super(nome, anoInscricao);
        this.cpf = cpf;
    }
    
    public double calcBonus(int anoAtual)
    {
        if (super.getTotalCompras() > 12000)
        {
            return ((anoAtual - super.getAnoInscricao()) * base);
        }
        else
            return (0);
    }
    
    public void setBase(double base)
    {
        this.base = base;
    }

    public String getCpf() {
        return cpf;
    }

    public double getBase() {
        return base;
    }
    
    
}
