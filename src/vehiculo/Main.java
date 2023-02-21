
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
          
        operativaVehiculosUrbanoSanchezDaniel2223(50);
    }      

    private static void operativaVehiculosUrbanoSanchezDaniel2223(int cantidad) {
        VehiculoUrbanoSanchezDaniel2223 miVehiculo;
        int stockActual;
        
        miVehiculo = new VehiculoUrbanoSanchezDaniel2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculo.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculo.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculo.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    } 
}