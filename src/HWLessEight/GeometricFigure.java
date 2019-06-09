package HWLessEight;

public class GeometricFigure  implements Info{
    public static void main(String[] args) {
        SettingsFigure circle = new SettingsFigure();
        circle.SettingsFigure("белый", "Круг", 6);

        circle.info();


    }
    @Override
    public void info(){
        System.out.println("QQQ");
    }
}
