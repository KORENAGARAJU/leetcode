package Arrays;
import java.util.Scanner ;
public class CheckDistancesBetweenSameLetters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        String s = "hello ";
        int[] arr = new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        boolean ans = checkDistances(s , arr) ;
        System.out.println(ans);
    }
    public static  boolean checkDistances(String s , int[] distance){
        boolean ans1 = false ;
        //System.out.println(s.length());
        int index = 0 ;
        int ans = 0 ;
        for(int i = 0 ; i < s.length() ; i++) {
            char check = s.charAt(i); //a
            int counter = 0;
            for (int j = i + 1; j < s.length(); j++) {
                if (check == s.charAt(j)) {
                    index = i;
                    ans = counter ;
                    break;
                }
                else {
                    counter++;
                }
            }
        }
        if(distance[index] == ans) {
            ans1 = true;
        } else {
            ans1 = false;
        }
        return ans1 ;
        // TODO: 24-02-2023
    }
}
