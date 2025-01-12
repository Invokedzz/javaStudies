package Challenge.Challenge14th.src;

import java.util.Arrays;

public class ArrayPermutation {

    public static void main ( String[] args ) {

        int [] nums = {2, 0, 4};

        int [] arrayBuild = buildArray( nums );

        System.out.println(Arrays.toString(arrayBuild));

    }

    public static int[] buildArray(int[] nums) {

        int [] ans = new int[] { nums.length };

        for ( int index = 0; index < ans.length; index ++ ) {

            ans [index] = nums [nums[index]];

        }

        return ans;

    }

}
