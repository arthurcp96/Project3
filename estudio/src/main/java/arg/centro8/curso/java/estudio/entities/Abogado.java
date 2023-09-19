package arg.centro8.curso.java.estudio.entities;

public class Abogado {
    private int id;
    private String nombre;
    private String apellido;
    private String especialidad;


    public Abogado() {
    }




    public Abogado(String nombre, String apellido, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }



    public Abogado(int id, String nombre, String apellido, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }



    @Override
    public String toString() {
        return "Abogados [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad
                + "]";
    }



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



    public String getEspecialidad() {
        return especialidad;
    }



    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    

    

    

    
}
