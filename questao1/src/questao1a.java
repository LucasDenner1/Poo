import java.util.Scanner;

public class questao1a {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
       String palavra = "";
       int i,j,k;

       while(palavra.length() != 5){

        System.out.println("Digite uma palavra com 5 letras: ");
        palavra = ler.nextLine();

        if(palavra.length()<5){
            System.out.println("Digite uma palavra maior que cinco letras.");
        }
        else{
            System.out.println("Digite uma palavra menor que cinco letras. ");
        }

    }

        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                for(k=0;k<5;k++){
                    if(!(i == j || j == k || k == i )){
                        System.out.println(palavra.charAt(i) +""+ palavra.charAt(j) +""+ palavra.charAt(k));
                    }
                }
            }
        }


    }
}
