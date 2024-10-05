import exercicio_dois.Builder.VeiculoBuilder;
import exercicio_dois.entidade.Veiculo;
import exercicio_tres.builder.RelatorioBuilder;
import exercicio_tres.entidade.Relatorio;
import exercicio_um.builder.PizzaBuilder;
import exercicio_um.entidade.Pizza;

public class Main {
    public static void main(String[] args) {
        System.out.println("Criando pizza: ");
        executarPizza();
        System.out.println("\nCriando veiculo: ");
        executarVeiculo();
        System.out.println("\nCriando relatorio: ");
        executarRelatorio();
    }

    private static void executarRelatorio() {
        Relatorio Texto = new RelatorioBuilder().setTitulo("Titulo").setCorpo("Corpo").setRodape("Rodape").build();
        Relatorio TextoSemRodape = new RelatorioBuilder().setTitulo("Titulo Sem Rodape"). setCorpo("Corpo sem rodape").build();

        System.out.println(Texto.toString());
        System.out.println(TextoSemRodape.toString());
    }

    private static void executarVeiculo() {
        Veiculo Palio = new VeiculoBuilder().setTipo("Hatch").setCor("Prata").setRodas(5).build();

        System.out.println(Palio.toString());
    }

    private static void executarPizza() {
        Pizza Calabresa = new PizzaBuilder()
            .setMassa("Padrão")
            .setTamanho("Grande").setIngrediente("Calabresa").build();

        System.out.println(Calabresa.toString());
    }


}