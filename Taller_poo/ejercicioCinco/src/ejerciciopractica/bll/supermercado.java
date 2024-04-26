package ejerciciopractica.bll;

public class supermercado {

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
     public double getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(double valorcompra) {
        this.valorcompra = valorcompra;
    }
   private double total;
   private double descuento;
   private double valorcompra;
   private Integer numero;
   
   // creo el metodo para realizar el descuento
   // metodo 1
   public void calculardescuento (){
       // calculo el descuento dependiendo de el numero al azar
       if(this.numero <5){
           this.descuento = this.valorcompra *0.15;
       }
       else{
           this.descuento = this.valorcompra *0.2;
       }
       //calculo total de la compra
       this.valorcompra = this.valorcompra - this.descuento;
   }
   
}
