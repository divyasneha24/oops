public class Simpleinheritance {
private
int pri=10;
public
int pub=11;
protected
int pro=12;
public
int getpri(){
return pri;
}
}
class subclass extends Simpleinheritance{
int var1=getpri();
}
class test{
public static void main(String[] args) {
subclass x = new subclass();
System.out.println(x.pub);
System.out.println(x.pro);
System.out.println(x.var1);
}
}
