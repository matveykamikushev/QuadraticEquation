import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Квадратные уравнения");
        System.out.println("Введи коэффициенты a b c");
        System.out.println("a = ...");
        Scanner a = new Scanner(System.in);
        Double a1 = a.nextDouble();
        System.out.println("b = ...");
        Scanner b = new Scanner(System.in);
        Double b1 = b.nextDouble();
        System.out.println("c = ...");
        Scanner c = new Scanner(System.in);
        Double c1 = c.nextDouble();
        double d = b1*b1-4*a1*c1;
        double x1 = (-b1+Math.sqrt(d))/(2*a1);
        double x2 = (-b1-Math.sqrt(d))/(2*a1);
        System.out.println("Первый корень = " + x1 + " Второй корень = " + x2);
    }
}
