public class EjemploValor {
        public static void main(String[] args) {
            int numero = 10;
            cambiarValor(numero);
            System.out.println("Después de llamar al método: " + numero);
        }
        static void cambiarValor(int n) {
            n = 20;
        }

}
