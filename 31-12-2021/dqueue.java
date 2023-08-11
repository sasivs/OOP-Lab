public class dqueue {
    public static void main(String [] args){
        queue q1 = new queue();
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        for (int i=0; i<arr.length; i++){
            q1.enqueue(arr[i]);
        }
        System.out.println(q1.front());
        System.out.println(q1.dequeue());
        System.out.println(q1.rear());
    }
}
