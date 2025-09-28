package playlist;

import java.io.PrintStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GUI extends javax.swing.JFrame {
    DLL D = new DLL() ;
    String name ;
    String artist ;
    String album ;
    String length ;
    String pos ;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
    private void updatetable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel() ;
        model.setRowCount(0);
        DNode h = D.head ;
        while(h != null){
            information info = h.info ;
            model.addRow(new Object[]{
               info.name,info.artist, info.album, info.length
            });
            h = h.Rlink ;
        }//end loop
    }//end updatetable
    
    
    private void clearforme(){
        txtname.setText("");
        txtArist.setText("");
        txtAlbum.setText("");
        txtLength.setText("");
    }
    
  
    public GUI() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        add_btn = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        Ins_behind = new javax.swing.JButton();
        Show = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        txtArist = new javax.swing.JTextField();
        txtAlbum = new javax.swing.JTextField();
        txtLength = new javax.swing.JTextField();
        Ins_Fornt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MusicPlaylist");
        setFont(new java.awt.Font("Prompt", 0, 10)); // NOI18N
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setFont(new java.awt.Font("Prompt", 1, 18)); // NOI18N
        jLabel1.setText("Music Playlist Manager");

        add_btn.setText("Add");
        add_btn.setEnabled(false);
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Remove.setText("Remove");
        Remove.setEnabled(false);
        Remove.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RemoveItemStateChanged(evt);
            }
        });
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        Ins_behind.setText("Ins_behind");
        Ins_behind.setEnabled(false);
        Ins_behind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ins_behindActionPerformed(evt);
            }
        });

        Show.setText("Show");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        txtname.setFont(new java.awt.Font("Prompt", 0, 12)); // NOI18N
        txtname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtname.setMaximumSize(new java.awt.Dimension(2147483647, 2147483637));
        txtname.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnameCaretUpdate(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtArist.setFont(new java.awt.Font("Prompt", 0, 12)); // NOI18N

        txtAlbum.setFont(new java.awt.Font("Prompt", 0, 12)); // NOI18N

        txtLength.setFont(new java.awt.Font("Prompt", 0, 12)); // NOI18N
        txtLength.setToolTipText("");

        Ins_Fornt.setText("Ins_Fornt");
        Ins_Fornt.setEnabled(false);
        Ins_Fornt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ins_ForntActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Prompt", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Song", "Artist", "Album", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setText("Song Name");

        jLabel3.setText("Artist Name");

        jLabel4.setText("Album Name");

        jLabel5.setText("Song length");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtArist, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(add_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Show, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ins_behind, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Ins_Fornt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(txtArist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(txtAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_btn)
                            .addComponent(Ins_behind)
                            .addComponent(Ins_Fornt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Remove)
                            .addComponent(Show)
                            .addComponent(Exit)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ins_behindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ins_behindActionPerformed
        name = txtname.getText();
        artist = txtArist.getText();
        album = txtAlbum.getText();
        length = txtLength.getText();
        pos = JOptionPane.showInputDialog("Insert song where ? : ") ;
        information info = new information(name, artist, album, length ) ;
        if(D.checkDuplicate(info.name)){
            D.behind_ins(info, pos) ;
        }else{
            JOptionPane.showMessageDialog(null, "duplicate data", "Alert",JOptionPane.WARNING_MESSAGE)  ; 
        }//end if
        updatetable();
        clearforme() ;
    }//GEN-LAST:event_Ins_behindActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        name = txtname.getText();
        artist = txtArist.getText();
        album = txtAlbum.getText();
        length = txtLength.getText();
        information info = new information(name, artist, album, length ) ;
        if(D.checkDuplicate(info.name)){
            D.add(info) ;
        }else{
            JOptionPane.showMessageDialog(null, "duplicate data", "Alert",JOptionPane.WARNING_MESSAGE)  ; 
        }//end if
        updatetable();
        clearforme() ;
        
    }//GEN-LAST:event_add_btnActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed

    }//GEN-LAST:event_txtnameActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void Ins_ForntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ins_ForntActionPerformed
        name = txtname.getText();
        artist = txtArist.getText();
        album = txtAlbum.getText();
        length = txtLength.getText();
        pos = JOptionPane.showInputDialog("Insert song where ? : ") ;
        information info = new information(name, artist, album, length ) ;
        if(D.checkDuplicate(info.name)){
            D.front_ins(info, pos) ;
        }else{
            JOptionPane.showMessageDialog(null, "duplicate data", "Alert",JOptionPane.WARNING_MESSAGE)  ; 
        }//end if
        updatetable();
        clearforme() ;
    }//GEN-LAST:event_Ins_ForntActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        if(D.head != null){
            Remove.setEnabled(true);
            pos = JOptionPane.showInputDialog("What music would you like to remove ?") ;
            D.remove(pos);
            updatetable();
        }else{
            Remove.setEnabled(false);
        }
        clearforme() ;
    }//GEN-LAST:event_RemoveActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
       updatetable();
    }//GEN-LAST:event_ShowActionPerformed

    private void txtnameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnameCaretUpdate
        if(txtname.getText().length() >= 1 ){
            Ins_Fornt.setEnabled(true);
            add_btn.setEnabled(true);
            Ins_behind.setEnabled(true);
        }else{
            Ins_Fornt.setEnabled(false);
            add_btn.setEnabled(false);
            Ins_behind.setEnabled(false);
        }
        if(D.head != null){
            Remove.setEnabled(true);
        }else{
            Remove.setEnabled(false);
        }
    }//GEN-LAST:event_txtnameCaretUpdate

    private void RemoveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RemoveItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveItemStateChanged


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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Ins_Fornt;
    private javax.swing.JButton Ins_behind;
    private javax.swing.JButton Remove;
    private javax.swing.JButton Show;
    private javax.swing.JButton add_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtAlbum;
    private javax.swing.JTextField txtArist;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
