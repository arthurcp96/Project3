package arg.centro8.curso.java.estudio.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import arg.centro8.curso.java.estudio.connectors.Connector;
import arg.centro8.curso.java.estudio.entities.Cliente;

public class ClienteRepository {
    private Connection conn = Connector.getConnection();

    public void save(Cliente clientes) {
        try (PreparedStatement ps = conn.prepareStatement(
                "insert into clientes (nombre, apellido, mail, numero) values (?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, clientes.getNombre());
            ps.setString(2, clientes.getApellido());
            ps.setString(3, clientes.getMail());
            ps.setString(4, clientes.getNumero());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next())
                clientes.setId(rs.getInt(1));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Cliente> getAll() {
        List<Cliente> list = new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery("select * from clientes")) {
            while (rs.next()) {
                list.add(new Cliente(
                        rs.getInt("id"), // id
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("mail"),
                        rs.getString("numero")
                ));
            }

        }

        catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public Cliente getById(int id) {
        return getAll()
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(new Cliente());
    }

    public List<Cliente> getLikeApellido(String apellido) {
        if (apellido == null)
            return new ArrayList();
        return getAll()
                .stream()
                .filter(c -> c.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .toList();
    }

}
