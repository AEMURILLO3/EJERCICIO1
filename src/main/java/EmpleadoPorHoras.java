  // Subclase EmpleadoPorHoras hija de clase Empleado.
 
  public class EmpleadoPorHoras extends Empleado {
  private double sueldo; // sueldo por hora
  private double horas; // horas de trabajo
 
  // constructor
  public EmpleadoPorHoras( String nombre, String apellido, String iess,
  double sueldoPorHoras, double horasTrabajadas ) {
  super( nombre, apellido, iess );
  setSueldo( sueldoPorHoras ); // valida y almacena el sueldo por horas
  setHoras( horasTrabajadas ); // valida y almacena las horas trabajadas
  } // fin del constructor
 
  // método setter sueldo
  public void setSueldo( double sueldoPorHoras ) {
  sueldo = ( sueldoPorHoras < 0.0 ) ? 0.0 : sueldoPorHoras;
  } // fin del método
 
  // método getter sueldo
  public double getSueldo() {
  return sueldo;
  } // fin del método
 
  // método setter horas
  public void setHoras( double horasTrabajadas ) {
  horas = ( ( horasTrabajadas >= 0.0 ) && ( horasTrabajadas <= 168.0 ) ) ?
  horasTrabajadas : 0.0;
  } // fin del método
 
  // devuelve las horas trabajadas
  public double getHoras() {
  return horas;
  } // fin del método 
 
  // calcula los ingresos y sobrescribe el método ingresos de superclase Empleado

    /**
     *
     * @return
     */
  @Override
  public double ingresos() {
  if ( getHoras() <= 40 )
  return getSueldo() * getHoras();
  else
  return 40 * getSueldo() + ( getHoras() - 40 ) * getSueldo() * 1.5;
  } // fin del método ingresos
 
  
  @Override
  public String toString() {
  return String.format( "empleado por horas: %s\n%s: $%,.2f; %s: %,.2f",
  super.toString(), "sueldo por hora", getSueldo(),
  "horas trabajadas", getHoras() );
  } // fin del método
  } // fin de la subclase EmpleadoPorHoras