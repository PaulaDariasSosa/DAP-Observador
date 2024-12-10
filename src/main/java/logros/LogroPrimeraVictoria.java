package logros;

import java.util.Objects;

public class LogroPrimeraVictoria extends Achievement {
    public LogroPrimeraVictoria() {
        super("Primera Victoria", "Ganar la primera partida");
    }

    @Override
    public void onEvent(String event, Object data) {
        if (!this.unlocked && Objects.equals(event, "LOGRO_PRIMERA_VICTORIA")) {
            boolean primeraVictoria = (boolean) data;
            if (primeraVictoria) {
                this.unlock();
                this.showNotification();
            }

        }
    }
}
