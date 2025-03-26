package builderdesignpattern;

public class client {
    public static void main(String [] args) throws Exception {
        Helper h = new Helper("Sneha","sneha@gmail.com",22,"7294094060",5);
        Student s = new Student(h);

        System.out.println(s);


    }
}


