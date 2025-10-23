public class Mensaje {
        public void saludar() {
            System.out.println("¡Hola!");
            despedirse();
        }
        public void despedirse() {
            System.out.println("¡Adiós!");
        }
        public static void main(String[] args) {
            Mensaje m = new Mensaje();
            m.saludar();
        }
}
