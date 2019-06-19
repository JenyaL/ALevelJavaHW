package HWLessEleven;

class MainBike {
    public static void main(String[] args) {
        DownhillBike downhillBike = new DownhillBike();
        downhillBike.setModel("Green");
        downhillBike.run();
        downhillBike.stop();
    }
}

public abstract class AbstractBicycle {
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        System.out.println(model);
    }

    String model;

    public abstract void run();

    public abstract void stop();
}

class DownhillBike extends AbstractBicycle {

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public void run() {
        System.out.println("Go!!!");
    }

    @Override
    public void stop() {
        System.out.println("Stop Bike!!!");
    }
}

