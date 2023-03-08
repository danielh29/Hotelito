/**
 * 
 */
package HOTEL;

/**
 * @author Daniel
 *
 */
public class Suite extends Habitacion {

	
	//Metros de la habitación de la suite
	int metros;
	//Servicios que tiene la suite
	String servicios;
	
	/**
	 * 
	 * @param Nhabitacion Número de la habitación de hotel
	 * @param estado Estado de la habitación de hotel
	 * @param Ncamas Número de camas que hay en la habitación de hotel
	 * @param metros Metros que tiene la suite
	 * @param servicios Servicios que ofrece la habitación
	 */
	public Suite(int Nhabitacion, String estado, int Ncamas, int metros, String servicios) {
		super(Nhabitacion, estado, Ncamas);
		
		this.metros=metros;
		this.servicios=servicios;
	}
	
	
	/**
	 * Función que devuelve los metros de la habitación
	 * @return devuelve los metros de la habitación
	 */
	public int getMetros() {
		return metros;
	}


	/**
	 * Setter establece los metros de la habitación
	 * @param metros de la habitación
	 */
	public void setMetros(int metros) {
		this.metros = metros;
	}


	/**
	 * Función que devuelve los servicios de la habitación
	 * @return devuelve los servicios de la habitación
	 */
	public String getServicios() {
		return servicios;
	}


	/**
	 * Setter Establece los servicios de la habitación
	 * @param servicios de la habitación
	 */
	public void setServicios(String servicios) {
		this.servicios = servicios;
	}


	/**
	 * Función que Calcula los Gastos de la habitación
	 */
	public void calculoGastos() {
		
	}

}
