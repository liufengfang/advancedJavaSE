package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by liufengfang on 2019/1/8.
 */
public class IterElementAttr {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("jim", 10));
        userList.add(new User("tom", 12));

        List<String> nameList = userList.stream().map(User:: getName).collect(Collectors.toList());
        System.out.println(nameList);
    }

}

class User {
    private String name;
    private int age;

    public User(String n, int a) {
        name=n;
        age=a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
