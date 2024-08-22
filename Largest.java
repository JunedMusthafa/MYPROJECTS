import java.util.*;
public class Largest {
    public static int getLargest(int numbers[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>largest)
                largest=numbers[i];
        }
        return largest;
    }
    public static void main(String[] args)
    {
        int numbers[]={1,3,5,6,8,2,0};
        System.out.println("the largest number in the array is : "+getLargest(numbers));
        
    }
    
}
