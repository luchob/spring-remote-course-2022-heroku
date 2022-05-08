package bg.softuni.heroku.init;

import bg.softuni.heroku.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInit implements CommandLineRunner {

  private final StudentService studentService;

  public DBInit(StudentService studentService) {
    this.studentService = studentService;
  }

  @Override
  public void run(String... args) throws Exception {
    studentService.init();
  }
}
