package Pila1_3;

import java.util.Scanner;

public class Pila1_3 {
    
    public static Scanner sc = new Scanner (System.in);
    public static int tope = 0;
    
    // isEmpty(); sólo guarda un mensaje de que las pilas están vacías.
    public static void isEmpty() {
        System.out.println("Total de elementos: "+tope);
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - ¡Pilas  vacías! - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - - - - - - - -\n");
    }
    
    // isFull(); sólo guarda un mensaje de que las pilas están llenas.
    public static void isFull() {
        System.out.println("Total de elementos: "+tope);
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - ¡Pilas  llenas! - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - - - - - - - -\n");
    }
    
    public static void main(String[] args) {
        int tam, opc;
        
        System.out.print("Ingresa el tamaño de la pila: ");
        tam = sc.nextInt();
        int pilaA[] = new int[tam];
        int pilaB[] = new int[tam];
        int pilaC[] = new int[tam];
        
        do {
            // Presentamos un menú al usuario
            System.out.println("*************** M E N Ú ***************");
            System.out.print("1 - Llenar pilas.\n"
                           + "2 - Mostrar pilas.\n"
                           + "3 - Vaciar pilas.\n"
                           + "4 - Unir pilas.\n"
                           + "5 - Mostrar pila unida.\n"
                           + "6 - Salir.\n"
                           + "Tu respuesta: ");
            opc = sc.nextInt();
            switch(opc) {
                case 1: // Llenar
                    // Las variables numero1 y numero2 guardaran los números aleatorios de sus pilas correspondientes.
                    int numero1, numero2;
                    System.out.println("\n- - - - - - ¡Llenando  pilas! - - - - - -");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - -");
                    // Generamos números aleatorios en las pilas A Y B
                    for (int i=0; i<tam; i++) {
                        if (tope<tam) {
                            numero1 = (int)(Math.random()*100+1);
                            pilaA[tope] = numero1;
                            // Una forma alterna de escribir la misma instrucción; Guardar datos aleatorios en la pila.
                            pilaB[tope] = (numero2 = (int) (Math.random()*200+100));
                            tope++;
                        }
                    }
                    System.out.println("- - - - - - - - -¡Listo!- - - - - - - - -\n");
                break;
                
                case 2: // Mostrar
                    // Si 'tope' es mayor a cero, mostrar las pilas, sino, llamar a isEmpty();
                    if (tope > 0){
                        System.out.println("\nMostrando pilas:\n");
                        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
                        // El primer bucle for es para pilaA y el segundo es para pilaB
                        for (int i=0; i<tope; i++) {
                            System.out.print(pilaA[i]+" ");
                        }
                        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - -");
                        for (int i=0; i<tope; i++) {
                            System.out.print(pilaB[i]+" ");
                        }
                        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                    } else {
                        isEmpty();
                    }
                break;
                
                case 3: // Vaciar
                    // Si 'tope' es mayor a cero, cambiamos el valor de 'tope' a cero, sino, llamamos a isEmpty();
                    if (tope > 0) {
                        System.out.println("\n- - - - - - -¡Vaciando pilas!- - - - - - -");
                        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
                        tope = 0;
                        System.out.println("- - - - - - - - -¡Listo!- - - - - - - - -\n");
                    } else {
                        isEmpty();
                    }
                    
                break;
                
                case 4: // Unir
                    // Si 'tope' es mayor a cero, sumamos los valores de pilaA y pilaB en pilaC, sino, llamamos a is Empty();
                    if (tope > 0){
                        // La variable contador nos sirve para llevar el control de las iteraciones en pilaC
                        int contador=0;
                        System.out.println("\n- - - - - - -¡Uniendo pilas!- - - - - - -");
                        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
                        // La suma de las últimas posiciones de pilaA y pilaB las guardaremos en la primera posición de pilaC
                        // Ejemplo:
                        /*
                            tope=10; i=0;
                            pilaC[i] = pilaA[tope] + pilaB[tope];
                            pilaC[0] = pilaA[10] + pilaB[10];
                        */
                        for (int i=tam-1; i>=0; i--) {
                            pilaC[contador] = pilaA[i] + pilaB[i];
                            contador++;
                        }
                        System.out.println("- - - - - - - - -¡Listo!- - - - - - - - -\n");
                    } else {
                        isEmpty();
                    }
                break;
                
                case 5: // Mostrar pila C
                    // Si 'tope' es mayor a cero, imprimimos pilaC, sino, llamamos a isEmpty();
                    if (tope > 0){
                        System.out.println("\nMostrando pila:\n");
                        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
                        for (int i=0; i<tam; i++) {
                            System.out.print(pilaC[i]+" ");
                        }
                        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                    } else {
                        isEmpty();
                    }
                break;
                
                case 6: // Bucle
                    //Este caso es el que rompe con el menú
                break;
                
                default:
                    System.out.println("No introduciste una opción válida...");
                break;
            }
        }while(opc != 6);
    }
}
