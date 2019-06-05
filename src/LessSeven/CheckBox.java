package LessSeven;

public class CheckBox extends Element{
    private int size;

    CheckBox(int x, int y, int size){
        super(x, y);
        this.size= size;
    }

    @Override
    public void select(){
        System.out.println("CheckBox");
    }
}
