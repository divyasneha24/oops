class addition{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
}
class methodover{
public static void main (String[] args){
    System.out.println(addition.add(20,10));
    System.out.println(addition.add(10,20,30));
}
}
