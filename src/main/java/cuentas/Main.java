package cuentas;
/**Método main*/
public class Main {

     
	public static void main(String[] args) {
        operativa_cuenta(2500);
}
        /**Método que permite realizar operaciones en la cuenta.
         * @param cantidad Cantidad a ingresar en la cuenta.
         */
        public static void operativa_cuenta(float cantidad) {
            CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
            System.out.println("El saldo actual es" + cuenta1.estado());

		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
        }
}