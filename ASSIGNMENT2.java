import java.util.Scanner;
class Employee{

String name,mail,address;
long mobileno;
int id;
double bp;

void info(){
Scanner sc = new Scanner (System.in);
System.out.print("Enter your name :");
name = sc.nextLine();
System.out.print("Enter your ID :");
id = sc.nextInt();
System.out.print("Enter your Mobile no :");
mobileno = sc.nextLong();
System.out.print("Enter your MAIL ID :");
mail = sc.next();
System.out.print("Enter your Address :");
address = sc.next();
System.out.print("Enter your basic salary:");
bp = sc.nextInt();
}
void display(){
System.out.println("*********************\nCheck your info-\nName-"+name+"\nId-"+id+"\nMobile no.:"+mobileno+"\nAddress:"+address+"\nMAil id-"+mail+"\n*********************\n");
}
}
class Programmer extends Employee{
double da,hra,pf,clubfee;
double GS=0,NS=0;
void programmer(){
da = (0.97*bp);
hra = (0.10*bp);
pf = (0.12*bp);
clubfee = (0.001*bp);
GS = bp + da + hra;
NS = GS - (pf + clubfee);
System.out.println("The gross salary is:"+GS+"\nThe Net salary is " + NS);
}
}
class Teamlead extends Employee{
double da,hra,pf,clubfee;
double GS=0,NS=0;
void teamlead(){
da = (0.97*bp);
hra = (0.10*bp);
pf = (0.12*bp);
clubfee = (0.001*bp);
GS = bp + da + hra;
NS = GS - (pf + clubfee);
System.out.println("The gross salary is:"+GS+"\nThe Net salary is " + NS);
}
}

class ASSIPROMANAGER extends Employee{
double da,hra,pf,clubfee;
double GS=0,NS=0;
void assipromanager(){
da = (0.97*bp);
hra = (0.10*bp);
pf = (0.12*bp);
clubfee = (0.001*bp);
GS = bp + da + hra;
NS = GS - (pf + clubfee);
System.out.println("The gross salary is:"+GS+"\nThe Net salary is " + NS);
}
}

class PROMANAGER extends Employee{
double da,hra,pf,clubfee;
double GS=0,NS=0;
void promanager(){
da = (0.97*bp);
hra = (0.10*bp);
pf = (0.12*bp);
clubfee = (0.001*bp);
GS = bp + da + hra;
NS = GS - (pf + clubfee);
System.out.println("The gross salary is:"+GS+"\nThe Net salary is " + NS);
}
}
public class ASSIGNMENT2{
public static void main(String arg[]){
int i = 1;
do{Scanner a = new Scanner (System.in);
System.out.print("-------------------\nWelcome.....\nCheck your salary by basic pay ...\n1)Programmer\n2)Team Leader \n3)Assistant project manager \n4)Project manager\nEnter no:");
int choice = a.nextInt();
switch (choice){
case 1:
Programmer P1 = new Programmer();
P1.info();
P1.display();
P1.programmer();
break;
case 2:
Teamlead P2 = new Teamlead();
P2.info();
P2.display();
P2.teamlead();
break;
case 3:
ASSIPROMANAGER P3 = new ASSIPROMANAGER();
P3.info();
P3.display();
P3.assipromanager();
break;
case 4:
PROMANAGER P4 = new PROMANAGER();
P4.info();
P4.display();
P4.promanager();
break;
}
}while(i!=6);
}
}











