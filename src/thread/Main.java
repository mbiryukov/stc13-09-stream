package thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Message from t1");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("message from Thread");
            }
        }).start();
    }
}
