package br.uern.di.poo.unidade1;

public enum Enumeracao{
    PORTA_SIMPLES("feita de madeira compensada,","com fechadura simples", 50.00),
    PORTA_PADRAO("feita de madeira andiroba,","com fechadura de encaixe", 140.00),
    PORTA_DE_LUXO("feita de madeira compensada,","com fechadura do tipo tetra", 350.00);
    
    private String Tipo_de_madeira,Tipo_de_fechadura;
    private double Custo;

    private Enumeracao(String tipo_de_madeira, String tipo_de_fechadura, double custo) {
        Tipo_de_madeira = tipo_de_madeira;
        Tipo_de_fechadura = tipo_de_fechadura;
        Custo = custo;
    }

    public String getTipoMadeira(){
        return Tipo_de_madeira;
    }

    public String getTipoFechadura(){
        return Tipo_de_fechadura;
    }

    public double getCusto(){
        return Custo;
    }

}