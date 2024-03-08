package models;

import commons.Imprimir;

public class Moto extends Vehiculo implements InterfaceVehiculo {
    public int getCilindraj() {
        return cilindraj;
    }

    public Moto(){
        this.setTipoVehiculo("Moto");
    }

    public void setCilindraj(int cilindraj) {
        this.cilindraj = cilindraj;
    }

    private int cilindraj;

    @Override
    public void acelerar() {
        System.out.println("acelerando moto");
    }

    @Override
    public void frenar() {
        System.out.println("frenando moto");



    }

    @Override
    public void estacionar() {
        System.out.println("estacionando moto");

    }

    @Override
    public void direccion() {
        System.out.println("direccion moto");

    }

    @Override
    public void print() {
        Imprimir.ImprimirMoto(this);
    }
}
