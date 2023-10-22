package abstractfactorymethod.datatbases.postgresql;

import abstractfactorymethod.datatbases.Database;

public class PostGreSqlServer implements Database {
    private static PostGreSqlServer instance = null;
    private PostGreSqlServer(){}
    public static synchronized PostGreSqlServer getInstance(){
        if(instance == null){
            instance = new PostGreSqlServer();
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
