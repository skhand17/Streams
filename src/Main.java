import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        Consumer<Integer> loggingObject = (integer ->  {
            if (integer > 10) {
                System.out.println("logging");
            }
        });

        loggingObject.accept(11);


        Function<Integer, String> function = ((Integer num) -> {

            String output = Integer.toString(num);
            return output;
        });

         String output = function.apply(10);
        System.out.println(output);
    }
}