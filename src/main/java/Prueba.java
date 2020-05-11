//Programa de prueba

public class Prueba {
    public static void main(String[] args) {
        EmpleadoPorHoras empleadoPorHoras = 
        new EmpleadoPorHoras( "Andrés", "Murillo", "172056-98", 4.5, 50 );
        
    System.out.println( "Información Empleado:\n" );
    System.out.printf( "%s\n%s: $%,.2f\n\n",empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos() );
    }    
}
