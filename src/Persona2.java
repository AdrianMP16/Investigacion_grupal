public class Persona2 {
    static class Persona {
        String nombre;
    }
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Ana";
        cambiarNombre(p);
        System.out.println("Después de llamar al método: " + p.nombre);
    }
    static void cambiarNombre(Persona2.Persona persona) {
        persona.nombre = "Carla";
    }
}
