package HWLessSeven;

public class ImputFileld extends Element {
    private String valye;

    public String getValye() {
        return valye;
    }

    public void setValye(String valye) {
        if (valye != null) {
            this.valye = valye;
        }
    }
    @Override
    public void select(){
        System.out.println("ImputFileld");
    }
}
