import java.util.Scanner;
public class Count{
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string:");
            String s = sc.nextLine();
            char c;
            int vowels = 0, cons = 0;
            for (int i=0; i<s.length(); i++){
                c = s.charAt(i);
                if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u'){
                    vowels+=1;
                }
                else{
                    cons+=1;
                }
            }
            System.out.println("There are "+vowels+" vowels and "+cons+" consonants in the string "+s);
        }
    }
}