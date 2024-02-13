/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
/**
 *
 * @author jramosal
 */
public class Panel2 extends JPanel implements ActionListener {

    private JRadioButton rbA,rbB,rbC;
    /**
     * Creates new form Panel2
     */
    public Panel2(String title) {
        setBorder(new EmptyBorder(0,0,0,0));
        setBorder(new TitledBorder(title));
        
       /* setBorder(new CompoundBorder(new EmptyBorder(0,0,0,0)));*/
        setLayout( null );
        
        rbA=new JRadioButton("Opción A");
        rbA.setBounds(10,18,100,25);
        add(rbA);
        
        rbB=new JRadioButton("Opción B");
        rbB.setBounds(115,18,100,25);
        add(rbB);
        
        rbC=new JRadioButton("Opción C");
        rbC.setBounds(220,18,100,25);
        add(rbC);    
        initComponents();
    }
    
    public void setDefault()
    {
        rbA.setSelected(false);
        rbB.setSelected(false);
        rbC.setSelected(false);
    }
    
    public boolean [] getOption(){
    boolean rbk[];
    
    rbk = new boolean[3];
    
    rbk[0] = rbA.isSelected();
    rbk[1] = rbB.isSelected();
    rbk[2] = rbC.isSelected();
    return rbk;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
