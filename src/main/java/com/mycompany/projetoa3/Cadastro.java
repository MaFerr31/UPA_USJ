package com.mycompany.projetoa3;

import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        super("Cadastro do Paciente");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        TX1 = new javax.swing.JLabel();
        TX2 = new javax.swing.JLabel();
        CPFTextField = new javax.swing.JTextField();
        TX3 = new javax.swing.JLabel();
        NomeTextField = new javax.swing.JTextField();
        TX4 = new javax.swing.JLabel();
        DataTextField = new javax.swing.JTextField();
        TX5 = new javax.swing.JLabel();
        GeneroTextField = new javax.swing.JTextField();
        TX6 = new javax.swing.JLabel();
        EnderecoTextField = new javax.swing.JTextField();
        TX7 = new javax.swing.JLabel();
        CidadeTextField = new javax.swing.JTextField();
        TX8 = new javax.swing.JLabel();
        CEPTextField = new javax.swing.JTextField();
        TX9 = new javax.swing.JLabel();
        CelularTextField = new javax.swing.JTextField();
        TX10 = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        TX11 = new javax.swing.JLabel();
        SUSTextField = new javax.swing.JTextField();
        buttonAlterar = new javax.swing.JButton();
        buttonConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MenuBarra = new javax.swing.JMenuBar();
        Login = new javax.swing.JMenu();
        Atendente = new javax.swing.JMenuItem();
        Cadastro = new javax.swing.JMenu();
        Paciente = new javax.swing.JMenuItem();
        Atendimento = new javax.swing.JMenu();
        AtendimentoDiario = new javax.swing.JMenuItem();
        FilaAtendimento = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 113, 182));

        TX1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        TX1.setForeground(new java.awt.Color(255, 255, 255));
        TX1.setText("Cadastro do Paciente");

        TX2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TX2.setForeground(new java.awt.Color(255, 255, 255));
        TX2.setText("CPF:");

        CPFTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        CPFTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFTextFieldActionPerformed(evt);
            }
        });

        TX3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TX3.setForeground(new java.awt.Color(255, 255, 255));
        TX3.setText("Nome:");

        NomeTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        NomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeTextFieldActionPerformed(evt);
            }
        });

        TX4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TX4.setForeground(new java.awt.Color(255, 255, 255));
        TX4.setText("Data de Nascimento:");

        DataTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        DataTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataTextFieldActionPerformed(evt);
            }
        });

        TX5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TX5.setForeground(new java.awt.Color(255, 255, 255));
        TX5.setText("Gênero:");

        GeneroTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        TX6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TX6.setForeground(new java.awt.Color(255, 255, 255));
        TX6.setText("Endereço:");

        EnderecoTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        TX7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TX7.setForeground(new java.awt.Color(255, 255, 255));
        TX7.setText("Cidade:");

        CidadeTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        CidadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidadeTextFieldActionPerformed(evt);
            }
        });

        TX8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TX8.setForeground(new java.awt.Color(255, 255, 255));
        TX8.setText("CEP:");

        CEPTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        TX9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TX9.setForeground(new java.awt.Color(255, 255, 255));
        TX9.setText("Celular:");

        CelularTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        CelularTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelularTextFieldActionPerformed(evt);
            }
        });

        TX10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TX10.setForeground(new java.awt.Color(255, 255, 255));
        TX10.setText("Email:");

        EmailTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        TX11.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TX11.setForeground(new java.awt.Color(255, 255, 255));
        TX11.setText("Carteira SUS:");

        SUSTextField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        buttonAlterar.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        buttonAlterar.setForeground(new java.awt.Color(0, 113, 182));
        buttonAlterar.setText("Alterar");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        buttonConsultar.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        buttonConsultar.setForeground(new java.awt.Color(0, 113, 182));
        buttonConsultar.setText("Consultar");
        buttonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\spect\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoA3\\src\\main\\java\\com\\mycompany\\projetoa3\\Setinha.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TX9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CelularTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TX10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(TX11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SUSTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(TX6)
                            .addGap(18, 18, 18)
                            .addComponent(EnderecoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TX7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(CidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(TX8)
                            .addGap(18, 18, 18)
                            .addComponent(CEPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(198, 198, 198)
                            .addComponent(buttonAlterar)
                            .addGap(18, 18, 18)
                            .addComponent(buttonConsultar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(TX2)
                            .addGap(18, 18, 18)
                            .addComponent(CPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(TX4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(TX5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(GeneroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(TX3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(NomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TX1)
                .addGap(222, 222, 222))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TX1)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TX2)
                    .addComponent(TX4)
                    .addComponent(DataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TX5)
                    .addComponent(GeneroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TX3)
                    .addComponent(NomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CEPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TX8)
                    .addComponent(CidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TX7)
                    .addComponent(EnderecoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TX6))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SUSTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TX11)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TX10)
                    .addComponent(CelularTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TX9))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        Login.setText("Login");

        Atendente.setText("Atendente");
        Atendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtendenteActionPerformed(evt);
            }
        });
        Login.add(Atendente);

        MenuBarra.add(Login);

        Cadastro.setText("Cadastro");

        Paciente.setText("Paciente");
        Paciente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PacienteStateChanged(evt);
            }
        });
        Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacienteActionPerformed(evt);
            }
        });
        Cadastro.add(Paciente);

        MenuBarra.add(Cadastro);

        Atendimento.setText("Atendimento");

        AtendimentoDiario.setText("Registrar Consulta");
        AtendimentoDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtendimentoDiarioActionPerformed(evt);
            }
        });
        Atendimento.add(AtendimentoDiario);

        FilaAtendimento.setText("Fila");
        FilaAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilaAtendimentoActionPerformed(evt);
            }
        });
        Atendimento.add(FilaAtendimento);

        MenuBarra.add(Atendimento);

        setJMenuBar(MenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CPFTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFTextFieldActionPerformed

    private void NomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeTextFieldActionPerformed

    private void DataTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataTextFieldActionPerformed

    private void CidadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidadeTextFieldActionPerformed

    private void CelularTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelularTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelularTextFieldActionPerformed

    private void AtendimentoDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtendimentoDiarioActionPerformed
        RegistrarConsulta rc =  new RegistrarConsulta();
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtendimentoDiarioActionPerformed

    private void PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacienteActionPerformed
        
    }//GEN-LAST:event_PacienteActionPerformed

    private void PacienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PacienteStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_PacienteStateChanged

    private void AtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtendenteActionPerformed
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtendenteActionPerformed

    private void buttonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarActionPerformed
        ConsultarPaciente cp = new ConsultarPaciente();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonConsultarActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        String cpf = (CPFTextField.getText());
        String nome = NomeTextField.getText();
        String email = EmailTextField.getText();
        String data_nasc = DataTextField.getText();
        int cel = Integer.parseInt(CelularTextField.getText());
        String endereco = EnderecoTextField.getText();
        String cidade = (CidadeTextField.getText());
        String cep = (CEPTextField.getText());
        int sus = Integer.parseInt(SUSTextField.getText());
        String genero = (GeneroTextField.getText());
        
        try{
            Paciente paciente = new Paciente(cpf, nome, email, data_nasc, cel, endereco, cidade, cep, sus, genero);
            DAO dao = new DAO();
            dao.atualizar(paciente);
            JOptionPane.showMessageDialog(null,"Paciente atualizado com sucesso!");
            CPFTextField.setText("");
            NomeTextField.setText("");
            EmailTextField.setText("");
            DataTextField.setText("");
            CelularTextField.setText("");
            EnderecoTextField.setText("");
            CidadeTextField.setText("");
            CEPTextField.setText("");
            SUSTextField.setText("");
            GeneroTextField.setText("");
                    
                    
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Não foi possível atualizar o paciente.");
        }
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void FilaAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilaAtendimentoActionPerformed
        FilaAtendimento ft = new FilaAtendimento();
        ft.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FilaAtendimentoActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Atendente;
    private javax.swing.JMenu Atendimento;
    private javax.swing.JMenuItem AtendimentoDiario;
    private javax.swing.JTextField CEPTextField;
    private javax.swing.JTextField CPFTextField;
    private javax.swing.JMenu Cadastro;
    private javax.swing.JTextField CelularTextField;
    private javax.swing.JTextField CidadeTextField;
    private javax.swing.JTextField DataTextField;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField EnderecoTextField;
    private javax.swing.JMenuItem FilaAtendimento;
    private javax.swing.JTextField GeneroTextField;
    private javax.swing.JMenu Login;
    private javax.swing.JMenuBar MenuBarra;
    private javax.swing.JTextField NomeTextField;
    private javax.swing.JMenuItem Paciente;
    private javax.swing.JTextField SUSTextField;
    private javax.swing.JLabel TX1;
    private javax.swing.JLabel TX10;
    private javax.swing.JLabel TX11;
    private javax.swing.JLabel TX2;
    private javax.swing.JLabel TX3;
    private javax.swing.JLabel TX4;
    private javax.swing.JLabel TX5;
    private javax.swing.JLabel TX6;
    private javax.swing.JLabel TX7;
    private javax.swing.JLabel TX8;
    private javax.swing.JLabel TX9;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
