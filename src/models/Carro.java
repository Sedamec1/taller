package models;

import commons.Imprimir;

public class Carro extends Vehiculo implements InterfaceVehiculo {


    public Carro(){
        this.setTipoVehiculo("Carro");
    }
    @Override
    public void acelerar() {
        System.out.println("acelerando carro");

    }

    @Override
    public void frenar() {
        System.out.println("frenando carro");





    }

    @Override
    public void estacionar() {
        System.out.println("estacionando carro");


    }

    @Override
    public void direccion() {
        System.out.println("direccion carro");
    }

    @Override
    public void print() {
        Imprimir.imprimirCarro(this);
    }


}
