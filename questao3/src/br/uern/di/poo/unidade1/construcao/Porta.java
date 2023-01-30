package br.uern.di.poo.unidade1.construcao;

public class Porta{

    private Enumeracao tipo_de_porta;
    private double Altura,Largura;
    private boolean teste_pivo; 
    private final double aumento = 350.00;
    private final double Alturap = 1.8,Largurap = 0.7;

    public Porta() {
    this.tipo_de_porta = Enumeracao.PORTA_SIMPLES;
    this.Altura = Alturap;
    this.Largura = Largurap;

    teste_pivo = false;
    }

    public Porta(Enumeracao tipo_de_porta, double altura, double largura, boolean teste_pivo) {
        this.tipo_de_porta = tipo_de_porta;
        Altura = altura;
        Largura = largura;
        this.teste_pivo = teste_pivo;

    }

    public Enumeracao getTipo_de_porta() {
        return tipo_de_porta;
    }

    public void setTipo_de_porta(Enumeracao tipo_de_porta) {
        this.tipo_de_porta = tipo_de_porta;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public double getLargura() {
        return Largura;
    }

    public void setLargura(double largura) {
        Largura = largura;
    }

    public boolean isTeste_pivo() {
        return teste_pivo;
    }

    public void setTeste_pivo(boolean teste_pivo) {
        this.teste_pivo = teste_pivo;
    }

    public double getAumento() {
        return aumento;
    }

    public double getAlturap() {
        return Alturap;
    }

    public double getLargurap() {
        return Largurap;
    }
    
    public double calculaPreco(){
    double custo,metroq;

    metroq = Altura * Largura;

    if(tipo_de_porta == Enumeracao.PORTA_SIMPLES){
        custo = metroq * tipo_de_porta.getCusto();

        if(teste_pivo == true){
         custo = custo + 350.00;
        }
        
        System.out.println("O valor do custo é: R$" + custo);

        return custo;
    }
    
    if(tipo_de_porta == Enumeracao.PORTA_PADRAO){
        custo = metroq * tipo_de_porta.getCusto();

        if(teste_pivo == true){
            custo = custo + 350.00;
           }

           System.out.println("O valor do custo é: R$" + custo);
        return custo;
    }

    else{
        custo = metroq * tipo_de_porta.getCusto();
        
        if(teste_pivo == true){
            custo = custo + 350.00;
           }
           System.out.println("O valor do custo é: R$" + custo);

        return custo;
    }

    }

    public void exibePorta(){
     System.out.println("A porta é " + tipo_de_porta.getTipoMadeira() + " " + tipo_de_porta.getTipoFechadura()+".");   
    }
}