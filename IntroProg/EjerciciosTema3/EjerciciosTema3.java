/*Enunciado del ejercicio:
Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.

Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.
*/

public class EjerciciosTema3 {
    public static void main(String[] args) {
    int a=30,b=20,c=10;
    int resultado=sumador(a,b,c);
    //Primera parte
    System.out.println("Resultado de suma de los tres parámetros es: "+resultado);
    // Segunda parte
    Coche miCoche = new Coche();
    miCoche.IncrementaPuertas();
    System.out.println("La cantidad de puertas del objeto miCoche es: "+miCoche.puertas);
    }
public static int sumador(int num1, int num2, int num3) {
    return num1+num2+num3;
}

}
class Coche {
    public int puertas=0;
    public void IncrementaPuertas(){
        this.puertas++;
    }
}


