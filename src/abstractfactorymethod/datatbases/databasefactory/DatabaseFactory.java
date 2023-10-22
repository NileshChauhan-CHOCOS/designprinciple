package abstractfactorymethod.datatbases.databasefactory;

import abstractfactorymethod.datatbases.Database;
import abstractfactorymethod.datatbases.enums.DATABASES;
import abstractfactorymethod.datatbases.enums.DATABASE_TYPE;

public abstract class DatabaseFactory {
    public static DatabaseFactory getDatabaseFactory(DATABASE_TYPE databaseType){
        switch (databaseType){
            case RELATIONAL -> {
                return new RelationalDatabaseFactory();
            }
            case NON_RELATIONAL -> {
                return new NonRelationalDatabaseFactory();
            }
            default -> {
                return null;
            }
        }
    }
    public abstract Database getDatabase(DATABASES databases);

}
