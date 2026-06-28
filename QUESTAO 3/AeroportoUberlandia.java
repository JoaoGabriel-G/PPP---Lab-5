public class AeroportoUberlandia implements Observer {
    @Override
    public void atualizar(double temperatura, double umidade, double velocidadeVento) {
        System.out.println("\n[Torre de Controle - Aeroporto] Analisando condições de voo...");
        if (velocidadeVento > 50.0) {
            System.out.println("ALERTA MÁXIMO: Rajadas de vento a + " + velocidadeVento + " km/h. Condições desfavoráveis para pouso!");
        } else {
            System.out.println("Informação: Ventos operacionais a " + velocidadeVento + " km/h.");
        }
    }
}