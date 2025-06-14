/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB9;

/**
 *
 * @author Raditya Arya Wiguna
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class GUI_DataBiskuit extends javax.swing.JFrame {

    /**
     * Creates new form GUI_DataKeripik
     */
    public GUI_DataBiskuit() {
        initComponents();
        
        // Pemanggilan class Biskuit dengan parameter
        Snack snack = new Biskuit();
        txttambah.setText(Integer.toString(snack.tambahStok()));
        txttambah.setEnabled(false); //Menonaktifkan inputan
    }
    public void batal() {
        txtnama.setText("");
        txtid.setText("");
        txtharga.setText("");
        txtstok.setText("");
        txtvarian.setText("");
        txtkadaluarsa.setText("");
        txtberat.setText("");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtvarian = new javax.swing.JTextField();
        txtkadaluarsa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtberat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmb_kemasan = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        btnCLOSE = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_data_snack = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnSnack = new javax.swing.JButton();
        btnHapus1 = new javax.swing.JButton();
        btnBatal1 = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("PENDATAAN SNACK BISKUIT | CEMILAN RAKYAT");

        jLabel2.setText("Nama Snack");

        jLabel3.setText("ID Snack");

        jLabel4.setText("Harga Satuan");

        jLabel5.setText("Kemasan Penyajian");

        jLabel6.setText("Varian Rasa");

        jLabel7.setText("Masa Kadaluarsa");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        txtvarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvarianActionPerformed(evt);
            }
        });

        txtkadaluarsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkadaluarsaActionPerformed(evt);
            }
        });

        jLabel8.setText("Berat Snack");

        txtberat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtberatActionPerformed(evt);
            }
        });

        jLabel10.setText("gr");

        cmb_kemasan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toples", "Kardus", "Plastik", "Kaleng" }));
        cmb_kemasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_kemasanActionPerformed(evt);
            }
        });

        jLabel9.setText("Stok");

        txtstok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstokActionPerformed(evt);
            }
        });

        btnCLOSE.setText("Close");
        btnCLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLOSEActionPerformed(evt);
            }
        });

        table_data_snack.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Snack", "ID Snack", "Harga", "Varian", "Berat", "Kemasan ", "Masa Kadaluarsa", "Stok"
            }
        ));
        jScrollPane2.setViewportView(table_data_snack);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnSnack.setText("Form Snack");
        btnSnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnackActionPerformed(evt);
            }
        });

        btnHapus1.setText("Hapus");
        btnHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus1ActionPerformed(evt);
            }
        });

        btnBatal1.setText("Batal");
        btnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal1ActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnHapus1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCLOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSnack))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                        .addComponent(txtnama, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtharga))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel7))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cmb_kemasan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtkadaluarsa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtvarian)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtberat, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel10))))))
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtvarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtberat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmb_kemasan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtkadaluarsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHapus1)
                        .addComponent(btnBatal1)
                        .addComponent(btnUbah)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSnack)
                    .addComponent(btnCLOSE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void txtvarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvarianActionPerformed

    private void txtkadaluarsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkadaluarsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkadaluarsaActionPerformed

    private void txtberatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtberatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtberatActionPerformed

    private void cmb_kemasanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_kemasanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_kemasanActionPerformed

    private void txtstokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstokActionPerformed

    private void btnCLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLOSEActionPerformed
        // TODO add your handling code here:
        //exit
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCLOSEActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel dataModel = (DefaultTableModel)table_data_snack.getModel();
            List list = new ArrayList<>();
            table_data_snack.setAutoCreateColumnsFromModel(true);

            //POLYMORFISME
            Snack snack; //instansiasi
            snack = new Biskuit(); //upcasting     
            Biskuit biskuit = (Biskuit) snack; //downcasting

            //memanggil atribut class Snack (utama) dan Biskuit serta menempatkan text field sesuai dengan atributnya
            biskuit.setRasa(txtvarian.getText());
            biskuit.setKadaluarsa(txtkadaluarsa.getText());
            biskuit.setBerat(Integer.parseInt(txtberat.getText()));
            snack.nama_snack = txtnama.getText();
            snack.id_snack = txtid.getText();
            snack.kategori = "Biskuit";
            snack.jumlah_tambah = Integer.parseInt(txttambah.getText());
            snack.stok_snack = Integer.parseInt(txtstok.getText());
            
            if (txtnama.getText().matches(".*\\d.*") || txtvarian.getText().matches(".*\\d.*")) { //validasi data kolom tidak boleh angka
                throw new IllegalArgumentException("Kolom nama snack dan rasa tidak boleh mengandung angka!");
            }
            String[] kemasan = { "Toples", "Kardus", "Plastik", "Kaleng" };
            biskuit.setKemasan(kemasan[cmb_kemasan.getSelectedIndex()]);

            int hargaAsli = Integer.parseInt(txtharga.getText());
            if (!txtdiskon.getText().isEmpty()) {
                int diskon = Integer.parseInt(txtdiskon.getText());
                if(diskon < 0){throw new IllegalArgumentException("Diskon tidak bisa negatif!");}
                snack.harga = biskuit.hitungDiskon(hargaAsli, diskon); // Simpan hasil perhitungan diskon
            } else {
                snack.harga = hargaAsli; //Menampilkan harga aslinya
            }
            // Menambahkan data ke list sesuai data yang diinputkan
            list.add(snack.nama_snack);
            list.add(snack.id_snack);
            list.add(snack.harga);
            if (!txtdiskon.getText().isEmpty()) { //pengkondisian & penambahan data diskon ke tabel list
                list.add(txtdiskon.getText() + "%");
            } else {
                list.add("-");
            }
            list.add(biskuit.getRasa()); //method subclass Biskuit
            list.add(biskuit.getBerat());
            list.add(biskuit.getKemasan());
            list.add(biskuit.getKadaluarsa());
            // Cek kondisi checkbox
            if (cb_tambah.isSelected()) {
                snack.tambahStok();
                JOptionPane.showMessageDialog(null, "Penambahan Stok Snack Berhasil! Stok Terkini: " + snack.stok_snack); 
                list.add(snack.stok_snack);
                list.add(snack.jumlah_tambah);
            } else {
                list.add(snack.stok_snack);
                list.add("-");
            }
            JOptionPane.showMessageDialog(null, "Data Snack Berhasil Ditambahkan!");
            dataModel.addRow(list.toArray()); // Menambahkan ke tabel
            batal();
        } catch (NumberFormatException e) { //untuk error jika kolom angka tidak sesuai inputannya
            JOptionPane.showMessageDialog(null,
                "Kolom harga, stok, berat, diskon, dan tambah stok hanya boleh diisi dengan angka!",
                "Penginputan Kolom Salah", 0);
        } catch (IllegalArgumentException e) { // untuk error jika ada ketidaksesuaian pada kolom teks
            JOptionPane.showMessageDialog(null, e.getMessage(), "Input Tidak Valid", 2);
        } 
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnSnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnackActionPerformed
        // TODO add your handling code here:
        new Gui_Penilaian().setVisible(true);
    }//GEN-LAST:event_btnSnackActionPerformed

    private void btnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dataModel = (DefaultTableModel)table_data_snack.getModel();
        int rowCount = dataModel.getRowCount();
        while (rowCount > 0){
            dataModel.removeRow(rowCount - 1);
            rowCount = dataModel.getRowCount();
        }
    }//GEN-LAST:event_btnHapus1ActionPerformed

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
        // TODO add your handling code here:
        batal();
    }//GEN-LAST:event_btnBatal1ActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        //masukkan method update();
        update();
    }//GEN-LAST:event_btnUbahActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_DataBiskuit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_DataBiskuit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_DataBiskuit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_DataBiskuit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_DataBiskuit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal1;
    private javax.swing.JButton btnCLOSE;
    private javax.swing.JButton btnHapus1;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnSnack;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmb_kemasan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_data_snack;
    private javax.swing.JTextField txtberat;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtkadaluarsa;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtstok;
    private javax.swing.JTextField txtvarian;
    // End of variables declaration//GEN-END:variables
}
