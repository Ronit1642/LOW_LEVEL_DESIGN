package prototyperegistry;


public class Student implements prototype<Student> {
    private int age;
    private String name;
    private String batch;
    private double averageBatchPsp;
    private double studentPsp;

//    public Student clone(){
//        Student s = new Student();
//        s.age = this.age;
//        s.averageBatchPsp = this.averageBatchPsp;
//        s.name = this.name;
//        s.batch = this.batch;
//        s.studentPsp = this.studentPsp;
//        return s;
//    }
    public Student (){}

    public Student (Student s){
        this.age = s.age;
        this.averageBatchPsp = s.averageBatchPsp;
        this.name = s.name;
        this.batch = s.batch;
        this.studentPsp = s.studentPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public void setAge(int age){
        this.age = age;

    }

    public void setName(String name){
        this.name = name;

    }
    public void setBatch(String batch){
        this.batch = batch;


    }
    public void setstudentpsp(int psp){
        this.studentPsp = psp;

    }
}
