package clasecomposicion;

import java.util.Scanner;

public class ClaseComposicion {

    public static void main(String[] args) {
        Municipalidad m;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar cantidad de arreglos a cargar: ");
        int cantidad = sc.nextInt();
        
        m = new Municipalidad(cantidad);
        
        System.out.println("Ingresar nombre del que esta pagando: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println("Ingresar la deuda a pagar: ");
        double deuda = sc.nextDouble();
        System.out.println("Ingresar la cantidad de cuotas: ");
        int cuotas = sc.nextInt();
        
        Plan p = new Plan(nombre, deuda, cuotas);
        
        m.agregarPlan(p);
        
        System.out.println("Cantidad de planes pagados en su totalidad: " + m.cantidadPlanesPagados());
        
        System.out.println("La sumatoria actual de deuda es de: $" + m.sumatoriaDeuda());
        
        
    }
    
}
