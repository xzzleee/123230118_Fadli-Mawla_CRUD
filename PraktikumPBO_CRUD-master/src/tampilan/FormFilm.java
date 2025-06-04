/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import datamodel.DataFilm;
import datamodel.PengelolaDataFilm;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class FormFilm extends javax.swing.JFrame {
    private final PengelolaDataFilm dao = new PengelolaDataFilm();
    private int selectedId = -1;
    
    public FormFilm() {
        initComponents();
        loadTable();
    }
    
    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) tableMovie.getModel();
        model.setRowCount(0);
        List<DataFilm> list = dao.readAll();
        for (DataFilm m : list) {
             model.addRow(new Object[]{
                m.getId(),
                m.getJudul(),
                m.getAlur(),
                m.getPenokohan(),
                m.getAkting(),
                String.format("%.2f", m.getRating())
            });
        }
    }
    
    private void clearForm(){
        txtJudul.setText("");
        txtAlur.setText("");
        txtPenokohan.setText("");
        txtAkting.setText("");
        selectedId = -1;    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMovie = new javax.swing.JTable();
        LabelJudul = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        LabelAlur = new javax.swing.JLabel();
        txtAlur = new javax.swing.JTextField();
        LabelPenokohan = new javax.swing.JLabel();
        txtPenokohan = new javax.swing.JTextField();
        LabelAkting = new javax.swing.JLabel();
        txtAkting = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Judul", "Alur", "Penokohan", "Akting", "Rating"
            }
        ));
        tableMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMovieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMovie);

        LabelJudul.setText("Judul");

        LabelAlur.setText("Alur");

        LabelPenokohan.setText("Penokohan");

        LabelAkting.setText("Akting");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelJudul)
                    .addComponent(LabelAlur)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlur, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPenokohan)
                    .addComponent(txtPenokohan, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelAkting)
                    .addComponent(txtAkting, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnTambah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelAlur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlur, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPenokohan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPenokohan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelAkting)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAkting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
            String judul = txtJudul.getText();
            double alur = Double.parseDouble(txtAlur.getText());
            double penokohan = Double.parseDouble(txtPenokohan.getText());
            double akting = Double.parseDouble(txtAkting.getText());
            
            if (judul.trim().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Judul tidak boleh kosong");
               return;}

            if (alur < 0 || alur > 5 || penokohan < 0 || penokohan > 5 || akting < 0 || akting > 5) {
                JOptionPane.showMessageDialog(this, "Nilai harus antara 0 hingga 5");
                return;
            }

            DataFilm m = new DataFilm(judul, alur, penokohan, akting);
            dao.create(m);
            loadTable();
            clearForm();
            JOptionPane.showMessageDialog(this, "Data Film Berhasil Ditambahkan");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Pastikan semua nilai berupa angka");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menambah data: " + e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         if (selectedId != -1) {
            try {
                String judul = txtJudul.getText();
                double alur = Double.parseDouble(txtAlur.getText());
                double penokohan = Double.parseDouble(txtPenokohan.getText());
                double akting = Double.parseDouble(txtAkting.getText());
                
                if (judul.trim().isEmpty()) {
                   JOptionPane.showMessageDialog(this, "Judul tidak boleh kosong");
                   return;
                }


                if (alur < 0 || alur > 5 || penokohan < 0 || penokohan > 5 || akting < 0 || akting > 5) {
                    JOptionPane.showMessageDialog(this, "Nilai harus antara 0 hingga 5");
                    return;
                }

                DataFilm m = new DataFilm(selectedId, judul, alur, penokohan, akting);
                dao.update(m);
                loadTable();
                clearForm();
                JOptionPane.showMessageDialog(this, "Data Film Berhasil Diupdate");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Pastikan semua nilai berupa angka");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal mengupdate data: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data terlebih dahulu");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (selectedId != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Apakah kamu yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                dao.delete(selectedId);
                loadTable();
                clearForm();
                JOptionPane.showMessageDialog(this, "Data Film Berhasil Dihapus");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data terlebih dahulu");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tableMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMovieMouseClicked
        int row = tableMovie.getSelectedRow();
        selectedId = Integer.parseInt(tableMovie.getValueAt(row, 0).toString());
        txtJudul.setText(tableMovie.getValueAt(row, 1).toString());
        txtAlur.setText(tableMovie.getValueAt(row, 2).toString());
        txtPenokohan.setText(tableMovie.getValueAt(row, 3).toString());
        txtAkting.setText(tableMovie.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tableMovieMouseClicked

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new FormFilm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAkting;
    private javax.swing.JLabel LabelAlur;
    private javax.swing.JLabel LabelJudul;
    private javax.swing.JLabel LabelPenokohan;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMovie;
    private javax.swing.JTextField txtAkting;
    private javax.swing.JTextField txtAlur;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtPenokohan;
    // End of variables declaration//GEN-END:variables
}
