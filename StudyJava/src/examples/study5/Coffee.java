package examples.study5;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew(){
        System.out.println("필터를 통해 커피를 우려내는 중");
    }

    @Override
    public void addCondiments(){
        System.out.println("설탕과 우유를 추가하는 중");
    }

    @Override
    boolean customerWantsCondiments() {
        return super.customerWantsCondiments();
    }
}
