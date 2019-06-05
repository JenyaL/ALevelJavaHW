public class MyArray {

    public static void main(String[] args) {
        MyArrayTask myArrayTask = new MyArrayTask();

        myArrayTask.length();
    }

}

class MyArrayTask {
    private String[] myArray = {"qwe", "rty", "uio"};
    int qwerty = 0;


    void length() {

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] != null) {
              qwerty=(i);
            }
        }
        System.out.println(qwerty+1);
    }
}