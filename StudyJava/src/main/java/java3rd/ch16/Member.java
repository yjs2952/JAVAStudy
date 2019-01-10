package java3rd.ch16;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {

    public static final int MALE = 0;
    public static final int FEMALE = 1;

    private String name;
    private int sex;
    private int age;
}
