package bg.softuni.heroku.web;

import bg.softuni.heroku.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

  private final StudentService studentService;

  StudentController(StudentService studentService) {

    this.studentService = studentService;
  }

  @GetMapping("/")
  public String all(Model model) {

    model.addAttribute("students", studentService.findAllStudents());

    return "students";
  }

}
