package prototypeprinciple;

public class Client {
    public static void register(StudentRegistry registry){
        Student s1 = new Student();
        s1.setBatch("April21");
        s1.setAverageBatchPsp(46.74);
        registry.register("april21", s1);
    }
    public static void main(String[] args) {
        StudentRegistry sr = new StudentRegistry();
        register(sr);
        Student ps = sr.get("april21").clone();
        ps.setName("Nilesh Chauhan");
        ps.setAge(25);
        ps.setStudentPsp(67.89);
        System.out.println("Debug");
    }
}
