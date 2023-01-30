package br.uern.di.poo.unidade1.construcao;

public class App {
    public static void main(String[] args) throws Exception {

        Porta porta1 = new Porta();
        Porta porta2 = new Porta(Enumeracao.PORTA_PADRAO,2.0,1.2,false);
        Porta porta3 = new Porta(Enumeracao.PORTA_DE_LUXO,1.2,1.0,false);
        Porta porta4 = new Porta(Enumeracao.PORTA_DE_LUXO,8.0,4.0,true);

       porta1.exibePorta();
       porta1.calculaPreco();
       Servicos.calculaServ(porta1);

       porta2.exibePorta();
       porta2.calculaPreco();
       Servicos.calculaServ(porta2);

       porta3.exibePorta();
       porta3.calculaPreco();
       Servicos.calculaServ(porta3);

       porta4.exibePorta();
       porta4.calculaPreco();
       Servicos.calculaServ(porta4);

}

}
