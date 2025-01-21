package Q2;

class MyRunnable implements Runnable {
    private String name;

    // Constructor to initialize the thread with a name and print a start-up message
    public MyRunnable(String name) {
        this.name = name;
        System.out.println("Thread " + this.name + " is starting...");
    }

    // Override the run() method to define the thread's behavior
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            // Print the fully qualified name of the thread
            System.out.println(Thread.currentThread().getName() + ": Iteration " + (i + 1));
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

        // Create Thread objects and pass the Runnable objects to them
        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to complete before finishing the main thread
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread has finished.");
    }
}

