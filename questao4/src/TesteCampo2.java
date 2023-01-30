import java.util.Random;
import java.util.Scanner;

public class TesteCampo2 {
    public static void main(String[] args) throws Exception {
    int i;
    double altura,largura,raio,maximo,minimo,resultado,velocidade;
    
    Scanner scanf = new Scanner(System.in);

    
    System.out.println("Digite a altura do campo: ");
    altura = scanf.nextDouble();
    
    System.out.println("Digite a largura do campo: ");
    largura = scanf.nextDouble();
    
    System.out.println("Digite o raio da bola:");
    raio = scanf.nextDouble();
    
    ParOrdenado campo = new ParOrdenado(0,0);
    Random v_aleatorio = new Random();

    resultado = altura + largura;

    minimo = (5 * resultado)/100;
    maximo = (10 * resultado)/100;

    velocidade = v_aleatorio.nextDouble(maximo - minimo) + minimo;

    Bola bola = new Bola(campo,velocidade,velocidade,raio);
    CampoRetangular Campozin = new CampoRetangular(campo, largura, altura, bola);

    for(i=0;i<30;i++){
        Campozin.movimentaBola();
    }
  }           
}