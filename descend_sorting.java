public class descend_sorting {
    
        public static void main(String[] args) {
            int arr[]={3,6,2,1,8,7,6,5};
            //counting_sort(arr);
            insertion_sort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
           }
        }
        static void counting_sort(int []arr){
            int largest=Integer.MIN_VALUE;  
            for(int i=0;i<arr.length;i++){
                largest=Math.max(largest,arr[i]);
            }
            //range of elements = 0 to largest element in array
            int[] count=new int[largest+1];
            //largest+1 be cause the elements start from 0
            for(int i=0;i<arr.length;i++){
                //the index for the count array is elements from original array (if arr[0]=1, then count[1])
                count[arr[i]]++;
            }
            //Sorting logic for counting sort 
            int j=0;
            for(int i=count.length-1;i>=0;i--){
                while(count[i]>0){
                //ensure count is atleast 1 if count 0 element doesnt exist in original array
                arr[j]=i;
                j++;
                count[i]--;
                }
            }
        }
        static void bubble_sort(int arr[]){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]<arr[j+1]){
                        int temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1]= temp;
                    }
                }
            }
        }
        static void selection_sort(int[] arr){
            
            for(int i=0;i<arr.length;i++){
                int max_index=i;
                for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[max_index]){
                    max_index=j;
                }
            }
                int temp = arr[i];
                arr[i]=arr[max_index];
                arr[max_index]=temp;

            }
        }
        static void insertion_sort(int []arr){
            for(int i =1;i< arr.length;i++){
                int curr = arr[i];
                int prev= i-1;
                while(prev>=0&&arr[prev]<curr){
                    arr[prev+1]=arr[prev];
                    prev--;
                }
                arr[prev+1]=curr;
            }
        }
}
