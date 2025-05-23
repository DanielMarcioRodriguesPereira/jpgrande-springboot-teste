package com.dmrp.jpgrande.springboot.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dmrp.jpgrande.springboot.test.modelo.entidades.Usuario;
import com.dmrp.jpgrande.springboot.test.modelo.repositorios.UsuarioRepository;

@SpringBootApplication
public class JpgrandespringboottesteApplication {

	private static final Logger log = LoggerFactory.getLogger(JpgrandespringboottesteApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(JpgrandespringboottesteApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UsuarioRepository repository) {
		return (args) -> {
			repository.save(new Usuario("Pedro Pereira", "pedro@gmail.com"));
			repository.save(new Usuario("Rogerio Ferreira", "rogerFer@hotmail.com"));
			repository.save(new Usuario("Pedro Pereira", "pedro@gmail.com")); // Eu não deveria deixar o mesmo email ter dois IDs...

			//fetch TODOS!!!!!!
			log.info("Todos os Usuários encontrados (espero eu) //findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach(usuario -> {
				log.info(usuario.toString());
			});
			log.info("");

			//fetch ID do individuo
			Usuario usuario = repository.findById(1L);
			log.info("Usuário ID 1 encontrado //findById(1L):");
			log.info("--------------------------------");
			log.info(usuario.toString());
			log.info("");

			//fetch pelo email (legal)
			log.info("Usuário encontrado pelo email //findByEmail('pedro@gmail.com'):");
			log.info("--------------------------------------------");
			repository.findByEmail("pedro@gmail.com").forEach(gmail -> {
				log.info(gmail.toString());
			});
			log.info("");
		};
	}

}
