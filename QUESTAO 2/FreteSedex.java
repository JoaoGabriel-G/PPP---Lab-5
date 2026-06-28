public class FreteSedex implements FreteStrategy {
    @Override
    public double calcular(double valorTotal) {

        return valorTotal * 0.15;
    }
}