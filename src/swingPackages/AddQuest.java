/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swingPackages;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class AddQuest extends javax.swing.JFrame
{


    /**
     * Creates new form AddQuest
     */
    public AddQuest()
    {
        initComponents();

    }

    String setDate()
    {
        String date;
        java.util.Date d = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        return date = s.format(d);
    }

    int getId()
    {
        int id;
        LoginFrame F = new LoginFrame();
        return id = F.userId;
    }

    String setTime()
    {
        String time;
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return time = formatter.format(date);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        questField = new javax.swing.JTextField();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(237, 237, 237));

        jLabel3.setFont(new java.awt.Font("Okami", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(218, 0, 55));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("QUESTlog");

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 23, 23));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quest Name");

        addBtn.setBackground(new java.awt.Color(68, 68, 68));
        addBtn.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(237, 237, 237));
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(68, 68, 68));
        backBtn.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(237, 237, 237));
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Okami", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(218, 0, 55));
        jLabel4.setText("AD ASTRA ABYSSOSQUE");

        resetBtn.setBackground(new java.awt.Color(237, 237, 237));
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reset.png"))); // NOI18N
        resetBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(questField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resetBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(addBtn)
                                .addGap(60, 60, 60)
                                .addComponent(backBtn))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(backBtn))
                .addGap(49, 49, 49))
        );

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

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addBtnActionPerformed
    {//GEN-HEADEREND:event_addBtnActionPerformed
        // TODO add your handling code here:
        if(questField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(jPanel1, "Enter quest name");
        }
        else{
        //Add quest
        String questName = questField.getText();
        String dateNew = setDate();
        String timeNew = setTime();
        int idNew = getId();

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/quest", "root", "");
            PreparedStatement st = con.prepareStatement(
                    "INSERT INTO quest(quest_title,date,time,user_id) VALUES(?,?,?,?)");

            st.setString(1, questName);
            st.setString(2, dateNew);
            st.setString(3, timeNew);
            st.setInt(4, idNew);

            int rs = st.executeUpdate();

            if (rs == 1)
            {
                JOptionPane.showMessageDialog(jPanel1, "Quest added");
                new MainFrame().setVisible(false);
                new MainFrame().setVisible(true);
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel1, "Failed to add quest");
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backBtnActionPerformed
    {//GEN-HEADEREND:event_backBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_resetBtnActionPerformed
    {//GEN-HEADEREND:event_resetBtnActionPerformed
        // TODO add your handling code here:

        questField.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AddQuest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField questField;
    private javax.swing.JButton resetBtn;
    // End of variables declaration//GEN-END:variables
}
