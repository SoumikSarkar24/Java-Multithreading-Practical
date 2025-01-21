package Q5;

class CommonMethod {
    // Synchronized method to ensure only one thread can access it at a time
    public synchronized void printNumbers(int threadId) {
        System.out.println("Thread " + threadId + " is starting.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + threadId + " prints: " + i);
            try {
                Thread.sleep(500);  // Simulate some work with sleep
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread " + threadId + " has finished.");
    }
}

class MyThread extends Thread {
    private CommonMethod commonMethod;
    private int threadId;

    // Constructor to initialize the thread with the common method and ID
    public MyThread(CommonMethod commonMethod, int threadId) {
        this.commonMethod = commonMethod;
        this.threadId = threadId;
    }

    // The run method will call the synchronized method
    @Override
    public void run() {
        commonMethod.printNumbers(threadId);
    }
}

public class SynchronizedMethodExample {
    public static void main(String[] args) {
        // Create an instance of the CommonMethod class
        CommonMethod commonMethod = new CommonMethod();

        // Create multiple threads that will access the synchronized method
        MyThread thread1 = new MyThread(commonMethod, 1);
        MyThread thread2 = new MyThread(commonMethod, 2);
        MyThread thread3 = new MyThread(commonMethod, 3);
        MyThread thread4 = new MyThread(commonMethod, 4);
        MyThread thread5 = new MyThread(commonMethod, 5);

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}

