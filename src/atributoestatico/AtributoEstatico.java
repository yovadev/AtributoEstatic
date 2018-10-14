
package atributoestatico;

public class AtributoEstatico {


    public static void main(String[] args) {
        Club miembro1 = new Club("Jhon", "Doe");
        Club miembro2 = new Club("Jane", "Doe");
        Club miembro3 = new Club("Pedro", "Picapiedra");
        
        System.out.println();
        System.out.println("El nombre del socio es: "+miembro1.getNombre());
        System.out.println("El apellido del socio es: "+miembro1.getApellido());
        System.out.println("El numero total de socios es: "+miembro1.getContador());
    }

}
