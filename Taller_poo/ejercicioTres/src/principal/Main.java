
package principal;


public class Main {

    public double getMontoU() {
        return MontoU;
    }

    public void setMontoU(double MontoU) {
        this.MontoU = MontoU;
    }

    public double getMontoD() {
        return MontoD;
    }

    public void setMontoD(double MontoD) {
        this.MontoD = MontoD;
    }

    public double getMontoT() {
        return MontoT;
    }

    public void setMontoT(double MontoT) {
        this.MontoT = MontoT;
    }

    public double getMontoC() {
        return MontoC;
    }

    public void setMontoC(double MontoC) {
        this.MontoC = MontoC;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public double getProcentajeU() {
        return procentajeU;
    }

    public void setProcentajeU(double procentajeU) {
        this.procentajeU = procentajeU;
    }

    public double getProcentajeD() {
        return procentajeD;
    }

    public void setProcentajeD(double procentajeD) {
        this.procentajeD = procentajeD;
    }

    public double getProcentajeT() {
        return procentajeT;
    }

    public void setProcentajeT(double procentajeT) {
        this.procentajeT = procentajeT;
    }

    public double getProcentajeC() {
        return procentajeC;
    }

    public void setProcentajeC(double procentajeC) {
        this.procentajeC = procentajeC;
    }

    private double MontoU;
    private double MontoD;
    private double MontoT;
    private double MontoC;
    private double Total;
    private double procentajeU;
    private double procentajeD;
    private double procentajeT;
    private double procentajeC;
    
    public void porcentaje(double MontoU, double MontoD, double MontoT, double MontoC){
        this.MontoU = MontoU;
        this.MontoD = MontoD;
        this.MontoT = MontoT;
        this.MontoC = MontoC;
        this.Total = (MontoU + MontoD + MontoT + MontoC );
        this.procentajeU = ((100 / Total ) * MontoU);
        this.procentajeD = ((100 / Total ) * MontoD);
        this.procentajeT = ((100 / Total ) * MontoT);
        this.procentajeC = ((100 / Total ) * MontoC);
    }
}
