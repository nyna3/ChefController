package com.raven.component;

import com.raven.swing.SearchText01;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.border.EmptyBorder;

public class Camp extends javax.swing.JPanel {

    

    public Camp() {
        initComponents();
        setOpaque(false);
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(5, 5, 5, 5));
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchText011 = new com.raven.swing.SearchText01();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        searchText011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchText011ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchText011, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchText011, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchText011ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchText011ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchText011ActionPerformed

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(Color.WHITE);
        super.paintComponent(grphcs);
    }
    public void clear() {
        if (searchText011 != null) {
            searchText011.setText(""); // Limpa o texto do componente interno
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.SearchText01 searchText011;
    // End of variables declaration//GEN-END:variables
}
