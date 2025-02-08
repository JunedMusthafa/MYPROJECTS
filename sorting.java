import java.util.Scanner;
public class sorting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements: ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        counting_sort(arr);
        System.out.println("The sorted array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
           } 
        sc.close();
    }
    /*compare adjacent elements and swap in passes, elements get bubbled up the order  */
    static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int temp = 0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
    /*Select smallest element and compare it to the rest of the array and then keep swapping until you get the sorted array */
    }
    static void selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min_index = i;
            for(int j=i+1;j<arr.length;j++){
                
                    if(arr[min_index]>arr[j]){
                        min_index= j;
                    }
            }
            int temp = arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }
    static void insertion_sort(int arr[]){
        for(int i =1;i<arr.length;i++){
           int j = i-1;
           int key = arr[i];
           while( j>=0&&arr[j]>key){
            arr[j+1]=arr[j];
            j--;
           }
           arr[j+1]=key;
        }    
    }
    static void counting_sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[]= new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
            j++;
            count[i]--;
            }
        }
    }
}
