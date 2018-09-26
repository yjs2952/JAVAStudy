package examples.study;

public class DroneTest {
    public static void main(String args[]){

        Drone[] d1 = new Drone[1000000000];
        for(int i=0; i<d1.length; i++){
            d1[i] = new Drone();
        }
    }
}
