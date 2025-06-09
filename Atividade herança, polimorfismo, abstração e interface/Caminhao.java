public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String placa, String modelo, int ano, double capacidadeCarga) {
        super(placa, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirDados() {
        System.out.println("Caminhão - Modelo: " + getModelo() + " | Placa: " + getPlaca() + " | Ano: " + getAno() + " | Capacidade de Carga: " + capacidadeCarga + " toneladas");
    }
}
