public class subarray{
    public static void print_cont_sequence(int array[])
    {
        int ts=0;
        for(int i=0;i<array.length;i++)
        {
            /*This loop is for the start */
            for(int j=i;j<array.length;j++)
            {
                /*This loop is for the end */
                for(int k=i;k<=j;k++)
                {
                    /*This loop is used for only printing */
                    System.out.print(array[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays are: "+ts);
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,};
        print_cont_sequence(array);
    }
}