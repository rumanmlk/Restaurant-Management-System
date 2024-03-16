/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restrauntmanagementsystem;
import javax.swing.*;

/**
 *
 * @author saadaye
 */
public class RestrauntManagementSystem {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         SwingUtilities.invokeLater(() -> {
            AdminPanel adminPanel = new AdminPanel();
            adminPanel.setVisible(true); // Set AdminPanel as the first visible panel
        });
    }
}
