public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void atender() {
        System.out.println("Atendendo Telefone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o numero: " + numero);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    public void pausar() {
        System.out.println("Pausando musica");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando reprodutor musical.
        meuIphone.selecionarMusica("Caquinho - Hino avulso");
        meuIphone.tocar();
        meuIphone.pausar();
        //Testando navegadir de internet
        meuIphone.adicionarNovaAba();
        meuIphone.exibirPagina("dio.me");
        meuIphone.atualizarPagina();
        //Testando Aparelho telefonico
        meuIphone.ligar("+55 (77) 99132-7409");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
    }
       

}
