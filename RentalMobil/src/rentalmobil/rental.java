/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobil;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class rental extends javax.swing.JFrame {

    /**
     * Creates new form rental
     */
    public rental() {
        initComponents();
        
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x,y);
        
        
       tampiltanggal();
       
       jeniskendaraan.disable();
       hargasewa.disable();
       biayasupir.disable();
       totalbayar.disable();
       kembalian.disable();
    }
    //metod untuk tanggal hari ini
    public void tampiltanggal(){
        Date tgl = new Date();
        SimpleDateFormat aa = new SimpleDateFormat("dd-MM-yyyy");
        tanggal.setText(aa.format(tgl));
      
       }
    // jumlah karakter sewa 
    public void JumlahKarakter(KeyEvent c){
        if(lamasewa.getText().length() == 2){
            c.consume();
            JOptionPane.showMessageDialog(null,
                    "Maksimal 2 Karakter",
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
          
        }
    }
        
        //method hanya angka
        public void FilterAngka(KeyEvent b){
            if (Character.isAlphabetic(b.getKeyChar())){
                b.consume();
                JOptionPane.showMessageDialog(null,
                      "Maukan Hanya Angka",
                      "Peringatan", JOptionPane.WARNING_MESSAGE 
                      );          
            }
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
        transaksi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tanggal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nopol = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jeniskendaraan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hargasewa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lamasewa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jasasupir = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        biayasupir = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        totalbayar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        uangbayar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        kembalian = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("RENTAL MOBIL");

        jLabel2.setText("No.Transaksi ");

        transaksi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                transaksiFocusLost(evt);
            }
        });
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        transaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                transaksiKeyTyped(evt);
            }
        });

        jLabel3.setText("Tanggal ");

        tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalActionPerformed(evt);
            }
        });

        jLabel4.setText("No.Polisi");

        nopol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "E2930YW", "E0759XZ", "E5673AW" }));
        nopol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nopolActionPerformed(evt);
            }
        });
        nopol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nopolKeyTyped(evt);
            }
        });

        jLabel5.setText("Jenis Kendaraan");

        jeniskendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeniskendaraanActionPerformed(evt);
            }
        });

        jLabel6.setText("Harga Sewa/Hari");

        jLabel7.setText("Lama Sewa ");

        lamasewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamasewaActionPerformed(evt);
            }
        });
        lamasewa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lamasewaKeyTyped(evt);
            }
        });

        jLabel8.setText("Pilihan Supir");

        jasasupir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jasa Supir", "Tidak Ada Jasa Supir" }));
        jasasupir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jasasupirActionPerformed(evt);
            }
        });

        jLabel9.setText("Biaya Supir ");

        biayasupir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biayasupirActionPerformed(evt);
            }
        });

        jLabel10.setText("Total Bayar");

        totalbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbayarActionPerformed(evt);
            }
        });

        jLabel11.setText("Uang Bayar");

        uangbayar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                uangbayarFocusLost(evt);
            }
        });
        uangbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uangbayarKeyTyped(evt);
            }
        });

        jLabel12.setText("Kembalian");

        jButton1.setText("BARU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("HITUNG");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("KELUAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jasasupir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(biayasupir)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jeniskendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(hargasewa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(lamasewa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(totalbayar)
                                .addComponent(uangbayar)
                                .addComponent(kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jeniskendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargasewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lamasewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jasasupir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(biayasupir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(totalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(uangbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transaksiActionPerformed

    private void nopolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nopolActionPerformed
        // TODO add your handling code here:
        
         if(nopol.getSelectedItem()=="E2930YW"){
             jeniskendaraan.setText("Mobil Pribadi");
             hargasewa.setText("400000");
         }else if(nopol.getSelectedItem()=="E0759XZ"){
            jeniskendaraan.setText("Mobil Pick Up");
            hargasewa.setText("600000");
        }else {
            jeniskendaraan.setText("Mobil Truck");
            hargasewa.setText("1500000");
  
         }
    }//GEN-LAST:event_nopolActionPerformed

    private void lamasewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamasewaActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_lamasewaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null,
                "Apakah Yakin akan Keluar?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
              System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        transaksi.setText("");
        jeniskendaraan.setText("");
        hargasewa.setText("");
        lamasewa.setText("");
        biayasupir.setText("");
        totalbayar.setText("");
        uangbayar.setText("");
        kembalian.setText("");
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void transaksiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transaksiKeyTyped
        // TODO add your handling code here:
        JumlahKarakter(evt);
        FilterAngka(evt);
    }//GEN-LAST:event_transaksiKeyTyped

    private void nopolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nopolKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_nopolKeyTyped

    private void jasasupirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jasasupirActionPerformed
        // TODO add your handling code here:
        if(jasasupir.getSelectedItem()=="Jasa Supir"){
            biayasupir.setText("100000");
        }else{
        biayasupir.setText("0");
        
    }
    }//GEN-LAST:event_jasasupirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int sewa = Integer.parseInt(hargasewa.getText());
        int lama = Integer.parseInt(lamasewa.getText());
        int bisup = Integer.parseInt(biayasupir.getText());
        int tobar;
         
        tobar = ((sewa * lama) + bisup);
        totalbayar.setText(Integer.valueOf(tobar). toString());
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void uangbayarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uangbayarFocusLost
        // TODO add your handling code here:
        int cektotal = Integer.parseInt(totalbayar.getText());
        int cekbayar = Integer.parseInt(uangbayar.getText());
        
        if(cekbayar < cektotal){
            JOptionPane.showMessageDialog(null,
                    "Uang bayar Kurang Dari Total Bayar",
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
        }else{
            int hitungkembalian;
            hitungkembalian = cekbayar - cektotal;
            kembalian.setText(Integer.valueOf(hitungkembalian).toString());
        }
    }//GEN-LAST:event_uangbayarFocusLost

    private void transaksiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_transaksiFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_transaksiFocusLost

    private void lamasewaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lamasewaKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
        
    }//GEN-LAST:event_lamasewaKeyTyped

    private void uangbayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uangbayarKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
         
    }//GEN-LAST:event_uangbayarKeyTyped

    private void jeniskendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeniskendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jeniskendaraanActionPerformed

    private void biayasupirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biayasupirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biayasupirActionPerformed

    private void totalbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalbayarActionPerformed

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
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField biayasupir;
    private javax.swing.JTextField hargasewa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jasasupir;
    private javax.swing.JTextField jeniskendaraan;
    private javax.swing.JTextField kembalian;
    private javax.swing.JTextField lamasewa;
    private javax.swing.JComboBox<String> nopol;
    private javax.swing.JTextField tanggal;
    private javax.swing.JTextField totalbayar;
    private javax.swing.JTextField transaksi;
    private javax.swing.JTextField uangbayar;
    // End of variables declaration//GEN-END:variables

     }
