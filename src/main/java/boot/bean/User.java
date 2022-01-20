package boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public String name;
    public int age;
    public Pet pet;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
