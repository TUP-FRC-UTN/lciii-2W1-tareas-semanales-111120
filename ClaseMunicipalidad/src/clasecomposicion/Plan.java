package clasecomposicion;

public class Plan {
    private String nombre;
    private double deuda;
    private int cuotas;
    private Pago[] pagos;

    public Plan(String nombre, double deuda, int cuotas) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.cuotas = cuotas;
        pagos = new Pago[cuotas];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }
    
    public void agregarPago(Pago pago){
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null){
                pagos[i] = pago;
                break;
            }
        }
    }
    
    public boolean estaPagadoTotalmente(){
        boolean pagado = true;
        
        for (int i = 0; i < pagos.length; i++) {
            if(pagos[i] == null){
                pagado = false;
                break;
            }
        }
        return pagado;
    }
}
