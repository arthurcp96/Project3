package arg.centro8.curso.java.estudio.test;

import arg.centro8.curso.java.estudio.entities.Abogado;
import arg.centro8.curso.java.estudio.entities.Cliente;
import arg.centro8.curso.java.estudio.entities.Turno;
import arg.centro8.curso.java.estudio.enums.Hora;
import arg.centro8.curso.java.estudio.repositories.AbogadoRepository;
import arg.centro8.curso.java.estudio.repositories.ClienteRepository;
import arg.centro8.curso.java.estudio.repositories.TurnoRepository;

public class TestRepository {
    public static void main(String[] args) {

       AbogadoRepository ar = new AbogadoRepository();

       Abogado abogado = new Abogado("Sebastian", "Otero", "Derecho Tributario");
       ar.save(abogado);
       System.out.println(abogado);
       ar.getAll().forEach(System.out::println);

       System.out.println("************************************");
       System.out.println(ar.getById(10));

       System.out.println("***************************************");
       ar.getLikeEspecialidad("tri").forEach(System.out::println);



       System.out.println("-------------------------------------------");
       ClienteRepository cr = new ClienteRepository();

       Cliente cliente = new Cliente("Luciano", "Canicci", "Caniciluciano@gmail.com", "1125678909");
       cr.save(cliente);
       cr.getAll().forEach(System.out::println);

       System.out.println("****************************************");
       cr.getLikeApellido("ca").forEach(System.out::println);

       System.out.println("*****************************************");
       System.out.println(cr.getById(5));



       System.out.println("----------------------------------------------");
       TurnoRepository tr = new TurnoRepository();

       Turno turno = new Turno(3, 4, "2023-06-02", Hora.Turno_10_00);
       //tr.save(turno);    
       tr.getAll().forEach(System.out::println);

       System.out.println("********************************");
       tr.getLikeFecha("06").forEach(System.out::println);

       System.out.println("******************************************");
       System.out.println(tr.getById(7));

       

      


       
       
       



    }
}
