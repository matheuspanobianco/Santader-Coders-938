package Aula2.Exercicio_Complementar;

public enum Meses {

    JANEIRO (1000, "JANEIRO"),
    FEVEREIRO(2000, "FEVEREIRO"),
    MARCO(3000, "MARCO"),
    ABRIL(4000, "ABRIL"),
    MAIO(5000, "MAIO"),
    JUNHO(6000, "JUNHO"),
    JULHO(7000, "JULHO"),
    AGOSTO(8000, "AGOSTO"),
    SETEMBRO(9000,"SETEMBRO"),
    OUTUBRO(10_000, "OUTUBRO"),
    NOVEMBRO(11000, "NOVEMBRO"),
    DEZEMBRO(12000, "DEZEMBRO");

    private final float gasto;
    private final String nome;

    Meses(float gasto, String nome) {
        this.gasto = gasto;
        this.nome = nome;
    }

    public float GastoMes(){
        return gasto;
    }
    public String NomeMes(){
        return nome;
    }
}
