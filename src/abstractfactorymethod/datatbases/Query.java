package abstractfactorymethod.datatbases;

public interface Query {
    Query getInstance();
    String getQuery();
}
