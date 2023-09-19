package arg.centro8.curso.java.estudio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import arg.centro8.curso.java.estudio.entities.Abogado;
import arg.centro8.curso.java.estudio.entities.Cliente;
import arg.centro8.curso.java.estudio.entities.Turno;
import arg.centro8.curso.java.estudio.repositories.AbogadoRepository;
import arg.centro8.curso.java.estudio.repositories.ClienteRepository;
import arg.centro8.curso.java.estudio.repositories.TurnoRepository;

@Controller
public class WebController {
    private AbogadoRepository abogadoRepository = new AbogadoRepository();
    private ClienteRepository clienteRepository = new ClienteRepository();
    private TurnoRepository turnoRepository = new TurnoRepository();

    private String mensajeAbogado = "Ingrese un nuevo abogado";
    private String mensajeCliente = "Ingrese un nuevo cliente";
    private String mensajeTurno = "Ingrese un nuevo turno";

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/clientes")

    public String getClientes(
            @RequestParam(name = "buscarApellido", required = false, defaultValue = "") String buscarApellido,
            Model model) {
        model.addAttribute("mensajeCliente", mensajeCliente);
        model.addAttribute("cliente", new Cliente());
        // model.addAttribute("clientes", clienteRepository.getAll());
        model.addAttribute("likeApellido", clienteRepository.getLikeApellido(buscarApellido));
        return "clientes";

    }

    @GetMapping("/abogados")
    public String getAbogados(
            @RequestParam(name = "buscarEspecialidad", required = false, defaultValue = "") String buscarEspecialidad,
            Model model) {

        model.addAttribute("mensajeAbogado", mensajeAbogado);
        model.addAttribute("abogado", new Abogado());
        model.addAttribute("likeEspecialidad", abogadoRepository.getLikeEspecialidad(buscarEspecialidad));
        //model.addAttribute("abogado", abogadoRepository.getAll());
        return "abogados";
    }

    @GetMapping("/turnos")
    public String getTurnos(@RequestParam(name = "buscarFecha", required = false, defaultValue = "") String buscarFecha,
            Model model) {

        model.addAttribute("mensajeTurno", mensajeTurno);
        model.addAttribute("turno", new Turno());
        model.addAttribute("likeFecha", turnoRepository.getLikeFecha(buscarFecha));
        model.addAttribute("turnos", turnoRepository.getAll());
        model.addAttribute("abogados", abogadoRepository.getAll());
        model.addAttribute("clientes", clienteRepository.getAll());
        return "turnos";
    }

    @PostMapping("/saveAbogado")
    public String save(@ModelAttribute Abogado abogado) {
        try {
            abogadoRepository.save(abogado);
            mensajeAbogado = "Se guardo el abogado id: " + abogado.getId();
        } catch (Exception e) {
            mensajeAbogado = "Ocurrio un error";
        }
        return "redirect:abogados";
    }

    @PostMapping("/saveCliente")
    public String save(@ModelAttribute Cliente cliente) {
        try {
            clienteRepository.save(cliente);
            mensajeCliente = "Se guardo el cliente id " + cliente.getId();
        } catch (Exception e) {
            mensajeCliente = "Ocurrio un error";
        }
        return "redirect:clientes";
    }

    @PostMapping("/saveTurno")
    public String save(@ModelAttribute Turno turno) {
        try {
            turnoRepository.save(turno);
            mensajeTurno = "Se guardo el turno id" + turno.getId();

        } catch (Exception e) {
            mensajeTurno = "Ocurrio un error";
        }
        return "redirect:turnos";
    }

}
