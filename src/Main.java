public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 500);
        cuenta.mostrarSaldo();   // Muestra el saldo
        cuenta.depositar(200);   // Deposita dinero
        cuenta.mostrarSaldo();   // Muestra el nuevo saldo
    }
}

