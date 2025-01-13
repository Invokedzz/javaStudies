package Challenge.Challenge15th.src;

import java.util.Arrays;

public class Challenge15th {

    public static void main ( String[] args ) {

        int [] nums = { 3, 2, 3 };

        int [] result = getConcatenation( nums );

        System.out.println(Arrays.toString( result ));

    }

    public static int[] getConcatenation (int[] nums) {

        /*Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

                Specifically, ans is the concatenation of two nums arrays.

                Return the array ans */

        int [] ans = new int [nums.length * 2];

        for ( int index = 0; index < nums.length; index ++ ) {

            ans[index] = nums[index];

            ans[index + nums.length] = nums[index];

        }

        return ans;

    }

}
