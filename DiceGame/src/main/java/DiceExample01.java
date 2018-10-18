import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiceExample01 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dicegame.xml");
        Dice dice = ac.getBean(Dice.class);

        Player p1 = (Player) ac.getBean("yoon");
        Player p2 = (Player) ac.getBean("kim");
        Player p3 = (Player) ac.getBean("lee");
        Player p4 = (Player) ac.getBean("joo");

        Game diceGame = ac.getBean(Game.class);

        diceGame.game();
    }
}
