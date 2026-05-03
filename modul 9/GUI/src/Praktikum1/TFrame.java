package Praktikum1;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class TFrame extends Frame  {
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    TextArea txtArea;
    Button btnHitung , btnTampilkan;
    CheckboxGroup cbg;
    Checkbox cbAsd, cbPemlan, cbmatkomlan, cbProbstat;
    ArrayList<String> daftarNilai  = new ArrayList<>();

    public TFrame(){
        setLayout(null);

        lbJudul = new Label ("Hitung nilai akhir");
        lbJudul.setFont(new Font("Arial", 1, 13));
        add(lbJudul);
        lbJudul.setBounds (100,35, 170, 20);

        cbg = new CheckboxGroup();
        cbAsd = new Checkbox("ASD", cbg, false);
        add(cbAsd);
        cbAsd.setBounds(50, 55, 90,20);

        cbPemlan = new Checkbox("Pemlan", cbg, false);
        add(cbPemlan);
        cbPemlan.setBounds(150, 55, 90,20);

        cbmatkomlan = new Checkbox("Matkomlan", cbg, false);
        add(cbmatkomlan);
        cbmatkomlan.setBounds(250, 55, 90,20);

        cbProbstat = new Checkbox("Probstat", cbg, false);
        add(cbProbstat);
        cbProbstat.setBounds(350, 55, 90,20);

        

        lbTugas = new Label ("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(100,80,70,20);

        lbKuis = new Label ("Kuis : ");
        add(lbKuis);
        lbKuis.setBounds(100,110,70,20);

        lbUTS = new Label ("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(100,140,70,20);

        lbUAS = new Label ("UAS : ");
        add(lbUAS);     
        lbUAS.setBounds(100,170,70,20);

        lbHasil = new Label ("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(100,200,70,20);

        txtTugas = new TextField ("0");
        add(txtTugas);
        txtTugas.setBounds(200,80,60,20);

        txtKuis = new TextField ("0");
        add(txtKuis);
        txtKuis.setBounds(200,110,60,20);

        txtUTS = new TextField ("0");
        add(txtUTS);
        txtUTS.setBounds(200,140,60,20);

        txtUAS = new TextField ("0");
        add(txtUAS);
        txtUAS.setBounds(200,170,60,20);

        txtHasil = new TextField ("0");
        add(txtHasil);
        txtHasil.setBounds(200,200,60,20);

        btnHitung = new Button("Hitung");
        add(btnHitung);
        btnHitung.setBounds(120,230,100,20);

        txtArea = new TextArea();
        add(txtArea);
        txtArea.setBounds(50,280,300,100);

        btnTampilkan = new Button("Tampilkan nilai semua matkul");
        add(btnTampilkan);
        btnTampilkan.setBounds(50, 390, 300, 20);

        btnHitung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e ) {
                double tugas = Double.parseDouble(txtTugas.getText().trim());
                double kuis = Double.parseDouble(txtKuis.getText().trim());
                double uts = Double.parseDouble(txtUTS.getText().trim());
                double uas = Double.parseDouble(txtUAS.getText().trim());
                double hasil = 0;
                String matkul = "";

               if (cbAsd.getState()){
                hasil = (0.2 * tugas) + (0.1 * kuis) + (0.3 * uts) + (0.4 * uas);
                matkul = "ASD";
               } else if (cbPemlan.getState()){
                hasil = (0.3 * tugas) + (0.1 * kuis) + (0.2 * uts) + (0.4 * uas);
                matkul = "Pemlan";
               } else if (cbmatkomlan.getState()){
                hasil = (0.1 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
                matkul = "Matkomlan";
               } else if (cbProbstat.getState()){
                hasil = (0.2 * tugas) + (0.2 * kuis) + (0.2 * uts) + (0.4 * uas);
                matkul = "Probstat";
               }
                txtHasil.setText(String.valueOf(hasil));
                daftarNilai.add(matkul + " : " + hasil);
            }
        });

        ItemListener reset = new ItemListener() {
            public void itemStateChanged (ItemEvent e){
            txtTugas.setText("");
            txtKuis.setText("");
            txtUTS.setText("");
            txtUAS.setText("");
            }
        };
        cbAsd.addItemListener(reset);
        cbPemlan.addItemListener(reset);
        cbmatkomlan.addItemListener(reset);
        cbProbstat.addItemListener(reset);

        btnTampilkan.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        txtArea.setText("HASIL SEMUA NILAI\n");

            for (String data : daftarNilai) {
            txtArea.append(data + "\n");
            }
        }
        });
        
    }
}
