import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Java5_9 {

    public static void main(String[] args) {

        try
        {
            File file = new File("/tmp/employee/Naman1.txt");

            FileOutputStream fileOutputStream = new FileOutputStream(file);

            PrintStream printStream = new PrintStream(fileOutputStream);

            printStream.println("Hello");

            printStream.println("3032");

            printStream.close();
            printStream.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}