package br.com.dio.desafio.dominio;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class OrdenarRanking {
    private List<Dev> rankingsDevs;
  


    public OrdenarRanking() {
        this.rankingsDevs = new ArrayList<>();
    }

    public void adicionarDev (String nome, double XP_PADRAO){
        rankingsDevs.add(new Dev (nome,XP_PADRAO));
    }

    public List<Dev> ordenadoPorXp() { 
        List<Dev> ordenadoPorXp = new ArrayList<>(rankingsDevs);
        Collections.sort(ordenadoPorXp);
        return ordenadoPorXp;

    }
}
