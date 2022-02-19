package com.example.testevscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class TestevscodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestevscodeApplication.class, args);
	}
	public class Endereco {

		private String cep;
		private String logradouro;
		private String complemento;
		private String bairro;
		private String localidade;
		private String uf;
		private String ibge;
		private String gia;
		private String ddd;
		private String siafi;
	
	}

	@RestController
	public class CepRestService {

    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> getCep(@PathVariable String cep) {

        Endereco endereco = cepService.buscaEnderecoPorCep(cep);

        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build(); 
    }

}
		@FeignClient(url= "https://viacep.com.br/ws/" , name = "viacep")
		public interface CepService {

		@GetMapping("{cep}/json")
		Endereco buscaEnderecoPorCep(@PathVariable("cep") String cep);

}

}
