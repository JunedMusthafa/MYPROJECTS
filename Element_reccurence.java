import java.util.*;
public class Element_reccurence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        int[] nums = new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(checker(nums));
        sc.close();
    }
    static boolean checker(int[] nums){
    
            for(int i=0;i<nums.length;i++){
               
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i] == nums[j]){
                    return true;
                }   
            }    
        }
        return false;

    }
}
