public class Main {
    public static void main(String[] args) {


        /* Ejercicio 1:
        Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
            Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
         */

      int numeroIf = 12;

        if (numeroIf > 0){
            System.out.println(numeroIf + " es positivo");
        } else if (numeroIf < 0){
            System.out.println(numeroIf + " es negativo");
        } else {
            System.out.println(numeroIf + " es cero");
        }


        /* Ejercicio 2:
        Crea un bucle While, este bucle tendrá que tener como condición que la variable
        numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

            - Incrementar el valor de la variable en uno cada vez que se ejecute.
            - Mostrarlo por pantalla cada vez que se ejecute.
         */

       int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile ++;
            System.out.println(numeroWhile);

        }

        /* Ejercicio 3: PER ACABAR
        Para el bucle Do While, deberás crear la misma estructura que en el While,
        pero solo se debe ejecutar una vez.

         */

        int numerodoWhile = 4;
            do {
            System.out.println(numerodoWhile);
            } while (numerodoWhile < 3);


        /* Ejercicio 4:
        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su
        condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor
        cada vez que se ejecute y deberá mostrarse por pantalla.
         */

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        /* Ejercicio 5:
        Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
        También habrá que poner un default para cuando el valor de la variable no sea una estación.
         */

   var estacion = "Verano";

        switch (estacion) {
            case "Primavera":
            case "Verano":
            case "Otoño":
            case "Invierno":
                System.out.println("Es " + estacion);
                break;

            default:
                System.out.println("Esto no es ninguna estación");

        }

    }
}