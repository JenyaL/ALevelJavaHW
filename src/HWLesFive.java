import HWLessFivePartOne.HWLessFivePart1;

public class HWLesFive {
    public static void main(String[] args) {

        HWLessFivePart1.MyInt a1 = new HWLessFivePart1.MyInt(3);
        HWLessFivePart1.MyInt a2 = a1;

        a1.x = 4;

        System.out.println(a1.x + " " +  a2.x);
    }
}

