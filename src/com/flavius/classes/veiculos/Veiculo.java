package com.flavius.classes.veiculos;

public class Veiculo {

    public String placa;
    private String marca;
    private String modelo;
    private double fatorEstacionamento;
    private String horaEntrada;
    private String horaSaida;
    private double totalEstacionamento;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String a) {
        this.marca = a;
    }
}