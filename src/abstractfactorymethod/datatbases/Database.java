package abstractfactorymethod.datatbases;

public interface Database {
    void connect();
    void add();
    void update();
    void delete();
}
