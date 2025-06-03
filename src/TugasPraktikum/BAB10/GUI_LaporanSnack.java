/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB10;

/**
 *
 * @author Raditya Arya Wiguna
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;                  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI_LaporanSnack extends javax.swing.JFrame {

    /**
     * Creates new form GUI_LaporanSanck
     */
    public GUI_LaporanSnack() {
        initComponents();
        txtid.setEditable(false);
        txttambah.setEnabled(false);
        txttambah.setText(Integer.toString(0));
        txtkurang.setEnabled(false);
        txtkurang.setText(Integer.toString(0));
        tampil_snack();
        tampil();
     
    }
    public void batal() {
        txtid.setText("");
        txtharga.setText("");
        txtstok.setText("");
        txttambah.setText("");
        txtkurang.setText("");
    }
    
    public Connection conn;
    String nama_snack, id, harga, stok_snack, kategori, jumlah_tambah, jumlah_kurang;
    
    public void itempilih() {
     int row = table_data_snack.getSelectedRow();

     id = table_data_snack.getValueAt(row, 0).toString();
     nama_snack = table_data_snack.getValueAt(row, 1).toString();
     cmbsnack.setSelectedItem(nama_snack);
     txtharga.setText(table_data_snack.getValueAt(row, 2).toString());
     txtstok.setText(table_data_snack.getValueAt(row, 3).toString());

     kategori = table_data_snack.getValueAt(row, 4).toString();
     cmb_kategori.setSelectedItem(kategori);
     txttambah.setText(table_data_snack.getValueAt(row, 5).toString());
     txtkurang.setText(table_data_snack.getValueAt(row, 6).toString());

     txttambah.setText("0");
    }
    
    public void koneksi() throws SQLException {
        try {
            conn = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/prak_2418014?serverTimezone=UTC",
        "root",
        "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_LaporanSnack.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            Logger.getLogger(GUI_LaporanSnack.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception es) {
            Logger.getLogger(GUI_LaporanSnack.class.getName()).log(Level.SEVERE, null, es);
        }
    }
    
     public void cari() {
        try {
            try ( Statement statement = conn.createStatement()) {
                String sql = "SELECT * FROM tb_snack WHERE `nama_snack`  LIKE '%" + txtSearch.getText() + "%'";
                ResultSet rs = statement.executeQuery(sql); //menampilkan data dari sql query
                if (rs.next()) // .next() = scanner method
                {
                    txtid.setText(rs.getString(1));
                    cmbsnack.setSelectedItem(rs.getString(2));
                    cmb_kategori.setSelectedItem(rs.getString(3));
                    txtharga.setText(rs.getString(4));
                    txtstok.setText(rs.getString(5));
                    txttambah.setText(rs.getString(6));
                    txtkurang.setText(rs.getString(7));
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Data yang Anda cari tidak ada");
                }
            }
        } catch (Exception ex) {
            System.out.println("Error." + ex);
        }
    } 
    //masukkan method tampil()
    public void tampil() {
        DefaultTableModel tabelhead = new DefaultTableModel();
        tabelhead.addColumn("ID Snack");
        tabelhead.addColumn("Nama Snack");
        tabelhead.addColumn("Harga");
        tabelhead.addColumn("Stok");
        tabelhead.addColumn("Kategori");
        tabelhead.addColumn("Tambah");
        tabelhead.addColumn("Penjualan");
        try {
            koneksi();
            String sql = "SELECT * FROM tb_snack";
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                tabelhead.addRow(new Object[]{
                res.getString("id"),      
                res.getString("nama_snack"),
                res.getString("harga"),
                res.getString("stok_snack"),
                res.getString("kategori"),
                res.getString("jumlah_tambah"),
                res.getString("jumlah_kurang")
            });
            }
            table_data_snack.setModel(tabelhead);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "BELUM TERKONEKSI");
        }
    }
    //masukka method tampil_mhs() dibawah sini
    public void tampil_snack() {
        try {
            koneksi();
            String sql = "SELECT nama_snack FROM tb_keripik " +
                         "UNION " +
                         "SELECT nama_snack FROM tb_biskuit " +
                         "ORDER BY nama_snack ASC";
            Statement stt = conn.createStatement();
            ResultSet res = stt.executeQuery(sql);
            while (res.next()) {
                cmbsnack.addItem(res.getString("nama_snack"));
            }
            res.close();
            stt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void delete() {
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "DELETE FROM tb_snack WHERE harga='" + txtharga.getText() + "'";
                java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
                batal();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus");
            }
        }
        refresh();
    }
     public void refresh() {
        new GUI_LaporanSnack().setVisible(true);
        this.setVisible(false);
    }
    
    //masukkan method insert()
    public void insert() {
        String Nama = (String) cmbsnack.getSelectedItem();
        int Harga = Integer.parseInt(txtharga.getText());
        int Stok = Integer.parseInt(txtstok.getText());
        String Kategori = cmb_kategori.getSelectedItem().toString();
        int Tambah = Integer.parseInt(txttambah.getText());
        int Jual = Integer.parseInt(txtkurang.getText());

        int StokBaru = Stok;

        // Perbaikan logika cek checkbox
        if (cb_tambah.isSelected() && cb_kurang.isSelected()) {
            StokBaru = Stok + Tambah - Jual;
        } else if (cb_tambah.isSelected()) {
            StokBaru = Stok + Tambah;
        } else if (cb_kurang.isSelected()) {
            StokBaru = Stok - Jual;
        }

        if (StokBaru < 0) {
            JOptionPane.showMessageDialog(null, "Stok akhir tidak boleh kurang dari 0!");
            return;
        }
        try {
            koneksi();
            Statement statement = conn.createStatement();
            statement.executeUpdate(
                "INSERT INTO tb_snack(nama_snack, harga, stok_snack, kategori, jumlah_tambah, jumlah_kurang) " +
                "VALUES('" + Nama + "','" + Harga + "','" + StokBaru + "','" + Kategori + "','" + Tambah + "','" + Jual + "')"
            );
            statement.close();
            JOptionPane.showMessageDialog(null, "Data Snack " + Nama + " Berhasil Ditambahkan!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Input!");
            System.out.println("Error: " + e);
        }
        refresh();
    }


    //masukkan method update()  
    public void update() {
        String Nama = (String) cmbsnack.getSelectedItem();
        int Harga = Integer.parseInt(txtharga.getText());
        int Stok = Integer.parseInt(txtstok.getText());
        String Kategori = cmb_kategori.getSelectedItem().toString();
        int Tambah = Integer.parseInt(txttambah.getText());
        int Jual = Integer.parseInt(txtkurang.getText());
        String nama_lama = nama_snack;
        String kat_lama = kategori;
        int StokBaru = Stok;
        if (cb_tambah.isSelected() && cb_kurang.isSelected()) {
            StokBaru = Stok + Tambah - Jual;
        } else if (cb_tambah.isSelected()) {
            StokBaru = Stok + Tambah;
        } else if (cb_kurang.isSelected()) {
            StokBaru = Stok - Jual;
        }
        if (StokBaru < 0) {
            JOptionPane.showMessageDialog(null, "Stok akhir tidak boleh kurang dari 0!");
            return;
        }
        try {
            koneksi();
            Statement statement = conn.createStatement();
            statement.executeUpdate("UPDATE tb_snack SET nama_snack='" + Nama + "',"
                    + "harga='" + Harga + "',"
                    + "stok_snack='" + StokBaru + "',"
                    + "kategori='" + Kategori + "',"
                    + "jumlah_tambah='" + Tambah + "',"
                    + "jumlah_kurang='" + Jual + "' "
                    + "WHERE nama_snack='" + nama_lama + "' AND kategori='" + kat_lama + "'");
            statement.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Update Data Snack Berhasil!");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        refresh();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtstok = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmb_kategori = new javax.swing.JComboBox<>();
        btnCLOSE = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_data_snack = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txttambah = new javax.swing.JTextField();
        cb_tambah = new javax.swing.JCheckBox();
        btnUbah = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtkurang = new javax.swing.JTextField();
        cb_kurang = new javax.swing.JCheckBox();
        btnkeripik = new javax.swing.JButton();
        cmbsnack = new javax.swing.JComboBox<>();
        btnbiskuit = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("LAPORAN PENDATAAN SNACK | CEMILAN RAKYAT");

        jLabel3.setText("ID Snack");

        jLabel5.setText("Stok terkini");

        txtstok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstokActionPerformed(evt);
            }
        });

        jLabel6.setText("Kategori");

        cmb_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keripik", "Biskuit" }));
        cmb_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_kategoriActionPerformed(evt);
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
                "ID Snack", "Nama Snack", "Stok Terkini", "Kategori", "Tambah", "Penjualan"
            }
        ));
        table_data_snack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_data_snackMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_data_snack);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel11.setText("Tambah stok");

        cb_tambah.setText("Aktifkan tambah stok");
        cb_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tambahActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        jLabel12.setText("Kurang stok");

        cb_kurang.setText("Aktifkan kurang stok");
        cb_kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_kurangActionPerformed(evt);
            }
        });

        btnkeripik.setText("Keripik");
        btnkeripik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeripikActionPerformed(evt);
            }
        });

        cmbsnack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~Nama Snack~" }));
        cmbsnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsnackActionPerformed(evt);
            }
        });

        btnbiskuit.setText("Biskuit");
        btnbiskuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbiskuitActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel4.setText("Harga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(99, 99, 99)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txttambah, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel6)
                                .addComponent(jLabel12)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmb_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtharga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cb_kurang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnkeripik)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnbiskuit)
                            .addGap(28, 28, 28)
                            .addComponent(cmbsnack, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnSimpan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnUbah)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnHapus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCLOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnkeripik)
                    .addComponent(btnbiskuit)
                    .addComponent(cmbsnack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkurang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_kurang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnBatal)
                    .addComponent(btnUbah)
                    .addComponent(btnCLOSE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_kategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_kategoriActionPerformed

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
        insert();
        
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        batal();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void cb_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tambahActionPerformed
        // TODO add your handling code here:
        //Kondisi apabila cb_tambah dipilih, maka status sebelumnya (false) akan berubah menjadi true sehingga pengguna dapat menginputkan nilainya
        if (cb_tambah.isSelected()){
            txttambah.setEnabled(true);
        }else{
            txttambah.setEnabled(false);//Tetap, jika cb_tambah tidak dipilih (bernilai false)
        }
    }//GEN-LAST:event_cb_tambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        //masukkan method update();
        update();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnkeripikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeripikActionPerformed
        // TODO add your handling code here:
        new GUI_DataKeripik().setVisible(true);
    }//GEN-LAST:event_btnkeripikActionPerformed

    private void cmbsnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsnackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsnackActionPerformed

    private void btnbiskuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbiskuitActionPerformed
        // TODO add your handling code here:
        new GUI_DataBiskuit().setVisible(true);
    }//GEN-LAST:event_btnbiskuitActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        //  masukkan method cari()
        cari();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cb_kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_kurangActionPerformed
        // TODO add your handling code here:
        if (cb_kurang.isSelected()){
            txtkurang.setEnabled(true);
        }else{
            txtkurang.setEnabled(false);//Tetap, jika cb_tambah tidak dipilih (bernilai false)
        }
    }//GEN-LAST:event_cb_kurangActionPerformed

    private void table_data_snackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_data_snackMouseClicked
        // TODO add your handling code here:
        int tabel = table_data_snack.getSelectedRow();
        id = table_data_snack.getValueAt(tabel, 0).toString();
        nama_snack = table_data_snack.getValueAt(tabel, 1).toString();
        harga = table_data_snack.getValueAt(tabel, 2).toString();
        stok_snack = table_data_snack.getValueAt(tabel, 3).toString();
        kategori = table_data_snack.getValueAt(tabel, 4).toString();
        jumlah_tambah = table_data_snack.getValueAt(tabel, 5).toString();
        jumlah_kurang = table_data_snack.getValueAt(tabel, 6).toString();
        itempilih();
    }//GEN-LAST:event_table_data_snackMouseClicked

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
            java.util.logging.Logger.getLogger(GUI_LaporanSnack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_LaporanSnack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_LaporanSnack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_LaporanSnack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_LaporanSnack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCLOSE;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton btnbiskuit;
    private javax.swing.JButton btnkeripik;
    private javax.swing.JCheckBox cb_kurang;
    private javax.swing.JCheckBox cb_tambah;
    private javax.swing.JComboBox<String> cmb_kategori;
    private javax.swing.JComboBox<String> cmbsnack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_data_snack;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtkurang;
    private javax.swing.JTextField txtstok;
    private javax.swing.JTextField txttambah;
    // End of variables declaration//GEN-END:variables
}
