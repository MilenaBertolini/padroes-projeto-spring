package dio.project.java.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjectJavaAndSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectJavaAndSpringApplication.class, args);
	}

}
