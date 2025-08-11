package Multithreading;


class SyncThread extends Thread {

   Counter counter;

   SyncThread(Counter counter) {

       this.counter = counter;

   }

   public void run() {

       System.out.println("Run method");

		for (int i = 0; i < 1000; i++) {

           counter.increment();

       }

   }

   public static void main(String[] args) throws InterruptedException {

       Counter counter = new Counter();

       SyncThread t1 = new SyncThread(counter);

       SyncThread t2 = new SyncThread(counter);

       t1.start();

       t2.start();

		t1.join();

		t2.join();


       System.out.println("Final Count: " + counter.getCount()); 

   }

}

