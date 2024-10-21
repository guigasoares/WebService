package WebService.demo;

import java.util.ArrayList;
import java.util.List;

public class CursoManager {
    private final List<Curso> listaCursos;

    public CursoManager() {
        listaCursos = new ArrayList<>();
        inicializarCursos();
    }

    private void inicializarCursos() {
        listaCursos.add(new Curso("Engenharia de Software", 3200));
        listaCursos.add(new Curso("Inteligência Artificial", 2800));
    }

    public List<Curso> listarCursos() {
        return listaCursos;
    }
}


//Nome: Guilherme Soares Santos
//RA: 10428380