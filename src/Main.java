public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Aula introdutória de Orientação à Objetos
// Declaração de objeto
        Pessoa adao;
// Instanciação do objeto
        adao = new Pessoa();
// Ao mesmo tempo
        Pessoa qualquer = new Pessoa();
// Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));

          //criar novos objetos

        //declarar objetos
          Pessoa rainha;

          //instanciar objetos
        rainha = new Pessoa();

        //definir forma do objeto
        rainha.nome = "Tina";
        rainha.sobrenome = "turnner";

        //definiçao de comportamento
        rainha.falar( texto: "oi");


    }
}