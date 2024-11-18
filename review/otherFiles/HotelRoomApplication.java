package review.otherFiles;

import java.util.Scanner;

import java.util.Locale;

import review.otherFiles.HotelRoomEntity;

public class HotelRoomApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        ourMainApplication();

    }

    private static void ourMainApplication () {

        Scanner init = new Scanner(System.in);

        int parameterValue = init.nextInt();

        String [] studentName = new String[parameterValue];

        String [] studentsEmail = new String[parameterValue];

        int [] studentsRoom = new int[10];

        for (int y = 0; y < studentName.length; y++) {

            System.out.println("Enter your name: ");

            studentName[y] = init.next();

            System.out.println("Enter your email: ");

            studentsEmail[y] = init.next();

            System.out.println("Enter your room: ");

            studentsRoom[y] = init.nextInt();

        }

        for (int x = 0; x < studentName.length; x++) {

            HotelRoomEntity room = new HotelRoomEntity(studentName[x], studentsEmail[x], studentsRoom[x]);

            if (studentsRoom[x] > 10) {

                System.out.println("Enter a valid room");

                break;

            }

            System.out.println(room);

        }

    }

}
