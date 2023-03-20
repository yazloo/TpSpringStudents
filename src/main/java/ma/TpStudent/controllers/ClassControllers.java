package ma.TpStudent.controllers;


import ma.TpStudent.dto.StudentDto;
import ma.TpStudent.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")


public class ClassControllers
{
       private static final Logger LOGGER= LoggerFactory.getLogger(ClassControllers.class);
       private StudentService service;

       public  ClassControllers(StudentService service)
       {
          this.service=service;
       }
  @PostMapping("/create")
       public  StudentDto save(@RequestBody StudentDto dto)
         {
           LOGGER.debug("start save dto : {}",dto);
           StudentDto result=service.create(dto);
           LOGGER.debug("end save");
           return  result;
         }
  @PutMapping("/update")
       public StudentDto update(@RequestBody StudentDto dto)
        {
            LOGGER.debug("start update dto : {}",dto);
            StudentDto result=service.update(dto);
            LOGGER.debug("end update");
            return  result;
        }
  @DeleteMapping("/{id}")
       public boolean delete (@PathVariable("id") long id)
       {
           LOGGER.debug("start delete id :"+id);
           boolean result=service.delete(id);
           LOGGER.debug("end delete ");
           return  result;
       }
  @GetMapping("/select")
       public List<StudentDto>selectAll()
      {
           LOGGER.debug("start  selectAll");
           List<StudentDto>lls=service.select();
           LOGGER.debug("end methode selectAll");
           return lls;
      }
}
