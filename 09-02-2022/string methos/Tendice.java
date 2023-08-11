import java.util.*;
public class Tendice {
    public static int randomNum(){
        return (int)(Math.floor(Math.random()*6)+1);
    }
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of trials");
            int n = sc.nextInt();
            int[] trials = new int[51];
            for(int i=0; i<51; i++){
                trials[i]=0;
            }
            int sum;
            for(int i=0; i<n; i++){
                sum = 0;
                for(int j=0; j<10; j++){
                    sum+=randomNum();
                }
                trials[sum-10]+=1; 
            }
            for(int i=0; i<51; i++){
                System.out.print((i+10)+": ");
                for(int j=0; j<trials[i]; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
