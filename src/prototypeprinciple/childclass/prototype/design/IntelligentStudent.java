package prototypeprinciple.childclass.prototype.design;

public class IntelligentStudent extends Student{
    private int iq;
    public IntelligentStudent(){}
    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = 120;
    }
    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent((this));
    }
}
