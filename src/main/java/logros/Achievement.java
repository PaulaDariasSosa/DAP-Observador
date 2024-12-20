package logros;

import es.ull.app.ShadowPac;

import javax.swing.*;

abstract class Achievement implements AchievementObserver {
    private final String name;
    private final String description;
    protected boolean unlocked;

    public Achievement(String name, String description) {
        this.name = name;
        this.description = description;
        this.unlocked = false;
    }

    @Override
    public abstract void onEvent(String event, Object data);

    public void unlock() {
        this.unlocked = true;

    }

    public void showNotification() {
        try {
            SwingUtilities.invokeAndWait(() -> {
                JOptionPane.showMessageDialog(null, "¡Logro desbloqueado!: " + this.name + " - " + this.description);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


