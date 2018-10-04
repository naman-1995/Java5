import java.util.function.Consumer;

public class Java5_2Consumer
{

    public static void main(String[] args) {

        Consumer<String> consumer1 = (arg)->
        {
            System.out.println(arg + "OK");
        };

        consumer1.accept("Consumer Accept - ");
    }
}