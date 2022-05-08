package bg.softuni.heroku.service.impl;

import bg.softuni.heroku.model.StudentEntity;
import bg.softuni.heroku.repository.StudentRepository;
import bg.softuni.heroku.service.StudentService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  private final StudentRepository studentRepository;

  public StudentServiceImpl(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Override
  public void init() {
    if (studentRepository.count() == 0) {

      studentRepository.save(new StudentEntity().setName("Pesho"));
      studentRepository.save(new StudentEntity().setName("Anna"));

    }
  }

  @Override
  public List<StudentEntity> findAllStudents() {
    return studentRepository.findAll();
  }
}
