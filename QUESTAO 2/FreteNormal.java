public class FreteNormal implements FreteStrategy {
    @Override
    public double calcular(double valorTotal) {

        return valorTotal * 0.05;
    }
}