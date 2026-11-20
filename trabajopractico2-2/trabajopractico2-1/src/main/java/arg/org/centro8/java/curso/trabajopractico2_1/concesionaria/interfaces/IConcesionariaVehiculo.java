package arg.org.centro8.java.curso.trabajopractico2_1.concesionaria.interfaces;

public interface IConcesionariaVehiculo {
  /*
   * Una Interfaz no tiene constructores, no se puede
   * instanciar.Pueden declarar metodos
   * abstractos(no tienen cuerpo o comportamiento la clases
   * que lo hereden debe implementar los metodos abstractos).
   */
  public abstract void mostrarListaDeVehiculo();

  public abstract void mostrarVehiculoMasCaro();

  public abstract void mostrarVehiculoMasBarato();

  public abstract void mostrarVehiculoQueContieneModeloY();

  public abstract void mostrarVehiculoOrdenadoDeMayorAmenorPorPrecio();

  public abstract void mostrarVehiculoOrdenNatural();
}
