package src.baldFlakes2;
import java.util.Locale;

public class Proccess {
    
    public Proccess () {};

    public static void main (String[] args) {

        float x = 10.0f;

        float y = 1.0f;

        float registerValues = (x + y) / 2;

        System.out.println(registerValues);

       // multiplication(args);

        floatNumber(args);

    };

    public static void floatNumber (String[] args) {

        double randomValue = 10.7845784;

        System.out.printf("%.2f", randomValue); // Considera apenas 2 casas decimais

        System.out.printf("%.3f", randomValue); // Considera apenas 3 casas decimais

        Locale.setDefault(Locale.UK);

    };

    public static void multiplication (String[] args) {

        float w = 20.0f;

        float z = 2.0f;

        float registerNewValues = (w * z) - w;

        System.out.println(registerNewValues);

    };

}
