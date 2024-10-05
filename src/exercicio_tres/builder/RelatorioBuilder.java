package exercicio_tres.builder;



import exercicio_tres.entidade.Relatorio;

public class RelatorioBuilder {
    private Relatorio relatorio = new Relatorio();

    public RelatorioBuilder setTitulo(String titulo){
        this.relatorio.setTitulo(titulo);
        return this;
    }
    public RelatorioBuilder setCorpo(String corpo){
        this.relatorio.setCorpo(corpo);
        return this;
    }
    public RelatorioBuilder setRodape(String rodape){
        this.relatorio.setRodape(rodape);
        return this;
    }
    public Relatorio build(){
        return this.relatorio;
    }
}
