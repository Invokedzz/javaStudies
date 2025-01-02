package interfaces.docinterfaces.model.entities;

import interfaces.docinterfaces.model.services.Printer;

import interfaces.docinterfaces.model.services.Scanner;

public class ComboDevice extends Device implements Printer, Scanner {

    public ComboDevice () {

        super ();

    }

    public ComboDevice ( String serialNumber ) {

        super ( serialNumber );

    }

    @Override
    public void processDoc ( String doc ) {

        System.out.println("Combo processing: " + doc);

    }


    @Override
    public void print ( String doc ) {

        System.out.println("Combo printing: " + doc);

    }

    @Override
    public String scan () {

        return "Combo scan result";

    }


}
