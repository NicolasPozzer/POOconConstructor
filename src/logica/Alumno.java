


package logica;

//Objeto alumno
class Alumno {
    
    
    //Atributos o caracteristicas del alumno
    int id;
    String nombre;
    String apellido;
    
    
    //Creacion de Constructor Vacio para cargarlos luego a un alumno
    public Alumno() {
    }

    //Creacion de Constructores con atributos para alumno
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    /*===============================
    =========METODOS DE ALUMNO=======
    =================================
    */
    
    //Metodo mostrar nombre
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y se decir mi nombre!");
        
    }
    
    
    
    /*===============================
    =========Getter y Setters=======
    =================================
    */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
}
