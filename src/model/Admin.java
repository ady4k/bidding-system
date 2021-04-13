package model;

public class Admin extends User{
    private int adminLevel;
    // permisiuni la toate licitatiile, la toate produsele
    // poate sterge / modifica direct licitatia
    // permisiuni peste seller

    // constructori
    public Admin(String name, int age, String location, int adminLevel) {
        super(name, age, location);
        this.adminLevel = adminLevel;
    }

    // getteri
    public int getAdminLevel() {
        return adminLevel;
    }

    // setteri
    public void setAdminLevel(int adminLevel) {
        this.adminLevel = adminLevel;
    }
}
