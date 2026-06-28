public class PrefeituraUberlandia implements Observer {
    @Override
    public void atualizar(double temperatura, double umidade, double velocidadeVento) {
        System.out.println("\n[Defesa Civil - Uberlândia] Analisando dados...");
        if (umidade < 30.0) {
            System.out.println("ALERTA: Umidade relativa do ar crítica (" + umidade + "). Evite exercícios ao ar livre!");
        } else {
            System.out.println("Informação: Umidade do ar estável (" + umidade + ")");
        }
    }
}