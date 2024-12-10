package main.java.logros;

import java.util.Objects;

public class LogroPerderVida extends Achievement {
    public LogroPerderVida() {
        super("Te comieron", "Perder una vida");
    }

    @Override
    public void onEvent(String event, Object data) {
        if (!this.unlocked && Objects.equals(event, "LOGRO_PERDER_VIDA")) {
            boolean perderVida = (boolean) data;
            if (perderVida) {
                this.unlock();
                this.showNotification();
            }

        }
    }
}
