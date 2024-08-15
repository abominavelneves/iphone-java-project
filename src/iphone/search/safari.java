package iphone.search;
public class safari implements searchSystem{
    String url;
    public void exibirPagina(String url){
        System.out.println("Exibindo a página do URL "+url);
    }
    public void adicionarNovaAba(){
        System.out.println("Nova Página.");
    }
    public void atualizarNovaPagina(){
        System.out.println("Atualizando a página no Safari.");
    }
}
