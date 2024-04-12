class Immutable{
private final String a="divya sneha";
Immutable(String a){
}
void display(){
System.out.println("Name : "+a);
}
}
public class MutableAndImmutable {
public static void main(String[] args) {
//Mutable Object
StringBuilder obj=new StringBuilder("sneha");
obj.append(" ");
obj.append("divya");
String a=obj.toString();
System.out.println("The final modified string : "+a);
//Immutable object
Immutable obj1=new Immutable("hello");
obj1.display();
}
}
