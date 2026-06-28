import java.util.ArrayList;
import java.util.List;

public class CentralEstacaoTempo {
    private List<Observer> observadores;
    private double temperatura;
    private double umidade;
    private double velocidadeVento;

    public CentralEstacaoTempo() {
        this.observadores = new ArrayList<>();
    }

    public void registrarObservador(Observer o) {
        observadores.add(o);
    }

    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    // Notifica todos os observadores da lista
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(temperatura, umidade, velocidadeVento);
        }
    }

    public void setMedicoes(double temperatura, double umidade, double velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.velocidadeVento = velocidadeVento;

        System.out.println("\n==================================================");
        System.out.println("CET: Novas medições climáticas registradas!");
        System.out.println("==================================================");

        notificarObservadores();
    }
}