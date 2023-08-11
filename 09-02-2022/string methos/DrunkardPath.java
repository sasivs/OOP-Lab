import java.util.*;
public class DrunkardPath {
    public static int randomNum(){
        return (int)Math.floor(Math.random()*4);
    }
    public static void printPath(int n){
        int x=0, y=0;
        for (int i=0; i<n; i++){
            switch(randomNum()){
                case 0:
                    y+=1;
                    System.out.println("("+x+","+y+")");
                    break;
                case 1:
                    y-=1;
                    System.out.println("("+x+","+y+")");
                    break;
                case 2:
                    x+=1;
                    System.out.println("("+x+","+y+")");
                    break;
                case 3:
                    x-=1;
                    System.out.println("("+x+","+y+")");
                    break;
            }
        }
        int dis = x*x + y*y;
        System.out.println("Squared distance = "+dis);
    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of steps");
            int n = sc.nextInt();
            sc.nextLine();
            printPath(n); 
        }
    }
}
