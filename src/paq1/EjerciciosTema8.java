package paq1;

public class EjerciciosTema8 {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Christian");
        String nombre = persona.getNombre();

        persona.setEdad(33);
        int edad = persona.getEdad();

        persona.setTelefono("3103630912");
        String telefono = persona.getTelefono();

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(telefono);

    }

    class Persona{
        private String nombre;
        private String Telefono;
        private int edad;

        public void setNombre(String name){
            this.nombre = name;
        }
        public String getNombre(){
            return this.nombre;
        }

        public void setTelefono(String tel){
            this.Telefono = tel;
        }
        public String getTelefono(){
            return this.Telefono;
        }

        public void setEdad(int age){
            this.edad = age;
        }
        public int getEdad(){
            return this.edad;
        }
    }
}
