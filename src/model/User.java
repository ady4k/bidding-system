package model;

import collections.service.ListService;

public class User {
    //private static List<User> lista = new ArrayList<>();
    private static int userId = 0;
    private final int CurrId;

    private String name;
    private int age;
    private String location;
    private static final ListService lstSrv = new ListService();

    // constructori
    public User(String name, int age, String location) {
        this.CurrId = userId++;
        this.name = name;
        this.age = age;
        this.location = location;
        this.addUser();
    }

    public void addUser() {
        lstSrv.addUser(this);
    }

    // getteri
    public static int getUserId() {
        return userId;
    }

    public int getCurrId() {
        return CurrId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }


    // setteri
    public static void setUserId(int userId) {
        User.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    // override
    @Override
    public String toString() {
        return "User{" +
                "CurrId=" + CurrId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}