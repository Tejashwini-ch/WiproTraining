package Multithreading;

class Counter {

    private int count = 0;

    // synchronized method to avoid race condition

    public synchronized void increment() {

        //System.out.print("Count: "+count);

		count++;

	}
 
    public int getCount() {

        return count;

    }

}

 