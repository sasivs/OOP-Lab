import java.util.*;
public class Anagram {
    public static void anagram(String s1, String s2){
        int len;
        if((len=s1.length())!=s2.length() || s1.equals(s2)){
            System.out.println(s2+" is not an anagram of "+s1);
            return;
        }
        char c;
        int rIndex;
        StringBuilder s = new StringBuilder(s1);
        for(int i=0; i<len; i++){
            c = s2.charAt(i);
            if ((rIndex=s1.indexOf(c))>=0){
                s.replace(rIndex,rIndex,"");
            }
            else{
                System.out.println(s2+" is not an anagram of "+s1);
                return;
            }
        }
        System.out.println(s2+" is an anagram of "+s1);
        return;
    }   
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the base string");
            String s1 = sc.nextLine();
            System.out.println("Enter the string to be verified");
            String s2 = sc.nextLine();
            anagram(s1,s2);
        }
    }
}
