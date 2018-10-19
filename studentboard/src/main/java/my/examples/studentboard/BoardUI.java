package my.examples.studentboard;

import my.examples.studentboard.vo.Student;

import java.util.List;
import java.util.Scanner;

/**
 * 화면에 메뉴 및 목록 보여주기 위한 클래스
 */
public class BoardUI {

    public int main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("선택 (1: 학생등록, 2: 학생목록 보기, 3: 종료) : ");
        int num = sc.nextInt();

        return num;
    }

    public Student addStudent(){

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("국어 : ");
        int kor = sc.nextInt();

        System.out.print("영어 : ");
        int eng = sc.nextInt();

        System.out.print("수학 : ");
        int math = sc.nextInt();

        sc.nextLine();

        System.out.print("등록 할까요? (Y/N)");
        String input = sc.nextLine();

        if (input.equals("Y")) {
            Student student = new Student();
            student.setName(name);
            student.setKorScore(kor);
            student.setEngScore(eng);
            student.setMathScore(math);
            return student;
        } else if (input.equals("N")) {
            return null;
        }

        return null;
    }

    public void listStudent(List<Student> list){
        System.out.println("------------------------------------");
        System.out.printf("|%6s %6s %5s %4s\t\t|\n", "이름", "국어", "영어", "수학");
        System.out.println("------------------------------------");
        for (Student student : list) {
            System.out.printf("|%6s %6d %6d %6d\t\t|\n",student.getName(),student.getKorScore(),student.getEngScore(),student.getMathScore());
        }
        System.out.println("------------------------------------");
    }

    public boolean end(){
        System.out.println("종료합니다.");
        return false;
    }
}
