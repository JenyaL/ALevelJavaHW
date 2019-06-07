package CRLessonNine;

public class  MyBrowser implements CanBeClosed{

    @Override
    public void close() {
        System.out.println("MyBrowser");
    }
}
