import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int r;
        double pi =3.14;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the r of circle :");
        r = input.nextInt();
        double perimeter = 2 * pi * r;
        double area = pi * r * r;
        System.out.println("Circle perimeter: " + perimeter);
        System.out.println("Circle area: " + area);
    }
}
