import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int nums[] = new int[]{2,7,11,15};


        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    /*Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target. */
    public static int[] twoSum(int[] nums, int target)
    {
        // local variables
        int size = nums.length-1;
        int result[] = new int[2];

        /* nested for loop that will iterate through two indices of array */

        for (int i =0; i <= size - 1; i++ ){
            System.out.println("index i: " + i);

            for ( int j = 1; j <= size; j++){
                System.out.println("index j: " +j);

                // conditional statement to see if ints at indices equal target
                if ( nums[i] + nums[j] == target  && nums[i] != nums[j])
                {
                    result[0] = j;
                    result[1] = i;
                    return Arrays.copyOf(result, result.length);
                }
            }
        }
        return Arrays.copyOf(result, result.length);
    }
}