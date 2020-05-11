//Superclase Empleado.

public abstract class Empleado {
  private String primerNombre;
  private String apellidoPaterno;
  private String numeroSeguroSocial;
 
 // constructor variables
 public Empleado( String nombre, String apellido, String iess ){
  primerNombre = nombre;
  apellidoPaterno = apellido;
  numeroSeguroSocial = iess;
  }
 
 // método setter nombre
 public void setPrimerNombre( String nombre ) {
  primerNombre = nombre;
  } // fin método
 
  // método getter nombre
  public String getPrimerNombre() {
  return primerNombre;
  } // fin del método
 
  // método setter apellido
  public void setApellidoPaterno( String apellido ) {
  apellidoPaterno = apellido;
  } // fin del método
 
  // método getter apellido
  public String getApellidoPaterno() {
  return apellidoPaterno;
  } // fin del método 
 
  // método setter iess
  public void setNumeroSeguroSocial( String iess ) {
  numeroSeguroSocial = iess;
  } // fin del método 
 
  // método getter iess
  public String getNumeroSeguroSocial() {
  return numeroSeguroSocial;
  } // fin del método
 
  // método toString

    /**
     *
     * @return
     */
  @Override
  public String toString() {
  return String.format( "%s %s\nnumero de seguro social: %s",
  getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial() );
  } // fin del método
 
  // método abstracto sobrescrito por las subclases
  public abstract double ingresos(); 
  } // fin de la clase