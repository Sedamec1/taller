package commons;

import models.Carro;
import models.Moto;
import models.Vehiculo;

public class Imprimir {


    public static void ImprimirMoto(Moto moto){
        ImprimirVehiculo(moto);
        System.out.println("Cilindrage:"+moto.getCilindraj());

    }

    public static void imprimirCarro(Carro carro){
        ImprimirVehiculo(carro);
    }
    public static void ImprimirVehiculo(Vehiculo vehiculo){
        System.out.println("tipo vehiculo:"+ vehiculo.getTipoVehiculo()+"\n"+
                "Placa:"+vehiculo.getPlaca());
    }
}
