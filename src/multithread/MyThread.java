package multithread;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("start thread");
        long sum = 0L;
        for (long i = 0; i < 100000000L; i++) {
            sum += 1;
        }
        System.out.println("end thread");
    }

    public static void main(String[] args) {
        int NUM_THREAD = 8;
        for (int i = 0; i < NUM_THREAD; i++) {
            (new MyThread()).start();
        }
        System.out.println("finish");
    }
}
