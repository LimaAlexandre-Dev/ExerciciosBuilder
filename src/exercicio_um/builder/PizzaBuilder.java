package exercicio_um.builder;

import exercicio_um.entidade.Pizza;

public class PizzaBuilder {
    private Pizza pizza = new Pizza();

    public PizzaBuilder setMassa(String massa){
        this.pizza.setMassa(massa);
        return this;
    }

    public PizzaBuilder setTamanho(String tamanho){
        this.pizza.setTamanho(tamanho);
        return this;
    }

    public PizzaBuilder setIngrediente(String ingrediente){
        this.pizza.setIngrediente(ingrediente);
        return this;
    }

    public Pizza build(){
        return this.pizza;
    }
}
