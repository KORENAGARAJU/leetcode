package Arrays;
import java.util.* ;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[] {3 , 2 , 3 };
        int number = 6 ;
        int[] ans = twoSum(arr , number ) ;
        System.out.println("[" +ans[0] +","+ arr[1]+"]");
    }
    public static int[] twoSum(int[] nums, int target) {
        boolean check = false ;
        int[] arr = new int[2] ;
        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i]+nums[j] == target){
                    arr[0] = i ;
                    arr[1] = j ;
                    check = true ;
                    break ;
                }
            }
            if(check){
                break ;
            }
        }
        return arr;
    }
    // TODO: 24-02-2023 WORK ON TIME COMPLEXITIY AND SPACE COMPLEXITIY 
}
