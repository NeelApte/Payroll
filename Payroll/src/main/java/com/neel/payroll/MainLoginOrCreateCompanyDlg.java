/*
MIT License

Copyright (c) 2022 Neel Apte

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package com.neel.payroll;

import com.neel.payroll.DB.CurrCompanyAndUser;
import com.neel.payroll.DB.LoadSaveDatabase;
import com.neel.payroll.Util.Util;
import java.awt.FileDialog;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Neel
 */
public class MainLoginOrCreateCompanyDlg extends javax.swing.JDialog {

    /**
     * Creates new form MainLoginOrCreateCompanyDlg
     */
    public MainLoginOrCreateCompanyDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null); //Center dialog in screen
    }

    private boolean m_loginOK = false;

    /**
     * Get the value of m_loginOK
     *
     * @return the value of m_loginOK
     */
    public boolean isloginOK() {
        return m_loginOK;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfDbFilename = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pfUserPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnBrowseDbFile = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        btnCreateCompany = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Open / Create Company -- Payroll");

        jLabel1.setText("Select Company File:");

        jLabel2.setText("User Name");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnBrowseDbFile.setText("Browse");
        btnBrowseDbFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseDbFileActionPerformed(evt);
            }
        });

        jLabel13.setText("Password:");

        btnCreateCompany.setText("Create New company");
        btnCreateCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCompanyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateCompany, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pfUserPassword)
                    .addComponent(tfUserName)
                    .addComponent(tfDbFilename))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBrowseDbFile)
                .addGap(73, 73, 73))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfDbFilename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowseDbFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(pfUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnCreateCompany))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        var strUserName = this.tfUserName.getText();
        var strPassWord = this.pfUserPassword.getPassword().toString();
        var strDbFilename = this.tfDbFilename.getText();
        if (CurrCompanyAndUser.getInstance().initialize(strUserName, strPassWord, strDbFilename) == false) {
            return;
        }

        try {
            LoadSaveDatabase.getInstance().LoadFromDatabase();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }
        m_loginOK = true;
        setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnBrowseDbFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseDbFileActionPerformed
        FileDialog fd = new FileDialog(this, "Choose company database file.", FileDialog.LOAD);
        fd.setFile("*.db");
        fd.setLocationRelativeTo(null); //Try centering dialog ---- does not seem to work.
        fd.setVisible(true);
        String filename = fd.getFile();
        if (filename != null) {
            this.tfDbFilename.setText(fd.getDirectory() + "\\" + filename);
        }
    }//GEN-LAST:event_btnBrowseDbFileActionPerformed

    private void btnCreateCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCompanyActionPerformed
        CreateCompanyDlg dialog = new CreateCompanyDlg(new javax.swing.JFrame(), true);

        dialog.setVisible(true);

        if (dialog.isdialogClosedByOK()) {
            this.tfDbFilename.setText(Util.getAppDir() + "/" + dialog.getuserDBName() + ".db");
            this.tfUserName.setText(dialog.getuserName());
            //this.pfUserPassword.setText(dialog.get);
        }

        dialog.dispose();
    }//GEN-LAST:event_btnCreateCompanyActionPerformed


 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseDbFile;
    private javax.swing.JButton btnCreateCompany;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField pfUserPassword;
    private javax.swing.JTextField tfDbFilename;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
