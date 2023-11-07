import javax.swing.*;



public class Main {
    public static void main(String[] args) {



        Turista mochileiro = new Turista();



        mochileiro.setNome("Lindsay Lohan");
        mochileiro.setCpf("123");
        Turista mochileira = new Turista("Maria");



        String retorno = mochileira.viajar();
        System.out.println(retorno);





        Turista outroTurista = new Turista();
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        outroTurista.setNome(nome);
        JOptionPane.showMessageDialog(null, "O nome que entrou foi: "+
                outroTurista.getNome());





        String cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
        outroTurista.setCpf(cpf);



        if(Validacao.validaCPF(cpf)) {
            JOptionPane.showMessageDialog(null, outroTurista.getCpf()
                    + " Seu cpf foi validado!");
        }
        else{
            JOptionPane.showMessageDialog(null, outroTurista.getCpf()
                    + " Erro, seu cpf não é valido!");
        }
    }
}
