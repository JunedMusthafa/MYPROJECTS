import java.util.*;
public class binary_search {
    
        public static int binarysearch(int[] num,int key){
            int start=0, end=num.length-1;
            while (start<=end) {
                int mid=(start+end)/2;
                if(num[mid]==key)
                    return mid;
                if(num[mid]<key){
                    start=mid+1;
                }
                else
                    end=mid-1;
            }
            return -1;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the Array");
            int size= sc.nextInt();
            int num[]=new int[size];
            Scanner sc1 = new Scanner(System.in);
            int key=sc1.nextInt();
            System.out.println("The index where the key is found is :"+binarysearch(num,key));
        }
    
    
}
