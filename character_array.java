public class character_array {
    public static int getString(String menu[],String key) {
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[]={"dosa","idly","wada","uthappam"};
        String key="wada";
        int index=getString(menu, key);
        if(index==-1)
            System.out.println("Key not found!");
        else    
            System.out.println("Key is at index : "+index);

    }
}
