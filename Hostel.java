package com.springboot.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Component
public class Hostel {
    @Id
    private int Hid;
    private int fee;
    private int sharing;
    @OneToMany
    private List<Student> student;
    private int rno;

    public int getHid() {
        return Hid;
    }

    public void setHid(int hid) {
        Hid = hid;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public int getSharing() {
        return sharing;
    }

    public void setSharing(int sharing) {
        this.sharing = sharing;
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "Hid=" + Hid +
                ", fee=" + fee +
                ", sharing=" + sharing +
                ", student=" + student +
                ", rno=" + rno +
                '}';
    }
}
