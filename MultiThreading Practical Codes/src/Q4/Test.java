package Q4;

class MyRunnable implements Runnable {
    private String name;

    // Constructor to initialize the thread with a name
    public MyRunnable(String name) {
        this.name = name;
        System.out.println("Thread " + this.name + " is starting...");
    }

    // Override the run() method to define the thread's behavior
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " with priority "
                    + Thread.currentThread().getPriority() + " is running, Iteration " + (i + 1));
            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread " + this.name + " has finished.");
    }

    public static void main(String[] args) {
        System.out.println("Main thread is running.");

        // Create Runnable objects
        MyRunnable myRunnable1 = new MyRunnable("Thread-1");
        MyRunnable myRunnable2 = new MyRunnable("Thread-2");
        MyRunnable myRunnable3 = new MyRunnable("Thread-3");
        MyRunnable myRunnable4 = new MyRunnable("Thread-4");
        MyRunnable myRunnable5 = new MyRunnable("Thread-5");

        // Create Thread objects and pass the Runnable objects to them
        Thread thread1 = new Thread(myRunnable1, "Thread-1");
        Thread thread2 = new Thread(myRunnable2, "Thread-2");
        Thread thread3 = new Thread(myRunnable3, "Thread-3");
        Thread thread4 = new Thread(myRunnable4, "Thread-4");
        Thread thread5 = new Thread(myRunnable5, "Thread-5");

        // Set priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY);  // Lowest priority (1)
        thread2.setPriority(Thread.NORM_PRIORITY); // Normal priority (5)
        thread3.setPriority(Thread.MAX_PRIORITY);  // Highest priority (10)
        thread4.setPriority(7);  // Custom priority
        thread5.setPriority(3);  // Custom priority

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            // Wait for all threads to finish
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread has finished.");
    }
}
