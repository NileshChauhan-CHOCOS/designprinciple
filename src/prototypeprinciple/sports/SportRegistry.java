package prototypeprinciple.sports;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

public class SportRegistry {
    private static final Map<String,Sport> hs = new HashMap<>();
    private static SportRegistry instance = null;
    private SportRegistry(){
    }

    public static synchronized SportRegistry getInstance(){
        if(instance == null){
            instance=new SportRegistry();
        }
        return instance;
    }
    public void register(String key, Sport sport){
        hs.put(key, sport);
    }
    public Sport get(String key){
        return hs.get(key);
    }
    public void print(){
        for(Map.Entry<String, Sport> entry : hs.entrySet()){
            System.out.println(entry.getValue().toString());
            System.out.println("=========================================");
        }
    }
}
