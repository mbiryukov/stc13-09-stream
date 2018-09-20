package methodHref;

public class Main {
    public static void main(String[] args) {
        Greeter sayHi = new GreeterImpl()::sayHiBrightly;
        sayHi.sayHi2();
    }
}
