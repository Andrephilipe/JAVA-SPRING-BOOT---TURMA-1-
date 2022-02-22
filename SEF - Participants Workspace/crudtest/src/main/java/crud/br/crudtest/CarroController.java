package crud.br.crudtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarroController {
    @Autowired
    CarroRepositorio repository;

    @GetMapping("/carro")
    public List<Carro> getAllCarros(){
      return repository.findAll();
    }
    @GetMapping("/carro/{id}")
    public Carro getCarroByld(@PathVariable Long id){
        return repository.findById(id).get();
    }
    @PostMapping("/carro")
    public Carro saveCarro(@RequestBody Carro carro){
        return repository.save(carro);
    }
    @DeleteMapping("/carro/{id}")
    public void deletarCarro(@PathVariable Long id){
        repository.deleteById(id);
    }
   
}
