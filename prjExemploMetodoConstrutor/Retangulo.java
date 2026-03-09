public class Retangulo 
{
    private double altura;
    private double base;
    private String unidadeMedida;
    
    public void setAltura(double a)
    {
        altura = a;
    }
    
    public double getAltura()
    {
        return altura;
    }
    
    public void setBase(double b)
    {
        base = b;
    }
    
     public double getBase()
    {
        return base;
    }
    
    public double calcArea()
    {
        return (altura * base);
    }
    
    public double calcPerimetro()
    {
       
        return ((altura * 2) + (base * 2));
    }
    
    public double calcDiagonal()
    {
        return (Math.sqrt(Math.pow(altura, 2) + (Math.pow(base, 2))));
    }
    
    // metodo construtor tem o mesmo nome da classe. SEM VOID
    public Retangulo(String uniMed)
    {
        unidadeMedida = uniMed;
    }
    
    public String getUnidade ()
    {
        return unidadeMedida;
    }
    }
  
