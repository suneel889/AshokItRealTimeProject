package com.example.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@EnableSwagger2
@Configuration
@EnableWebMvc
//@OpenAPIDefinition
public class SwaggerConfigs {
	
	@Bean
	public Docket createDocker() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example"))
				.paths(PathSelectors.any())
				.build();
				/*.useDefaultResponseMessages(true)
				.apiInfo(createApiinfo());*/
	}
	
	
	private ApiInfo createApiinfo() {
		Contact contact=new Contact("raja","https://ww.suneel.com/rest","katamanisuneel89@gmail.com");
		return new ApiInfo("Actor.APIDoc1","APIInfoActorAPI","3.1release","https://ww.suneel.com/licence",contact,"GNU public"
				,"http://www.gnu.licence.com",
				Collections.EMPTY_LIST);
		
	}

	
	
	 
	          
	}
