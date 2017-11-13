package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pilas p = new Pilas();
        /*p.push(2);
        p.push(8);
        p.push(1);

        p.peek();
        p.cima();
        p.pop();
        p.peek();
        p.pop();
        p.cima();
        p.pop();
        p.peek();*/

        int opción;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1) Insertar\n2) Mostrar\n3) Buscar\n4) Eliminar\n5) Contar\n6) maximo\n7) minimo\n8)terminar)\n¿Que desea realizar?");
            opción = sc.nextInt();

            switch (opción){
                case 1: //insertar
                    System.out.println("Teclee la cantidad de elementos a insertar: ");
                    int num = sc.nextInt();
                    int obj;
                    for (int i = 0; i<num; i++){
                        System.out.print("Teclee el elemento [" + i + "]: ");
                        int dato = sc.nextInt();
                        obj = dato;
                        p.push(obj);
                    }
                    break;

                case 2: //mostrar
                    p.peek();
                    break;

                case 3: //buscar
                    if (p.vacia()!=true){
                        System.out.println("Ingrese el valor a buscar: ");
                        int value = sc.nextInt();
                        System.out.println("el valor esta en la posicion: "+p.buscarv(value));
                    } else {
                        System.out.println("No hay elementos en la lista, elija otra opción");
                    }
                    break;

                case 4: //eliminar
                    if (p.vacia()!=true){
                        p.pop();
                    } else {
                        System.out.println("No hay elementos que pueda eliminar \n elija otra opción");
                    }
                    break;

                case 5: //contar
                    if (p.vacia()!=true){
                        System.out.println("Total de elementos: " + p.getTamaño());
                    } else {
                        System.out.println("No hay elementos en la lista");
                    }
                    break;

                case 6: //maximo
                    p.Maximo();
                    break;

                case 7: //minimo
                    p.Minimo();
                    break;

                case 8:
                    //Despedida
                    System.out.println("Vuelve pronto");
                    break;
            }
        }while (opción!=8);
    }
}



