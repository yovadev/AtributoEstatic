
package atributoestatico;

/**
 *
 * @author Yova
 */
public class Club {
    
    private String nombre;
    private String apellido;
    /* utilizando static para que se visibles */
    private static int contador = 0;
    
    public Club(String nom, String ape){
        nombre = nom;
        apellido = ape;
       contador++;
       System.out.printf("constructor para %s %s hay %d\n", nombre, apellido, contador);
    }
    
}
