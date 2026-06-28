public class Main {
    public static void main(String[] args) {

        CentralEstacaoTempo cet = new CentralEstacaoTempo();


        PrefeituraUberlandia prefeitura = new PrefeituraUberlandia();
        AeroportoUberlandia aeroporto = new AeroportoUberlandia();


        cet.registrarObservador(prefeitura);
        cet.registrarObservador(aeroporto);


        cet.setMedicoes(26.5, 45.0, 15.2);


        cet.setMedicoes(32.0, 18.5, 62.0);
    }
}