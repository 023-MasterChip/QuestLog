/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swingPackages;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class MainFrame extends javax.swing.JFrame
{
    public static int questId;

    /**
     * Creates new form MainFrame
     */
    public MainFrame()
    {

        initComponents();

        setUser();
        setDate();
        getList();
       
    }

    void getList()
    {
        DefaultListModel listmodel = new DefaultListModel();

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/quest", "root", "");
            PreparedStatement st = con.prepareStatement(
                    "Select * from quest where user_id=?");

            LoginFrame l = new LoginFrame();
            int user_id = l.userId;
            st.setInt(1, user_id);

            ResultSet rs = st.executeQuery();

            while (rs.next())
            {

                String quest = rs.getString("quest_title");

                jList1.setModel(listmodel);
                listmodel.addElement(quest);
            }

            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    void getObjList()
    {
         DefaultListModel listmodel = new DefaultListModel();

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/quest", "root", "");
            PreparedStatement st = con.prepareStatement(
                    "Select * from quest_obj where quest_id=? order by date desc");

            st.setInt(1, questId);

            ResultSet rs = st.executeQuery();

            
            if (rs.next() == false)
            { 
                objList.setModel(listmodel);
                listmodel.removeAllElements();
            }
            else { 
                do { 
                    String obj = rs.getString("obj_name");
                    

                    objList.setModel(listmodel);
                    listmodel.addElement(obj);
                } while (rs.next());
            }


            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    void setUser()
    {
        LoginFrame l = new LoginFrame();
        String user_name = l.user;
        userLabel.setText(user_name);
    }

    void setDate()
    {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        dateLabel.setText(s.format(d));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        questTitle = new javax.swing.JLabel();
        objDisplay = new javax.swing.JScrollPane();
        objList = new javax.swing.JList<>();
        noteLabel = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        questAdd = new javax.swing.JButton();
        questDelete = new javax.swing.JButton();
        utilPanel = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 247, 240));
        setMaximumSize(new java.awt.Dimension(32767, 32767));

        questPanel.setBackground(new java.awt.Color(250, 247, 240));

        mainPanel.setBackground(new java.awt.Color(227, 252, 191));

        questTitle.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        questTitle.setForeground(new java.awt.Color(20, 195, 142));

        objDisplay.setBackground(new java.awt.Color(184, 241, 176));
        objDisplay.setForeground(new java.awt.Color(184, 241, 176));

        objList.setBackground(new java.awt.Color(184, 241, 176));
        objList.setForeground(new java.awt.Color(102, 102, 102));
        objList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                objListMouseClicked(evt);
            }
        });
        objDisplay.setViewportView(objList);

        noteLabel.setForeground(new java.awt.Color(0, 255, 171));
        noteLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noteLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addComponent(objDisplay, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(questTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(questTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(objDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidePanel.setBackground(new java.awt.Color(20, 195, 142));

        jList1.setBackground(new java.awt.Color(0, 255, 171));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel3.setFont(new java.awt.Font("Okami", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(227, 252, 191));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("QUESTlog");

        questAdd.setBackground(new java.awt.Color(184, 241, 176));
        questAdd.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        questAdd.setForeground(new java.awt.Color(20, 195, 142));
        questAdd.setText("ADD");
        questAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questAddActionPerformed(evt);
            }
        });

        questDelete.setBackground(new java.awt.Color(184, 241, 176));
        questDelete.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        questDelete.setForeground(new java.awt.Color(20, 195, 142));
        questDelete.setText("DELETE");
        questDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(questAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(questDelete)
                .addGap(23, 23, 23))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questAdd)
                    .addComponent(questDelete))
                .addGap(15, 15, 15))
        );

        utilPanel.setBackground(new java.awt.Color(184, 241, 176));
        utilPanel.setPreferredSize(new java.awt.Dimension(135, 65));

        dateLabel.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(20, 195, 142));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateLabel.setText("date");
        dateLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        userLabel.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(20, 195, 142));
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userLabel.setText("user");

        addBtn.setBackground(new java.awt.Color(227, 252, 191));
        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(227, 252, 191));
        editBtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editing.png"))); // NOI18N
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(227, 252, 191));
        exitBtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(227, 252, 191));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minus.png"))); // NOI18N
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout utilPanelLayout = new javax.swing.GroupLayout(utilPanel);
        utilPanel.setLayout(utilPanelLayout);
        utilPanelLayout.setHorizontalGroup(
            utilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utilPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(addBtn)
                .addGap(26, 26, 26)
                .addComponent(editBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addGap(26, 26, 26)
                .addComponent(exitBtn)
                .addGap(131, 131, 131)
                .addGroup(utilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        utilPanelLayout.setVerticalGroup(
            utilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utilPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(utilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(utilPanelLayout.createSequentialGroup()
                        .addComponent(exitBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(utilPanelLayout.createSequentialGroup()
                        .addComponent(userLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(utilPanelLayout.createSequentialGroup()
                        .addGroup(utilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBtn)
                            .addComponent(editBtn)
                            .addComponent(deleteBtn))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout questPanelLayout = new javax.swing.GroupLayout(questPanel);
        questPanel.setLayout(questPanelLayout);
        questPanelLayout.setHorizontalGroup(
            questPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questPanelLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(questPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(utilPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        questPanelLayout.setVerticalGroup(
            questPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(questPanelLayout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(utilPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(questPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(questPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addBtnActionPerformed
    {//GEN-HEADEREND:event_addBtnActionPerformed
        // TODO add your handling code here:

        //Add new quest
        new UpdateFrame().setVisible(true);
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_exitBtnActionPerformed
    {//GEN-HEADEREND:event_exitBtnActionPerformed
        // TODO add your handling code here:

        //Logout btn
        new LoginFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void questDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_questDeleteActionPerformed
    {//GEN-HEADEREND:event_questDeleteActionPerformed
        // TODO add your handling code here:

        //Delete Quest btn
        
        JOptionPane.showMessageDialog(mainPanel, "Select a quest to delete");
    }//GEN-LAST:event_questDeleteActionPerformed

    private void questAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_questAddActionPerformed
    {//GEN-HEADEREND:event_questAddActionPerformed
        // TODO add your handling code here:

        //Add Quest btn
        new AddQuest().setVisible(true);
    }//GEN-LAST:event_questAddActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_editBtnActionPerformed
    {//GEN-HEADEREND:event_editBtnActionPerformed
        // TODO add your handling code here:

        //Edit quest details btn
        
        //Get obj name nd description from db and set to the fields in updateFrame
        
        new UpdateFrame().setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteBtnActionPerformed
    {//GEN-HEADEREND:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        //Delete objective btn
        
        JOptionPane.showMessageDialog(mainPanel, "Select an objective to delete");
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        JList list = (JList)evt.getSource();
    if (evt.getClickCount() == 1) {
        int index = list.locationToIndex(evt.getPoint());
        String qName = (String) list.getSelectedValue();
        questTitle.setText(qName);
        
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/quest", "root", "");
            PreparedStatement st = con.prepareStatement(
                    "Select * from quest where quest_title=?");

           
            st.setString(1, qName);

            ResultSet rs = st.executeQuery();

            while (rs.next())
            {

                 questId = rs.getInt("id");

            }   
             getObjList();

            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
    }//GEN-LAST:event_jList1MouseClicked

    private void objListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_objListMouseClicked
          JList list = (JList)evt.getSource();
    if (evt.getClickCount() == 1) {
        int index = list.locationToIndex(evt.getPoint());
        String qName = (String) list.getSelectedValue();
        
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/quest", "root", "");
            PreparedStatement st = con.prepareStatement(
                    "Select * from quest_obj where obj_name=?");

           
            st.setString(1, qName);
            

            ResultSet rs = st.executeQuery();

            while (rs.next())
            {

                String obj = rs.getString("notes");
                String obj_date  = rs.getString("date");
                noteLabel.setText(String.format("%-20s %-20s", obj, obj_date));
            }   
           
            
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
    }//GEN-LAST:event_objListMouseClicked

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
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JScrollPane objDisplay;
    private javax.swing.JList<String> objList;
    private javax.swing.JButton questAdd;
    private javax.swing.JButton questDelete;
    private javax.swing.JPanel questPanel;
    private javax.swing.JLabel questTitle;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JPanel utilPanel;
    // End of variables declaration//GEN-END:variables
}
