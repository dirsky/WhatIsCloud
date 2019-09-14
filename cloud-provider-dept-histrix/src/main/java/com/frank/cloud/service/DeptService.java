package com.frank.cloud.service;

import com.frank.cloud.entities.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);
    Dept    get(Long id);
    List<Dept> list();

}
