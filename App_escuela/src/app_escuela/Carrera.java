package app_escuela;

public class Carrera {
    private int id;
    private String nombre_car;

    public Carrera() {
    }

    public Carrera(int id, String nombre_car) {
        this.id = id;
        this.nombre_car = nombre_car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_car() {
        return nombre_car;
    }

    public void setNombre_car(String nombre_car) {
        this.nombre_car = nombre_car;
    }

    @Override
    public String toString() {
        // Lo que se mostrará en el JComboBox
        return nombre_car;
    }
}
