public class dstack {
    public static void main(String[] args){
        stack s1 = new stack();
        int[] arr = {1,2,3,4,5,6,7,8};
        for (int i=0; i<arr.length; i++){
            s1.push(arr[i]);
        }
        System.out.println(s1.peek());
        System.out.println(s1.pop());   
    }
}
