package java3rd.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
    private String name;
    private String id;
    private Address address;
}
