package arrays.ArrayList.app;

import arrays.ArrayList.entities.ExeArrayListEntity;

import arrays.ArrayList.entities.ExeArrayListPartTwo;

import java.util.List;

import java.util.ArrayList;

import java.util.Scanner;

import java.util.Locale;

public class ExeArrayList {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        reviewOfArrayList();

    }

    private static void reviewOfArrayList () {

        Scanner init = new Scanner(System.in);

        List <ExeArrayListEntity> list = new ArrayList<>();

        int controlValue = init.nextInt();

        for (int i = 0; i < controlValue; i++) {

            System.out.println("Enter your name: ");

            String userName = init.next();

            System.out.println("Enter your age: ");

            Integer userAge = init.nextInt();

            ExeArrayListEntity user = new ExeArrayListEntity(userName, userAge);

            list.add(user);

            System.out.println(list);

        }

        if (!list.isEmpty()) receiveExtraInformation(list, init);

    }

    private static void receiveExtraInformation (List <ExeArrayListEntity> list, Scanner init) {

        List <ExeArrayListPartTwo> extraList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            System.out.println("What do you work with? ");

            String workAs = init.next();

            System.out.println("What's your car model? ");

            String carModel = init.next();

            System.out.println("What's your car id? ");

            int carId = init.nextInt();

            while (idExistenceApproved(extraList, carId)) {

                System.out.println("Enter a different id!");
                carId = init.nextInt();

            }

            ExeArrayListPartTwo elements = new ExeArrayListPartTwo(workAs, carModel, carId);

            extraList.add(elements);

            System.out.println(extraList);

        }

        System.out.println("Enter the car id you want to review: ");

        int reviewCarId = init.nextInt();

        if (findIdPosition(extraList, reviewCarId) != null) {

            ExeArrayListPartTwo element = new ExeArrayListPartTwo(reviewCarId);

            String receiveVip = element.giveVipToACertainCarId(reviewCarId);

            System.out.println(receiveVip);

        }

    }

    private static Integer findIdPosition (List <ExeArrayListPartTwo> list, int carId) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCarId().equals(carId)) return i;
        }

        return null;

    }

    private static boolean idExistenceApproved (List <ExeArrayListPartTwo> list, int carId) {

        ExeArrayListPartTwo element = list.stream()
                .filter(x -> x.getCarId().equals(carId))
                .findFirst().orElse(null);

        return element != null;

    }

}
