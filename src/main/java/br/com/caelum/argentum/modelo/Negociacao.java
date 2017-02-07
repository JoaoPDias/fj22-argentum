package main.java.br.com.caelum.argentum.modelo;

import org.joda.time.DateTime;

public class Negociacao {
    private final double preco;
    private final int quantidade;
    private final DateTime data;

    public Negociacao(double preco, int quantidade, DateTime data) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public DateTime getData() {
        return data;
    }
    public double getVolume()
    {
        return preco*quantidade;

    }
}
