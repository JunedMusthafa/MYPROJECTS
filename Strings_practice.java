
import java.util.*;
public class Strings_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Give a word or sentence: ");
        String str = sc.nextLine();
        System.out.println("give another word : ");
        
        String str1 = sc.nextLine();
        
        anagram_check(str1, str);
        sc.close();
    }
    static int vowel_count_lowercase(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;

    }
    static void anagram_check(String str,String str1){
        
        str = str.toLowerCase();
        str1=str1.toLowerCase();
        if(str.length()==str1.length()){
        char[] arr = str.toCharArray();
        char[] arr1=str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        boolean result = Arrays.equals(arr,arr1);
        if(result ){
            System.out.println("The words are anagrams.");
        }
        else    
            System.out.println("Not anagrams");
        }
        else{
            System.out.println("Not anagrams");
        }
    }
}
