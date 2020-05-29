package modul3;

import javax.swing.JOptionPane;

public class ifElse {
    public static void main(String[] args) {
        String a = "Anita";
        String b = "Budi";
        String c = "Citra";
        String pil;
        pil = JOptionPane.showInputDialog("Masukkan sebuah huruf: ");
        if(null == pil)
            JOptionPane.showMessageDialog(null, "Nama Anda tidak terdaftar!");
        else if("a".equals(pil))
            JOptionPane.showMessageDialog(null, "Nama Anda adalah " + a + ".");
        else if("b".equals(pil))
            JOptionPane.showMessageDialog(null, "Nama Anda adalah " + b + ".");
        else if("c".equals(pil))
            JOptionPane.showMessageDialog(null, "Nama Anda adalah " + c + ".");
        else
            JOptionPane.showMessageDialog(null, "Nama Anda tidak terdaftar!");
    }
}
