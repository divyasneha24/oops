class ClassA
{
public
void aClass()
{
System.out.println("Class A");
}
}
class ClassB
{
public
void bClass()
{
System.out.println("Class B");
}
}
//Simple Inheritance
class ClassD extends ClassA
{
public
void dClass()
{
System.out.println("Class D");
}
}
//Multi-Level Inheritance
class ClassF extends ClassD
{
public
void fClass()
{
System.out.println("Class F");
}
}
//Hierarichal Inheritance
class ClassG extends ClassA
{
public
void gClass()
{
System.out.println("Class G");
}
}
class ClassH extends ClassA
{
public
void hClass()
{
System.out.println("Class H");
}
}
public class TOH{
public static void main(String args[])
{
//Simple Inheritance
System.out.println("Simple Inheritance");
ClassD obj1 = new ClassD();
obj1.aClass();
obj1.dClass();
//Multi-Level Inheritance
System.out.println("Multi-Level Inheritance");
ClassF obj3 = new ClassF();
obj3.aClass();
obj3.dClass();
obj3.fClass();
//Hierarichal Inheritance
System.out.println("Hierarichal Inheritance");
ClassG obj4 = new ClassG();
ClassH obj5 = new ClassH();
obj4.aClass();
obj4.gClass();
obj5.aClass();
obj5.hClass();
}
}
