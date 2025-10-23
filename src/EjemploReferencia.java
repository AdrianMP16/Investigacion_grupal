public class EjemploReferencia {
        public static void main(String[] args) {
            Persona2.Persona p = new Persona2.Persona();
            p.nombre = "Ana";
            cambiarNombre(p);
            System.out.println("Después de llamar al método: " + p.nombre);
        }
        static void cambiarNombre(Persona2.Persona persona) {
            persona.nombre = "Carla";
        }
}
