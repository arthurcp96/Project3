package arg.centro8.curso.java.estudio.entities;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private String mail;
    private String numero;

    
    public Cliente() {
    }


    public Cliente(String nombre, String apellido, String mail, String numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.numero = numero;
    }


    public Cliente(int id, String nombre, String apellido, String mail, String numero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.numero = numero;
    }


    


    @Override
    public String toString() {
        return "Clientes [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", numero="
                + numero + "]";
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


    public String getMail() {
        return mail;
    }


    public void setMail(String mail) {
        this.mail = mail;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }

    

    

    
}
