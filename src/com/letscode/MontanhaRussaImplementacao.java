package com.letscode;
public class MontanhaRussaImplementacao implements MontanhaRussa {
    public boolean brincar(int idade, double altura) {
        if (idade>16 && altura>1.55){
            System.out.println("Montanha Russa está liberada!");
            return true;
        }
        else {
            System.out.println("Montanha Russa não está liberada!");
            return false;
        }
    }
}

