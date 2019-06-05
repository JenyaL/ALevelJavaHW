public class MyArray {

    public static void main(String[] args) {
        MyArrayTask myArrayTask = new MyArrayTask();

        myArrayTask.length(myArrayTask.getMyArray(), "первого");
        myArrayTask.length(myArrayTask.getMyArrayClone(), "второго");
        myArrayTask.put();
        myArrayTask.length(myArrayTask.getMyArray(), "первого");
        myArrayTask.length(myArrayTask.getMyArrayClone(), "второго");

    }

}

class MyArrayTask {
    private String[] myArray = new String[3];
    String[] myArrayClone = new String[0];
    int numElemArrayOne = 0;
    int numElemArrayTwo = 5;
    public String[] getMyArray() {
        return myArray;
    }

    public String[] getMyArrayClone() {
        return myArrayClone;
    }

    void length(String[] name, String namear) {
        namear = namear;
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                numElemArrayOne++;
            }
        }
        System.out.println("Длина " + namear + " массива = " + numElemArrayOne);
    }

    void put() {
        for (int w = 0; w < numElemArrayTwo; w++) {
            if (w < myArray.length) {
                myArray[w] = "qwe" + w;
                System.out.println("Добавляем эллемент в первый массив - " + myArray[w]);
            } else if (w >= myArray.length) {
                myArrayClone = new String[myArray.length * 2];
                for (int e = 0; e < myArray.length; e++) {
                    myArrayClone[e] = myArray[e];
                    w = numElemArrayTwo;
                    System.out.println("Добавляем эллемент из первого во второй массив - "+myArrayClone[e]);
                }
            }
        }


    }
}