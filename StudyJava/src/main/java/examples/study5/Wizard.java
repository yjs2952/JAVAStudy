package examples.study5;

public class Wizard extends Person {

    @Override
    void prepareWeapon() {
        System.out.println("지팡이를 준비합니다.");
    }

    @Override
    void prepareArmor() {
        System.out.println("로브를 입습니다.");
    }
}
