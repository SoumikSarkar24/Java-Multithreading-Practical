package Q1;

class MyThread extends Thread {
    private String name;

    // Constructor to initialize the thread with a name and print a start-up message
    public MyThread(String name) {
        this.name = name;
        System.out.println("Thread " + this.name + " is starting...");
    }

    // Override the run() method to define the thread's behavior
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.name + ": Iteration " + (i + 1));
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

        // Create thread objects
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

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

