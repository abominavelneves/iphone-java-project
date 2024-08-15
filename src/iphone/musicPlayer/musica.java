package iphone.musicPlayer;

public class musica implements iPod {
    String song;
    public void tocar(){
        System.out.println("Tocando a música "+song);
    }
    public void pausar(){
        System.out.println("Música pausada.");
    }
    public void selecionarMusica(String song){
        System.out.println("Nova música selecionada é "+song);
    }
}
