public class Dice {

    private int face;

    public Dice(int face) {
        this.face = face;
        System.out.println("Dice()");
    }

    public int getNumber(){
        System.out.println("Dice.getNumber()");
        return (int) (Math.random() * face) + 1;
    }
}
