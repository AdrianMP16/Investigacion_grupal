public class Mensajero {
        public void enviarMensaje() {
            System.out.println("Mensaje enviado.");
        }
        public void enviarMensaje(String destinatario) {
            System.out.println("Mensaje enviado a " + destinatario + ".");
        }
        public void enviarMensaje(String destinatario, String contenido) {
            System.out.println("Mensaje para " + destinatario + ": " + contenido);
        }
        public void enviarMensaje(String contenido, int prioridad) {
            System.out.println("Mensaje '" + contenido + "' con prioridad " + prioridad);
        }
        public static void main(String[] args) {
            Mensajero app = new Mensajero();
            app.enviarMensaje();
            app.enviarMensaje("Ana");
            app.enviarMensaje("Luis", "Hola, ¿cómo estás?");
            app.enviarMensaje("Reunión a las 5pm", 1);
        }
}
