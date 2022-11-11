import javax.lang.model.util.ElementScanner6;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JOptionPane;

public class forrrrrrr {
    public static void main(String[] args) {
        String INPUT = JOptionPane.showInputDialog("masukkan nama atau nisn atau kelas");
        String[] name = { "juan", "adit", "farel", "najwan" };
        String[] kelas = { "xr4", "xr5", "xr6", "unknown" };
        String[] nisn = { "3131", "432122", "8765432", "666" };
        String[][] kelompok = { name, kelas, nisn }; // jadi satu kelompok
        int awikwok = 0;
        // boolean
        for (int j = 0; j < 3; j++) {
            // baris ke bawah
            for (int i = 0; i < 4; i++) {
                // ke kanan
                if (INPUT.equalsIgnoreCase(kelompok[j][i])) {
                    JOptionPane.showMessageDialog(null,
                            ("Nama " + kelompok[0][i] + "\nkelas " + kelompok[1][i] + "\nnisn " + kelompok[2][i]));
                    awikwok = 1;
                }

            }

        }
        if (awikwok == 0) {
            JOptionPane.showMessageDialog(null, "Nama tidak terdaftar");

        }
    }

}
