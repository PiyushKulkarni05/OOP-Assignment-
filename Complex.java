import java.util.Scanner;
class Complex{
float real,img;
Complex(float a,float b){
real=a;
img=b;
}
static void add(Complex c1,Complex c2){
float real = c1.real + c2.real;
float img = c1.img + c2.img;
System.out.println("The addition of two complex eqn is:"+real+"+"+img+"i");
}
static void sub(Complex c1,Complex c2){
float real = c1.real - c2.real;
float img = c1.img - c2.img;
System.out.println("The Substraction of two complex eqn is:"+real+"+"+img+"i");
}
static void Mult(Complex c1,Complex c2){
float real = (c1.real*c2.real)-(c1.img*c2.img);
float img = (c1.real*c2.img)+(c1.img*c2.real);
System.out.println("The Multiplication of two complex eqn is:"+real+"+"+img+"i");
}
static void div(Complex c1,Complex c2){
float denom = (c2.real*c2.real+c2.img*c2.img);
float real = ((c1.real*c2.real)-(c1.img*c2.img))/denom;
float img = ((c1.real*c2.img)+(c1.img*c2.real))/denom;
System.out.println("The Division of two complex eqn is:"+real+"+"+img+"i");
}
public static void main (String arg[]){
System.out.println("Welcome...\nEnter data as follows:");
System.out.print("Enter first real no.:");
Scanner p = new Scanner(System.in);
int a = p.nextInt();
System.out.print("Enter first imaginary no.:");
Scanner q = new Scanner(System.in);
int b = q.nextInt();
System.out.print("Enter second real no.:");
Scanner r = new Scanner(System.in);
int c = r.nextInt();
System.out.print("Enter second imaginary no.:");
Scanner s = new Scanner(System.in);
int d = s.nextInt();
Complex first = new Complex(a,b);
Complex second = new Complex(c,d);
int i = 0;
do{System.out.println("***********************");
System.out.println("Which operation you want to perform:\n1)Addition\n2)Substraction\n3)Multiplication\n4)Division");
System.out.print("Enter no.(1/2/3/4):");
Scanner t = new Scanner(System.in);
int option = t.nextInt();
switch (option){
case 1:
add(first,second);
break;
case 2:
sub(first,second);
break;
case 3:
Mult(first,second);
break;
case 4:
div(first,second);
break;
}
}while(i!=6);
}
}
