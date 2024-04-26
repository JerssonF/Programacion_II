
package principal;

public class Main {

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getValorU() {
        return valorU;
    }

    public void setValorU(double valorU) {
        this.valorU = valorU;
    }

    public double getValorD() {
        return valorD;
    }

    public void setValorD(double valorD) {
        this.valorD = valorD;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }



    private int Cantidad;
    private double valorU = 80000;
    private double valorD = 70000;
    private double valorTotal;
    
    
    public void total(int Cantidad ){
        this.Cantidad = Cantidad;
        if (Cantidad >= 5 ){
            this.valorD = valorD;
            this.valorTotal = valorD * Cantidad;
        }else if (Cantidad < 5) {
            this.valorU = valorU;
            this.valorTotal = valorU * Cantidad;
        }else if (Cantidad < 0){
            this.valorTotal = valorU * Cantidad;
        }
   
    }
 
}
