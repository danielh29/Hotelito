/**
 * 
 */
package HOTEL;

/**
 * @author Daniel
 *
 */
public class Dobles extends Habitacion {


	//Oferta del MiniBar
	String MiniBar;
	
	/**
	 * 
	 * @param Nhabitacion Número de la habitación de hotel
	 * @param estado Estado de la habitación de hotel
	 * @param Ncamas Número de camas que hay en la habitación de hotel
	 * @param MiniBar Oferta que ofrece el miniBar
	 */
	public Dobles(int Nhabitacion, String estado, int Ncamas, String MiniBar) {
		super(Nhabitacion, estado, Ncamas);
		this.MiniBar=MiniBar;
		
	}
	
	
	/**
	 * Función que devuelve la oferta del miniBar
	 * @return devuelve la oferta del miniBar
	 */
	public String getMiniBar() {
		return MiniBar;
	}


	/**
	 * Setter Establece la oferta del MiniBar
	 * @param miniBar del hotel
	 */
	public void setMiniBar(String miniBar) {
		MiniBar = miniBar;
	}


	/**
	 * Función calcula el descuento de la habitación
	 */
	public void CalculoDescuento() {
		
	}

}
