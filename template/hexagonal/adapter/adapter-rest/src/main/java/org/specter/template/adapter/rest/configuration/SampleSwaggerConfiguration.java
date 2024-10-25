package org.specter.template.adapter.rest.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
    servers = {
        @Server(url = "http://localhost:8080", description = "로컬")
    },
    info = @Info(
        title = "Hexagonal template",
        description = "Hexagonal architecture 구현을 위한 템플릿 프로젝트",
        contact = @Contact(
            name = "devKShull",
            url = "https://github.com/devKShull"
        )
    )
)
@Configuration
public class SampleSwaggerConfiguration {

}
