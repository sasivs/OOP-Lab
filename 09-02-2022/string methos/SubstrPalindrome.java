import java.util.*;
public class SubstrPalindrome {
    public static int palindrome(String s){
        int len = s.length();
        for (int i=0; i<len/2; i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
            //    System.out.println(s+" is not a palindrome");
               return 0;
            }
        }
        // System.out.println(s+" is a palindrome");
        return 1;
    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string");
            String s = sc.nextLine();
            int len = s.length();
            String sub;
            for(int i=0; i<len-1; i++){
                for(int j=i+2; j<len; j++){
                    if(palindrome(sub=s.substring(i,j))>0){
                        System.out.println("The substring "+sub+" of "+s+" is a palindrome");
                        return;
                    }
                }
            }
            System.out.println("There is no substring of length greater than one in "+s+" which is a palindrome");
        }
    }
}
