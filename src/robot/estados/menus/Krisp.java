package robot.estados.menus;

public class Krisp extends Hamburguesa {

    public Krisp(int id, String nombre, String descripcion, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso = false;
        this.vegetariana = false;
    }

    public Krisp() {
        this.id = 51;
        this.nombre = "Hamburguesa Krisp";
        this.descripcion = "Hamburguesa de res con aros de cebolla y crujiente tocino";
        this.precio = 45;
        this.conQueso = false;
        this.vegetariana = false;
    }

    @Override
    public String preparar(){
        String preparacion = this.ponerPan()+"\n"+this.ponerMayonesa()+"\n"+this.ponerMostaza()+"\n"+this.prepararProteina()+"\n"+this.ponerProteina()+"\n";
        if(this.conQueso)
            preparacion+=this.ponerQueso()+"\n";
        preparacion+=this.ponerVegetales()+"\n"+this.ponerArosDeCebolla()+"\n"+this.ponerCatsup()+"\n"+this.ponerPan();
        return preparacion;
    }

    @Override
    public String prepararProteina() {
        return "Estoy preparando la carne";
    }

    @Override
    public String ponerProteina() {
        return "Estoy poniendo la carne\n" + this.ponerTocino();
    }

    public String ponerArosDeCebolla() {
        return "Estoy poniendo los aros de cebolla";
    }

    public String ponerTocino() {
        return "Estoy poniendo el tocino";
    }
}