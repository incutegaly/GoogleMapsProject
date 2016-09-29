package com.example.computador.mapsproject;

/**
 * Created by COMPUTADOR on 27/09/2016.
 */

public class Locais {
    @Override
    public String toString() {
        return "Locais{" +
                "nome='" + nome + '\'' +
                ", viz='" + viz + '\'' +
                '}';
    }

    String nome;

    public String getViz() {
        return viz;
    }

    public void setViz(String viz) {
        this.viz = viz;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    String viz;
}
