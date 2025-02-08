import java.util.Scanner;
class hello{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of bars : ");
        int n= sc.nextInt();
        System.out.println("Enter the heights of the bars: ");
        int[] height=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(height[i]+", ");
        }
        sc.close();
        System.out.println("The total trapped water : "+trapped_water(height,n));
    }
    static int trapped_water(int[] height,int n){
        int[] left_max = new int[n];
        left_max[0]=height[0];
        for(int i=1;i<n;i++){
            left_max[i] = Math.max(left_max[i - 1], height[i]);
        }
        int[] right_max=new int[n];
        right_max[n-1]=height[n-1];
        for
        (int i = n-2;i>=0;i--){
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }
        int trapped_water = 0;
        for(int i=0;i<n;i++){
            trapped_water += Math.min(left_max[i],right_max[i])-height[i];
        }
        return trapped_water;
    }
}