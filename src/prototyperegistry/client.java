package prototyperegistry;

public class client {
    public static void main(String[] args){
        StudentRegistry reg = new StudentRegistry();
        fillregistry(reg);

        Student copy = reg.get("27_wed_mar").clone();
        Student isCopy = reg.get("27_wed_mar_is").clone();
//        Student copy = original.clone();
//        copy.setstudentpsp(26);
        System.out.println(copy);

    }
    public static void fillregistry(StudentRegistry reg){
        Student original = new Student();
        original.setBatch("August");
        original.setAge(26);
        reg.registry("27_wed_mar",original);

        IntelligentStudent is = new IntelligentStudent();
        is.setBatch("Aug");
        is.setAge(20);
        reg.registry("27_wed_mar_is",is);

    }
}
