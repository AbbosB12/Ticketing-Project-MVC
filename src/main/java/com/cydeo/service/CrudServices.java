package com.cydeo.service;

import com.cydeo.dto.RoleDTO;

import java.util.List;

public interface CrudServices<T,ID> {


    T save(T object);

    T findByID(ID id);

    List<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
