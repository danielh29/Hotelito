/**
 * 
 */
package HOTEL;

/**
 * @author Aaron
 * @version 2.0
 * 
 */
public class Reserva{

	/**
	 * Función que devuelve el numero de la reserva
	 * @return devuelve el numero de reserva
	 */
	public int getNreserva() {
		return Nreserva;
	}

	/**
	 * Setter para establecer el numero de la reserva
	 * @param nreserva establece el numero de la reserva
	 */
	public void setNreserva(int nreserva) {
		Nreserva = nreserva;
	}

	/**
	 * Función que devuelve la fecha de entrada de la reserva
	 * @return devuelve la fecha de entrada
	 */
	public Date getFentrada() {
		return Fentrada;
	}

	/**
	 * Setter que establece la fecha de entrada de la reserva
	 * @param fentrada establece la fecha de entrada
	 */
	public void setFentrada(Date fentrada) {
		Fentrada = fentrada;
	}
	/**
	 * Función que devuelve la fecha de salida de la reserva
	 * @return devuelve la fecha de salida
	 */
	public Date getFsalida() {
		return Fsalida;
	}
	/**
	 * Setter que establece la fecha de salida de la reserva
	 * @param fentrada establece la fecha de salida
	 */
	public void setFsalida(Date fsalida) {
		Fsalida = fsalida;
	}

	/**
	 * Función que devuelve el numero de personas de la reserva
	 * @return devuelve el numero de personas
	 */
	public int getNpersonas() {
		return Npersonas;
	}

	/**
	 * Setter que devuelve el numero de personas de la reserva
	 * @param npersonas devuelve el numero de personas
	 */
	public void setNpersonas(int npersonas) {
		Npersonas = npersonas;
	}

	//Indica el numero de reserva
	int Nreserva;

	//Indica la fecha de entrada
	Date Fentrada;

	//Indica la fecha de salida
	Date Fsalida;

	//Indica el numero de personas
	int Npersonas;

	/**
	 *
	 * @param Nreserva Indica el numero de la reserva
	 * @param Fentrada Indica la fecha de entrada
	 * @param Fsalida Indica la fecha de salida
	 * @param Npersonas Indica el numero de personas
	 */
	public Reserva(int Nreserva, Date Fentrada, Date Fsalida, int Npersonas) {

		this.Nreserva=Nreserva;
		this.Fentrada=Fentrada;
		this.Fsalida=Fsalida;
		this.Npersonas=Npersonas;
	}

}
