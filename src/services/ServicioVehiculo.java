package services;

import models.InterfaceVehiculo;
import models.Vehiculo;

public class ServicioVehiculo {
    private InterfaceVehiculo vehiculo;
    public  ServicioVehiculo(InterfaceVehiculo vehiculoExt){
        this.vehiculo= vehiculoExt;

    }


    public void pruebaRuta(){
        this.vehiculo.print();
        this.vehiculo.direccion();
        this.vehiculo.acelerar();
        this.vehiculo.estacionar();
        this.vehiculo.frenar();

    }




}
