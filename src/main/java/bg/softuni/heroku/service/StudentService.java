package bg.softuni.heroku.service;

import bg.softuni.heroku.model.StudentEntity;
import java.util.List;

public interface StudentService {

  void init();

  List<StudentEntity> findAllStudents();

}
