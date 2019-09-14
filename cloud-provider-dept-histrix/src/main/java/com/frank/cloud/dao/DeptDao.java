package com.frank.cloud.dao;

import com.frank.cloud.entities.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptDao {
    @Insert("INSERT INTO dept(dname,db_source) VALUES(#{dName},DATABASE());")
    boolean addDept(Dept dept);

    @Select("select deptno,dname,db_source from dept where deptno=#{id}; ")
    Dept findById(Long id);

    @Select("select deptno,dname,db_source from dept;")
    List<Dept> findAll();
}
