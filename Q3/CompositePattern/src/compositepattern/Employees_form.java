/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compositepattern;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author ermias
 */
public class Employees_form extends javax.swing.JFrame {

    static String role1;
    public int addOrRem = 0;
    

    /**
     * Creates new form Employees_form
     */
    DefaultTreeModel model;
    public Employees_form() {
        
        initComponents();
        jPanel1.setVisible(false);
        model = (DefaultTreeModel)jTree1.getModel();
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
        mainrole = new javax.swing.JTextField();
        add_ = new javax.swing.JButton();
        remove_ = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        name_ = new javax.swing.JTextField();
        dep_ = new javax.swing.JTextField();
        sal_ = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("          Employee managing system");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Role");

        mainrole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainroleActionPerformed(evt);
            }
        });

        add_.setLabel("Add");
        add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_ActionPerformed(evt);
            }
        });

        remove_.setLabel("Remove");
        remove_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("dep");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("salary");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sal_, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dep_, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(submit)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dep_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sal_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(submit))
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("CEO");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("MKT");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("ProdM");
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jTree1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(add_)
                            .addGap(56, 56, 56)
                            .addComponent(remove_))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mainrole, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(mainrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_)
                            .addComponent(remove_))
                        .addGap(17, 17, 17)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainroleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainroleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainroleActionPerformed

    private void remove_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_ActionPerformed
        // TODO add your handling code here:
        
        try{
                    
            jPanel1.setVisible(true);
            name_.setVisible(false);
            sal_.setVisible(false);
            jLabel3.setVisible(false);
            jLabel5.setVisible(false);
            addOrRem = 0;

            //jTree implementation here
            selectednode = (DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
            mainrole.setText(selectednode.getParent().toString());
            dep_.setText(selectednode.toString());
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "select employee first.");
        }
        
    }//GEN-LAST:event_remove_ActionPerformed
        
    DefaultMutableTreeNode selectednode;
    private void add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_ActionPerformed
        // TODO add your handling code here:
       
        try{
            jPanel1.setVisible(true);
            jLabel3.setVisible(true);
            name_.setVisible(true);
            dep_.setVisible(true);
            sal_.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);

            addOrRem = 1;
            //jTree implementation here
            selectednode = (DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
            mainrole.setText(selectednode.toString());

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "select employee first.");
        }
        
        
    }//GEN-LAST:event_add_ActionPerformed


    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        
        try{
            
        role1 = mainrole.getText().toString();
        
        String dep = dep_.getText();
        
        if(addOrRem == 1){
            String name = name_.getText();
            int sal = Integer.parseInt(sal_.getText());
            try {
                    for (int counter = 0; counter < list_of_employees.size(); counter++) { 		      
                            if(list_of_employees.get(counter).department.equals(role1)){
                                //list_of_employees.get(counter).Add(new Employee(name, dep, sal));
                                //list_of_employees.add(new Employee(name, dep, sal));
                                for(int i = 0; i < list_of_employees.get(counter).getSubordinates().size(); i++){
                                    if(list_of_employees.get(counter).getSubordinates().get(i).name.equals(name)){
                                        JOptionPane.showMessageDialog(null, "name already exist!!");
                                        exit(0);
                                    }
                                    
                                }
                                list_of_employees.get(counter).Add(new Employee(name, dep, sal));
                                list_of_employees.add(new Employee(name, dep, sal));
                                selectednode.insert(new DefaultMutableTreeNode(dep_.getText()), 0);
                                model.reload(selectednode);
                                JOptionPane.showMessageDialog(null, "new employee added successfully!");
                                mainrole.setText("");
                                name_.setText("");
                                dep_.setText("");
                                sal_.setText("");
                                
                            }
                    } 
                    
            } catch (Exception ex) {
                Logger.getLogger(Employees_form.class.getName()).log(Level.SEVERE, null, ex);
            }
            //JOptionPane.showMessageDialog(null, "done!!");
//            System.out.println(list_of_employees.get(1).getSubordinates().get(1).name);
            jPanel1.setVisible(false);
        }else if(addOrRem == 0){
            role1 = mainrole.getText().toString();
            dep = dep_.getText().toString();
            try {
                    for (int counter = 0; counter < list_of_employees.size(); counter++) { 		      
                            if(list_of_employees.get(counter).department.equals(role1)){
                                for(int i = 0; i < list_of_employees.get(counter).getSubordinates().size(); i++){
                                    if(list_of_employees.get(counter).getSubordinates().get(i).department.equals(dep)){
                                        list_of_employees.get(counter).remove(list_of_employees.get(counter).getSubordinates().get(i));
                                        DefaultMutableTreeNode parent = (DefaultMutableTreeNode)selectednode.getParent();
                                        parent.remove(selectednode);
                                        model.reload(parent);
                                        for(int j = 0; j < list_of_employees.size(); j++){
                                            if(list_of_employees.get(j).department.equals(dep)){
                                                list_of_employees.remove(j);
                                                name_.setText(" ");
                                            }
                                        }
                                        mainrole.setText("");
                                        dep_.setText("");
                                        JOptionPane.showMessageDialog(null, "done!!");
                                    }
                                }
                            }
                    }             } catch (Exception ex) {
                Logger.getLogger(Employees_form.class.getName()).log(Level.SEVERE, null, ex);
            }
            jPanel1.setVisible(false);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "please insert valid input.");
        }
        
    }//GEN-LAST:event_submitActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public static List<Employee> list_of_employees = new ArrayList<>();
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
            java.util.logging.Logger.getLogger(Employees_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        
        Employee CEO = new Employee("Ermiyas", "CEO", 10000);
        
        // add the two vice managers
        Employee MKT = new Employee("Bre", "MKT", 8000);
        
        Employee ProdM = new Employee("Girma", "prodM", 8000);
        
        CEO.Add(MKT);
        CEO.Add(ProdM);
        
        list_of_employees.add(MKT);
        list_of_employees.add(CEO);
        list_of_employees.add(ProdM);
      
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees_form().setVisible(true);
            }
        });
        
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_;
    private javax.swing.JTextField dep_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JTextField mainrole;
    private javax.swing.JTextField name_;
    private javax.swing.JButton remove_;
    private javax.swing.JTextField sal_;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
