/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IHM;

import Data.Consultation;
import Data.Patient;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class DossierPatient extends JDialog {

    private Patient patient = null;
    
    private Consultation consultation = null;
    
    private static DossierPatient singleton = null;

    public static DossierPatient getSingleton() {
        if (singleton == null){
            singleton = new DossierPatient();
        }
        
        return singleton;
    }
    
    
    
    /**
     * Creates new form DossierPatient
     */
    private DossierPatient() {
        super(Home.getSingletonWithoutCreation(), true);
        initComponents();
        
        myInitComponents();
    }
    
    private void myInitComponents(){
        popupMenuConsultation = new JPopupMenu();
        
        miAjouterConsultation = new JMenuItem("Ajouter une consultation");
        miModifierConsultation = new JMenuItem("Modifier la consultation selectionnee");
        
        popupMenuConsultation.add(miAjouterConsultation);
        popupMenuConsultation.addSeparator();
        popupMenuConsultation.add(miModifierConsultation);
        
        fillFormConsultation(null);
        
        tableConsultations.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jTable1MouseClicked(e);
            }
        });
        
        miAjouterConsultation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ajouterConsultation();
            }
        });
        
        miModifierConsultation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                modifierConsultation();
            }
        });
        
        bValiderConsultation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bValiderConsultationActionPerformed();
            }
        });
        
        bAnnulerConsultation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bAnnulerConsultationActionPerformed();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableConsultations = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tfHeureConsultation = new javax.swing.JTextField();
        lNumConsultation = new javax.swing.JLabel();
        tfNumConsultation = new javax.swing.JTextField();
        tfDateConsultation = new javax.swing.JTextField();
        lDateConsultation = new javax.swing.JLabel();
        lHeureConsultation = new javax.swing.JLabel();
        lObservationConsultation = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        epObservationConsultation = new javax.swing.JEditorPane();
        lDureeConsultation = new javax.swing.JLabel();
        tfDureeConsultation = new javax.swing.JTextField();
        lDurreeConsultation = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        bOrdonnance = new javax.swing.JButton();
        bValiderConsultation = new javax.swing.JButton();
        bAnnulerConsultation = new javax.swing.JButton();

        setResizable(false);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel28.setText("Historique de consultations :");

        tableConsultations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Consultation", "Date & Heure", "Duree", "Observation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableConsultations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableConsultationsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableConsultations);

        tfHeureConsultation.setFont(new java.awt.Font("Garamond", 3, 18)); // NOI18N
        tfHeureConsultation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        tfHeureConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHeureConsultationActionPerformed(evt);
            }
        });

        lNumConsultation.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lNumConsultation.setText("N°  Consulation");

        tfNumConsultation.setEditable(false);
        tfNumConsultation.setFont(new java.awt.Font("Garamond", 3, 18)); // NOI18N
        tfNumConsultation.setText("Auto Généré");
        tfNumConsultation.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));
        tfNumConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumConsultationActionPerformed(evt);
            }
        });

        tfDateConsultation.setFont(new java.awt.Font("Garamond", 3, 18)); // NOI18N
        tfDateConsultation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        tfDateConsultation.setName("tfDateConsultation"); // NOI18N
        tfDateConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDateConsultationActionPerformed(evt);
            }
        });

        lDateConsultation.setDisplayedMnemonic('l');
        lDateConsultation.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lDateConsultation.setText("Date :");

        lHeureConsultation.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lHeureConsultation.setText("Heure :");

        lObservationConsultation.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lObservationConsultation.setText("Observation :");

        jScrollPane2.setViewportView(epObservationConsultation);

        lDureeConsultation.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lDureeConsultation.setText("Duree:");

        tfDureeConsultation.setFont(new java.awt.Font("Garamond", 3, 18)); // NOI18N
        tfDureeConsultation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        tfDureeConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDureeConsultationActionPerformed(evt);
            }
        });

        lDurreeConsultation.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lDurreeConsultation.setText("Minutes");

        panel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultation :");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(454, 454, 454))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lNumConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(lObservationConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lDateConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfDateConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lHeureConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfHeureConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lDureeConsultation)
                .addGap(32, 32, 32)
                .addComponent(tfDureeConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lDurreeConsultation)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNumConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lDateConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDateConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lHeureConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfHeureConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lDureeConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDureeConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lDurreeConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lObservationConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bOrdonnance.setBackground(new java.awt.Color(0, 102, 255));
        bOrdonnance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bOrdonnance.setForeground(new java.awt.Color(255, 255, 255));
        bOrdonnance.setText("Ordonnance");
        bOrdonnance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrdonnanceActionPerformed(evt);
            }
        });

        bValiderConsultation.setBackground(new java.awt.Color(0, 102, 255));
        bValiderConsultation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bValiderConsultation.setForeground(new java.awt.Color(255, 255, 255));
        bValiderConsultation.setMnemonic('V');
        bValiderConsultation.setText("Valider");
        bValiderConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bValiderConsultationActionPerformed(evt);
            }
        });

        bAnnulerConsultation.setBackground(new java.awt.Color(0, 102, 255));
        bAnnulerConsultation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bAnnulerConsultation.setForeground(new java.awt.Color(255, 255, 255));
        bAnnulerConsultation.setMnemonic('A');
        bAnnulerConsultation.setText("Annuler");
        bAnnulerConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnnulerConsultationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(bValiderConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(bAnnulerConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(434, 434, 434)
                                .addComponent(bOrdonnance, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bValiderConsultation)
                    .addComponent(bAnnulerConsultation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bOrdonnance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDureeConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDureeConsultationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDureeConsultationActionPerformed

    private void bAnnulerConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnnulerConsultationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAnnulerConsultationActionPerformed

    private void bValiderConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bValiderConsultationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bValiderConsultationActionPerformed

    private void tfDateConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDateConsultationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDateConsultationActionPerformed

    private void tfNumConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumConsultationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumConsultationActionPerformed

    private void tfHeureConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHeureConsultationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHeureConsultationActionPerformed

    private void bOrdonnanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrdonnanceActionPerformed
        int indexRow = tableConsultations.getSelectedRow();
        
        if (indexRow == -1){
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner une consultation !!!", "Consultation ???", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel)tableConsultations.getModel();
        Consultation consultation = listConsultations.get(indexRow);
        
        OrdonanceDlg.showOrdonanceDlg(consultation);
    }//GEN-LAST:event_bOrdonnanceActionPerformed

    private void tableConsultationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableConsultationsMouseClicked
        if (evt.getClickCount()>=2 && evt.getButton() == MouseEvent.BUTTON1){
            bOrdonnanceActionPerformed(null);
        }
    }//GEN-LAST:event_tableConsultationsMouseClicked

    private void jTable1MouseClicked(MouseEvent e){
        if (e.getButton() != MouseEvent.BUTTON3){
            return;
        }
        
        int indiceConsultation = tableConsultations.getSelectedRow();
        
        miModifierConsultation.setEnabled( 
                listConsultations.size() > 0 
                        && 
                indiceConsultation != -1 
        );
        
        popupMenuConsultation.show(e.getComponent(), e.getX(), e.getY());
    }
    
    private void ajouterConsultation(){
        consultation = new Consultation();
        
        consultation.setId(0);
        consultation.setNumConsultation( Consultation.generateNumConsultation() );
        consultation.setDureeConsultation( 20 );
        consultation.setDate( utils.DateUtil.getCurrentDateTime() );
        consultation.setObservation("");
        consultation.setIdPatient( patient.getId() );
        consultation.setIdMedecin( Home.getSingletonWithoutCreation().getUser().getId() );
        
        fillFormConsultation(consultation);
    }
    
    private void modifierConsultation(){
        consultation = listConsultations.get(tableConsultations.getSelectedRow());
        
        fillFormConsultation(consultation);
    }
    
    private void emptyFormConsultation(){
        this.tfNumConsultation.setText("");
        this.tfDateConsultation.setText("");
        this.tfHeureConsultation.setText("");
        this.tfDureeConsultation.setText("");
        this.epObservationConsultation.setText("");
    }
    
    private void setEnabledFormConsultation(boolean enabled){
        this.lNumConsultation.setEnabled(enabled);
        this.tfNumConsultation.setEnabled(enabled);
        
        this.lDateConsultation.setEnabled(enabled);
        this.tfDateConsultation.setEnabled(enabled);
        
        this.lHeureConsultation.setEnabled(enabled);
        this.tfHeureConsultation.setEnabled(enabled);
        
        this.lDureeConsultation.setEnabled(enabled);
        this.tfDureeConsultation.setEnabled(enabled);
        this.lDurreeConsultation.setEnabled(enabled);
        
        this.lObservationConsultation.setEnabled(enabled);
        this.epObservationConsultation.setEnabled(enabled);
        
        this.bValiderConsultation.setEnabled(enabled);
        this.bAnnulerConsultation.setEnabled(enabled);
    }
    
    private void fillFormConsultation(Consultation consultation){
        this.setEnabledFormConsultation(false);
        this.emptyFormConsultation();
        
        if (consultation == null){
            return;
        }
        
        this.setEnabledFormConsultation(true);
        
        this.tfNumConsultation.setText(consultation.getNumConsultation());
        this.tfDateConsultation.setText(consultation.getDate().split( " " )[0]);
        this.tfHeureConsultation.setText(consultation.getDate().split( " " )[1]);
        this.tfDureeConsultation.setText( consultation.getDureeConsultation()+"" );
        this.epObservationConsultation.setText(consultation.getObservation());
    }
    
    private void bValiderConsultationActionPerformed(){
        try {
            String date = tfDateConsultation.getText().trim();
            String heure = tfHeureConsultation.getText().trim();
            
            
            
            int duree = 0;
            try {
                duree = Integer.parseInt(tfDureeConsultation.getText().trim());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erreur dans la duree ...", "Duree !!!", JOptionPane.ERROR);
                tfDureeConsultation.requestFocus();
                tfDureeConsultation.selectAll();
                return;
            }
            
            String observation = epObservationConsultation.getText().trim();
            
            String datetime = date+" "+heure;
            
            consultation.setDate(datetime);
            consultation.setDureeConsultation( duree );
            consultation.setObservation(observation);
                    
            
            if (consultation.getId() == 0){
                consultation.Ajouter();
                listConsultations.add(consultation);
                
                if (listConsultations.size() == 1){
                    //vider le jtable tableConsultations
                    ((DefaultTableModel)tableConsultations.getModel()).setRowCount(0);
                }
                
                ((DefaultTableModel)tableConsultations.getModel()).addRow( getRowConsultation(consultation) );
            }
            else{
                int indexRow = listConsultations.indexOf(consultation);
                
                ((DefaultTableModel)tableConsultations.getModel()).setValueAt(consultation.getNumConsultation(), indexRow, 0);
                ((DefaultTableModel)tableConsultations.getModel()).setValueAt(consultation.getDate(), indexRow, 1);
                ((DefaultTableModel)tableConsultations.getModel()).setValueAt(consultation.getDureeConsultation(), indexRow, 2);
                ((DefaultTableModel)tableConsultations.getModel()).setValueAt(consultation.getObservation(), indexRow, 3);
                
                listConsultations.set( indexRow , consultation);
                
                consultation.Modifier();
            }
            
            emptyFormConsultation();
            setEnabledFormConsultation(false);
        } catch (Exception e) {
        }
    }
    
    private void bAnnulerConsultationActionPerformed(){
        this.consultation=null;
        fillFormConsultation(null);
    }
    
    
    
  public void setPatient(Patient patient) {
        this.patient = patient;
        this.setTitle("Dossier patient : "+patient.getNom()+" "+patient.getPrenom());
        
        DefaultTableModel model = (DefaultTableModel)tableConsultations.getModel();
        model.setRowCount(0);//vider le jtable tableConsultations
        
        listConsultations = Consultation.rechercher(" idPatient = '"+patient.getId()+"'  ORDER BY date DESC  ");
        
        if (listConsultations.size() == 0){
            Vector row = new Vector();
            row.add("");
            row.add("");
            row.add("");
            row.add("");
            
            model.addRow( row );
            model.addRow( row );
            model.addRow( row );
        }
        else{
            for (Consultation consultation : listConsultations){
                model.addRow( getRowConsultation(consultation) );
            }
        }
    }       
    
    public Vector getRowConsultation(Consultation consultation){
        Vector row = new Vector();
            
        row.add( consultation.getNumConsultation() );
        row.add( consultation.getDate() );
        row.add( consultation.getDureeConsultation() );
        row.add( consultation.getObservation() );
            
        return row;
    }
    
    public static void showDossierPatient(Patient patient){
        getSingleton();
        singleton.setLocationRelativeTo( Home.getSingletonWithoutCreation() );
        
        singleton.setPatient(patient);
        
        singleton.setVisible(true);
    }
    
    private java.util.List<Consultation> listConsultations;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnnulerConsultation;
    private javax.swing.JButton bOrdonnance;
    private javax.swing.JButton bValiderConsultation;
    private javax.swing.JEditorPane epObservationConsultation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lDateConsultation;
    private javax.swing.JLabel lDureeConsultation;
    private javax.swing.JLabel lDurreeConsultation;
    private javax.swing.JLabel lHeureConsultation;
    private javax.swing.JLabel lNumConsultation;
    private javax.swing.JLabel lObservationConsultation;
    private java.awt.Panel panel1;
    private javax.swing.JTable tableConsultations;
    private javax.swing.JTextField tfDateConsultation;
    private javax.swing.JTextField tfDureeConsultation;
    private javax.swing.JTextField tfHeureConsultation;
    private javax.swing.JTextField tfNumConsultation;
    // End of variables declaration//GEN-END:variables

    private JPopupMenu  popupMenuConsultation;
    private JMenuItem   miAjouterConsultation;
    private JMenuItem   miModifierConsultation;    
}
