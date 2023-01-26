import java.util.Scanner;

public class questao1b {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String dia,mes,ano,data = "";

        System.out.println("Digite uma data no formato 'dd/mm/yyyy': ");
        data = ler.nextLine();
        ler.close();
        
        dia = data.substring(0, 2);
        mes = data.substring(3, 5);
        ano = data.substring(6, 10);
       
        Integer numero = Integer.valueOf(mes);

        switch(numero){
            case 1 :
            System.out.println("Janeiro, " + dia +" "+ ano);
            break;
            case 2 :
            System.out.println("Fevereiro, " + dia +" "+ ano);
            break;
            case 3 :
            System.out.println("Março, " + dia +" "+ ano);
            break;
            case 4 :
            System.out.println("Abril, " + dia +" "+ ano);
            break;
            case 5 :
            System.out.println("Maio, " + dia +" "+ ano);
            break;
            case 6 :
            System.out.println("Junho, " + dia +" "+ ano);
            break;
            case 7 :
            System.out.println("Julho, " + dia +" "+ ano);
            break;
            case 8 :
            System.out.println("Agosto, " + dia +" "+ ano);
            break;
            case 9 :
            System.out.println("Setembro, " + dia +" "+ ano);
            break;
            case 10 :
            System.out.println("Outubro, " + dia +" "+ ano);
            break;
            case 11 :
            System.out.println("Novembro, " + dia +" "+ ano);
            break;
            case 12 :
            System.out.println("Dezembro, " + dia +" "+ ano);
            break;

        }
    }
}
