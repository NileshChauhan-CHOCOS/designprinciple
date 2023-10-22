package abstractfactorymethod.datatbases.postgresql.query;

import abstractfactorymethod.datatbases.Query;

public class PostGreSqlQuery implements Query {
    private static PostGreSqlQuery instance = null;
    private PostGreSqlQuery(){}

    @Override
    public synchronized Query getInstance() {
        if(instance == null){
            instance = new PostGreSqlQuery();
        }
        return instance;
    }

    @Override
    public String getQuery() {
        return "This is PostGreSql Query Pattern";
    }

}
