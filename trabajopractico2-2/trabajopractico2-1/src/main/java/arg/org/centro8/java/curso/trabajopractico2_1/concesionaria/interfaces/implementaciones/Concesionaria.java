package arg.org.centro8.java.curso.trabajopractico2_1.concesionaria.interfaces.implementaciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import arg.org.centro8.java.curso.trabajopractico2_1.concesionaria.entidades.Auto;
import arg.org.centro8.java.curso.trabajopractico2_1.concesionaria.entidades.Moto;
import arg.org.centro8.java.curso.trabajopractico2_1.concesionaria.entidades.Vehiculo;
import arg.org.centro8.java.curso.trabajopractico2_1.concesionaria.interfaces.IConcesionariaVehiculo;
import lombok.Data;

@Data

public class Concesionaria implements IConcesionariaVehiculo {
        private List<Vehiculo> vehiculos = new ArrayList<>();

        // se creo una lista de la clase Vehiculos
        // este metodo muestra la lista,vehiculos
        @Override
        public void mostrarListaDeVehiculo() {
                vehiculos.add(new Auto("Peugeot", "206", 4, 200000));
                vehiculos.add(new Moto("Honda", "Titan", 125, 60000));
                vehiculos.add(new Auto("Peugeot", "208", 5, 250000));
                vehiculos.add(new Moto("Yamaha", "YBR", 160, 80500.50));
                vehiculos.forEach(System.out::println);
                /*
                 * se modifico y se elimino el constructor(metodo que permiten creae objetos de
                 * una clase) de la clase que tenia
                 * //de parametro List <Vehiculo> vehiculos.
                 * el constructor anteriormente puesto permitia crear un objeto
                 * Concesionaria pasandole una lista ya armada de Vehiculo
                 * , se guardaba dentro del atributo privado vehiculos
                 */

        }

        @Override
        public void mostrarVehiculoMasBarato() {
                vehiculos
                                .stream()// devuelve la secuencia de elementos para procesarlos
                                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                                // min(minimo) devuelve un objeto optional
                                .ifPresent(v -> System.out.printf("Vehículo más barato:%s %s%n", v.getMarca(),
                                                v.getModelo()));

                /*
                 * ifPresent imprime si el resultado existe
                 * v(predicado:funcion o expresion que )
                 * -> se implemanta una expresion lambda(recibe un parametro y devolvera un
                 * boolean)
                 * si existe dentro de la lista vehiculos debera imprimir la marca
                 * y modelo.
                 */
        }

        @Override
        public void mostrarVehiculoMasCaro() {
                vehiculos
                                .stream()// devuelve la secuencia de elementos para procesarlos
                                .max(Comparator.comparingDouble
                                // comparingDouble trabaja la comparación de
                                // números reales o decimales
                                (Vehiculo::getPrecio))
                                // max devuelve el maximo
                                .ifPresent(v -> System.out.printf("Vehículo más caro:%s %s%n", v.getMarca(),
                                                v.getModelo()));

        }

        /*
         * mostrarVehiculoOrdenNatural ya que en tp entregado anteriormente
         * se utilizo dentro del metodo sorted(Comparator.comparing) el cual
         * no deberia estar ya que esta secuencia se utliza para comparar objetos
         * y este caso la consigna pidio un ordenamiento.
         * Metodo sorted() la clase Vehiculo implemento la interfaz Comparable
         * sobreescribiendo el metodo compareTo() que es parte de la interfaz
         * Comparable que es utilizada para definir el orden de los objetos
         */

        @Override
        public void mostrarVehiculoOrdenNatural() {
                /*
                 * El ordenamiento natural: orden de clasificacion que se aplica al
                 * objeto el orden lexico(regla o metodo para organizar elementos
                 * palabras, letras o secuencia de datos) para una cadena, orden
                 * numerico para ordenar enteros,orden alfabetico, etc.
                 */

                vehiculos
                                .stream()// devuelve una secuencia de elementos
                                // para procesarlo, pero no gaurda elementos
                                .sorted()
                                .forEach(System.out::println);
                // esto permite mostrar el resultado

        }

        @Override
        public void mostrarVehiculoOrdenadoDeMayorAmenorPorPrecio() {
                vehiculos
                                .stream()
                                .sorted(Comparator.comparingDouble
                                // sorted de devuelve un lista ordenada
                                (Vehiculo::getPrecio)
                                                .reversed()
                                                .thenComparing(Vehiculo::getMarca)
                                                // se usa para definir criterios de ordenación adicionales
                                                .thenComparing(Vehiculo::getModelo))
                                .forEach(v -> System.out.printf("%s %s%n", v.getMarca(), v.getModelo()));
                /*
                 * System.out.printf
                 * se utiliza para imprimir directamente con formato
                 * %s marcador de posicion para un valor de
                 * de tipo String se reemplaza por el primer
                 * argumento
                 * %s el segundo es otro maracdor de tipo string
                 * que se reemplaza por el segundo argumento
                 * %n es un salto de linea
                 */

        }

        @Override
        public void mostrarVehiculoQueContieneModeloY() {
                /*
                 * metodo mostrarVehiculoQueContieneModeloY:
                 * este metodo mostrara que contiene el modelo
                 * letra y
                 * sorted con Comparator porque campo o regla ordenar
                 * en este caso se le pide que sea por marca, modelo
                 * precio.
                 * System.out.prinf mostrara el texto formatedo
                 */
                vehiculos.stream()
                                .filter(v -> v.getModelo().toLowerCase().contains("y"))
                                .sorted(Comparator.comparing(Vehiculo::getMarca)
                                                .thenComparing(Vehiculo::getModelo)
                                                .thenComparing(Vehiculo::getPrecio))
                                .forEach(v -> System.out.printf(
                                                "Vehículo que contiene en el modelo la letra 'Y': %s %s $%,.2f%n",
                                                v.getMarca(), v.getModelo(), v.getPrecio()));
        }

}
