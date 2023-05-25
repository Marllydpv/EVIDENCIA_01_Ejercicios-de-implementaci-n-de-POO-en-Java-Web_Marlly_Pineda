public class HistoriaCRUD extends HistoriaServlet {

    private String titulo;
    private String contenido;


    public HistoriaCRUD() {
    }

    public HistoriaCRUD(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public String agregarHistoria() {
        return titulo+" "+contenido;
    }

    @Override
    public String eliminarHistoria() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarHistoria'");
    }

  
    
}
