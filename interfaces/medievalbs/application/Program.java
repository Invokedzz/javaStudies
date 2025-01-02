package interfaces.medievalbs.application;

import interfaces.medievalbs.model.entities.*;


public class Program {

    public static void main ( String[] args ) {

        runProgram ();

    }

    private static void runProgram () {

        Phobia phobia = Phobia.VASCOPHOBIA;

        Mage mage = new Mage( "Mr. Duck", 100, phobia,
                20, 15, 100 );

        int mageAttack = mage.attack();

        int mageDefense = mage.defense();

        System.out.printf( "Attack: %s\nDefense: %s", mageAttack, mageDefense );

    }

}
