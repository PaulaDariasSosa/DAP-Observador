package logros;

import java.util.Objects;

public class LogroPerder extends Achievement {
    public LogroPerder() {
        super("Perdedor", "Perder una partida");
    }

    @Override
    public void onEvent(String event, Object data) {
        if (!this.unlocked && Objects.equals(event, "LOGRO_PERDER")) {
            boolean perder = (boolean) data;
            if (perder) {
                this.unlock();
                this.showNotification();
            }

        }
    }
}
