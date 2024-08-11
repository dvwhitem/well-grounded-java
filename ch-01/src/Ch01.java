import java.util.function.Function;

public class Ch01 {
    public static void main(String[] args) {

        Function<String, Integer> fnString = String::length;

        //var n = null;
        var n = "";

        System.out.println("Fn: " + String.format(n));
    }
}