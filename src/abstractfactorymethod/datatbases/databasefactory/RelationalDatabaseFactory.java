package abstractfactorymethod.datatbases.databasefactory;

import abstractfactorymethod.datatbases.Database;
import abstractfactorymethod.datatbases.enums.DATABASES;
import abstractfactorymethod.datatbases.mysql.Mysql;
import abstractfactorymethod.datatbases.oracle.Oracle;

public class RelationalDatabaseFactory extends DatabaseFactory {
    @Override
    public Database getDatabase(DATABASES databases) {
        switch (databases){
            case ORACLE -> {
                return Oracle.getInstance();
            }
            case MYSQL -> {
                return Mysql.getInstance();
            }
            default -> {
                return null;
            }
        }
    }
}
