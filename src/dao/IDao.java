package dao;

import java.util.List;

public interface IDao<T, ID> {

    List<T> findAll();

    T findById(ID id);

    T save(T t);

    List<T> saveAll(List<T> liste);

    T update(T t);

    boolean delete(T t);

    boolean deleteByUD(ID id);



}