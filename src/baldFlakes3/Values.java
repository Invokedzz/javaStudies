package src.baldFlakes3;
public class Values {
    
    public static void main (String[] args) {

        String firstName = "Michael";

        String lastName = "Jackson";

        System.out.printf("His name is: %s %s", firstName, lastName); 
        
        receiveInfo(args);

    };

    public static void receiveInfo (String[] args) {

        String personName = "Michael Jackson";

        int personAge = 50;
        
        Float moneyReceived = 100.0f;

        System.out.printf("His name is: %s, and his age is: %d, and his money is: %.2f", personName, personAge, moneyReceived);

    };

}
