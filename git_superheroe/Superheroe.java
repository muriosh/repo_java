public class Superheroe {
    String nombre;
    String poderPpal;
    int nivelDePoder;
    String colorDelDisfraz;

    Superheroe(){
        nombre= "";
        poderPpal= "";
        nivelDePoder= 0;
        colorDelDisfraz= "";
    }


    public Superheroe(String nombre, String poderPpal, int nivelDePoder, String colorDelDisfraz) {
        this.nombre = nombre;
        this.poderPpal = poderPpal;
        this.nivelDePoder = nivelDePoder;
        this.colorDelDisfraz = colorDelDisfraz;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getPoderPpal() {
        return poderPpal;
    }


    public void setPoderPpal(String poderPpal) {
        this.poderPpal = poderPpal;
    }


    public int getNivelDePoder() {
        return nivelDePoder;
    }


    public void setNivelDePoder(int nivelDePoder) {
        this.nivelDePoder = nivelDePoder;
    }


    public String getColorDelDisfraz() {
        return colorDelDisfraz;
    }


    public void setColorDelDisfraz(String colorDelDisfraz) {
        this.colorDelDisfraz = colorDelDisfraz;
    }


    public void usarPoder(){
        System.out.println("Tengo el PODER:"+poderPpal);
    }

    public String saludar(String nombre){
        return "Hola "+ nombre;
    }

}