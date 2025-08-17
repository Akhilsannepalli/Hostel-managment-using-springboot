package com.springboot.project;

import com.springboot.project.model.Hostel;
import com.springboot.project.model.Student;
import com.springboot.project.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HostelController {
    @Autowired
    private HostelService hs;

    @RequestMapping("/")
    public String hostel(){

        return "webApp/index.jsp";
    }
    @RequestMapping("/addStudent")
    public ModelAndView addStudent(@RequestParam int sid, @RequestParam int age,@RequestParam String sname,@RequestParam int hostelId) {
            Hostel hostel = new Hostel();
            hostel.setRno(hostelId);

            Student student = new Student();
            student.setSid(sid);
            student.setAge(age);
            student.setSname(sname);
            student.setHostel(hostel);

            hs.addStudent(student);

            ModelAndView mv = new ModelAndView("addstudent.jsp");
            mv.addObject("student", student);
            return mv;
        }
    @RequestMapping("/showHostels")
    public ModelAndView showinghostels(){
        List<Hostel> hostel=hs.fetchHostels();
        ModelAndView mv=new ModelAndView("Hostel.jsp");
        mv.addObject("hostel", hostel);
        return mv;
    }
    @RequestMapping("/showStudents")
    public ModelAndView showingstudents(){
        List<Student> student=hs.fetchStudents();
        ModelAndView mv=new ModelAndView("Student.jsp");
        mv.addObject("student",student);
        return  mv;
    }
}

