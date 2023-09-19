package arg.centro8.curso.java.estudio.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import arg.centro8.curso.java.estudio.connectors.Connector;
import arg.centro8.curso.java.estudio.entities.Turno;
import arg.centro8.curso.java.estudio.enums.Hora;

public class TurnoRepository {
    private Connection conn = Connector.getConnection();

    public void save(Turno turnos) {
        try (PreparedStatement ps = conn.prepareStatement(
                "insert into turnos (abogados_id, clientes_id, fecha, hora) values (?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, turnos.getAbogados_id());
            ps.setInt(2, turnos.getClientes_id());
            ps.setString(3, turnos.getFecha());
            ps.setString(4, turnos.getHora().toString());

            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next())
                turnos.setId(rs.getInt(1));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Turno> getAll() {
        List<Turno> list = new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery("select * from turnos")) {
            while (rs.next()) {
                list.add(new Turno(
                        rs.getInt("id"),
                        rs.getInt("abogados_id"),
                        rs.getInt("clientes_id"),
                        rs.getString("fecha"),
                        Hora.valueOf(rs.getString("hora"))));

            }

        }

        catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public Turno getById(int id) {
        return getAll()
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(new Turno());
    }

    public List<Turno> getLikeFecha(String fecha) {
        if (fecha == null)
            return new ArrayList();
        return getAll()
                .stream()
                .filter(c -> c.getFecha().toLowerCase().contains(fecha.toLowerCase()))
                .toList();
    }

}
