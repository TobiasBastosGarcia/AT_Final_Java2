package br.com.ApiDragonBall.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class Personagem {
    private int id;
    private String name;
    private String race;
    private PlanetaOrigem planetaOrigem;
}

