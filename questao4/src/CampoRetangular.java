public class CampoRetangular {
    private ParOrdenado canto_sup_esquerdo;
    private double comprimento, altura;
    private Bola bola_CR;

    public CampoRetangular(ParOrdenado canto_sup_esquerdo, double comprimento, double altura, Bola bola_CR) {
        this.canto_sup_esquerdo = canto_sup_esquerdo;
        this.comprimento = comprimento;
        this.altura = altura;
        this.bola_CR = bola_CR;
    }

    public ParOrdenado getCanto_sup_esquerdo() {
        return canto_sup_esquerdo;
    }

    public void setCanto_sup_esquerdo(ParOrdenado canto_sup_esquerdo) {
        this.canto_sup_esquerdo = canto_sup_esquerdo;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Bola getBola_CR() {
        return bola_CR;
    }

    public void setBola_CR(Bola bola_CR) {
        this.bola_CR = bola_CR;
    }

    public boolean bolaTocaCima() {

        if (bola_CR.getCentro().getY() + bola_CR.getRaio() >= altura/2) {
            System.out.println("A bola Bateu no topo.");
            return true;
        }
        return false;
    }

    public boolean bolaTocaBaixo() {

        if (bola_CR.getCentro().getY() - bola_CR.getRaio() <= -altura/2){
            System.out.println("A bola Bateu no chão.");
            return true;
        }
        return false;
    }

    public boolean bolaTocaEsquerda() {

        if (bola_CR.getCentro().getX() - bola_CR.getRaio() <= -comprimento/2) {
            System.out.println("A bola Bateu na esquerda.");
            return true;
        }
        return false;
    }

    public boolean bolaTocaDireita() {

        if (bola_CR.getCentro().getX() + bola_CR.getRaio() >= comprimento/2) {
            System.out.println("A bola Bateu na direita.");
            return true;
        }
        return false;
    }

    public void movimentaBola() {

        if (bolaTocaCima()) {
            bola_CR.setVelocidade_vertical(bola_CR.getVelocidade_vertical() * -1);
        }

        else if (bolaTocaBaixo()) {
            bola_CR.setVelocidade_vertical(bola_CR.getVelocidade_vertical() * -1);
        }

        else if (bolaTocaEsquerda()) {
            bola_CR.setVelocidade_horizontal(bola_CR.getVelocidade_horizontal() * -1);
        }

        else if (bolaTocaDireita()) {
            bola_CR.setVelocidade_horizontal(bola_CR.getVelocidade_horizontal() * -1);
        }
        bola_CR.movimenta();
        System.out.println(bola_CR.toString());
    }
}
