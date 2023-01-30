public class Bola {
    private ParOrdenado centro;
    private double velocidade_horizontal, velocidade_vertical;
    private final double raio;

    public Bola(ParOrdenado centro, double velocidade_horizontal, double velocidade_vertical, double raio) {
        this.centro = centro;
        this.velocidade_horizontal = velocidade_horizontal;
        this.velocidade_vertical = velocidade_vertical;
        this.raio = raio;
    }

    public double getVelocidade_horizontal() {
        return velocidade_horizontal;
    }

    public void setVelocidade_horizontal(double velocidade_horizontal) {
        this.velocidade_horizontal = velocidade_horizontal;
    }

    public double getVelocidade_vertical() {
        return velocidade_vertical;
    }

    public void setVelocidade_vertical(double velocidade_vertical) {
        this.velocidade_vertical = velocidade_vertical;
    }

    public ParOrdenado getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    public void movimenta() {
        centro.setX(centro.getX() + velocidade_horizontal);
        centro.setY(centro.getY() + velocidade_vertical);
    }

    public String toString() {
        return "A bola está na posição" + centro.toString() + " se movendo a uma velociade " + "(" + velocidade_vertical
                + ", " + velocidade_horizontal + ")"
                + "pixels por movimento";
    }
}
