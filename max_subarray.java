import java.util.*;
public class max_subarray{
    static Scanner sc=new Scanner (System.in);
    public static void main(String args[]){
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
       kadanes(arr);
    }
    static int max_subarray_sum(int arr[]){
       
        int max_sum=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
            int current_sum=0;
            for(int j=i;j<arr.length;j++){
              
                current_sum+=arr[j];
                if(max_sum<current_sum){
            max_sum=current_sum;
            }
            
        }
        
        }
        return max_sum;
    }
    static int prefix(int arr[]){
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        int max_sum=Integer.MIN_VALUE;
        
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];    
        }
        for(int i=0;i<prefix.length;i++)
        {
            int current_sum=0;
            for(int j=i;j<prefix.length;j++){
                current_sum= i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(current_sum>max_sum){
                    max_sum=current_sum;
                }
            }
        }
        return max_sum;
    }
    /*Kadanes algorithm: Any comparision that gives a negative number should be made zero */
    static void kadanes(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
        }
        
        System.out.println("The maximum sum using kadanes : "+ms);
    }
}