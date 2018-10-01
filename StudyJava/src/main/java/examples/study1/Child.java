package examples.study1;

public class Child extends Parent {

    private int sno;

    public Child(String name, int sno){
        super(name, sno);
        this.name = name;
        this.sno = sno;
    }

    /*public Child(String name) {
        super(name);
    }*/
}
