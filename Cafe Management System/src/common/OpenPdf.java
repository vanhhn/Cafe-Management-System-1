package common;

import javax.swing.JOptionPane;
import java.io.File;
import java.awt.Desktop;

public class OpenPdf {
    public static void openById(String id) {
        try {
            File file = new File("F:\\" + id + ".pdf"); // hoặc D:\\
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    Process p = Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll,FileProtocolHandler " + file.getAbsolutePath());
                }
            } else {
                JOptionPane.showMessageDialog(null, "File không tồn tại: " + file.getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi mở file: " + e.getMessage());
        }
    }
}