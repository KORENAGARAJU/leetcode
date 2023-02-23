package Arrays;

public class NumberOfGoodPairs{
    public static void main(String[] args) {
        int[] arr = new int[0];
        int ans = numIdenticalPairs(arr) ;
    }
    public static int numIdenticalPairs(int[] nums) {
        int counter=0;
        for(int i = 0 ; i < nums.length ; i++){

            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] == nums[j] && i<j){
                    counter++ ;
                }
            }
        }
        return counter ;
    }
    //good solution ;
}
