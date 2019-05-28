public class HWLesFiive {

    public static void main(String[] args) {
        Robots info = new Robots("Roma", "Dasha", 9999);
        Robots info1 = new Robots("Dasha", "News", 888);
        Robots info2 = new Robots("Ivan", "Men", 34);

        Robots[] newRobos = new Robots[3];
        newRobos[0] = info;
        newRobos[1] = info1;
        newRobos[2] = info2;

        for (int i = 0; i < newRobos.length; i++){
            newRobos[i].soutOne();
        }
    }
}

class Robots {
    Robots() {

    }

    Robots(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    Robots(String name, String firstName, int size) {
        this.name = name;
        this.firstName = firstName;
        this.size = size;
    }

    String name;
    String firstName;
    int size;

    void soutOne() {
        System.out.println(name + " " + firstName+ " " + size);
    }

    void soutTwo() {
        System.out.println(firstName);
    }

    void soutThree() {
        System.out.println(size);
    }
}