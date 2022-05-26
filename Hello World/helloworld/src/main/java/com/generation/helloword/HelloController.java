package com.generation.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
		@GetMapping
		public String HelloWord() {
			return "Hello Word Turma 53";
	}
	
		@GetMapping("/bsm")
		public String bsm() {
			return  "Comunicação <br />"
					+"Orientação ao Detalhe <br />"
					+"Proatividade <br />"
					+"Trabalho em Equipe <br />"
					+"Mentalidade de Crescimento <br />"
					+"Persistência <br />"
					+"Responsabilidade Pessoal <br />"
					+"Orientação ao Futuro <br />";
	}
		
		@GetMapping("/objetivos")
		public String objetivos() {
			return  "Aprender sobre o Spring Boot <br />"
					+"Desenvolver o Projeto Integrador <br />"
					+"Desenvolver o Blog Pessoal <br />";
			
		}
		

}
