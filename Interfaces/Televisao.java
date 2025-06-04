public class Televisao implements DispositivoEletronico {
    @Override
    public void ligar() {
        System.out.println("TV ligada.");
    }
    @Override
    public void desligar() {
        System.out.println("TV desligada.");
    }
}
