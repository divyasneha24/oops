class Student {
private
double semper = 8.09;
void stdsem(){
System.out.println("My percentage is "+semper+" (private).");
}
protected
int num = 64;
void stdnum(){
System.out.println("My num is "+num+"(protected)");
}
public
String name = "Divya";
void studname(){
System.out.println("My name is "+name+" (public).");
}
double getPVT()
{
System.out.println("My percentage is "+semper+" (private).");
return semper;
}
}
class details extends Student {
public
int getProt() {
System.out.println("My num is "+num+" (protected).");
return num;
}
}
public class ppp {
public static void main(String args[])
{
details object = new details();
object.studname();
object.getProt();
object.stdsem();
}
}
