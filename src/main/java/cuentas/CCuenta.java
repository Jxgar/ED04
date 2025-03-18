package cuentas;
/**Clase cuenta bancaria.*/
public class CCuenta {
        /** Nombre del titular de la cuenta. */
	private String nombre;  
        /** Número de cuenta bancaria. */
	private String cuenta; 
        /** Saldo actual de la cuenta. */
	private double saldo; 
        /** Tipo de interés aplicado a la cuenta. */
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

        /** Método que permite ingresar una cantidad.
         * @param cantidad Cantidad a ingresar
         * @throws Exception Si la cantidad es inferior a 0.
         * Si todo es correcto el saldo se actualiza.
         */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) 
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

        /** Método que permite retirar cantidad.
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
        
        
        /** Getter para el nombre del titular de la cuenta.
         * @return El nombre del titular.
         */
        public String getNombre() {
        return nombre;
    }
        /** Setter para modificar el nombre del titular de la cuenta.
         * @param nombre El nuevo nombre del titular.
         */
        public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        /** Getter para el número de cuenta.
         * @return El número de cuenta.
         */
        public String getCuenta() {
        return cuenta;
    }

        /** Setter para modificar el número de cuenta.
         * @param cuenta El nuevo número de cuenta.
         */
        public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

        /** Getter para el saldo de la cuenta.
         * @return El saldo actual de la cuenta.
         */
        public double getSaldo() {
        return saldo;
    }

        /** Setter para modificar el saldo de la cuenta.
         * @param saldo El nuevo saldo de la cuenta.
         */
        public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

        /** Getter para el tipo de interés de la cuenta.
         * @return El tipo de interés aplicado a la cuenta.
         */
        public double getTipoInterés() {
        return tipoInterés;
    }

        /** Setter para modificar el tipo de interés de la cuenta.
         * @param tipoInterés El nuevo tipo de interés de la cuenta.
         */
        public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
        
}
 
