public class Persona {
   private String nombre;
   public Persona(String nombre) {
      this.nombre = nombre;
   }
   public void saludar() {
     System.out.println("Hola, soy " + nombre);
   }
   public static void main(String[] args) {
      Persona p1 = new Persona("Ana");
      p1.saludar();
   }
}
