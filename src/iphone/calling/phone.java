package iphone.calling;

public class phone implements telephone{
    String numero;
    public void ligar(String numero){
        System.out.println("Ligando para o número "+numero);
    }
    public void atender(){
        System.out.println("Atendenddo a chamada.");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de Voz.");
    }
    
}
