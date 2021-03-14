package model;

public class User {
    private int userId;
    private String name;
    private int age;

    // constructori
    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }


    // getteri
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setteri
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
