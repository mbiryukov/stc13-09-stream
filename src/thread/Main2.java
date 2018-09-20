package thread;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Message from t1");
        new Thread(() -> System.out.println("Message from Thread")).start();
    }
}
