import java.util.*;
public class array {
    public static void main(String[] args) {
        int marks[]=new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[0]=100;
        System.out.println("phy = " + marks[0] );
        System.out.println("Che = " + marks[1] );
        
        System.out.println("Length of an Array = "+marks.length);
        sc.close();
    }
}
