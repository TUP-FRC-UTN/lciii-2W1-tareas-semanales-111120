package clasecomposicion;

public class Municipalidad {
    private Plan[] planes;
    
    public Municipalidad(int tam){
        planes = new Plan[tam];
    }
    
    public void agregarPlan(Plan plan){
        
        for (int i = 0; i < planes.length; i++) {
            if(planes[i] == null){
                planes[i] = plan;
                break;
            }
        }        
    }
    
    public int cantidadPlanesPagados(){
        int cantidad = 0;
        
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null) {
                if (planes[i].estaPagadoTotalmente()) {
                    cantidad++;
                }
            }
        }
        return cantidad;
    }
    
    public double sumatoriaDeuda(){
        double deuda = 0;
        
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null){
                deuda += planes[i].getDeuda();
            }
        }
        
        return deuda;
    }
}
