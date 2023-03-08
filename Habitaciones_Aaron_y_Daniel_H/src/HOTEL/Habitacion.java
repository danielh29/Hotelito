/**
 * 
 */
package HOTEL;

/**
 * @author Daniel
 *
 */


public abstract class  Habitacion {
	
	//Indica el número de habitaciones
	protected int Nhabitacion;
	//Indica el estado de la habitación
	protected String estado;
	//Indica el número de camas.
	protected int Ncamas;
	
	/**
	 * 
	 * @param Nhabitacion Número de la habitación de hotel
	 * @param estado Estado de la habitación de hotel
	 * @param Ncamas Número de camas que hay en la habitación de hotel
	 */
	public Habitacion( int Nhabitacion, String estado, int Ncamas) {
		this.Nhabitacion=Nhabitacion;
		this.estado=estado;
		this.Ncamas=Ncamas;
	}

	/**
	 * Función para saber el número de habitaciones
	 * @return Devuelve el número de habitaciones
	 */
	public int getNhabitacion() {
		return Nhabitacion;
	}

	/**
	 * Setter para establecer el número de habitaciones
	 * @param nhabitacion del hotel 
	 */
	public void setNhabitacion(int nhabitacion) {
		Nhabitacion = nhabitacion;
	}

	/**
	 * Función para devolver el estado de la habitación
	 * @return Devuelve el estado de la habitación
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Setter para establecer el estado de la habitación
	 * @param estado de la habitacion
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Función para devolver el número de camas
	 * @return Devuelve el número de camas
	 */
	public int getNcamas() {
		return Ncamas;
	}

	/**
	 * Setter para establecer el número de camas
	 * @param ncamas de la habitación
	 */
	public void setNcamas(int ncamas) {
		Ncamas = ncamas;
	}
	
	

}


