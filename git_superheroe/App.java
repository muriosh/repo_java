public class App {
    public static void main(String[] args) throws Exception {
        final int MAX = 10;
        System.out.println("Proyecto creado y Clase de héroes");
        Superheroe[] s = new Superheroe[MAX];
    
        // Instancio un array de objetos de la clase Superheroe
        int i = 0;
        while ( i < MAX){
            s[i] = new Superheroe("nombre_"+i, "poderPpal_"+i, i,"colorDelDisfraz_"+i );
            i++;
        }

        System.out.println("------------------------------------------");
        System.out.println("Mensaje añadido para probar el control de cambios");
        System.out.println("(“>Epi: ¡Hola Blas!");
        for (Superheroe heroe : s) {
            System.out.println(heroe.getNombre()+" "+heroe.getPoderPpal()+" "+heroe.getNivelDePoder()+" "+heroe.getColorDelDisfraz());
        }
        System.out.println("------------------------------------------");
   }

   

           /*
         * Instancio dos objetos de la clase Superheroe
         * Superheroe  rayoVeloz = new Superheroe(); // Mi héroe favorito :)
         * rayoVeloz.nombre= "RAYO VELOZ";
         * rayoVeloz.poderPpal= "Súper velcidad";
         * rayoVeloz.nivelDePoder= 85;
         * rayoVeloz.colorDelDisfraz= "amarillo";

         * Superheroe  wonderWoman= new Superheroe();
         * wonderWoman.nombre= "WONDER WOMAN"; // papel secundario :):)
         * wonderWoman.poderPpal= "Súper fuerza";
         * wonderWoman.nivelDePoder= 2;
         * wonderWoman.colorDelDisfraz= "rosa";
         */ 
        
        /*
         * Practico con la salida por consonsola de
         * los distintos tipos de datos.
        System.out.println("------------------------------------------");
        System.out.printf("OBJETO SÚPER HËROE: %s\n", rayoVeloz.nombre);
        System.out.printf("PODER: %s\t NIVLEL PODER %d \n", rayoVeloz.poderPpal, rayoVeloz.nivelDePoder);
        System.out.printf("COLOR DISFRAZ %s\n", rayoVeloz.colorDelDisfraz);
        System.out.println("------------------------------------------");

        System.out.println("------------------------------------------");
        System.out.printf("OBJETO SÚPER HEROINA: %s\n", wonderWoman.nombre);
        System.out.printf("PODER: %s\t NIVLEL PODER %d \n", wonderWoman.poderPpal, wonderWoman.nivelDePoder);
        System.out.printf("COLOR DISFRAZ %s\n", wonderWoman.colorDelDisfraz);
        System.out.println("------------------------------------------");
        */
}


