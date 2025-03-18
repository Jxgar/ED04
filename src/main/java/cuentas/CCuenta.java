package cuentas;
/**Clase cuenta bancaria.*/
public class CCuenta {
/**Declaramos las variables.*/
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

        /**Constructor vacío.*/
	public CCuenta() {
	}

        /**Constructor con las variables de la clase.
         *@param nom Nombre del titular
         *@param cue Número de cuenta
         *@param sal Saldo de la cuenta
         *@param tipo Tipo de interés de la cuenta
         */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		this.nombre = nom; 
		this.cuenta = cue; 
		this.saldo = sal; 
                this.tipoInterés = tipo; 
	}

        /**Método para conocer el saldo actual.
         * @return Saldo de la cuenta.
         */
	public double estado() {
		return saldo;
	}

        /**Método que permite ingresar una cantidad.
         * @param cantidad Cantidad a ingresar
         * @throws Exception Si la cantidad es inferior a 0.
         * Si todo es correcto el saldo se actualiza.
         */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) 
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

        /**Método que permite retirar cantidad.
         * @param cantidad Cantidad a retirar
         * @throws Exception Si el saldo es igual o inferior a 0
         * o si el saldo es menor que la cantidad a retirar.
         * Una vez retirada la cantidad el saldo se actualiza.
         */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0) 
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad) 
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad; 
	}
        
        //Añadimos métodos getter y setter para permitir la encapsulación. 
        public String getNombre() {
        return nombre;
    }
        public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        public String getCuenta() {
        return cuenta;
    }

        public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

        public double getSaldo() {
        return saldo;
    }

        public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

        public double getTipoInterés() {
        return tipoInterés;
    }

        public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
        
}
 
