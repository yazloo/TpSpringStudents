package ma.TpStudent.services;

import ma.TpStudent.dto.StudentDto;

import java.util.List;

public interface InterfaceService {

    StudentDto create(StudentDto dto);
    StudentDto update(StudentDto dto);
    boolean delete(long id);
    List<StudentDto>select();
}
