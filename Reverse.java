public class Reverse {
    public static void reverse_array(int numbers[]){
        int first=0,last=numbers.length -1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,7,9};
        reverse_array(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
