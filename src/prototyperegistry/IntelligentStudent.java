package prototyperegistry;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent s){
        super (s);
        this.iq = s.iq;


    }

    @Override
    public IntelligentStudent clone(){
        return  new IntelligentStudent(this);

    }




}
