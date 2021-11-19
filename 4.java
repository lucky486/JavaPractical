import java.util.Scanner;

abstract class Shape {
    double x, y;

    abstract void compute_area();
}

class Triangle extends Shape {
    void set_data(double x ,double y)
    {
        this.x = x;
        this.y = y;
    }

    void compute_area() {
        double area;
        area = 0.5 * x * y;
        System.out.println("The area of Triangle with base "+ x +" and " + "height "+ y+ " is : " + area);
        
    }
}

class Rectangle extends Shape {
    void set_data(double x, double y) {
        this.x = x;
        this.y = y;
    }
    void compute_area(){
        double area;
        area = x*y;
        System.out.println("The area of Triangle with length "+ x +" and " + "breadth "+ y+ " is : " + area);
    }
}

public class program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of triangle :     ");
        float b = input.nextFloat();
        System.out.print("Enter the height of triangle :   ");
        float h = input.nextFloat();
        Triangle T = new Triangle();
        T.set_data(b,h);
        T.compute_area();


        System.out.print("Enter the lenght of rectangle :  ");
        float len = input.nextFloat();
        System.out.print("Enter the breadth of rectangle : ");
        float bred = input.nextFloat();
        Rectangle R = new Rectangle();
        R.set_data(len,bred);
        R.compute_area();

        input.close();
    }
}


/*
Output :
Enter the base of triangle :     5
Enter the height of triangle :   9
The area of Triangle with base 5.0 and height 9.0 is : 22.5
Enter the lenght of rectangle :  7
Enter the breadth of rectangle : 9
The area of Triangle with length 7.0 and breadth 9.0 is : 63.0
*/
