package arg.centro8.curso.java.estudio.entities;

import arg.centro8.curso.java.estudio.enums.Hora;

public class Turno {
    private int id;
    private int abogados_id;
    private int clientes_id;
    private String fecha;
    private Hora hora;


    public Turno(int abogados_id, int clientes_id, String fecha, Hora hora) {
        this.abogados_id = abogados_id;
        this.clientes_id = clientes_id;
        this.fecha = fecha;
        this.hora = hora;
    }


    public Turno(int id, int abogados_id, int clientes_id, String fecha, Hora hora) {
        this.id = id;
        this.abogados_id = abogados_id;
        this.clientes_id = clientes_id;
        this.fecha = fecha;
        this.hora = hora;
    }


    public Turno() {
    }


    


    @Override
    public String toString() {
        return "Turnos [id=" + id + ", abogados_id=" + abogados_id + ", clientes_id=" + clientes_id + ", fecha=" + fecha
                + ", hora=" + hora + "]";
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getAbogados_id() {
        return abogados_id;
    }


    public void setAbogados_id(int abogados_id) {
        this.abogados_id = abogados_id;
    }


    public int getClientes_id() {
        return clientes_id;
    }


    public void setClientes_id(int clientes_id) {
        this.clientes_id = clientes_id;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public Hora getHora() {
        return hora;
    }


    public void setHora(Hora hora) {
        this.hora = hora;
    }

    


    

    

    


}
