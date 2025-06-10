package structural.filter;

import java.util.List;

public interface Filter<T> {
    List<T> doFilter(List<T>items);
}
