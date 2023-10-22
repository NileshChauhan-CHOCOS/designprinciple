package abstractfactorymethod.datatbases.databasefactory;

import abstractfactorymethod.datatbases.Database;
import abstractfactorymethod.datatbases.enums.DATABASES;
import abstractfactorymethod.datatbases.mongodb.Mongodb;
import abstractfactorymethod.datatbases.postgresql.PostGreSqlServer;

public class NonRelationalDatabaseFactory extends DatabaseFactory {
    @Override
    public Database getDatabase(DATABASES databases) {
        switch (databases){
            case MONGODB -> {
                return Mongodb.getInstance();
            }
            case POSTGRESQL_SERVER -> {
                return PostGreSqlServer.getInstance();
            }
            default -> {
                return null;
            }
        }
    }
}
