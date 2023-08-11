import java.util.*;
public class Palindrome {
    public static void palindrome(String s){
        int len = s.length();
        for (int i=0; i<len/2; i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
               System.out.println(s+" is not a palindrome");
               return;
            }
        }
        System.out.println(s+" is a palindrome");
        return;
    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string");
            String s = sc.nextLine();
            palindrome(s);   
        }
    }
}
