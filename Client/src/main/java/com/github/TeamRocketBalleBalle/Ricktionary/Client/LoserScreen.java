package com.github.TeamRocketBalleBalle.Ricktionary.Client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;

/** @author Vatsal */
public class LoserScreen extends javax.swing.JPanel {

    private javax.swing.JLabel BackGround;

    /** Creates new form LoserScreen */
    public LoserScreen() {
        initComponents();
    }

    /** @param args the command line arguments */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoserScreen.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LoserScreen().setVisible(true));
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Looseimage;
    private javax.swing.JButton mainmenu;

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        Looseimage = new javax.swing.JLabel();
        mainmenu = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();
        JLabel jLabel3 = new JLabel();
        // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1077, 767));

        mainmenu.setText("Kyu Harr Gaye...?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGap(450, 450, 450)
                                        .addComponent(
                                                jLabel3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                250,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGroup(
                                                layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                        .LEADING)
                                                        .addGroup(
                                                                layout.createSequentialGroup()
                                                                        .addGap(463, 463, 463)
                                                                        .addComponent(
                                                                                mainmenu,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE,
                                                                                150,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE))
                                                        .addGroup(
                                                                layout.createSequentialGroup()
                                                                        .addGap(288, 288, 288)
                                                                        .addComponent(
                                                                                Looseimage,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE,
                                                                                501,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE)))
                                        .addGap(288, 288, 288)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(
                                                jLabel3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                100,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGroup(
                                                layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                        .LEADING)
                                                        .addGroup(
                                                                layout.createSequentialGroup()
                                                                        .addGap(629, 629, 629)
                                                                        .addComponent(
                                                                                mainmenu,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE,
                                                                                52,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE))
                                                        .addGroup(
                                                                layout.createSequentialGroup()
                                                                        .addGap(33, 33, 33)
                                                                        .addComponent(
                                                                                Looseimage,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE,
                                                                                500,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE)))
                                        .addGap(216, 216, 216)));
        ImageIcon icon1 = new ImageIcon("Client/src/main/resources/logogif.gif");
        Image img1 = icon1.getImage();
        Image imgscale1 = img1.getScaledInstance(1077, 767, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon1 = new ImageIcon(imgscale1);
        Rectangle rectangle = new Rectangle(1077, 767);
        BackGround.setBounds(rectangle);
        BackGround.setIcon(scaledIcon1);
        add(BackGround);

        mainmenu.addActionListener((event) -> {
            test.sceneSwitch("welcomescreen");
        });
        // pack();
    } // </editor-fold>
    // End of variables declaration
}
