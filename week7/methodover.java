class Addition {
void add(int a,int b)
{
System.out.println(a+b);
}
}
class Sum extends Addition{
void add(int a,int b,int c)
{
System.out.println(a+b+c);
}
}
public class MethodOlInheri
{
public static void main(String[] args)
{
Sum obj = new Sum();
obj.add(2,4);
obj.add(3,6,9);
}
}
