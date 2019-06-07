package CRLessonNine;

public class MyFile implements CanBeClosed{
    @Override
    public void close() {
        System.out.println("MyFile");
    }
}
