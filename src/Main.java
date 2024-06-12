import celular.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("TESTANDO APARELHO TELEFÔNICO");
        iphone.ligar("(81)98888-8888");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println(" ");

        System.out.println("TESTANDO NAVEGADOR DE INTERNET");
        iphone.exibirPagina("web.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println(" ");

        System.out.println("TESTANDO REPRODUTOR MUSICAL");
        iphone.selecionarMusica("Tipo Madara");
        iphone.tocar();
        iphone.pausar();

    }
}
