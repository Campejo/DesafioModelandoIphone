package celular;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("iPhone tocando...");

        
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");

        
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado...");
    }
    
}
