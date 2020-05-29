package modul3;

import javax.swing.JOptionPane;

public class switchCase {
    public static void main(String[] args) {
        String a = "Anita";
        String b = "Budi";
        String c = "Citra";
        String pil;
        pil = JOptionPane.showInputDialog("Masukkan sebuah huruf: ");
        switch (pil) {
            case "a":
                JOptionPane.showMessageDialog(null, "Nama Anda adalah " + a + ".");
                break;
            case "b":
                JOptionPane.showMessageDialog(null, "Nama Anda adalah " + b + ".");
                break;
            case "c":
                JOptionPane.showMessageDialog(null, "Nama Anda adalah " + c + ".");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nama Anda tidak terdaftar!");
                break;
        }
    }
}
