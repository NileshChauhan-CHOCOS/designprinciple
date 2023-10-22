package prototypeprinciple.childclass.prototype.design;

public class Student implements Prototype<Student>{
    private String name;

    private String batch;
    private int age;
    private double studentPsp;
    private double batchPsp;
    public Student(){}
    public Student(Student student) throws IllegalArgumentException{
        if(student != null){
            this.age= student.age;
            this.batch = student.batch;
            this.batchPsp = student.batchPsp;
            this.studentPsp = student.studentPsp;
            this.name = student.name;
        }
        else{
            throw new IllegalArgumentException("Cannot create Object");
        }
    }
    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getBatchPsp() {
        return batchPsp;
    }
    public void setBatchPsp(double batchPsp) {
        this.batchPsp = batchPsp;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setStudentPsp(double studentPsp){
        this.studentPsp = studentPsp;
    }
    public Student clone(){
        return new Student(this);
    }
}
