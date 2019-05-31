public class HWLessFivePartTwo {


    public static void main(String[] args) {
        PointS pointOne = new PointS(1, 5);
        PointS pointTwo = new PointS(2, 5);
        PointS pointThree = new PointS(3, 5);
        PointS pointFour = new PointS(4, 5);

        PointS[] arraPoints = new PointS[4];
        arraPoints[0] = pointOne;
        arraPoints[1] = pointTwo;
        arraPoints[2] = pointThree;
        arraPoints[3] = pointFour;

        for (int i = 0; i < arraPoints.length; i++) {
            arraPoints[i].ihfoPoints();
        }


        for (int i = 0; i < arraPoints.length; i++) {
            arraPoints[i].sumPoint();
        }
    }
}

class PointS {

    PointS(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
    int y;
    int c;

    void ihfoPoints() {
        System.out.println(x + " " + y);
    }

    void sumPoint() {
        c = x + y;
        if (0 == (c % 2)) {
            System.out.println(x + " " + y);
        }
    }
}
