package HWLessEight;

public class SettingsFigure implements Info {
    private String name;
    private String color;
    int param;

    public int getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
    }

    void SettingsFigure(String colorFigure, String nameFigure, int paramFigure) {
        this.color = colorFigure;
        this.name = nameFigure;
        this.param = paramFigure;
    }

    void figureArea(){}

    void perimeterFigure(){}


    @Override
    public void info() {
        System.out.println("Фигура - " + name +"\n"
        + "Цвет фигуры - " + color + "\n"
        + "Исходный параметр - " + param);
    }
}
