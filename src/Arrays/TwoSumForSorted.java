package Arrays;
import java.util.* ;
public class TwoSumForSorted{
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in) ;
            int[] arr = new int[]{1 , 2 , 3 , 4, 5} ;
            int target = scn.nextInt() ;
            int[] ans = twoSum(arr , target) ;
            System.out.print("["+ans[0]+" " +ans[1]+"]") ;

    }
    //binary Search approch
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0 ;
        int right = numbers.length-1 ;

        while(left < right){
            if(numbers[left]+numbers[right] == target){
                int[] ans = {left+1 , right+1} ;
                return ans ;
            }
            else if(numbers[left]+numbers[right] > target){
                right-- ;
            }else
                left++ ;
        }
        int[] a = {-1,-1} ;
        return a ;
    }
}

