package com.southwind.repository.impl;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    public static Map<Long, Student> maps;

    static {
        maps = new HashMap<>();
        maps.put(1L,new Student(1L,"zhansan",23));
        maps.put(2L,new Student(2L,"lisi",24));
        maps.put(3L,new Student(3L,"wangwu",25));
    }
    @Override
    public Collection<Student> findAll() {
        Collection<Student> values = maps.values();
        return values;
    }

    @Override
    public Student findById(long id) {
        return maps.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        maps.put(student.getId(),student);
    }

    @Override
    public void removeStudent(long id) {
        maps.remove(id);
    }
}
