package test.demo.stream;

public class DemoFunctionOriented {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.printMe();

        DemoFunction demoFunction = new DemoFunction();

        demoFunction.print(() -> System.out.println("New Printing"));
        demoFunction.print(() -> System.out.println("New Printing 2"));
        demoFunction.print(() -> System.out.println("New Printing 3"));
    }

    static class Demo implements ITest {
        @Override
        public void printMe() {
            System.out.println("I'm printing");
        }
    }

    static class DemoFunction {
        public void print(ITest iTest) {
            iTest.printMe();
        }
    }

}
