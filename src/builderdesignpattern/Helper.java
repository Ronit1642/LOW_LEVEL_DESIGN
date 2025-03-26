package builderdesignpattern;

public class Helper {
    String name;
    String email;
    int age;
    String phoneno;
    double psp;

    public Helper(String name, String email, int age, String phoneno, double psp) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phoneno = phoneno;
        this.psp = psp;


    }

    public String getname() {
        return name;

    }

    public String getemail() {
        return email;

    }

    public int getage() {
        return age;
    }

    public String getphoneno() {
        return phoneno;
    }

    public double getpsp() {
        return psp;
    }
}


