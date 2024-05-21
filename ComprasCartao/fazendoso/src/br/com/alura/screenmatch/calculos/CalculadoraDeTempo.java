package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;

    }
    // o Exemplo abaixo, foi para demonstrar que você não pode ficar copiando e colando codigo e fica mais simples a forma apresentada
//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo); // Aqui mostra de onde está importando a duração.
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}