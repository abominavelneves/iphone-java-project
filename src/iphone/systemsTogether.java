package iphone;
import iphone.calling.telephone;
import iphone.musicPlayer.iPod;
import iphone.search.searchSystem;
public class systemsTogether implements telephone, iPod, searchSystem{
    public void ligar(String numero){
        System.out.println("Ligando pelo iPhone para o número "+numero);
    }
    public void atender(){
        System.out.println("Atendendo pelo iPhone.");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de Voz pelo iPhone");
    }
    public void tocar(){
        System.out.println("Tocando a música pelo Iphone.");
    }
    public void pausar(){
        System.out.println("Tocando a música pelo iPhoen.");
    }
    public void selecionarMusica(String musica){
        System.out.println("Nova música selecionada: "+musica);
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo nova página "+url);
    }
    public void atualizarNovaPagina(){
        System.out.println("Atualizando nova página");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada.");
    }
}
