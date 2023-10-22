package abstractfactorymethod.datatbases.mysql.query;

import abstractfactorymethod.datatbases.Query;

public class MysqlQuery implements Query {
    private static MysqlQuery instance = null;
    private MysqlQuery(){

    }
    @Override
    public String getQuery() {
        return "Select * from employee";
    }

    @Override
    public synchronized MysqlQuery getInstance() {
        if(instance == null){
            instance = new MysqlQuery();
        }
        return instance;
    }
}
