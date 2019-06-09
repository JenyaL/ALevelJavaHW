package HWLessEight;

public class SettingsFigure  implements Info{
    private String color;
    private String name;
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

    @Override
    public void info(){
        System.out.println("www");
    }

}
