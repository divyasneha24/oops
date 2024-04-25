public class ThreadDemo extends Thread{
    String name;
    ThreadDemo(String name){
        this.name=name;
    }
    public void run(){
        System.out.println("hello "+name);
    }
    public static void main(String[] args) {
        ThreadDemo t2=new ThreadDemo("Thread1");
        ThreadDemo t3=new ThreadDemo("oops");
        t2.start();
        t3.start();
    }
}
