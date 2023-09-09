package test.demo.design;

public class HumanVietnam extends HumanCanRun {
    @Override
    public void speak() {
        beforeSpeak();
        System.out.println("Vietnamese");
    }

    private void beforeSpeak() {
        System.out.println("Sing");
    }
}
