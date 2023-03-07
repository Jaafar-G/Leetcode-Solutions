public class practice {
    public static void main(String[] args) {
        //class variables
        int[] nums = new int[]{2,5,1,3,4,7};

        System.out.println(shuffle(nums, 3));
    }

    public static int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];
        int evenCount = 0;

        for ( int i = 0; i < ans.length; i++ ){
            if (i%2 ==0){
                ans[i] = nums[evenCount];
                evenCount++;
            }
            else {
                ans[i] = nums[(n)];
                n++;
            }
        }
        return ans;
    }
}
