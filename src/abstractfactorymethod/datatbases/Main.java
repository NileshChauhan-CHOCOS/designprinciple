package abstractfactorymethod.datatbases;

import abstractfactorymethod.datatbases.databasefactory.DatabaseFactory;
import abstractfactorymethod.datatbases.enums.DATABASES;
import abstractfactorymethod.datatbases.enums.DATABASE_TYPE;

public class Main {
    public static void main(String[] args) {
        DatabaseFactory databaseFactory = DatabaseFactory.getDatabaseFactory(DATABASE_TYPE.NON_RELATIONAL);
        assert databaseFactory != null;
        Database database = databaseFactory.getDatabase(DATABASES.MONGODB);
        database.connect();
        databaseFactory = DatabaseFactory.getDatabaseFactory(DATABASE_TYPE.RELATIONAL);
        assert databaseFactory != null;
        database = databaseFactory.getDatabase(DATABASES.MYSQL);
        database.connect();
    }
}
