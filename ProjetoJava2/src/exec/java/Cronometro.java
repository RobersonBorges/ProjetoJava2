package exec.java;

public class Cronometro {
	public static void main(String[] args) {
        long tempoInicial = System.currentTimeMillis();
        long tempoAtual;
        long tempoDecorrido;

        /* Simula alguma tarefa que leva um tempo desconhecido*/
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tempoAtual = System.currentTimeMillis();
        tempoDecorrido = tempoAtual - tempoInicial;

        System.out.println("Tempo decorrido: " + tempoDecorrido + "ms");
    }

}

