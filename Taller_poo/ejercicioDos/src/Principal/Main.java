
package Principal;


public class Main {

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoT() {
        return saldoT;
    }

    public void setSaldoT(double saldoT) {
        this.saldoT = saldoT;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }

  
   private double saldo;
   private double saldoT;
   private double aumento;
   private double venta;
    
   
   public void aumento(double venta, double saldo){
       this.saldo = saldo;
       this.venta = venta;
        if ((venta >= 200000 ) & (venta <= 1000000)){
            this.aumento = (venta *0.07);
            this.saldoT = aumento + saldo ;
        }else if ((venta >= 1000001 ) & (venta <= 2000000)){
            this.aumento = (venta *0.1);
            this.saldoT = aumento + saldo ;
        }else if (venta >=2000001){
            this.aumento = (venta *0.15);
            this.saldoT = aumento + saldo ;
        }else {
            this.aumento = (venta * 0);
            this.saldoT = aumento + saldo;
        }
   }
}
