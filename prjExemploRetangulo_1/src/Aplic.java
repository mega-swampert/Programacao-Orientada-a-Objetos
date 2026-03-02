

public class Aplic {

    
    public static void main(String[] args) 
    {
       Retangulo objRet;
       objRet = new Retangulo();
       
       objRet.setAltura(5.0);
       objRet.setBase(8.0);
       
       System.out.println("Medida da Altura do retangulo: " + objRet.getAltura());
       System.out.println("Medida do Perimetro do retangulo: " + objRet.getBase());
       System.out.println("Medida da Area do retangulo: " + objRet.calcArea());
       System.out.println("Medida do Perimetro do retangulo: " + objRet.calcPerimetro());
       System.out.println("Medida da Diagonal do retangulo: " + objRet.calcDiagonal());
    }
    
}
