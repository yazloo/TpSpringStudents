package ma.TpStudent.mappers;

import ma.TpStudent.dto.StudentDto;
import ma.TpStudent.entities.StudentEntitie;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClassMappers {
    public StudentDto convertDto(StudentEntitie entity)
    {
        StudentDto dto=new StudentDto();
        dto.setId(entity.getId());
        dto.setNom(entity.getName());
        dto.setAge(entity.getId());
        return  dto;
    }

    public StudentEntitie convertEntity(StudentDto dto)
    {
        StudentEntitie entity=new StudentEntitie();
        entity.setId(dto.getId());
        entity.setName(dto.getNom());
        entity.setAge(dto.getNom());
        return entity;
    }
    public List<StudentDto> convertDtos(List<StudentEntitie> entities)
    {
        return  entities.stream().map(entity->convertDto(entity)).collect(Collectors.toList());
    }

    public List<StudentEntitie> ConvertEntity(List<StudentDto> dtos)
    {
        return dtos.stream().map(dto ->convertEntity(dto)).collect(Collectors.toList());
    }

}
