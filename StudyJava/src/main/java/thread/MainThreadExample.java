package thread;

public class MainThreadExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        User1 user1 = new User1();
        user1.setCalculator(cal);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(cal);
        user2.start();
    }
}

class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    synchronized public void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
    }
}

class User1 extends Thread {
    private Calculator cal;

    public void setCalculator(Calculator cal) {
        this.setName("CalculatorUser01");
        this.cal = cal;
    }

    @Override
    public void run() {
        cal.setMemory(100);
    }
}

class User2 extends Thread {
    private Calculator cal;

    public void setCalculator(Calculator cal) {
        this.setName("CalculatorUser02");
        this.cal = cal;
    }

    @Override
    public void run() {
        cal.setMemory(50);
    }
}
