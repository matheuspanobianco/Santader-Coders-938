package BE_JV_001.LÓGICA_DE_PROGRAMAÇÃO_I.Exercicios_Aula3.Questao4_MaquinaDeBebidas_IfElse;

public enum ENUM_MaquinaDeBebidas {

    COCA_COLA("Coca-Cola",5.00f),
    COCA_COLA_ZERO("Coca-Cola Zero",4.50f),
    PEPSI("Pepsi",4.40f),
    GUARANA_ANTARCTICA("Guaraná Antartica",3.50f),
    FANTA_LARANJA("Fanta Laranja", 4.23f),
    AGUA("Água", 2.50f);

    private String nome;
    private float preco;

    ENUM_MaquinaDeBebidas(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    public float getPreco(){
        return preco;
    }


}
