public class Evento{
 
    private String titulo,time1,time2;
    private double vitoriat1,empate,vitoriat2;
    private Resultado resultadoevento;
    
public Evento(String titulo, String time1, String time2, double vitoriat1, double empate, double vitoriat2) {
    this.titulo = titulo;
    this.time1 = time1;
    this.time2 = time2;
    this.vitoriat1 = vitoriat1;
    this.vitoriat2 = vitoriat2;
    this.empate = empate;
}

public Resultado getResultado(){
    return resultadoevento;
  }   

public void setResultado(Resultado finalizarjog){
    resultadoevento = finalizarjog;
}

public double getvalorVt1(){
 return vitoriat1;
}

public double getvalorEmp(){
return empate;
}

public double getvalorVt2(){
return vitoriat2;
}
}