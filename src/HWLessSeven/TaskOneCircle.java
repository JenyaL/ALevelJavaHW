package HWLessSeven;



class TaskOneCircle {
    double radius;
    double Perimeter;
    final double P = 3.14;

    public TaskOneCircle(int radius) {
        this.radius = radius;
    }

    void getPerimeter() {
        Perimeter = 2 * (P * radius);
        System.out.println("При условии что радиус = "+ radius+ " периметр круга = " + Perimeter);

    }
}
