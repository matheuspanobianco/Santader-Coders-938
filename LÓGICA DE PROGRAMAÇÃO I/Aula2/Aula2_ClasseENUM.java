package Aula2;

public enum Aula2_ClasseENUM {

        JANUARY_EXPENSE (10000F, "valor do mes"),
        FEBRUARY_EXPENSE (17000F, "valor do mes"),
        MARCH_EXPENSE (23000F, "valor do mes");

        private float valor;
        private String mes;

    Aula2_ClasseENUM(float valor, String mes){
            this.valor = valor;
            this.mes = mes;
        }

        public float getValor() {
            return valor;
        }

        public String getMes() {
            return mes;
        }
}
