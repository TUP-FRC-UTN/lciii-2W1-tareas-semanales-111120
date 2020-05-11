package clasecomposicion;

public class Pago {
    private int demora;
    private double importe;
    private double interesesAdicionales;

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getInteresesAdicionales() {
        return interesesAdicionales;
    }

    public void setInteresesAdicionales(double interesesAdicionales) {
        this.interesesAdicionales = interesesAdicionales;
    }

    public Pago(int demora, double importe, double interesesAdicionales) {
        this.demora = demora;
        this.importe = importe;
        this.interesesAdicionales = interesesAdicionales;
    }

    @Override
    public String toString() {
        return "Pago{" + "demora=" + demora + ", importe=" + importe + ", interesesAdicionales=" + interesesAdicionales + '}';
    }
    
        
}
