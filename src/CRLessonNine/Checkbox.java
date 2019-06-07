package CRLessonNine;


public class Checkbox extends Element implements Clickable {
    @Override
    public void clickable() {
        System.out.println("в продакшин");
    }

    @Override
    void elem() {
        System.out.println(" “Hello, abstract world!”");
    }

    public static void main(String[] args) {
        Checkbox rt = new Checkbox();
        rt.clickable();
        rt.elem();
    }

}
