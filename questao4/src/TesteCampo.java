import java.util.Scanner;

public class TesteCampo {
    public static void main(String[] args) {
        int i;
        double posi_campX, posi_campY, alt_camp, larg_camp,
                posi_bolaX, posi_bolaY, raio_bola, velo_bolaX,velo_bolaY;

        Scanner scanf = new Scanner(System.in);

        System.out.println("============ Campo ==============");
        System.out.print("   Digite a posição X: ");
        posi_campX = scanf.nextDouble();

        System.out.print("   Digite a posição Y: ");
        posi_campY = scanf.nextDouble();

        System.out.print("   Digite a altura: ");
        alt_camp = scanf.nextDouble();

        System.out.print("   Digite a Largura: ");
        larg_camp = scanf.nextDouble();

        System.out.println("============ BOLA ===============");
        System.out.print("   Digite a posição X da bola: ");
        posi_bolaX = scanf.nextDouble();

        System.out.print("   Digite a posição Y da bola: ");
        posi_bolaY = scanf.nextDouble();

        System.out.print("   Digite o raio da bola: ");
        raio_bola = scanf.nextDouble();

        System.out.print("   Digite a velocidade X da bola: ");
        velo_bolaX = scanf.nextDouble();

        System.out.print("   Digite a velocidade Y da bola: ");
        velo_bolaY = scanf.nextDouble();
        System.out.println("=================================");

        ParOrdenado infocampo = new ParOrdenado(posi_campX,posi_campY);
        ParOrdenado infobola = new ParOrdenado(posi_bolaX,posi_bolaY);

        Bola bola = new Bola(infobola,velo_bolaX,velo_bolaY,raio_bola);
        CampoRetangular campo = new CampoRetangular(infocampo,alt_camp,larg_camp,bola);

        for(i=0;i<30;i++){
            System.out.print(i);
           campo.movimentaBola();
        }
        
    }
}
