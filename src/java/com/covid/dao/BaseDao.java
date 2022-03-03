
package com.covid.dao;

import java.util.List;

public interface BaseDao<T> {
    boolean save(T ob);
    boolean update(T ob);
    boolean delete(int id);
    List<T> list();
    T get(int id);
}
