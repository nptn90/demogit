import test.demo.design.HumanCanRun;
import test.demo.design.HumanVietnam;

public class Main {
    public static void main(String[] args) {
        HumanCanRun vietnam = new HumanVietnam();
        vietnam.speak();
        System.out.println("Hello Tung!");
    }
}