package graalvm.mockito;

class Main {
    public static void main(String[] args) {
        MyService myService = new MyServiceImpl();
        System.out.println(myService.hello());
    }
}
