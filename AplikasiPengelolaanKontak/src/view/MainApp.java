package view;

import javax.swing.SwingUtilities;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // tampilkan frame utama
            PengelolaanKontakFrame frame = new PengelolaanKontakFrame();
            frame.setVisible(true);
        });
    }
}
