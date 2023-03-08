/**
 * 
 */
package HOTEL;

/**
 * @author Aaron
 * @version 2.0
 * 
 */
public class Clientes {
	/**
	 * Función que devuelve el numero del cliente
	 * @return devuelve el numero del cliente
	 */
	public int getNcliente() {
		return Ncliente;
	}

	/**
	 * Setter que establece el numero del cliente
	 * @param ncliente establece el numero del cliente
	 */
	public void setNcliente(int ncliente) {
		Ncliente = ncliente;
	}

	/**
	 * Función que devuelve el nombre del cliente
	 * @return devuelve el nombre del cliente
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * Setter que establece el nombre del cliente
	 * @param nombre devuelve el nombre del cliente
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * Función que devuelve el numero de telefono del cliente
	 * @return devuelve el numero de telefono del cliente
	 */
	public int getTelefono() {
		return Telefono;
	}

	/**
	 * Setter que devuelve el numero de telefono del cliente
	 * @param telefono devuelve el numero de telefono del cliente
	 */
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	//Indica el número del cliente
	int Ncliente;
	//Indica el nombre del cliente
	String Nombre;
	//Indica el numero de telefono del cliente
	int Telefono;

	/**
	 *
	 * @param Ncliente indica el numero de referencia del cliente
	 * @param Nombre indica el nombre del cliente
	 * @param Telefono indica el numero de telefono del cliente
	 */

	public Clientes(int Ncliente, String Nombre, int Telefono) {

		this.Ncliente=Ncliente;
		this.Nombre=Nombre;
		this.Telefono=Telefono;
	}
}
