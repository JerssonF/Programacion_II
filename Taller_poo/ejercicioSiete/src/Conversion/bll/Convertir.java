
package Conversion.bll;


public class Convertir {
    private double segundos;
    private double minutos;
    private double tiempoR;

    public double getSegundos() {
        return segundos;
    }

    public void setSegundos(double segundos) {
        this.segundos = segundos;
    }

    public double getMinutos() {
        return minutos;
    }

    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }

    public double getTiempoR() {
        return tiempoR;
    }

    public void setTiempoR(double tiempoR) {
        this.tiempoR = tiempoR;
    }
    //metodo 
    public void conteo(){
        this.tiempoR = 0;
        
        while(this.segundos % 60 != 0){
            this.tiempoR++;
            this.segundos++;
        }
        this.minutos = this.tiempoR;
    }
}
