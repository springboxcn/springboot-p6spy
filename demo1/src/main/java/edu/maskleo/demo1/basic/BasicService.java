package edu.maskleo.demo1.basic;

import java.util.List;

public interface BasicService<P, T> {

    void add(T t);

    int modify(T t);

    int delete(P id);

    T selectOne(P id);

    List<T> selectAll();
}
