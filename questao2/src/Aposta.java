public class Aposta {
    private Evento fasestorneio;
    private Resultado fimdapartida;
    private float aposta;
    private double lucro;

    public Aposta(Evento fasestorneio, Resultado fimdapartida, float aposta) {
        this.fasestorneio = fasestorneio;
        this.fimdapartida = fimdapartida;
        this.aposta = aposta;
    }

  public Evento getFasestorneio() {
      return fasestorneio;
    }

  public Resultado getResultado(){
     return fimdapartida;
   }   

  public float getValorApostado(){
    return aposta;
  } 
  
  public double calculaLucro(Evento valoraposta){
     if(valoraposta.getResultado() == fimdapartida.TIME1){
      lucro = aposta * valoraposta.getvalorVt1();
     }
     if(valoraposta.getResultado() == fimdapartida.TIME2){
      lucro = aposta * valoraposta.getvalorVt2();
     }
     else{
      lucro = aposta * valoraposta.getvalorEmp();
     }

     return lucro;
  }
}
