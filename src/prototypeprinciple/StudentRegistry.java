package prototypeprinciple;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private final Map<String, Student> hs = new HashMap<>();
    void register(String key, Student s){
        if(s != null && key != null){
            hs.put(key, s);
        }
    }
    public Student get(String key){
        if(key != null){
            return hs.get(key);
        }
        return null;
    }
}
