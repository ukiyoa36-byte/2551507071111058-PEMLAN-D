package Praktikum2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mahasiswa extends JFrame {
    JFrame frame = new JFrame();
    JLabel Nama = new JLabel("Nama Lengkap");
    JTextField txtNama = new JTextField(20);
    JLabel Pendaftaran = new JLabel("Nomor Pendaftaran");
    JTextField txtPendaftaran = new JTextField(20);
    JLabel Telephone = new JLabel("No. Telp");
    JTextField txtTelephone = new JTextField(20);
    JLabel Alamat = new JLabel("Alamat");
    JTextField txtAlamat = new JTextField(20);
    JLabel Email = new JLabel("Email");
    JTextField txtEmail = new JTextField(20);
    JButton btnSubmit = new JButton("Submit");
    

    Mahasiswa(){
        setTitle("Data Mahasiswa");
        setLocation(300, 100);
        setSize(300, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void KomponenVisual(){
        getContentPane().setLayout(null);
        getContentPane().add(Nama);
        Nama.setBounds(10, 10, 100, 20);
        getContentPane().add(txtNama);
        txtNama.setBounds(120, 10, 150, 20);
        getContentPane().add(Pendaftaran);
        Pendaftaran.setBounds(10, 40, 100, 20);
        getContentPane().add(txtPendaftaran);
        txtPendaftaran.setBounds( 120, 40, 150, 20);
        getContentPane().add(Telephone);
        Telephone.setBounds(10, 70, 100, 20);
        getContentPane().add(txtTelephone);
        txtTelephone.setBounds(120, 70, 150, 20);
        getContentPane().add(Alamat);
        Alamat.setBounds(10, 100, 100, 20);
        getContentPane().add(txtAlamat);
        txtAlamat.setBounds(120, 100, 150, 40);
        getContentPane().add(Email);
        Email.setBounds(10, 160, 100, 20);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(120, 160, 150, 20);
        getContentPane().add(btnSubmit);
        btnSubmit.setBounds(100, 190, 80, 20);
        setVisible(true);

    }

    void reaksi (){
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (txtNama.getText().isEmpty() || txtPendaftaran.getText().isEmpty() || txtPendaftaran.getText().isEmpty() || txtAlamat.getText().isEmpty() || txtEmail.getText().isEmpty()) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Terpantau masih ada yang belum kamu isi.... isi ulang!!! hmmph", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                } else {
                    int reaksi = javax.swing.JOptionPane.showConfirmDialog(null, "Apakah data yang kamu masukkan sudah benar?", "Konfirmasi", javax.swing.JOptionPane.YES_NO_OPTION);
                    if (reaksi == javax.swing.JOptionPane.YES_OPTION) {
                        tampilkanJendelaBaru();
                    }
                }
            }
        });
    }

    void tampilkanJendelaBaru(){
        JFrame newFrame = new JFrame("Data Mahasiswa");
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        String data = "Nama Lengkap: " + txtNama.getText() + "\n" +
                      "Nomor Pendaftaran: " + txtPendaftaran.getText() + "\n" +
                      "No. Telp: " + txtTelephone.getText() + "\n" +
                      "Alamat: " + txtAlamat.getText() + "\n" +
                      "Email: " + txtEmail.getText();
        
        textArea.setText(data);
        newFrame.add(new JScrollPane(textArea));
        newFrame.setSize(400, 300);
        newFrame.setLocationRelativeTo(null);
        newFrame.setVisible(true);
        
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.KomponenVisual();
        mhs.reaksi();
    }

}
