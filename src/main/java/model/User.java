package model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
    @Min(18)
    private int age;
    @NotEmpty
    @Size(min = 2, max = 20)
    private String name;

    public User(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
