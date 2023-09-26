import funcoes.Internet;
import funcoes.ReprodutorMusical;
import funcoes.Telefone;

public class Smartphone implements ReprodutorMusical, Telefone, Internet {
    //Funções do ReprodutorMusical
    public void tocar(){
        System.out.println("Tocando musica.");
    };
    public void pausar(){
        System.out.println("Pausando musica.");
    };
    public void selecionarMusica(){
        System.out.println("Musica selecionada.");
    };
    public void proximaMusica(){
        System.out.println("Mudando para proxima faixa.");
    };
    public void musicaAnterior(){
        System.out.println("Mudando para faixa anterior.");
    };

    // Funções do telefone
    public void ligar(){
        System.out.println("Chamando.");
    };
    public void desligar(){
        System.out.println("Chamada encerrada.");
    };
    public void atender(){
        System.out.println("Atendendo chamada");
    };
    public void recusar(){
        System.out.println("Chamada recusada.");
    };
    public void iniciarCorreioVoz(){
        System.out.println("Ouvindo correio de voz");
    };

    // Funções da Internet
    public void exibirPagina(){
        System.out.println("Página Aberta.");
    };
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova página.");
    };
    public void atualizarPagina(){
        System.out.println("Atualizando página.");
    };
}
