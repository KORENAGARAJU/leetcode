package Arrays;
import java.util.* ;
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3 ,5  } ;
        int[] ans = sortedSquares(arr) ;
        for (int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length] ;
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = nums[i]*nums[i] ;
        }
        Arrays.sort(ans) ;
        return ans ;
    }
    // TODO: 25-02-2023 improve space and time  
}
