package arrays.someStuff;

public class ForEachLearn {

    public static void main (String[] args) {

        String [] vectorTest = new String[] {"Pablo", "Honey", "Radiohead"};

        for (int i = 0; i < vectorTest.length; i++) {

            System.out.println(vectorTest[i]);

        }

        System.out.println("--------------");

        for (String forEach: vectorTest) {

            System.out.println(forEach);

        }

    }

}
