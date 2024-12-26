package filejava.secondexercise.application;

import java.io.*;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

import filejava.secondexercise.model.entities.Product;

public class Application {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner ( System.in );

        letsRunThisProgram ( sc );

    }

    private static void letsRunThisProgram ( Scanner sc ) {

        File filePath = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/filejava/secondexercise/model/input.csv" );

        String getFolderPath = filePath.getParent();

        File prepareANewPath = new File( getFolderPath + "/out" );

        boolean wasFolderCreated = prepareANewPath.mkdir();

        System.out.println( "Created: " + wasFolderCreated );

    }

}
