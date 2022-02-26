package acc.br.pessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import acc.br.pessoa.entity.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> { 
	
}
