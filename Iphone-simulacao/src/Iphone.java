import funcoes.Internet;
import funcoes.ReprodutorMusical;
import funcoes.Telefone;

public class Iphone {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone();
        ReprodutorMusical musica = (ReprodutorMusical) iphone;
        Telefone telefone = (Telefone) iphone;
        Internet internet = (Internet) iphone;

        System.out.println("---------------------MÚSICA-------------------------");
        musica.tocar();
        musica.pausar();
        musica.selecionarMusica();
        musica.proximaMusica();
        musica.musicaAnterior();
        System.out.println("-----------------------------------------------------");
        System.out.println(" ");

        System.out.println("---------------------TELEFONE------------------------");
        telefone.atender();
        telefone.desligar();
        telefone.ligar();
        telefone.recusar();
        telefone.iniciarCorreioVoz();
        System.out.println("-----------------------------------------------------");
        System.out.println(" ");

        System.out.println("---------------------INTERNET------------------------");
        internet.exibirPagina();
        internet.adicionarNovaAba();
        internet.atualizarPagina();
        System.out.println("-----------------------------------------------------");
    }
}
