package com.southwind.fegin.impl;

import com.southwind.entity.Student;
import com.southwind.fegin.FeginProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeginError implements FeginProviderClient {
    @Override
    public Collection<Student> findAll() {
        System.out.println("维护中......");
        return null;
    }
}
