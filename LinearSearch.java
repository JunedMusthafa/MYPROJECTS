
public class LinearSearch{
    public static int LinearSearch(int numbers[],int key){
        for(int i=0;i<=numbers.length;i++)
        {
            if(numbers[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,54,5,6,3,7,99};
        int key = 99;
        int index= LinearSearch(numbers, key);
        if(index==-1)
            System.out.println("Key Not Found!");
        else
            System.out.println("Key is at index "+index);
    }
}