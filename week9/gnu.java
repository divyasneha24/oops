import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
class CopyCommand
{

    public static void main(String[] args)
    {
        FileInputStream Input;
        FileOutputStream Output;
    try
    {
        Input = new FileInputStream("source");
        Output = new FileOutputStream("destination");
        while(Input.available()>0)
        {
            Output.write(Input.read());
        }
    }
    catch(FileNotFoundException obj)
    {
        System.out.println("Invalid");
    }   
    catch(IOException obj)
    {
        System.out.println("IO error");
    }
}
}
