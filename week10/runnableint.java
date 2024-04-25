public class runnableint implements Runnable{
    String name;
    runnableint(String name){
        this.name=name;
    }
    public void run(){
        System.out.println("threadname "+name);
    }
    public static void main(String[] args) {
        runnableint obj=new runnableint("T1");
        runnableint obj1=new runnableint("T2");
    obj.run();
    obj1.run();
}
}
