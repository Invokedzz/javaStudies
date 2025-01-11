package Challenge.Challenge11th.src;

import java.util.Arrays;

public class Program {

    public static void main ( String[] args ) {

        int [] vectorInt = new int[]{20, 30, 40, 50};

        int [] returnOfElements = twoSum( vectorInt, 50 );

        System.out.println( Arrays.toString( returnOfElements ) );

    }

    public static int[] twoSum(int[] nums, int target) {

        for ( int index = 0; index < nums.length; index ++ ) {

            for ( int j = index + 1; j < nums.length; j ++ ) {

                if ( nums[index] + nums[j] == target ) return new int[]{ index, j };

            }

        }

        return nums;

    }

}
