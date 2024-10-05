package exercicio_um.entidade;

public class Pizza {
    private String massa = "";
    private String tamanho = "";
    private String ingrediente = "";

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString(){
    return "Massa: "+ this.massa +
            " Tamanho: " + this.tamanho +
            " Ingredientes: " + this.ingrediente;
    }

}
