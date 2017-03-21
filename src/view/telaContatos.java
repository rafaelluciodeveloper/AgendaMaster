package view;

import conf.Conexao;
import conf.Relatorio;
import dao.ContatoDAO;
import table.TabelaContato;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Contato;

public class telaContatos extends javax.swing.JFrame {

    private TabelaContato tabelaContatos;
    public static Statement st;
    public Conexao conexao;
    private final ContatoDAO contatoDAO;
    private Contato c;
    private Relatorio relatorio;

    public telaContatos() throws SQLException {
        conexao = new Conexao();
        contatoDAO = new ContatoDAO();
        st = conexao.getConexao().createStatement();
        tabelaContatos = new TabelaContato(selecionarContatos());
        initComponents();
        redimensionarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnRelatorios = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");

        jLabel1.setText("ID");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Telefone");

        jLabel5.setText("E-Mail");

        btnRelatorios.setText("Relatório");
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        jTable2.setModel(tabelaContatos);
        jTable2.setToolTipText("");
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 37, Short.MAX_VALUE)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRelatorios))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtNome))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(txtEndereco)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo)
                    .addComponent(btnRelatorios)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtNome.requestFocus();
        controleBotoes(false, false, true, false, false);
        c = new Contato();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        c.setNome(txtNome.getText());
        c.setEndereço(txtEndereco.getText());
        c.setTelefone(Integer.parseInt(txtTelefone.getText()));
        c.setEmail(txtEmail.getText());
        try {
            contatoDAO.salvar(c);
            JOptionPane.showMessageDialog(null, "Salvo Com Suscesso!!!");
            tabelaContatos.setResult(selecionarContatos());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error!!!");
        }
        c = new Contato();
        controleBotoes(true, true, true, true, true);
        txtID.requestFocus();
        limparCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        txtID.setText(tabelaContatos.getValueAt(jTable2.getSelectedRow(), 0).toString());
        txtNome.setText(tabelaContatos.getValueAt(jTable2.getSelectedRow(), 1).toString());
        txtEndereco.setText(tabelaContatos.getValueAt(jTable2.getSelectedRow(), 2).toString());
        txtTelefone.setText(tabelaContatos.getValueAt(jTable2.getSelectedRow(), 3).toString());
        txtEmail.setText(tabelaContatos.getValueAt(jTable2.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        controleBotoes(false, false, true, false, false);
        try {
            c = contatoDAO.listarPorId(Long.parseLong(txtID.getText()));
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não Foi Possivel Selecionar Contato");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Deseja Excluir Contato ?");
        if (op == 0) {
            try {
                contatoDAO.excluir(Long.parseLong(txtID.getText()));
                tabelaContatos.setResult(selecionarContatos());
                limparCampos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não Foi Possivel Exluir Contato");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        relatorio = new Relatorio();
        relatorio.imprimir("report1.jasper");
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new telaContatos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(telaContatos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(telaContatos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(telaContatos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(telaContatos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(telaContatos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private ResultSet selecionarContatos() {
        ResultSet rs = null;
        String SQL = "SELECT * FROM contatos";
        try {
            rs = st.executeQuery(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void controleCampos(boolean txtId, boolean txtNome, boolean txtEndereco, boolean txtTelefone, boolean txtEmail) {
        this.txtNome.setEditable(txtId);
        this.txtNome.setEditable(txtNome);
        this.txtEndereco.setEditable(txtEndereco);
        this.txtTelefone.setEditable(txtTelefone);
        this.txtEmail.setEditable(txtEmail);
    }

    public void controleBotoes(boolean btnbNovo, boolean btnAlterar, boolean btnSalvar, boolean btnExcluir, boolean btnRelatorio) {
        this.btnNovo.setEnabled(btnbNovo);
        this.btnAlterar.setEnabled(btnAlterar);
        this.btnSalvar.setEnabled(btnSalvar);
        this.btnExcluir.setEnabled(btnExcluir);
        this.btnRelatorios.setEnabled(btnRelatorio);
    }

    public void limparCampos() {
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtID.setText("");
    }

    public void redimensionarTabela() {
        jTable2.setAutoResizeMode(jTable2.AUTO_RESIZE_OFF);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(170);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(60);
        jTable2.getColumnModel().getColumn(4).setPreferredWidth(170);
    }

}
