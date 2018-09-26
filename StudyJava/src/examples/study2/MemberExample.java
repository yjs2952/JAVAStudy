package examples.study2;

public class MemberExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("red");
        Member obj3 = new Member("red");

        System.out.println(obj1.hashCode());
        System.out.println(obj1.toString());


        if(obj1.equals(obj2)){
            System.out.println("obj1 와 obj2 는 같다");
        }else{
            System.out.println("obj1 와 obj2 는 다르다");
        }

        if(obj2.equals(obj3)){
            System.out.println("obj2 와 obj3 는 같다");
        }else{
            System.out.println("obj2 와 obj3 는 다르다");
        }
    }
}
