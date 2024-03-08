import models.Carro;
import models.InterfaceVehiculo;
import models.Moto;
import models.Vehiculo;
import services.ServicioVehiculo;

public class Main {

    public static void main(String[] args) {

        Carro carro= new Carro();
        carro.setMarca("Mazda");
        carro.setPlaca("ABC-123");
        carro.setModelo("2024");
        carro.setVelocidadMaxima(200);

        ServicioVehiculo servicioCarro=new ServicioVehiculo(carro);
        servicioCarro.pruebaRuta();

        System.out.println("-------------------------------");
        Moto moto= new Moto();
        moto.setMarca("AKT");
        moto.setPlaca("AKT-123");
        moto.setModelo("2023");
        moto.setVelocidadMaxima(180);
        moto.setCilindraj(125);

        ServicioVehiculo servicioMoto=new ServicioVehiculo(moto);
        servicioMoto.pruebaRuta();


    }

}