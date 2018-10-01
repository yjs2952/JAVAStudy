package examples.study3;

import java.util.*;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("spring", "12");
        map.put("summer", "1234");
        map.put("fall", "123");
        map.put("winter", "12345");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("아이디와 패스워드 입력");
            System.out.print("아이디 : ");
            String id = sc.nextLine();

            System.out.print("비밀번호 : ");
            String pw = sc.nextLine();

            if (map.containsKey(id)) {

                if (map.get(id).equals(pw)) {
                    System.out.println("로그인 성공");
                    break;
                } else {
                    System.out.println("비밀번호가 일치 ㄴㄴ");
                }
            } else {
                System.out.println("아이디가 존재하지 않아");
            }
        }
    }
}
