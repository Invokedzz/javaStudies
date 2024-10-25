package src.baldFlakes2;

import java.util.Scanner;

public class thirdTest {

    public static void main (String[] args) {

        tTest(args);

    }

    public static void tTest (String[] args) {

        Scanner init = new Scanner(System.in);

        int code, qty;

        double code1, code2, code3, code4, code5;

        code = init.nextInt();

        qty = init.nextInt();

        code1 = qty * 4;

        code2 = qty * 4.5;

        code3 = 5 * qty;

        code4 = 2 * qty;

        code5 = 1.5 * qty;

        if (code == 1) System.out.print(code1);

        else if (code == 2) System.out.println(code2);

        else if (code == 3) System.out.println(code3);

        else if (code == 4) System.out.println(code4);

        else if (code == 5) System.out.println(code5);

        else System.out.println("Die plague");

        init.close();

    }

}
