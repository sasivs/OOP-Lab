import java.util.*;
public class RandomWalker {
    public static int randomNum(){
        return (int)Math.floor(Math.random()*4);
    }
    public static int path(int n){
        int x=0, y=0;
        for (int i=0; i<n; i++){
            switch(randomNum()){
                case 0:
                    y+=1;
                    break;
                case 1:
                    y-=1;
                    break;
                case 2:
                    x+=1;
                    break;
                case 3:
                    x-=1;
                    break;
            }
        }
        int dis = x*x + y*y;
        return dis;
    }
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of steps");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter number of trials");
            int t = sc.nextInt();
            int sum=0;
            for (int i=0 ;i<t; i++){
                sum+=path(n);
            }
            System.out.printf("Mean squared distnace of "+n+" steps performed for "+t+" trials is "+"%.2f",(float)(sum/t));
        }

    }
}
