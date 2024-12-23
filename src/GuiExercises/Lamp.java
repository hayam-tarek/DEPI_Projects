/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GuiExercises;

import java.awt.*;

/**
 *
 * @author hayam tarek
 */
public class Lamp extends javax.swing.JFrame {

    /**
     * Creates new form Lamp
     */
    public Lamp() {
        initComponents();
        setSize(400, 500);
        getContentPane().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Lamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lamp().setVisible(true);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // لون الحدود
        g.setColor(Color.BLACK);
        
        // القاعدة
        g.drawRect(150, 400, 100, 15);

        //ساقين الاباجورة 
        g.drawLine(195, 335, 180, 400); // الشمال
        g.drawLine(205, 335, 220, 400); // اليمين

        // جسم الاباجورة
        g.drawLine(150, 220, 130, 320); // الجنب الشمال
        g.drawLine(250, 220, 270, 320); // الجنب اليمين
        g.drawArc(130, 310, 140, 25, 0, -180); // القوس السفلي

        // راس الاباجورة
        g.setColor(new Color(255, 255, 153));
        g.fillOval(150, 200, 100, 35);

        // حدود راس الاباجورة
        g.setColor(Color.BLACK);
        g.drawOval(150, 200, 100, 35);

        // جسم الاباجورة
        g.setColor(new Color(255, 255, 153));
        g.fillOval(180, 250, 40, 70); // فالنص
        g.fillOval(145, 260, 30, 40); // فالشمال
        g.fillOval(225, 260, 30, 40); // فاليمين

        // حدود جسم الاباجورة
        g.setColor(Color.BLACK);
        g.drawOval(180, 250, 40, 70); // فالنص
        g.drawOval(145, 260, 30, 40); // فالشمال
        g.drawOval(225, 260, 30, 40); // فاليمين
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
