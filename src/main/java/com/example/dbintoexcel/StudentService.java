package com.example.dbintoexcel;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    List< Student > getTheListStudent();
}