package ma.TpStudent.swagger;



import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class ClassSwagger {
    @Bean
    public Docket api()

    {
        return  new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors
                .basePackage("ma.sp1.controllers")).build();
    }



}
