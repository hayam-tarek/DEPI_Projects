/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PaintBrush;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;

/**
 *
 * @author hayam tarek
 */
public class PaintBrush extends JFrame {

    private DrawingPanel drawingPanel;
    private String currentMode = "Line";
    private boolean isSolid = false;
    private boolean isDotted = false;
    private Color currentColor = Color.BLACK;
    private int strokeWidth = 5;

    /**
     * Creates new form PaintBrush
     */
    public PaintBrush() {
        initComponents();
        drawingPanel = new DrawingPanel();
        PaintBrushBody.setLayout(new BorderLayout());
        PaintBrushBody.add(drawingPanel, BorderLayout.CENTER);
        ImageIcon originalIcon = new ImageIcon("assets/color-wheel.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        chooseColor.setIcon(scaledIcon);
        chooseColor.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        functionsLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        paintModeLabel = new javax.swing.JLabel();
        lineButton = new javax.swing.JButton();
        rectangleButton = new javax.swing.JButton();
        ovalButton = new javax.swing.JButton();
        pencliButton = new javax.swing.JButton();
        eraserButton = new javax.swing.JButton();
        solidCheckBox = new javax.swing.JCheckBox();
        dottedCheckBox = new javax.swing.JCheckBox();
        colorsLabel = new javax.swing.JLabel();
        blackButton = new javax.swing.JButton();
        redButton = new javax.swing.JButton();
        greenbutton = new javax.swing.JButton();
        blueButton = new javax.swing.JButton();
        PaintBrushBody = new javax.swing.JPanel();
        fontSlider = new javax.swing.JSlider();
        Separator = new javax.swing.JSeparator();
        chooseColor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint Brush");
        setBackground(new java.awt.Color(255, 255, 255));

        functionsLabel.setText("Functions:");

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        undoButton.setText("Undo");
        undoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoButtonActionPerformed(evt);
            }
        });

        paintModeLabel.setText("Paint mode:");

        lineButton.setText("Line");
        lineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineButtonActionPerformed(evt);
            }
        });

        rectangleButton.setText("Rectangle");
        rectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleButtonActionPerformed(evt);
            }
        });

        ovalButton.setText("Oval");
        ovalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovalButtonActionPerformed(evt);
            }
        });

        pencliButton.setText("Pencil");
        pencliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencliButtonActionPerformed(evt);
            }
        });

        eraserButton.setText("Eraser");
        eraserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraserButtonActionPerformed(evt);
            }
        });

        solidCheckBox.setText("Solid");
        solidCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solidCheckBoxActionPerformed(evt);
            }
        });

        dottedCheckBox.setText("Dotted");
        dottedCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dottedCheckBoxActionPerformed(evt);
            }
        });

        colorsLabel.setText("Colors:");

        blackButton.setBackground(new java.awt.Color(0, 0, 0));
        blackButton.setForeground(new java.awt.Color(255, 255, 255));
        blackButton.setBorderPainted(false);
        blackButton.setLabel(" ");
        blackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackButtonActionPerformed(evt);
            }
        });

        redButton.setBackground(new java.awt.Color(255, 0, 0));
        redButton.setForeground(new java.awt.Color(255, 255, 255));
        redButton.setBorderPainted(false);
        redButton.setLabel(" ");
        redButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redButtonActionPerformed(evt);
            }
        });

        greenbutton.setBackground(new java.awt.Color(0, 255, 0));
        greenbutton.setForeground(new java.awt.Color(255, 255, 255));
        greenbutton.setBorderPainted(false);
        greenbutton.setLabel(" ");
        greenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenbuttonActionPerformed(evt);
            }
        });

        blueButton.setBackground(new java.awt.Color(0, 0, 255));
        blueButton.setForeground(new java.awt.Color(255, 255, 255));
        blueButton.setText(" ");
        blueButton.setBorderPainted(false);
        blueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueButtonActionPerformed(evt);
            }
        });

        PaintBrushBody.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PaintBrushBodyLayout = new javax.swing.GroupLayout(PaintBrushBody);
        PaintBrushBody.setLayout(PaintBrushBodyLayout);
        PaintBrushBodyLayout.setHorizontalGroup(
            PaintBrushBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PaintBrushBodyLayout.setVerticalGroup(
            PaintBrushBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );

        fontSlider.setMajorTickSpacing(2);
        fontSlider.setMaximum(10);
        fontSlider.setMinorTickSpacing(1);
        fontSlider.setPaintLabels(true);
        fontSlider.setPaintTicks(true);
        fontSlider.setValue(5);
        fontSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fontSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fontSliderStateChanged(evt);
            }
        });

        chooseColor.setForeground(new java.awt.Color(60, 63, 65));
        chooseColor.setBorderPainted(false);
        chooseColor.setContentAreaFilled(false);
        chooseColor.setFocusPainted(false);
        chooseColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(functionsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(undoButton)
                        .addGap(18, 18, 18)
                        .addComponent(paintModeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lineButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rectangleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ovalButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pencliButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eraserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(solidCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dottedCheckBox))
                            .addComponent(fontSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(colorsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(greenbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(blueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(blackButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(redButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooseColor)
                        .addGap(0, 246, Short.MAX_VALUE))
                    .addComponent(Separator)
                    .addComponent(PaintBrushBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearButton)
                            .addComponent(functionsLabel)
                            .addComponent(undoButton)
                            .addComponent(paintModeLabel)
                            .addComponent(lineButton)
                            .addComponent(rectangleButton)
                            .addComponent(ovalButton)
                            .addComponent(pencliButton)
                            .addComponent(eraserButton)
                            .addComponent(solidCheckBox)
                            .addComponent(dottedCheckBox)
                            .addComponent(colorsLabel)
                            .addComponent(blackButton)
                            .addComponent(redButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fontSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(greenbutton)
                                .addComponent(blueButton))))
                    .addComponent(chooseColor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PaintBrushBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        drawingPanel.clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void undoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoButtonActionPerformed
        // TODO add your handling code here:
        drawingPanel.undo();
    }//GEN-LAST:event_undoButtonActionPerformed

    private void greenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenbuttonActionPerformed
        // TODO add your handling code here:
        currentColor = Color.GREEN;
        drawingPanel.setCurrentColor(currentColor);
    }//GEN-LAST:event_greenbuttonActionPerformed

    private void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineButtonActionPerformed
        // TODO add your handling code here:
        currentMode = "Line";
        drawingPanel.setCurrentMode(currentMode);
    }//GEN-LAST:event_lineButtonActionPerformed

    private void rectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleButtonActionPerformed
        // TODO add your handling code here:
        currentMode = "Rectangle";
        drawingPanel.setCurrentMode(currentMode);
    }//GEN-LAST:event_rectangleButtonActionPerformed

    private void ovalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovalButtonActionPerformed
        // TODO add your handling code here:
        currentMode = "Oval";
        drawingPanel.setCurrentMode(currentMode);
    }//GEN-LAST:event_ovalButtonActionPerformed

    private void pencliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencliButtonActionPerformed
        // TODO add your handling code here:
        currentMode = "Pencil";
        drawingPanel.setCurrentMode(currentMode);
    }//GEN-LAST:event_pencliButtonActionPerformed

    private void eraserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraserButtonActionPerformed
        // TODO add your handling code here:
        currentMode = "Eraser";
        drawingPanel.setCurrentMode(currentMode);
    }//GEN-LAST:event_eraserButtonActionPerformed

    private void solidCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solidCheckBoxActionPerformed
        // TODO add your handling code here:
        isSolid = !isSolid;
        drawingPanel.setSolid(isSolid);
    }//GEN-LAST:event_solidCheckBoxActionPerformed

    private void dottedCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dottedCheckBoxActionPerformed
        // TODO add your handling code here:
        isDotted = !isDotted;
        drawingPanel.setDotted(isDotted);
    }//GEN-LAST:event_dottedCheckBoxActionPerformed

    private void blackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackButtonActionPerformed
        // TODO add your handling code here:
        currentColor = Color.BLACK;
        drawingPanel.setCurrentColor(currentColor);
    }//GEN-LAST:event_blackButtonActionPerformed

    private void redButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtonActionPerformed
        // TODO add your handling code here:
        currentColor = Color.RED;
        drawingPanel.setCurrentColor(currentColor);
    }//GEN-LAST:event_redButtonActionPerformed

    private void blueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButtonActionPerformed
        // TODO add your handling code here:
        currentColor = Color.BLUE;
        drawingPanel.setCurrentColor(currentColor);
    }//GEN-LAST:event_blueButtonActionPerformed

    private void fontSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fontSliderStateChanged
        // TODO add your handling code here:
        strokeWidth = fontSlider.getValue();
        drawingPanel.setStrokeWidth(strokeWidth);
    }//GEN-LAST:event_fontSliderStateChanged

    private void chooseColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseColorActionPerformed
        // TODO add your handling code here:
        Color selectedColor = JColorChooser.showDialog(this, "Choose a Color", currentColor);
        if (selectedColor != null) {
            currentColor = selectedColor;
            drawingPanel.setCurrentColor(currentColor);
        }
    }//GEN-LAST:event_chooseColorActionPerformed

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
            java.util.logging.Logger.getLogger(PaintBrush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaintBrush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaintBrush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaintBrush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaintBrush().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaintBrushBody;
    private javax.swing.JSeparator Separator;
    private javax.swing.JButton blackButton;
    private javax.swing.JButton blueButton;
    private javax.swing.JButton chooseColor;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel colorsLabel;
    private javax.swing.JCheckBox dottedCheckBox;
    private javax.swing.JButton eraserButton;
    private javax.swing.JSlider fontSlider;
    private javax.swing.JLabel functionsLabel;
    private javax.swing.JButton greenbutton;
    private javax.swing.JButton lineButton;
    private javax.swing.JButton ovalButton;
    private javax.swing.JLabel paintModeLabel;
    private javax.swing.JButton pencliButton;
    private javax.swing.JButton rectangleButton;
    private javax.swing.JButton redButton;
    private javax.swing.JCheckBox solidCheckBox;
    private javax.swing.JButton undoButton;
    // End of variables declaration//GEN-END:variables
}
