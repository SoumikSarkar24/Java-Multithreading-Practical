package Q3;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);  // Set the name of the thread
    }

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
    }

    public static void main(String[] args) {
        System.out.println("Main thread is running.");

        // Create and start 5 threads with different priorities
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");
        MyThread thread3 = new MyThread("Thread-3");
        MyThread thread4 = new MyThread("Thread-4");
        MyThread thread5 = new MyThread("Thread-5");

        // Set priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY);  // Lowest priority
        thread2.setPriority(Thread.NORM_PRIORITY); // Normal priority (default)
        thread3.setPriority(Thread.MAX_PRIORITY);  // Highest priority
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


