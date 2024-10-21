package WebService.demo;

public class Curso {
    private String titulo;
    private int cargaHoraria;

    public Curso() {
    }

    public Curso(String titulo, int cargaHoraria) {
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}


//Nome: Guilherme Soares Santos
//RA: 10428380
