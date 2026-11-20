Segunda actividad 
entregable obligatoria:

Concesionaria de autos y motos.
Se pidió desarrollar un programa con Java que simule el funcionamiento de una concesionaria 
de vehiculos.

Al ejecutarse, la aplicación deberá generar exactamente la siguiente salida por consola y finalizar
su ejecución inmediatamente después:

Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00 Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00 Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00 Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50 
============================= 
Vehículo más caro: Peugeot 208 Vehículo más barato: Honda Titan Vehículo que contiene en el modelo la letra ‘Y’: Yamaha YBR $80.500,50 
============================= 
Vehículos ordenados por precio de mayor a menor: Peugeot 208 Peugeot 206 Yamaha YBR Honda Titan 
============================= 
Vehículos ordenados por orden natural (marca, modelo, precio): Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00 Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00 Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00 Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50 

La solución a complir fue la siguientes:

-Diseñar una solución orientada a objetos, creando por lo menos una clase abstracta y al menos
una interfaz.

-Se debe usar framework collection y Api Stream.

-La salida es por consola y exactamente como se requiere.

-Sobreescribir el método toString().

-Se debe implementar la interfaz Comparable al menos en una clase.

-Lista vehículo se debe cargar en un único método.No se debe solicitar ningún ingreso por pantalla.

-Algoritmo de impresión, no debe depender de la cantidad , modelo o tipo de vehículos.

-El proyecto debe ser creado con SpringBoot.
Que se gestione con Maven. Utilización de herramientas

Lombok para reducir código repetitivo y buenas prácticas de desarrollo.
