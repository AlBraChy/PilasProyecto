package com.company;

/**
 * Created by ZeroX on 08/11/2017.
 */
public class Pilas {

    private Nodo top;

    public Pilas(){
        top = null;
    }

    public Boolean vacia(){
        return (top==null);
    }

    public void push(int valor){//insertar
        Nodo nuevoNodo;
        if (vacia())
            top = new Nodo(valor);
        else {
            nuevoNodo = new Nodo(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
    }

    public void peek(){//mostrar
        Nodo temp = top;
        if (temp!=null){
            System.out.println("La pila es: ");
            while (temp!=null){
                System.out.println(temp.getValor());
                temp=temp.getProx();
            }
        }
        else
            System.out.println("Pila vacía.");
    }

    public void cima(){//buscar
        if (!vacia())
            System.out.println("Cima: "+top.getValor());
        else
            System.out.println("La pila esta vacía.");
    }

    public void pop(){//extraer
        if (!vacia()){
            System.out.println("Dato extraido: "+top.getValor());
            top = top.getProx();
        }
        else
            System.out.println("La pila esta vacía.");
    }
}
