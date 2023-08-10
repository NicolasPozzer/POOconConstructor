
package logica;




public class POOconConstructor {

    
    public static void main(String[] args) {
        
        
        //Declaro el OBJETO alumno y creo mi objeto con los parametros
        
        Alumno alu1 = new Alumno(1, "Nicolas", "Pozzer");
        Alumno alu2 = new Alumno(2, "Romina", "Zacarias");
        Alumno alu3 = new Alumno();//Alumno vacio
        
        
        
        
        //Mostrando los datos del alumno 1
        System.out.println("La ID del alumno 1 es: "+ alu1.getId());
        System.out.println("El nombre del alumno 1 es: "+ alu1.getNombre());
        System.out.println("y su apellido: "+ alu1.getApellido());
        System.out.println("\nY todos sus datos completo serian:\n ==> id: "+alu1.getId()+"  nombre: "+alu1.getNombre()+"  apellido: "+alu1.getApellido());
        System.out.println("\n");
        
        //Mostrando los datos del alumno 2
        System.out.println("La ID del alumno 2 es: "+ alu2.getId());
        System.out.println("El nombre del alumno 2 es: "+ alu2.getNombre());
        System.out.println("y su apellido: "+ alu2.getApellido());
        //Cambio de apellido del alumno 2 ya que esta mal
        alu2.setApellido("Pozzer");
        
        System.out.println("Corrigiendo el apellido de: "+ alu2.getNombre());
        
        System.out.println("\nY todos sus datos completo serian:\n ==> id: "+alu2.getId()+"  nombre: "+alu2.getNombre()+"  apellido: "+alu2.getApellido());
        
        
        
        /*
        ==============================================================
        =======SETEANDO ATRIBUTOS PARA EL ALUMNO 3 QUE ESTA VACIO=====
        ==============================================================
        */
        
        alu3.setId(3);
        System.out.println("\n\nEl alumno "+ alu3.getId() +" esta vacio, cargando sus datos...");
        
        alu3.setNombre("Martin");
        alu3.setApellido("Pozzer");
        System.out.println(" todos sus datos completo serian:\n ==> id: "+alu3.getId()+"  nombre: "+alu3.getNombre()+"  apellido: "+alu3.getApellido());
        System.out.println("\n");

        
    }
    
}
