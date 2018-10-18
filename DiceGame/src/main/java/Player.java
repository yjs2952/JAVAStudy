public class Player {
    private String name;
    private Dice dice;

    public Player() {
        System.out.println("Player()");
    }

    public Player(String name, Dice dice) {
        this();
        this.name = name;
        this.dice = dice;
    }

    public void play(){
        System.out.println(name + "님의 번호는 " + dice.getNumber() + " 입니다.");
    }
}
