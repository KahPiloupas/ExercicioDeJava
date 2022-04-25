package com.letscode;

public class BrinquedosDoParque {
    public static void main(String[] args) {

        //1 - CLASSES:

        CarrosselImplementacao carrossel = new CarrosselImplementacao();
        carrossel.brincar(7,1.10);
        carrossel.brincar(8,1.32);

        MontanhaRussaImplementacao montanhaRussa = new MontanhaRussaImplementacao();
        montanhaRussa.brincar(8,1.32);
        montanhaRussa.brincar(17,1.56);

        RodaGiganteImplementacao rodaGigante = new RodaGiganteImplementacao();
        rodaGigante.brincar();

        //2 - CLASSE ANÔNIMA:
        brincarNoCarrossel(new Carrossel(){
            @Override
            public boolean brincar( int idade, double altura){
                if (idade>6 && altura>1.30){
                    System.out.println("(Classe anônima) Carrossel está liberado!");
                    return true;
                }
                else {
                    System.out.println("(Classe anônima) Carrossel não está liberado!");
                    return false;
                }
            }
        });

        brincarNaMontanhaRussa(new MontanhaRussa(){
            @Override
            public boolean brincar(int idade, double altura) {
                if (idade>16 && altura>1.55){
                    System.out.println("(Classe Anônima) Montanha Russa está liberada!");
                    return true;
                }
                else {
                    System.out.println("(Classe Anônima) Montanha Russa não está liberada!");
                    return false;
                }
            }
        });

        brincarNaRodaGigante(new RodaGigante() {
            @Override
            public void brincar() {
                System.out.println("(Classe Anônima) Roda Gigante está liberada!");
            }
        });

        // 3- LAMBDAS:
        brincarNoCarrossel(((idade, altura) -> {
            if (idade>6 && altura>1.30){
                System.out.println("(Lambda) Carrossel está liberado!");
                return true;
            }
            else {
                System.out.println("(Lambda) Carrossel não está liberado!");
                return false;
            }
        }));

        brincarNaMontanhaRussa(((idade, altura) -> {
            if (idade>16 && altura>1.55){
                System.out.println("(Lambda) Montanha Russa está liberada!");
                return true;
            }
            else {
                System.out.println("(Lambda) Montanha Russa não está liberada!");
                return false;
            }
        }));

        brincarNaRodaGigante((() -> {
            System.out.println("(Lambda) Roda Gigante está liberada!");
        }));

    }
    static void brincarNoCarrossel(Carrossel carrossel) {
        carrossel.brincar(8,1.32);
    }
    static void brincarNaMontanhaRussa(MontanhaRussa montanhaRussa) {
        montanhaRussa.brincar(17,1.56);
    }
    static void brincarNaRodaGigante(RodaGigante rodaGigante) {
        rodaGigante.brincar();
    }
}
