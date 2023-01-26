package br.uern.di.poo.unidade1;

public class Servicos {
    private static final double pPortaluxo = 0.1 ;
    private static final double instalacao = 70.00 ;
    private static final double pivo = 250.00 ;

    public static void calculaServ(Porta porta){
        double custo_do_servico,percentual;

        if(porta.getTipo_de_porta() == Enumeracao.PORTA_DE_LUXO){
            custo_do_servico = instalacao;

            if(porta.isTeste_pivo() == true){
                custo_do_servico = custo_do_servico + pivo;
            }

            percentual = custo_do_servico * (pPortaluxo/100);
            custo_do_servico = custo_do_servico + percentual;

            System.out.println("O valor do serviço é: R$" + custo_do_servico);
        }

        else{
            custo_do_servico = instalacao;

            if(porta.isTeste_pivo() == true){
                custo_do_servico = custo_do_servico + pivo;
            }
            System.out.println("O valor do serviço é: R$" + custo_do_servico);
        }

    }

}
