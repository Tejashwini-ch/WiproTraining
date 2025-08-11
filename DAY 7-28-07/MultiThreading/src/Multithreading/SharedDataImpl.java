package Multithreading;

public class SharedDataImpl {
	public static void main(String[] args) {
        SharedData shared = new SharedData();
       Producer p = new Producer(shared);
        Consumer c = new Consumer(shared);
        p.start();
        c.start();
    }

}
