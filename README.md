package areas;
import java.util.Scanner;

public class Areas {


    public static void main(String[] args) {
        double opc = leer();
        if (opc ==1)
        {
          double a,b,c;
          mensaje("primer");
          a = leer();
          mensaje("segundo");
        
        }
        
        
        
        
        
        
    }
 public static void menu()
 {
 System.out.println("1.-Área de un Cuadrado ");
 System.out.println("2.-Área de un Réctangulo ");
 System.out.println("3.-Área de un Triángulo ");
 System.out.println("4.-Área de un Circulo ");
 
 }
 public static double leer()
 {
 Scanner sc = new Scanner(System.in);
 double valor;
 valor = sc.nextDouble();
 return (valor);
 }       
 public static void mensaje (String cadena)
 {
 System.out.println("Introduce el "+ cadena+"valor");
 }         
 public static double cuadrado(double x, double y)
 {
 double r;
 r = x * y;
 return(r);
 }
     public static double rectangulo(double x, double y)
 {
 double r;
 r = x * y;
 return(r);
 }
    public static double triangulo(double x, double y)
 {
 double r;
 r = x * y /2;
 return(r);
 }
    public static double circulo(double x)
 {
 double r;
 r = 3.1416 * x*x;
 return(r);
 }
  
   public static void resultado (double x, double y,double res)
   {
   System.out.println("El resultado del area es de:"+ x + y + res );
   
   }
}
