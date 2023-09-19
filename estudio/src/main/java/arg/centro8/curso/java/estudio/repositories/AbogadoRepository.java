package arg.centro8.curso.java.estudio.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import arg.centro8.curso.java.estudio.connectors.Connector;
import arg.centro8.curso.java.estudio.entities.Abogado;

public class AbogadoRepository {
    private Connection conn = Connector.getConnection();

    public void save(Abogado abogados) {
        try (PreparedStatement ps = conn.prepareStatement(
                "insert into abogados (nombre, apellido, especialidad) values (?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, abogados.getNombre());
            ps.setString(2, abogados.getApellido());
            ps.setString(3, abogados.getEspecialidad());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next())
                abogados.setId(rs.getInt(1));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Abogado> getAll() {
        List<Abogado> list = new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery("select * from abogados")) {
            while (rs.next()) {
                list.add(new Abogado(
                        rs.getInt("id"), // id
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("especialidad")
                ));
            }

        }

        catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    public Abogado getById(int id) {
        return getAll()
               .stream()
               .filter (a->a.getId() == id)
               .findFirst()
               .orElse(new Abogado());
    }

    public List<Abogado>getLikeEspecialidad(String especialidad){
        if(especialidad==null) return new ArrayList();
        return getAll()
                    .stream()
                    .filter(c->c.getEspecialidad().toLowerCase().contains(especialidad.toLowerCase()))
                    .toList();      
    }

}
