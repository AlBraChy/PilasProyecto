package com.company;

/**
 * Created by ZeroX on 08/11/2017.
 */
public class Nodo {

    protected int valor;
    protected Nodo prox;

    public Nodo(){
        valor = 0;
        prox = null;
    }

    public Nodo(int v){
        valor = v;
        prox = null;
    }

    public void setValor(int v){
        valor = v;
    }

    public void setProx(Nodo p){
        prox = p;
    }

    public int getValor(){
        return valor;
    }

    public Nodo getProx(){
        return prox;
    }
}