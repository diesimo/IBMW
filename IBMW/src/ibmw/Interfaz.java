/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;



/**
 *
 * @author the_g
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
     //   private IBMW app;
   // private Parametros param;

    /*public Interfaz() {
        initComponents();
        
        this.app = new );
        this.param = this.app.getParam();
        this.inicializarParametros(param);

        Timer timer = new Timer(1, (ActionEvent ae) -> { // Actualizar interfaz cada 1ms (0,001s)
            this.actualizarInterfaz();
            
        });
        timer.start();
    }*/

    public Interfaz() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        Grupo_1.add(Op_Pro);
        Grupo_1.add(Op_En);
        Grupo_1.add(Op_Al);
        Grupo_1.add(Op_Ca);
        Grupo_1.add(Op_Mo);
        Grupo_1.add(Op_Pa);
        Grupo_2.add(PMC);
        Grupo_2.add(PRC);
        Grupo_2.add(PPC);
        Grupo_3.add(EMC);
        
     
       
        Timer timer = new Timer(1, (ActionEvent ae) -> { // Actualizar interfaz cada 1ms (0,001s)
            this.actualizarInterfaz();
            
        });
        timer.start();
       
    }
        Jefe j = new Jefe();
        ProdMotor pm = new ProdMotor();
        ProdParabrisas pp = new ProdParabrisas ();
        ProdRuedas pr = new ProdRuedas ();
        Ensambladores ensa=new Ensambladores();
        Gerente ge = new Gerente();
        int ProTotal = 0;//Productores Totales PRUEBA
        int EnsTotal = 0;//Ensambladores Totales PRUEBA
        int PM=0;
        int PR=0;
        int PP=0;
        int EM=0;
        int ER=0;
        int EP=0;
        
        
           
          

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        Grupo_2 = new javax.swing.ButtonGroup();
        Grupo_3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Op_Pro = new javax.swing.JRadioButton();
        Op_En = new javax.swing.JRadioButton();
        Op_Al = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Consultar = new javax.swing.JButton();
        Op_Ca = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CR = new javax.swing.JTextField();
        CM = new javax.swing.JTextField();
        CP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DRest = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        EsJefe = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        EsGe = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        AddPro = new javax.swing.JButton();
        DisPro = new javax.swing.JButton();
        AddEn = new javax.swing.JButton();
        DisEn = new javax.swing.JButton();
        Op_Pa = new javax.swing.JRadioButton();
        Op_Mo = new javax.swing.JRadioButton();
        PMC = new javax.swing.JRadioButton();
        PPC = new javax.swing.JRadioButton();
        PRC = new javax.swing.JRadioButton();
        EMC = new javax.swing.JRadioButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel2.setText("PICASIMO MOTORS");

        Op_Pro.setText("Productores Ruedas");
        Op_Pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_ProActionPerformed(evt);
            }
        });

        Op_En.setText("Ensambladores");

        Op_Al.setText("Almacen");

        jLabel1.setText("Seleccione parametro a consultar:");

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        Op_Ca.setText("Carros listos");
        Op_Ca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_CaActionPerformed(evt);
            }
        });

        jLabel4.setText("Ruedas ");

        jLabel5.setText("Parabrisas ");

        jLabel6.setText("Motores");

        CR.setEditable(false);
        CR.setBackground(new java.awt.Color(255, 255, 255));
        CR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRActionPerformed(evt);
            }
        });

        CM.setEditable(false);
        CM.setBackground(new java.awt.Color(255, 255, 255));
        CM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMActionPerformed(evt);
            }
        });

        CP.setEditable(false);
        CP.setBackground(new java.awt.Color(255, 255, 255));
        CP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPActionPerformed(evt);
            }
        });

        jLabel7.setText("Disponible en Almacen:");

        DRest.setEditable(false);
        DRest.setBackground(new java.awt.Color(255, 255, 255));
        DRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DRestActionPerformed(evt);
            }
        });

        jLabel8.setText("Dias Restantes:");

        EsJefe.setEditable(false);
        EsJefe.setBackground(new java.awt.Color(255, 255, 255));
        EsJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsJefeActionPerformed(evt);
            }
        });

        jLabel9.setText("Jefe");

        jLabel10.setText("Gerente");

        EsGe.setEditable(false);
        EsGe.setBackground(new java.awt.Color(255, 255, 255));
        EsGe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsGeActionPerformed(evt);
            }
        });

        jLabel11.setText("Estado actual de:");

        jLabel12.setText("Contratar y despedir empelados:");

        jLabel13.setText("Productores");

        jLabel14.setText("Ensambladores");

        AddPro.setText("+");
        AddPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddProMouseClicked(evt);
            }
        });
        AddPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProActionPerformed(evt);
            }
        });

        DisPro.setText("-");
        DisPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisProActionPerformed(evt);
            }
        });

        AddEn.setText("+");
        AddEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEnActionPerformed(evt);
            }
        });

        DisEn.setText("-");
        DisEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisEnActionPerformed(evt);
            }
        });

        Op_Pa.setText("Productores Parabrisas");

        Op_Mo.setText("Productores Motores");
        Op_Mo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_MoActionPerformed(evt);
            }
        });

        PMC.setText("Productores de Motores");
        PMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMCActionPerformed(evt);
            }
        });

        PPC.setText("Productores de Parabrisas");

        PRC.setText("Productores de Ruedas");
        PRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRCActionPerformed(evt);
            }
        });

        EMC.setText("Ensambladores ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CM, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(DRest, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(566, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EsJefe, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(EsGe))
                .addGap(184, 184, 184))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Op_Mo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(AddPro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DisPro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(AddEn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DisEn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 566, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PPC)
                            .addComponent(PMC)
                            .addComponent(PRC)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Op_Pro)
                                .addComponent(Op_En)
                                .addComponent(Op_Pa)
                                .addComponent(Op_Ca)
                                .addComponent(Op_Al)))
                        .addGap(25, 25, 25)
                        .addComponent(Consultar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(EMC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addGap(311, 311, 311))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(233, 233, 233))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(Op_Mo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Op_Pro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Op_Pa)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Consultar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Op_En)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Op_Al)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Op_Ca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(EsJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EsGe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PMC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PRC)
                            .addComponent(AddPro)
                            .addComponent(DisPro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PPC)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddEn)
                            .addComponent(DisEn)
                            .addComponent(EMC))
                        .addGap(99, 99, 99))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DRest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(64, 64, 64))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Op_ProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_ProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Op_ProActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        // TODO add your handling code here:
        String mensaje = "";
        
        if(Op_Pro.isSelected()){
            mensaje = "La cantidad de Productores de Ruedas es: " + pr.getContract() ;
        }else if(Op_En.isSelected()){
            mensaje = "La cantidad de Ensambladores es: " + ensa.getContract();
        }else if(Op_Al.isSelected()){
            mensaje = "La cantiadad de elementos en el almacen es: "  + (ensa.getcsntM() + ensa.getcsntR() + ensa.getcsntP())  ;
        }else if(Op_Ca.isSelected()){
            mensaje = "La cantidad de carros listos es: " + ensa.getContCarL();
        }else if(Op_Mo.isSelected()){
            mensaje = "La cantidad de Productores de Motores es: es: " + pm.getContract();
        }else if(Op_Pa.isSelected()){
            mensaje = "La cantidad de Productores de Parabrisas es: " + pp.getContract();
        }else{
            mensaje = "No se selcciono ninguna opcion";
        }
        JOptionPane.showMessageDialog(this, mensaje);
        
        
        
    }//GEN-LAST:event_ConsultarActionPerformed
 
    private void CRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRActionPerformed

    private void CMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMActionPerformed

    private void CPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPActionPerformed

    private void DRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DRestActionPerformed
        
        int d = 85;
        
        
        this.DRest.setText(String.valueOf(d));
        System.out.print(j.getDiaD());
        
        
        
       
    }//GEN-LAST:event_DRestActionPerformed

    private void EsJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsJefeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EsJefeActionPerformed

    private void EsGeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsGeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EsGeActionPerformed

    private void AddProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProActionPerformed
        //BOTON + DE PRODUCTOR
       if(PMC.isSelected()){
        if(pm.getContract()!=5){
        pm.setContractadd();
       }
      }else if(PRC.isSelected()){
          if(pr.getContract()!=5){
              pr.setContractadd();
        
       }
      }else if(PPC.isSelected()){
          if(pp.getContract()!=5){
            pp.setContractadd();
       }
      }
        
    }//GEN-LAST:event_AddProActionPerformed

    private void Op_CaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_CaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Op_CaActionPerformed

    private void AddProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddProMouseClicked
        Sumar(1);
    }//GEN-LAST:event_AddProMouseClicked

    private void Op_MoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_MoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Op_MoActionPerformed

    private void DisProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisProActionPerformed
        // BOTON - DE PRODUCTOR
       if(PMC.isSelected()){
        if(pm.getContract()!=0){
       pm.setContractdis();
       }
      }else if(PRC.isSelected()){
          if(pr.getContract()!=0){
              pr.setContractdis();
       }
      }else if(PPC.isSelected()){
          if(pp.getContract()!=0){
            pp.setContractdis();
       }
      }
        
    }//GEN-LAST:event_DisProActionPerformed

    private void AddEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEnActionPerformed
        // BOTON + DE ENAMBLADOR
         if(EMC.isSelected()){
        if(ensa.getContract()!=5){
        ensa.setContractadd();
       }
      
     
      }
        
    }//GEN-LAST:event_AddEnActionPerformed

    private void DisEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisEnActionPerformed
       //BOTON - DE ENSAMBLADOR
        if(EMC.isSelected()){
        if(ensa.getContract()!=0){
        ensa.setContractdis();
       }
      
      }
    }//GEN-LAST:event_DisEnActionPerformed

    private void PRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRCActionPerformed

    private void PMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PMCActionPerformed

    
    public void Sumar(int i)
    {
        int suma=0;
        
        suma=suma+i;
                
    
    
    }
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    public void actualizarInterfaz(){
        //Actualizar interfaz
        this.DRest.setText(String.valueOf(j.getDiaD()));
        this.CR.setText(String.valueOf(ensa.getcsntR()));
        this.CP.setText(String.valueOf(ensa.getcsntP()));
        this.CM.setText(String.valueOf(ensa.getcsntM()));
        this.EsGe.setText(ge.evaluar());
        this.EsJefe.setText(j.evaluar());
        
        
        
//        this.mesonPF.setText(String.valueOf(app.getMesonPF().getCantUnidades()));
//        this.mesonP.setText(String.valueOf(app.getMesonP().getCantUnidades()));
//        
//        //Actualizar cocineros y mesoneros
//        this.cocinerosE.setText(String.valueOf(app.getCantCocinerosE()));
//        this.cocinerosPF.setText(String.valueOf(app.getCantCocinerosPF()));
//        this.cocinerosP.setText(String.valueOf(app.getCantCocinerosP()));
//        this.mesoneros.setText(String.valueOf(app.getCantMesoneros()));
//        
//        
//        
//        //Actualizar ordenes armadas
//        this.ordenesAtendidas.setText(String.valueOf(AplicacionRestaurante.getOrdenesArmadas()));
//        
//        //Actualizar cronometrador
//        this.cronometrador.setText(app.getCronometrador().getStatus());
//        
//        //Actualizar gerente
//        this.gerente.setText(app.getGerente().getStatus());
//                
//        //Actualizar horas para el cierre 
//        this.horas.setText(String.valueOf(app.getCronometrador().getContador()));
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEn;
    private javax.swing.JButton AddPro;
    private javax.swing.JTextField CM;
    private javax.swing.JTextField CP;
    private javax.swing.JTextField CR;
    private javax.swing.JButton Consultar;
    private javax.swing.JTextField DRest;
    private javax.swing.JButton DisEn;
    private javax.swing.JButton DisPro;
    private javax.swing.JRadioButton EMC;
    private javax.swing.JTextField EsGe;
    private javax.swing.JTextField EsJefe;
    private javax.swing.ButtonGroup Grupo_1;
    private javax.swing.ButtonGroup Grupo_2;
    private javax.swing.ButtonGroup Grupo_3;
    private javax.swing.JRadioButton Op_Al;
    private javax.swing.JRadioButton Op_Ca;
    private javax.swing.JRadioButton Op_En;
    private javax.swing.JRadioButton Op_Mo;
    private javax.swing.JRadioButton Op_Pa;
    private javax.swing.JRadioButton Op_Pro;
    private javax.swing.JRadioButton PMC;
    private javax.swing.JRadioButton PPC;
    private javax.swing.JRadioButton PRC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
