public class Proccess {
    
    public Proccess () {};

    public static void main (String[] args) {

        float x = 10.0f;

        float y = 1.0f;

        float registerValues = (x + y) / 2;

        System.out.println(registerValues);

        multiplication(args);

    };

    public static void multiplication (String[] args) {

        float w = 20.0f;

        float z = 2.0f;

        float registerNewValues = (w * z) - w;

        System.out.println(registerNewValues);

    };

}
