package robot.estados.menus;

public class Mexicana extends Hamburguesa {

    public Mexicana(int id, String nombre, String descripcion, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso = false;
        this.vegetariana = false;
    }

    public Mexicana() {
        this.id = 102;
        this.nombre = "Hamburguesa Mexicana";
        this.descripcion = "Hamburguesa de arrachera, guacamole totopos y crema con especias haciendo referencia a los chilaquiles  ";
        this.precio = 55;
        this.conQueso = false;
        this.vegetariana = false;
    }

    @Override
    public String preparar(){
        String preparacion = this.ponerPan()+"\n"+this.ponerCremaConEspecias()+"\n"+this.ponerMayonesa()+"\n"+this.ponerMostaza()+"\n"+this.prepararProteina()+"\n"+this.ponerProteina()+"\n";
        if(this.conQueso)
            preparacion+=this.ponerQueso()+"\n";
        preparacion+=this.ponerTotopos()+"\n"+this.ponerVegetales()+"\n"+this.ponerGuacamole()+"\n"+this.ponerCatsup()+"\n"+this.ponerPan();
        return preparacion;
    }

    @Override
    public String prepararProteina() {
        return "Estoy preparando la arrachera";
    }

    @Override
    public String ponerProteina() {
        return "Estoy poniendo la arrachera";
    }

    public String ponerGuacamole() {
        return "Estoy poniendo el guacamole";
    }

    public String ponerTotopos() {
        return "Estoy poniendo los totopos";
    }

    public String ponerCremaConEspecias() {
        return "Estoy poniendo la crema con especias";
    }
}