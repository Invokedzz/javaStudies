package src.baldFlakes;


public class Start {

    public Start () {}
  
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        System.out.println("Hello, IntelliJ");

        receiveValues(args);

    }

    public static void receiveValues (String[] args) {

        int x, y;

        x = 10;

        y = 30;

        int addValues = x * y;

        System.out.println(addValues);

    }

}
