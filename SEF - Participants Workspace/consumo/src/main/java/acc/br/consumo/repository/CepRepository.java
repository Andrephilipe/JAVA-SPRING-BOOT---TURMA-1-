package acc.br.consumo.repository;

import org.springframework.data.repository.CrudRepository;

import acc.br.consumo.model.Endereco;
public interface CepRepository extends CrudRepository<Endereco, Integer>{
    
}
