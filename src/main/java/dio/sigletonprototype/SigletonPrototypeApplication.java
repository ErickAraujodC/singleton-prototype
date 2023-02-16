package dio.sigletonprototype;

import dio.sigletonprototype.app.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SigletonPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigletonPrototypeApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(SistemaMensagem sistema){
		return args -> {
			sistema.enviarMsgCadastro();
			sistema.enviarMsgBemVindo();
			sistema.enviarMsgCadastro();
		};
	}
}
