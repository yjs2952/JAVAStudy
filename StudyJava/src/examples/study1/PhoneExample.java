package examples.study1;

public class PhoneExample {
    public static void main(String[] args){

        //Phone phone = new Phone("홍킬통");

        SmartPhone sm = new SmartPhone("홍킬통");

        sm.turnOn();
        sm.internetSearch();
        sm.turnOff();
    }
}
