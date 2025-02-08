package Strings;

public class string_functions {
    public static void main(String[] args) {
        toUppercase();
        String str = "aaaabbbccd";
        System.out.println(string_compression(str));
    }
    public static void toUppercase(){
        String str = "i am juned musthafa";
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)== ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }
            else{
                sb.append(str.charAt(i));
            }
        }
        sb.toString();
        System.out.println(sb);
    }
    static String string_compression(String str){
        
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0 ;i<str.length();i++){
            Integer count =1;    
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        
        return sb.toString();
    }
}
