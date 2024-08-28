import java.util.Scanner;
abstract class Shape {

}
class Triangle extends Shape{
    int a,b,e;
    Triangle(int a,int b){
        this.a=a;
        this.b=b;
    }
    void area(){
        System.out.println("Area of Triangle is:"+(0.5*a*b));
    }
}
class Rectangle extends Shape{
    int a,b,e;
    Rectangle(int a,int b){
        this.a=a;
        this.b=b;
    }
    void area(){
        System.out.println("Area of rectangle is:"+(a*b));
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height of Triangle:");
        int height = sc.nextInt();
        System.out.print("Enter Base of Triangle:");
        int base = sc.nextInt();
        Triangle a=new Triangle(height,base);
        a.area();
        System.out.print("Enter Length of Rectangle:");
        int length = sc.nextInt();
        System.out.print("Enter width of Rectangle:");
        int width = sc.nextInt();
        Rectangle b = new Rectangle(length,width);
        a.area();
        b.area();
    }
}
