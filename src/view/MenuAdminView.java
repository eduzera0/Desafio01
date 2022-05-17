/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.MenuAdminC;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

/**
 *
 * @author eduar
 */
public class MenuAdminView extends javax.swing.JFrame {
    
    private final MenuAdminC controller;
    /**
     * Creates new form MenuAdminView
     */
    public MenuAdminView() {
        initComponents();
        controller = new MenuAdminC(this);
        
    }
    
    public ArrayList<Usuario> usuarioLista(){
        ArrayList<Usuario> usuariosLista= new ArrayList<>();
        try{
            String QUERY = "SELECT * FROM usuarios";
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario", "root", "");
            PreparedStatement statement = conexao.prepareStatement(QUERY);
            ResultSet rs = statement.executeQuery();
            Usuario usuario;
            while(rs.next()){
                usuario = new Usuario(rs.getString("id"), rs.getString("email"), rs.getString("nome"), rs.getString("telefone"), rs.getString("nivelUsuario"), rs.getString("ativo"));
                usuariosLista.add(usuario);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return usuariosLista;
    }
    
    public void mostrarUsuarios(){
        ArrayList<Usuario> lista = usuarioLista();
        DefaultTableModel dm = (DefaultTableModel)jTabelaListagem.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
        DefaultTableModel model = (DefaultTableModel)jTabelaListagem.getModel();
        Object[] row = new Object[6];
        for(int i=0; i<lista.size(); i++){
            row[0] = lista.get(i).getId();
            row[1] = lista.get(i).getEmail();
            row[2] = lista.get(i).getNome();
            row[3] = lista.get(i).getTelefone();
            row[4] = lista.get(i).getNivelUsuario();
            row[5] = lista.get(i).getAtivo();
            model.addRow(row);
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
        jTextFieldMAid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMAtelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldMAnome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldMAemail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldMAativo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldMAnivelUsuario = new javax.swing.JTextField();
        jButtonMAR = new javax.swing.JButton();
        jPasswordFieldMAsenha = new javax.swing.JPasswordField();
        jButtonMAC = new javax.swing.JButton();
        jButtonMAU = new javax.swing.JButton();
        jButtonMAD = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaListagem = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldMAperg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu ADMIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Menu ADMIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
        getContentPane().add(jTextFieldMAid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 180, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Telefone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));
        getContentPane().add(jTextFieldMAtelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 180, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Nome");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 66, -1, 40));
        getContentPane().add(jTextFieldMAnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 180, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Senha");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 126, -1, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 66, -1, 40));
        getContentPane().add(jTextFieldMAemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 180, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Ativo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 126, -1, 40));
        getContentPane().add(jTextFieldMAativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 180, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Acesso (NORMAL ou ADMIN)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 170, 50));
        getContentPane().add(jTextFieldMAnivelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 180, 30));

        jButtonMAR.setText("Lista Usuarios");
        jButtonMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMARActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, 130, 40));
        getContentPane().add(jPasswordFieldMAsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 180, 30));

        jButtonMAC.setText("Criar");
        jButtonMAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMACActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 130, 40));

        jButtonMAU.setText("Atualizar");
        jButtonMAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMAUActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMAU, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 130, 40));

        jButtonMAD.setText("Deletar");
        jButtonMAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMADActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 130, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Para deletar insira somente o Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 200, 20));

        jTabelaListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Email", "Nome", "Telefone", "Nivel de Acesso", "Ativo"
            }
        ));
        jTabelaListagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaListagemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaListagem);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1000, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Jogo Favorito");
        jLabel12.setToolTipText("");
        jLabel12.setAutoscrolls(true);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 90, 50));
        getContentPane().add(jTextFieldMAperg, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 180, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/minebackground.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-440, -140, 1500, 920));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMACActionPerformed
        controller.cadastrar();
    }//GEN-LAST:event_jButtonMACActionPerformed

    private void jButtonMAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMAUActionPerformed
        controller.atualizar();
    }//GEN-LAST:event_jButtonMAUActionPerformed

    private void jButtonMADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMADActionPerformed
       controller.deletaUser();
    }//GEN-LAST:event_jButtonMADActionPerformed

    private void jButtonMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMARActionPerformed
        mostrarUsuarios();
    }//GEN-LAST:event_jButtonMARActionPerformed

    private void jTabelaListagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaListagemMouseClicked
        JTable table = (JTable) evt.getSource();
        int i = table.getSelectedRow();
        String id = (String) this.jTabelaListagem.getValueAt(i, 0);
        this.jTextFieldMAid.setText(id);
        String email = (String) this.jTabelaListagem.getValueAt(i, 1);
        this.jTextFieldMAemail.setText(email);
        String nome = (String) this.jTabelaListagem.getValueAt(i, 2);
        this.jTextFieldMAnome.setText(nome);
        String telefone = (String) this.jTabelaListagem.getValueAt(i, 3);
        this.jTextFieldMAtelefone.setText(telefone);
        String nivelUsuario = (String) this.jTabelaListagem.getValueAt(i, 4);
        this.jTextFieldMAnivelUsuario.setText(nivelUsuario);
        String ativo = (String) this.jTabelaListagem.getValueAt(i, 5);
        this.jTextFieldMAativo.setText(ativo);
    }//GEN-LAST:event_jTabelaListagemMouseClicked

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
            java.util.logging.Logger.getLogger(MenuAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdminView().setVisible(true);
            }
        });
    }

    public JPasswordField getjPasswordFieldMAsenha() {
        return jPasswordFieldMAsenha;
    }

    public void setjPasswordFieldMAsenha(JPasswordField jPasswordFieldMAsenha) {
        this.jPasswordFieldMAsenha = jPasswordFieldMAsenha;
    }

    public JTextField getjTextFieldMAnome() {
        return jTextFieldMAnome;
    }

    public void setjTextFieldMAnome(JTextField jTextFieldMAnome) {
        this.jTextFieldMAnome = jTextFieldMAnome;
    }

    

    public JTextField getjTextFieldMAativo() {
        return jTextFieldMAativo;
    }

    public void setjTextFieldMAativo(JTextField jTextFieldMAativo) {
        this.jTextFieldMAativo = jTextFieldMAativo;
    }

    public JTextField getjTextFieldMAemail() {
        return jTextFieldMAemail;
    }

    public void setjTextFieldMAemail(JTextField jTextFieldMAemail) {
        this.jTextFieldMAemail = jTextFieldMAemail;
    }

    public JTextField getjTextFieldMAid() {
        return jTextFieldMAid;
    }

    public void setjTextFieldMAid(JTextField jTextFieldMAid) {
        this.jTextFieldMAid = jTextFieldMAid;
    }

    public JTextField getjTextFieldMAnivelUsuario() {
        return jTextFieldMAnivelUsuario;
    }

    public void setjTextFieldMAnivelUsuario(JTextField jTextFieldMAnivelUsuario) {
        this.jTextFieldMAnivelUsuario = jTextFieldMAnivelUsuario;
    }

    public JTextField getjTextFieldMAtelefone() {
        return jTextFieldMAtelefone;
    }

    public void setjTextFieldMAtelefone(JTextField jTextFieldMAtelefone) {
        this.jTextFieldMAtelefone = jTextFieldMAtelefone;
    }

    public JTable getjTableListagem() {
        return jTabelaListagem;
    }

    public void setjTableListagem(JTable jTableListagem) {
        this.jTabelaListagem = jTableListagem;
    }

    public JTextField getjTextFieldMAperg() {
        return jTextFieldMAperg;
    }

    public void setjTextFieldMAperg(JTextField jTextFieldMAperg) {
        this.jTextFieldMAperg = jTextFieldMAperg;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMAC;
    private javax.swing.JButton jButtonMAD;
    private javax.swing.JButton jButtonMAR;
    private javax.swing.JButton jButtonMAU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordFieldMAsenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaListagem;
    private javax.swing.JTextField jTextFieldMAativo;
    private javax.swing.JTextField jTextFieldMAemail;
    private javax.swing.JTextField jTextFieldMAid;
    private javax.swing.JTextField jTextFieldMAnivelUsuario;
    private javax.swing.JTextField jTextFieldMAnome;
    private javax.swing.JTextField jTextFieldMAperg;
    private javax.swing.JTextField jTextFieldMAtelefone;
    // End of variables declaration//GEN-END:variables
}
