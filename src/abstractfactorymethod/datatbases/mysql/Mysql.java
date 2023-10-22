package abstractfactorymethod.datatbases.mysql;

import abstractfactorymethod.datatbases.Database;

public class Mysql implements Database {
   private static Mysql instance = null;
   private Mysql(){}
    public static synchronized Mysql getInstance(){
       if(instance == null){
           instance = new Mysql();
       }
       return instance;
    }

    @Override
    public void connect() {
        System.out.println("You are connected to Mysql database " + instance);
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
