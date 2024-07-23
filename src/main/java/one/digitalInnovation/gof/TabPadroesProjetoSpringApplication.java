package one.digitalInnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Projeto Springboot gerado via Spring Initializr
 * Os seguintes módulos foram selecionados:
 * Spring Data JPA
 * SpringWeb
 * H2 Database
 * OpenFeign
 */

@EnableFeignClients
@SpringBootApplication
public class TabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TabPadroesProjetoSpringApplication.class, args);
	}

}
