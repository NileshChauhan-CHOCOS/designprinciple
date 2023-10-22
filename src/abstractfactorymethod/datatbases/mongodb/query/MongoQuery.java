package abstractfactorymethod.datatbases.mongodb.query;

import abstractfactorymethod.datatbases.Query;

public class MongoQuery implements Query {
    private static MongoQuery instance = null;
    private MongoQuery(){
    }
    @Override
    public String getQuery() {
        return "This is mongoQuery";
    }

    @Override
    public synchronized MongoQuery getInstance() {
        if(instance == null){
            instance = new MongoQuery();
        }
        return instance;
    }
}
