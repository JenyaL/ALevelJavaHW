package HWLessEight;


public class GeometricFigure {

    public static void main(String[] args) {

        SettingsFigure circle = new SettingsFigure() {
            @Override
            void figureArea() {
                double s = Math.PI * (getParam() * getParam());
                float fl = (float) s;
                System.out.println("Площадь круга - " + fl);
            }

            @Override
            void perimeterFigure() {
                double p = (2 * Math.PI) * getParam();
                float pFl = (float) p;
                System.out.println("Периметр круга - " + pFl);
            }
        };
        circle.Scan();
        circle.SettingsFigure("белый", "Круг");
        circle.info();
        circle.figureArea();
        circle.perimeterFigure();

        System.out.println("\n");

        SettingsFigure square = new SettingsFigure() {
            @Override
            void figureArea() {
                float s = getParam() * getParam();
                System.out.println("Площадь квадрата - " + s);
            }

            @Override
            void perimeterFigure() {
                float pFl = getParam() * 4;
                System.out.println("Периметр квадрата - " + pFl);
            }
        };
        square.SettingsFigure("красный", "Квадрат");
        square.info();
        square.figureArea();
        square.perimeterFigure();

    }

}
