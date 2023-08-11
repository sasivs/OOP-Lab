// class thread implements Runnable{
//     static boolean done = false;
//     String msg;
//     thread(String m){
//         msg=m;
//         Thread t = new Thread();
//         t.start();
//     }
//     public void run(){
//         while(!done){
//             this.print(msg);
//         }
//     }
//     public void stop(){
//         done=true;
//     }

//     public void print(String ms){
//         System.out.println(msg);
//     }
// }



// public class sample {
//     public static void main(String [] args){
//         thread t1 = new thread("Hello");
//         thread t2 = new thread("Learn Multi-threading");
//         try{
//             Thread.sleep(1000);
//         }
//         catch (InterruptedException e){
//             System.out.println(e);
//         }
//         t1.stop();
//     }
// }
