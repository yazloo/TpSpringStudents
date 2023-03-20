package ma.TpStudent.services;

import ma.TpStudent.dto.StudentDto;
import ma.TpStudent.mappers.ClassMappers;
import ma.TpStudent.repositories.InterfaceRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements InterfaceService {
    private static final Logger LOGGER= LoggerFactory.getLogger(StudentService.class);
     public InterfaceRepositories repos;
     public ClassMappers mappers;

     public StudentService(InterfaceRepositories repos,ClassMappers mappers)
     {
        this.repos=repos;
        this.mappers=mappers;
     }

    @Override
    public StudentDto create(StudentDto dto) {
         LOGGER.debug("Start method create: {}",dto);
        return mappers.convertDto(repos.save(mappers.convertEntity(dto)));
    }

    @Override
    public StudentDto update(StudentDto dto) {
        LOGGER.debug("Start method update:");
        return mappers.convertDto(repos.save(mappers.convertEntity(dto)));
    }

    @Override
    public boolean delete(long id) {
        LOGGER.debug("start method delete ");
        repos.deleteById(id);
        return true;
    }
    @Override
    public List<StudentDto> select() {
        LOGGER.debug("start method select ");
       return mappers.convertDtos(repos.findAll());
    }
}
