package demo04;

public class LlamdbaThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Name: " + Thread.currentThread().getName() + ", chrildren Thread");
            }
        }).start();


        new Thread(() -> System.out.println("Thread Name: " + Thread.currentThread().getName() + ", chrildren Thread")).start();
    }
}
