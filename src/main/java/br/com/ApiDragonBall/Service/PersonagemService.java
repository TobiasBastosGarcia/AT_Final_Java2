package br.com.ApiDragonBall.Service;

import br.com.ApiDragonBall.Model.Personagem;
import br.com.ApiDragonBall.Model.PlanetaOrigem;
import br.com.ApiDragonBall.controllers.PersonagemController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PersonagemService {
    Logger logger = LoggerFactory.getLogger(PersonagemService.class);
    List<Personagem> personagems = initPersonagens();

    private List<Personagem> initPersonagens() {

        PlanetaOrigem planetaOrigem1 = new PlanetaOrigem(0,"Namek");
        PlanetaOrigem planetaOrigem2 = new PlanetaOrigem(1,"Tierra");
        PlanetaOrigem planetaOrigem3 = new PlanetaOrigem(2,"Vegeta");
        PlanetaOrigem planetaOrigem4 = new PlanetaOrigem(3,"Freezer No. 79");

        Personagem personagem1 = new Personagem(0,"Goku","Sayan",planetaOrigem1);
        Personagem personagem2 = new Personagem(1,"Vegeta","Sayan",planetaOrigem2);
        Personagem personagem3 = new Personagem(2,"Piccolo","Namekian",planetaOrigem3);
        Personagem personagem4 = new Personagem(3,"Bulma","Human",planetaOrigem2);
        Personagem personagem5 = new Personagem(4,"Frezzar","Frieza Race",planetaOrigem4);

        ArrayList<Personagem> personagens = new ArrayList<>();
        personagens.add(personagem1);
        personagens.add(personagem2);
        personagens.add(personagem3);
        personagens.add(personagem4);
        personagens.add(personagem5);


        return personagens;
    }
    public List<Personagem> getAll(){
        return personagems;
    }

    public Personagem getById(int id){
        return personagems.get(id);
    }
    public void save(Personagem personagem){
        personagems.add(personagem);
    }
    public Personagem delete(int id){
        return personagems.remove(id);
    }
    public void update(int id, Personagem personagem){
        personagems.remove(id);
        personagems.add(id,personagem);
    }
}
