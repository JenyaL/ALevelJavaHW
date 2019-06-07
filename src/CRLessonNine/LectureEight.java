package CRLessonNine;

public class LectureEight {
    static void finishWork(CanBeClosed CanBeClosed) {
        CanBeClosed.close();
    }

    public static void main(String[] args) {
        MyBrowser myBrowser = new MyBrowser();
        MyFile myFile = new MyFile();
        finishWork(myBrowser);
        finishWork(myFile);

        finishWork(new CanBeClosed() {
            @Override
            public void close() {
                System.out.println("end");
            }
        });
    }
}