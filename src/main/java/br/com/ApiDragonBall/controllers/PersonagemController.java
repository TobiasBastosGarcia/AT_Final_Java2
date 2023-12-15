package br.com.ApiDragonBall.controllers;
import br.com.ApiDragonBall.Model.Personagem;
import br.com.ApiDragonBall.Model.PlanetaOrigem;
import br.com.ApiDragonBall.Service.PersonagemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/personagem")
public class PersonagemController {
    @Autowired
    PersonagemService personagemService;
    Logger logger = LoggerFactory.getLogger(PersonagemController.class);



    @GetMapping()
    public List<Personagem> getAll(){
        logger.info("Get all personagens");
        return personagemService.getAll();
    }
    @GetMapping("/{id}")
    public Personagem getById(@PathVariable int id){
        logger.info("Get one personagem");
        return personagemService.getById(id);
    }
    @PostMapping
    public void save(@RequestBody Personagem personagem){
        logger.info("Create personagem");
        personagemService.save(personagem);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        logger.info("Deletar personagem"+id);
        Personagem removed = personagemService.delete(id);
        logger.info("Personagem deletado"+ removed);

    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id,@RequestBody Personagem personagem){
        logger.info("Atualizar personagem" + id + "Personagem" + personagem  );
        personagemService.update(id,personagem);

    }


}
