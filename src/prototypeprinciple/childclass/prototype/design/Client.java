package prototypeprinciple.childclass.prototype.design;
public class Client {
    public static void register(StudentRegistry registry){
        Student s1 = new Student();
        s1.setBatch("April21");
        s1.setBatchPsp(46.74);
        registry.fillRegister("april21", s1);

        IntelligentStudent s2 = new IntelligentStudent();
        s2.setBatch("April21");
        s2.setBatchPsp(46.78);
        registry.fillRegister("intelligentst", s2);
    }
    public static void main(String[] args) {
        StudentRegistry sr = new StudentRegistry();
        register(sr);
        Student ps = sr.get("april21").clone();
        ps.setName("Nilesh Chauhan");
        ps.setAge(25);
        ps.setStudentPsp(67.89);

        Student  its = sr.get("intelligentst").clone();
        its.setAge(34);
        its.setName("Sidhharat");
        its.setStudentPsp(56.78);
        System.out.println("Debug");
    }
}
