//Percentage of marks
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter obtained marks: ");
        double obtained = sc.nextDouble();

        System.out.print("Enter maximum marks: ");
        double maximum = sc.nextDouble();

        double percentage = (obtained / maximum) * 100;
        System.out.println("Percentage = " + percentage + "%");
    }
}


// Area and circumference of a circle 
import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}


//Orignal proce from discounted selling price
import java.util.Scanner;

public class DiscountedPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original price: ");
        double originalPrice = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        double discountedPrice = originalPrice - (originalPrice * discount / 100);
        System.out.println("Discounted Selling Price = " + discountedPrice);
    }
}


//Power calculation
import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter voltage (V): ");
        double voltage = sc.nextDouble();

        System.out.print("Enter current (A): ");
        double current = sc.nextDouble();

        double power = voltage * current;
        System.out.println("Power = " + power + " Watts");
    }
}


// Areaa of trapezium 
import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first parallel side (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second parallel side (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter height (h): ");
        double h = sc.nextDouble();

        double area = h * (a + b) / 2;
        System.out.println("Area of Trapezoid = " + area);
    }
}


//Even or odd
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}


// Area of triangle using Hero's formula
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of Triangle = " + area);
    }
}