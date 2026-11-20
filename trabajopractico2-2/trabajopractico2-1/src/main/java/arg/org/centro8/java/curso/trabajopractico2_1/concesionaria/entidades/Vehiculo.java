package arg.org.centro8.java.curso.trabajopractico2_1.concesionaria.entidades;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public abstract class Vehiculo implements Comparable<Vehiculo> {
    /*
     * Clase abstracta no se puede crear objetos, se utiliza el abstract
     * para favorecer la herencia
     */
     
    // se implemento la interfaz Comparable en la clase abstracta Vehiculo
    private String marca;
    private String modelo;
    private double precio;

    @Override
    public int compareTo(Vehiculo vehiculo) {
        // compareTo es un metodo que define el orden natural
        // this.objeto que llama
        String esteVehiculo = this.marca + "," + this.modelo + "," +
                this.precio;
        String otroVehiculo = vehiculo.marca + "," + vehiculo.modelo + "," + vehiculo.precio;
        return esteVehiculo.compareTo(otroVehiculo);
        /*
         * se compara el String se utiliza compareTo de la clase
         * String para comparar ambas representaciones, tammbien para realizar
         * ordenamiento natural(es el orden de clasificacion que se aplica al
         * objeto)un ejemplo seria el orden numerico para ordenar enteros
         */

    }

    @Override
    public String toString() {
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols(Locale.GERMANY);
        // Locale.GERMANY configura punto para miles y coma para los decimales
        DecimalFormat df = new DecimalFormat("$#,##0.00", simbolo);

        return "marca:" + marca + "//  modelo:" + modelo + ",  precio:" + df.format(precio) + "//";
    }

}
