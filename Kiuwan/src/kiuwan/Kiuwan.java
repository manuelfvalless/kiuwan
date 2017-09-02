package kiuwan;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Kiuwan {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int areaCuadrado;
        System.out.println("Intruduzca lado del cuadrado: ");
        areaCuadrado= sc.nextInt();
        Cuadrado cuadrado = new Cuadrado(areaCuadrado);
        cuadrado.area();
        System.out.println("Área del cuadrado de lado "+areaCuadrado+" es: "+cuadrado.getareaCuadrado());
        
        
        int radioCirculo;
        System.out.println("Intruduzca radio del circulo: ");
        radioCirculo= sc.nextInt();
        Circulo circulo = new Circulo(radioCirculo);
        circulo.area();
        System.out.println("Área del círculo de radio "+radioCirculo+" es: "+circulo.getAreaRadio());
        
        
        int baserectangulo = 0, alturarectangulo = 0;
        System.out.println("Introduzca base del rectángulo");
        baserectangulo=sc.nextInt();
        System.out.println("Introduzca altura del rectángulo");
        alturarectangulo=sc.nextInt();
        Rectangulo rectangulo = new Rectangulo(baserectangulo, alturarectangulo);
        rectangulo.area();
        System.out.println("Área del rectángulo de base "+baserectangulo+" y altura "+alturarectangulo+" es: "+rectangulo.getAreaRectangulo());

        int basetriangulo = 0, alturatriangulo = 0;
        System.out.println("Introduzca base del triángulo");
        basetriangulo=sc.nextInt();
        System.out.println("Introduzca altura del triángulo");
        alturatriangulo=sc.nextInt();
        Triangulo triangulo = new Triangulo(30, 60);
        triangulo.area();
        System.out.println("Área del triángulo de base "+basetriangulo+" y altura"+alturatriangulo+" es: "+triangulo.getareaTriangulo());
    }
}

