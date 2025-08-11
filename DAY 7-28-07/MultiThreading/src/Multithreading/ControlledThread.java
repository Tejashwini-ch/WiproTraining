package Multithreading;

class ControlledThread extends Thread {

    public void run() {

        for (int i = 1; i <= 4; i++) {

            System.out.println(getName() + " - Count: " + i);

            try {

                Thread.sleep(1000); // pause for 1 second

            } catch (InterruptedException e) {

                System.out.println(e);

            }

        }

    }
 
    public static void main(String[] args) {

        System.out.println("Main thread starts….");

		ControlledThread t1 = new ControlledThread();

        ControlledThread t2 = new ControlledThread();
        
        ControlledThread t3 = new ControlledThread();
      
 
        t1.setName("Worker-1");

        t2.setName("Worker-2");
        
        t3.setName("Worker-3");
 
        System.out.println("Starting threads...");

        t1.start();
        t2.start();

        try {

            // Wait for t1 to finish before continuing

            t1.join();
            t2.join();

        } catch (InterruptedException e) {

            System.out.println(e);

        }

		t2.start();
		
		try {
			
			//Wait for t2 to finish before continuing
			
			t2.join();//it will make the program run until the t2 is finished and after finishing t3 runs.
			
		}catch(InterruptedException e) {
			
			System.out.println(e);
		}
		
		t3.start();//we can also put t3.join in try catch also
 
        // Check if threads are alive

        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());

        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());
        
        System.out.println("Is " + t3.getName() + " alive? " + t3.isAlive());
 
        //System.out.println("Main thread finished.");

    }

}
/*
output for two threads
Main thread starts….
Starting threads...
Worker-1 - Count: 1
Worker-1 - Count: 2
Worker-1 - Count: 3
Worker-1 - Count: 4
Worker-2 - Count: 1
Is Worker-1 alive? false
Is Worker-2 alive? true
Worker-2 - Count: 2
Worker-2 - Count: 3
Worker-2 - Count: 4
-----------------------------------------------------
output for 3 threads
Main thread starts….
Starting threads...
Worker-1 - Count: 1
Worker-1 - Count: 2
Worker-1 - Count: 3
Worker-1 - Count: 4
Worker-2 - Count: 1
Is Worker-1 alive? false
Is Worker-2 alive? true
Worker-2 - Count: 2
Worker-2 - Count: 3
Worker-2 - Count: 4 
*/
 
