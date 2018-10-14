
package atributoestatico;

/**
 *
 * @author Yova
 */
public class Club {

   
    private String nombre;
    private String apellido;
    private static int contador = 0;
    
    public Club(String nom, String ape){
        nombre = nom;
        apellido = ape;
       contador++;
       System.out.printf("constructor para %s %s hay %d\n", nombre, apellido, contador);
    }
    
     public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public static int getContador() {
        return contador;
    }
    
    
}
