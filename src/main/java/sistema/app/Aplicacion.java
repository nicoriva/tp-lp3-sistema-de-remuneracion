package sistema.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"sistema"})
@EnableJpaRepositories(basePackages = {"sistema"})
@EntityScan(basePackages = {"sistema"})
public class Aplicacion {

	//metodo main para ejecutar el programa
	public static void main(String[] args) {
		SpringApplication.run(Aplicacion.class, args);
	}
}
