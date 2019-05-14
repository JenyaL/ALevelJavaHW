public class HWLesOne {

    public static void main(String[] args) {
        // subTask - 1
        String myName = "Evgen";
        int myAge = 36;
        float myWeight = 93.5f;

        System.out.println("subTask - 1 \n" + "Имя = " + myName + ", " + "Возраст = " + myAge + ", " + "Вес = " + myWeight);

        // subTask - 2
        int valueA = 1;
        int valueB = 6;

        System.out.println("subTask - 2.1 \n" + "a = " + valueA + "\n" + "b = " + valueB);
        int valueC = valueA;
        valueA = valueB;
        valueB = valueC;

        System.out.println("subTask - 2.2 \n" + "a = " + valueA + "\n" + "b = " + valueB);

        // subTask - 3
        valueA = valueA + valueB;
        valueB = valueB - valueA;
        valueB = -valueB;
        valueA = valueA - valueB;

        System.out.println("subTask - 3 \n" + "a = " + valueA + "\n" + "b = " + valueB);
    }
}
