package abstractfactorymethod.datatbases.oracle.query;

import abstractfactorymethod.datatbases.Query;

public class OracleQuery implements Query {
    private static OracleQuery instance = null;
    private OracleQuery(){}
    @Override
    public synchronized Query getInstance() {
        if(instance == null){
            instance = new OracleQuery();
        }
        return instance;
    }

    @Override
    public String getQuery() {
        return "This is Oracle Query";
    }
}
