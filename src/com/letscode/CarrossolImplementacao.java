package com.letscode;

public class CarrossolImplementacao implements Carrossel{
    public boolean brincar(int idade, double altura) {
        if (idade>6 && altura>1.30){
            System.out.println("Carrossel está liberado!");
            return true;
        }
        else {
            System.out.println("Carrossel não está liberado!");
            return false;
        }
    }
}
