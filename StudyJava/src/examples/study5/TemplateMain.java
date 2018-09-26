package examples.study5;

public class TemplateMain {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        warrior.readyToBattle();

        Archer archer = new Archer();
        archer.readyToBattle();

        Wizard wizard = new Wizard();
        wizard.readyToBattle();
    }
}
