package prototypeprinciple.childclass.prototype.design;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private final Map<String, Student> hs = new HashMap<>();
    public void fillRegister(String key, Student st){
        hs.put(key,st);
    }
    public Student get(String key){
        return hs.get(key);
    }
}
