public class CuentaBancaria {
        private String titular;
        private double saldo;
        public CuentaBancaria(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }
        public void mostrarSaldo() {
            System.out.println("Saldo actual de " + titular + ": $" + saldo);
        }
        public void depositar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                System.out.println("Depósito exitoso.");
            } else {
                System.out.println("Cantidad inválida.");
            }
        }
        public String getTitular() {return titular;}
        public double getSaldo() {return saldo;}
        public void setSaldo(double nuevoSaldo) {
            if (nuevoSaldo >= 0) {
                saldo = nuevoSaldo;
            } else {
                System.out.println("El saldo no puede ser negativo.");
            }
        }
}
