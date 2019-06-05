package HWLessSeven;

public class Element {
    private int x;
    private int y;
    private String cssClass;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        } else  {
            System.out.println("Error");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {

        if (y >= 0) {
            this.y = y;
        } else  {
            System.out.println("Error");
        }
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        if (cssClass != null) {
            this.cssClass = cssClass;
        } else {
            System.out.println("Error");
        }
    }

    public Element(){

    }
    public Element(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void select (){
        System.out.println("Element selected");
    }
}
