package com.springboot.project.service;

import com.springboot.project.model.Student;
import com.springboot.project.model.Hostel;
import com.springboot.project.repository.HostelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostelService {
@Autowired
    private HostelRepository hostelRepository;

    public HostelService() {
        this.hostelRepository = new HostelRepository();
    }

    public void addStudent(Student student) {
        hostelRepository.save(student);
        System.out.println("Student saved successfully!");
    }

    public List<Student> fetchStudents() {
        return hostelRepository.showAllStudents();
    }

    public List<Hostel> fetchHostels() {
        return hostelRepository.showAllHostels();
    }

    public void close() {
        hostelRepository.close();
    }
}

