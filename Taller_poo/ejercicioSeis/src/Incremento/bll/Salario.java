
package Incremento.bll;


public class Salario {
    private double salario;
    private Integer tiempo;
    private double incremento;
    private double salarioActual;

    public double getSalarioActual() {
        return salarioActual;
    }

    public void setSalarioActual(double salarioActual) {
        this.salarioActual = salarioActual;
    }
    
    
    
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }
    
    //metodo
    public void descuento(){
        if(this.tiempo == 1){
            this.incremento = this.salario * 0.05;
        }else if(this.tiempo <= 2){
            this.incremento = this.salario * 0.07;
        }else if(this.tiempo <= 5){
            this.incremento = this.salario * .1;
        }else if(this.tiempo <= 10){
            this.incremento = this.salario * .15;
        }else{
            this.incremento = this.salario * 0.2;
        }
        this.salarioActual = this.salario + this.incremento; 
    }
        
}
