package java3rd.ch14;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Student2 {
    public enum Sex {MALE, FEMALE}

    public enum City {Seoul, Busan}

    @NonNull
    private String name;

    @NonNull
    private int score;

    @NonNull
    private Sex sex;

    private City city;
}
