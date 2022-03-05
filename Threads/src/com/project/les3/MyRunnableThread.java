package com.project.les3;

public class MyRunnableThread {
    
private static int myCount = 0;
public void run() {
   while(MyRunnableThread.myCount <= 10){
       try{
           System.out.println("Expl Thread: "+(++MyRunnableThread.myCount));
           Thread.sleep(100);
       } catch (InterruptedException iex) {
           System.out.println("Exception in thread: "+iex.getMessage());
       }
   }
} 
public static void main(String a[]){
   System.out.println("Starting Main Thread...");
   Thread t = new Thread();
   t.start();
   while(MyRunnableThread.myCount <= 20){
       try{
           System.out.println("Main Thread: "+(++MyRunnableThread.myCount));
           Thread.sleep(100);
       } catch (InterruptedException iex){
           System.out.println("Exception in main thread: "+iex.getMessage());
       }
   }
   System.out.println();
   System.out.println("End of Main Thread...");
}


}
