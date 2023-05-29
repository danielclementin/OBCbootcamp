public class EjerciciosTema4 {
    public static void main(String[] args) {
      

/* 
Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/
int numeroIf=0;
if(numeroIf==0) {
    System.out.println("numeroIf es cero");
}
if(numeroIf<0) {
    System.out.println("numeroIf es negativo");
}
if(numeroIf>0) {
    System.out.println("El numeroIf es positivo");
}

/*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea 
inferior a 3, el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.*/
int numeroWhile=0;
while(numeroWhile<3) {
    System.out.println("El numeroWhile antes de ser incrementado es "+numeroWhile);
    numeroWhile++;
    System.out.println("El numeroWhile luego de ser incrementado es "+numeroWhile);
}

/*
Para el bucle Do While, deberás crear la misma estructura que en el While, 
pero solo se debe ejecutar una vez.*/
System.out.println("Comienza Do while");
numeroWhile=0;
do {
    System.out.println("El numeroWhile antes de ser incrementado es "+numeroWhile);
    numeroWhile++;
    System.out.println("El numeroWhile luego de ser incrementado es "+numeroWhile);
} while(numeroWhile<0);

/* Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición 
será que la variable sea igual o menor que 3, 
se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/
System.out.println("Ciclo For");
for(int numeroFor=0;numeroFor<=3;numeroFor++) {
    System.out.println("El numeroFor es "+numeroFor);
}

/* 
Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro 
estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje 
por consola informando de la estación en la que está. También habrá que poner un default para 
cuando el valor de la variable no sea una estación.*/
String estacion="Primavera";
switch(estacion) {
    case "Verano": System.out.println("La estación es Verano");break;
    case "Otoño": System.out.println("La estación es Otoño");break;
    case "Invierno":System.out.println("La estación es Invierno");break;
    case "Primavera": System.out.println("La estación es Primavera");break;
    default: System.out.println("Ninguna estación");break;
}

}
}
