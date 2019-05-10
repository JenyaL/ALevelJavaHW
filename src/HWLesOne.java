public class HWLesOne {

    public static void main(String[] args) {
        // subTask - 1
        String myName = "Evgen";
        int myAge = 36;
        float myWeight = 93.5f;

        System.out.println("subTask - 1 \n" + "Имя = " + myName + ", " + "Возраст = " + myAge + ", " + "Вес = " + myWeight);

        // subTask - 2
        int valyeA = 1;
        int valyeB = 6;

        System.out.println("subTask - 2.1 \n" + "a = " + valyeA + "\n" + "b = " + valyeB);
        int valyeC = valyeA;
        valyeA = valyeB;
        valyeB = valyeC;

        System.out.println("subTask - 2.2 \n" + "a = " + valyeA + "\n" + "b = " + valyeB);

        // subTask - 3
        valyeA = valyeA + valyeB;
        valyeB = valyeB - valyeA;
        valyeB = -valyeB;
        valyeA = valyeA - valyeB;

        System.out.println("subTask - 3 \n" + "a = " + valyeA + "\n" + "b = " + valyeB);


    }
}
