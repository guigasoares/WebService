package WebService.demo.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import WebService.demo.Curso;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoControlador {

    private final List<Curso> listaDeCursos;

    @Autowired
    public CursoControlador() {
        listaDeCursos = new ArrayList<>();
        adicionarCursosIniciais();
    }

    private void adicionarCursosIniciais() {
        listaDeCursos.add(new Curso("Fotografia Digital", 90));
        listaDeCursos.add(new Curso("Culinária Internacional", 60));
    }

    @GetMapping
    public List<Curso> obterCursos() {
        return listaDeCursos;
    }

    @PostMapping
    public Curso criarCurso(@RequestBody Curso novoCurso) {
        listaDeCursos.add(novoCurso);
        return novoCurso;
    }

    @GetMapping("/{titulo}")
    public Curso buscarCurso(@PathVariable String titulo) {
        return listaDeCursos.stream()
                .filter(c -> c.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

    @PutMapping("/{titulo}")
    public Curso editarCurso(@PathVariable String titulo, @RequestBody Curso cursoModificado) {
        Curso curso = buscarCurso(titulo);
        if (curso != null) {
            curso.setTitulo(cursoModificado.getTitulo());
            curso.setCargaHoraria(cursoModificado.getCargaHoraria());
        }
        return curso;
    }

    @DeleteMapping("/{titulo}")
    public void removerCurso(@PathVariable String titulo) {
        listaDeCursos.removeIf(c -> c.getTitulo().equalsIgnoreCase(titulo));
    }
}


//Nome: Guilherme Soares Santos
//RA: 10428380