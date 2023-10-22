package prototypeprinciple;

public class Student implements Prototype<Student> {
    private int age;
    private String batch;
    private double averageBatchPsp;
    private double studentPsp;
    private String name;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public double getStudentPsp() {
        return studentPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Student clone() {
        Student es = new Student();
        es.age = this.age;
        es.averageBatchPsp = this.averageBatchPsp;
        es.batch = this.batch;
        es.studentPsp = this.studentPsp;
        es.name = this.name;
        return es;
    }
}
