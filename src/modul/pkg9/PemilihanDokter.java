/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg9;

/**
 *
 * @author setiawan
 */
public class PemilihanDokter extends javax.swing.JFrame {

    /**
     * Creates new form PemilihanDokter
     */
    public PemilihanDokter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jconadokt = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtalamat = new javax.swing.JTextField();
        jtxtusia = new javax.swing.JTextField();
        jtxtjenis = new javax.swing.JTextField();
        jtxtgol = new javax.swing.JTextField();
        jtxtstatus = new javax.swing.JTextField();
        jtxtkewar = new javax.swing.JTextField();
        jtxtwaktu = new javax.swing.JTextField();
        jtxtspesial = new javax.swing.JTextField();
        jtxtnama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PEMILIHAN DOKTER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 441, 38);

        jLabel2.setText("Pilih Dokter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 90, 20);

        jconadokt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pilih Salah Satu ---", "DR. Farras Yassar", "DR. Anisa Putri", "DR. Harun Fajar" }));
        jconadokt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconadoktActionPerformed(evt);
            }
        });
        getContentPane().add(jconadokt);
        jconadokt.setBounds(160, 80, 130, 20);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identitas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(null);

        jLabel3.setText("Alamat");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 60, 100, 20);

        jLabel4.setText("Usia");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 90, 100, 20);

        jLabel5.setText("Jenis Kelamin");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 120, 100, 20);

        jLabel6.setText("Golongan Darah");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 150, 100, 20);

        jLabel7.setText("Status");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 180, 100, 20);

        jLabel8.setText("Kewarganegaraan");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 210, 100, 20);

        jLabel9.setText("Waktu Praktek");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 240, 100, 20);

        jLabel10.setText("Dokter Spesialis");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 270, 100, 20);

        jLabel11.setText("Nama");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 30, 100, 20);
        jPanel2.add(jtxtalamat);
        jtxtalamat.setBounds(140, 60, 170, 20);
        jPanel2.add(jtxtusia);
        jtxtusia.setBounds(140, 90, 170, 20);
        jPanel2.add(jtxtjenis);
        jtxtjenis.setBounds(140, 120, 170, 20);
        jPanel2.add(jtxtgol);
        jtxtgol.setBounds(140, 150, 170, 20);
        jPanel2.add(jtxtstatus);
        jtxtstatus.setBounds(140, 180, 170, 20);
        jPanel2.add(jtxtkewar);
        jtxtkewar.setBounds(140, 210, 170, 20);
        jPanel2.add(jtxtwaktu);
        jtxtwaktu.setBounds(140, 240, 170, 20);
        jPanel2.add(jtxtspesial);
        jtxtspesial.setBounds(140, 270, 170, 20);

        jtxtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnamaActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtnama);
        jtxtnama.setBounds(140, 30, 170, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 120, 330, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jconadoktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconadoktActionPerformed
        if(jconadokt.getSelectedItem().equals("DR. Farras Yassar")){
            jtxtnama.setText("DR. Farras Yassar ");
            jtxtalamat.setText("Jl. Surabaya 16, Malang");
            jtxtusia.setText("20 Tahun");
            jtxtjenis.setText("Laki-Laki");
            jtxtgol.setText("A");
            jtxtstatus.setText("Belum Menikah ");
            jtxtkewar.setText("Indonesia");
            jtxtspesial.setText("Dokter Umum");
            jtxtwaktu.setText(" Pagi (07.00-15.00)");
        }
        else if(jconadokt.getSelectedItem().equals("DR. Anisa Putri")){
            jtxtnama.setText("DR. Anisa Putri");
            jtxtalamat.setText("Jl. Veteran 3, Malang");
            jtxtusia.setText("20 Tahun");
            jtxtjenis.setText("Perempuan");
            jtxtgol.setText("O");
            jtxtstatus.setText("Belum Menikah");
            jtxtkewar.setText("Indonesia");
            jtxtspesial.setText("Dokter Gigi");
            jtxtwaktu.setText(" Sore (16.00-22.00)");
        }
        else if(jconadokt.getSelectedItem().equals("DR. Harun Fajar")){
            jtxtnama.setText("DR. Harun Fajar ");
            jtxtalamat.setText("Jl. Bandung 9, Malang");
            jtxtusia.setText("20 Tahun");
            jtxtjenis.setText("Laki-Laki");
            jtxtgol.setText("B");
            jtxtstatus.setText("Belum Menikah");
            jtxtkewar.setText("Indonesia");
            jtxtspesial.setText("Dokter Gizi");
            jtxtwaktu.setText(" Malam (22.00-06.00)");
        }
    }//GEN-LAST:event_jconadoktActionPerformed

    private void jtxtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnamaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PemilihanDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jconadokt;
    private javax.swing.JTextField jtxtalamat;
    private javax.swing.JTextField jtxtgol;
    private javax.swing.JTextField jtxtjenis;
    private javax.swing.JTextField jtxtkewar;
    private javax.swing.JTextField jtxtnama;
    private javax.swing.JTextField jtxtspesial;
    private javax.swing.JTextField jtxtstatus;
    private javax.swing.JTextField jtxtusia;
    private javax.swing.JTextField jtxtwaktu;
    // End of variables declaration//GEN-END:variables
}
