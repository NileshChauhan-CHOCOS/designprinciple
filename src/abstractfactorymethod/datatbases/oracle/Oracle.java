package abstractfactorymethod.datatbases.oracle;

import abstractfactorymethod.datatbases.Database;

public class Oracle implements Database {
    private static Oracle instance = null;
    private Oracle(){}

    public static synchronized Oracle getInstance(){
        if(instance == null){
            instance = new Oracle();
        }
        return instance;
    }

    @Override
    public void connect() {

    }

    @Override
    public void add() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
