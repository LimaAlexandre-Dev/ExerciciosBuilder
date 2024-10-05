package exercicio_tres.entidade;

public class Relatorio {
    private String titulo = "";
    private String corpo = "";
    private String rodape = "";

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setRodape(String rodape) {
        this.rodape = rodape;
    }

    @Override
    public String toString(){
        return "Titulo: " + this.titulo + "" +
                " Corpo: " + this.corpo + "" +
                " Rodape: " + this.rodape;
    }
}
