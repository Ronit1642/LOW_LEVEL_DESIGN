package builderdesignpattern;


public class Student {
    String name;
    String email;
    int age;
    String phoneno;
    double psp;

    public Student(Helper h) throws Exception{
        if(h.getage()>100){
            throw new Exception("age should be less");
        }
        if(h.getpsp()<0){
            throw new Exception ("psp should be greater than ");
        }
        this.name = h.getname();
        this.email = h.getemail();
        this.age = h.getage();
        this.phoneno = h.getphoneno();
        this.psp = h.getpsp();


    }

}
