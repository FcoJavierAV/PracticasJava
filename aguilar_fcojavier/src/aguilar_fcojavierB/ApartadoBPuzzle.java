/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aguilar_fcojavierB;
//Importamos las herramientas necesarias para nuestro codigo.
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Javi.OH
 */
public class ApartadoBPuzzle extends javax.swing.JFrame {

    /**
     * Creates new form ApartadoBPuzzle
     */
    Color ENCENDIDO = new Color(255, 255, 0); //Color para cuando la bombilla esta encendida
    Color APAGADO = new Color(192, 192, 192); //Color para cuando la bombilla esta apagada

    public ApartadoBPuzzle() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bombilla1 = new javax.swing.JToggleButton();
        Bombilla2 = new javax.swing.JToggleButton();
        Bombilla3 = new javax.swing.JToggleButton();
        Bombilla4 = new javax.swing.JToggleButton();
        Bombilla5 = new javax.swing.JToggleButton();
        Bombilla6 = new javax.swing.JToggleButton();
        Bombilla7 = new javax.swing.JToggleButton();
        VolverEmpezar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(960, 500));

        Bombilla1.setBackground(new java.awt.Color(192, 192, 192));
        Bombilla1.setMaximumSize(new java.awt.Dimension(100, 100));
        Bombilla1.setMinimumSize(new java.awt.Dimension(100, 100));
        Bombilla1.setPreferredSize(new java.awt.Dimension(100, 100));
        Bombilla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bombilla1ActionPerformed(evt);
            }
        });
        jPanel1.add(Bombilla1);

        Bombilla2.setBackground(new java.awt.Color(192, 192, 192));
        Bombilla2.setMaximumSize(new java.awt.Dimension(100, 100));
        Bombilla2.setMinimumSize(new java.awt.Dimension(100, 100));
        Bombilla2.setPreferredSize(new java.awt.Dimension(100, 100));
        Bombilla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bombilla2ActionPerformed(evt);
            }
        });
        jPanel1.add(Bombilla2);

        Bombilla3.setBackground(new java.awt.Color(192, 192, 192));
        Bombilla3.setMaximumSize(new java.awt.Dimension(100, 100));
        Bombilla3.setMinimumSize(new java.awt.Dimension(100, 100));
        Bombilla3.setPreferredSize(new java.awt.Dimension(100, 100));
        Bombilla3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bombilla3ActionPerformed(evt);
            }
        });
        jPanel1.add(Bombilla3);

        Bombilla4.setBackground(new java.awt.Color(192, 192, 192));
        Bombilla4.setMaximumSize(new java.awt.Dimension(100, 100));
        Bombilla4.setMinimumSize(new java.awt.Dimension(100, 100));
        Bombilla4.setPreferredSize(new java.awt.Dimension(100, 100));
        Bombilla4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bombilla4ActionPerformed(evt);
            }
        });
        jPanel1.add(Bombilla4);

        Bombilla5.setBackground(new java.awt.Color(192, 192, 192));
        Bombilla5.setMaximumSize(new java.awt.Dimension(100, 100));
        Bombilla5.setMinimumSize(new java.awt.Dimension(100, 100));
        Bombilla5.setPreferredSize(new java.awt.Dimension(100, 100));
        Bombilla5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bombilla5ActionPerformed(evt);
            }
        });
        jPanel1.add(Bombilla5);

        Bombilla6.setBackground(new java.awt.Color(192, 192, 192));
        Bombilla6.setMaximumSize(new java.awt.Dimension(100, 100));
        Bombilla6.setMinimumSize(new java.awt.Dimension(100, 100));
        Bombilla6.setPreferredSize(new java.awt.Dimension(100, 100));
        Bombilla6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bombilla6ActionPerformed(evt);
            }
        });
        jPanel1.add(Bombilla6);

        Bombilla7.setBackground(new java.awt.Color(192, 192, 192));
        Bombilla7.setMaximumSize(new java.awt.Dimension(100, 100));
        Bombilla7.setMinimumSize(new java.awt.Dimension(100, 100));
        Bombilla7.setPreferredSize(new java.awt.Dimension(100, 100));
        Bombilla7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bombilla7ActionPerformed(evt);
            }
        });
        jPanel1.add(Bombilla7);

        VolverEmpezar.setText("Volver a Empezar");
        VolverEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverEmpezarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(VolverEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(VolverEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bombilla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bombilla1ActionPerformed
        //Con la sentencia if else controlamos que el usuario pulse la primera bombilla.
        if (Bombilla1.isSelected()) {
            Bombilla1.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla2.setSelected(!Bombilla2.isSelected());
            //Con la sentencia if else controlamos que el usuario pulse la segunda bombilla.
            if (Bombilla2.isSelected()) {
                Bombilla2.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla2.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
        } else {
            Bombilla1.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla2.setSelected(!Bombilla2.isSelected());
            //Con la sentencia if else controlamos que el usuario pulse la primera bombilla.
            if (Bombilla2.isSelected()) {
                Bombilla2.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla2.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
        }
        //if que controla la victoria, se muestra un mensaje al usuario en caso de que cumpla su objetivo. Posteriormente reseteamos las bombillas a apagadas.
        if (Bombilla1.isSelected() && Bombilla2.isSelected() && Bombilla3.isSelected() && Bombilla4.isSelected()
                && Bombilla5.isSelected() && Bombilla6.isSelected() && Bombilla7.isSelected()) {
            JOptionPane.showMessageDialog(this, "¡¡¡Felicidades has ganado!!!");
            //APAGAMOS TODAS LAS BOMBILLAS
            Bombilla1.setSelected(false);
            Bombilla2.setSelected(false);
            Bombilla3.setSelected(false);
            Bombilla4.setSelected(false);
            Bombilla5.setSelected(false);
            Bombilla6.setSelected(false);
            Bombilla7.setSelected(false);
            //CONFIGURAMOS EL COLOR DE APAGADO QUE ES GRIS EN ESTE CASO
            Bombilla1.setBackground(this.APAGADO);
            Bombilla2.setBackground(this.APAGADO);
            Bombilla3.setBackground(this.APAGADO);
            Bombilla4.setBackground(this.APAGADO);
            Bombilla5.setBackground(this.APAGADO);
            Bombilla6.setBackground(this.APAGADO);
            Bombilla7.setBackground(this.APAGADO);
        }
    }//GEN-LAST:event_Bombilla1ActionPerformed

    private void Bombilla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bombilla2ActionPerformed
        //Con la sentencia if else controlamos que el usuario pulse la primera bombilla.
        if (Bombilla2.isSelected()) {
            Bombilla2.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla1.setSelected(!Bombilla1.isSelected());
            //Con la sentencia if else controlamos que el usuario pulse la primera bombilla.
            if (Bombilla1.isSelected()) {
                Bombilla1.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla1.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
            Bombilla3.setSelected(!Bombilla3.isSelected());
            if (Bombilla3.isSelected()) {
                Bombilla3.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla3.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }

        } else {
            Bombilla2.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla1.setSelected(!Bombilla1.isSelected());
            //Con la sentencia if else controlamos que el usuario pulse la primera bombilla.
            if (Bombilla1.isSelected()) {
                Bombilla1.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla1.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
            Bombilla3.setSelected(!Bombilla3.isSelected());
            if (Bombilla3.isSelected()) {
                Bombilla3.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla3.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }

        }
        //if que controla la victoria, se muestra un mensaje al usuario en caso de que cumpla su objetivo. Posteriormente reseteamos las bombillas a apagadas.
        if (Bombilla1.isSelected() && Bombilla2.isSelected() && Bombilla3.isSelected() && Bombilla4.isSelected()
                && Bombilla5.isSelected() && Bombilla6.isSelected() && Bombilla7.isSelected()) {
            JOptionPane.showMessageDialog(this, "¡¡¡Felicidades has ganado!!!");
            //APAGAMOS TODAS LAS BOMBILLAS
            Bombilla1.setSelected(false);
            Bombilla2.setSelected(false);
            Bombilla3.setSelected(false);
            Bombilla4.setSelected(false);
            Bombilla5.setSelected(false);
            Bombilla6.setSelected(false);
            Bombilla7.setSelected(false);
            //CONFIGURAMOS EL COLOR DE APAGADO QUE ES GRIS EN ESTE CASO
            Bombilla1.setBackground(this.APAGADO);
            Bombilla2.setBackground(this.APAGADO);
            Bombilla3.setBackground(this.APAGADO);
            Bombilla4.setBackground(this.APAGADO);
            Bombilla5.setBackground(this.APAGADO);
            Bombilla6.setBackground(this.APAGADO);
            Bombilla7.setBackground(this.APAGADO);
        }
    }//GEN-LAST:event_Bombilla2ActionPerformed

    private void Bombilla3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bombilla3ActionPerformed
        if (Bombilla3.isSelected()) {
            Bombilla3.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla2.setSelected(!Bombilla2.isSelected());
            //Con la sentencia if else controlamos que el usuario pulse la segunda bombilla.
            if (Bombilla2.isSelected()) {
                Bombilla2.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla2.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
            Bombilla4.setSelected(!Bombilla4.isSelected());
            if (Bombilla4.isSelected()) {
                Bombilla4.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla4.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
        } else {
            Bombilla3.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla2.setSelected(!Bombilla2.isSelected());
            //Con la sentencia if else controlamos que el usuario pulse la segunda bombilla.
            if (Bombilla2.isSelected()) {
                Bombilla2.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla2.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
            Bombilla4.setSelected(!Bombilla4.isSelected());
            if (Bombilla4.isSelected()) {
                Bombilla4.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla4.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
        }
        //if que controla la victoria, se muestra un mensaje al usuario en caso de que cumpla su objetivo. Posteriormente reseteamos las bombillas a apagadas.
        if (Bombilla1.isSelected() && Bombilla2.isSelected() && Bombilla3.isSelected() && Bombilla4.isSelected()
                && Bombilla5.isSelected() && Bombilla6.isSelected() && Bombilla7.isSelected()) {
            JOptionPane.showMessageDialog(this, "¡¡¡Felicidades has ganado!!!");
            //APAGAMOS TODAS LAS BOMBILLAS
            Bombilla1.setSelected(false);
            Bombilla2.setSelected(false);
            Bombilla3.setSelected(false);
            Bombilla4.setSelected(false);
            Bombilla5.setSelected(false);
            Bombilla6.setSelected(false);
            Bombilla7.setSelected(false);
            //CONFIGURAMOS EL COLOR DE APAGADO QUE ES GRIS EN ESTE CASO
            Bombilla1.setBackground(this.APAGADO);
            Bombilla2.setBackground(this.APAGADO);
            Bombilla3.setBackground(this.APAGADO);
            Bombilla4.setBackground(this.APAGADO);
            Bombilla5.setBackground(this.APAGADO);
            Bombilla6.setBackground(this.APAGADO);
            Bombilla7.setBackground(this.APAGADO);
        }
    }//GEN-LAST:event_Bombilla3ActionPerformed

    private void Bombilla4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bombilla4ActionPerformed
        if (Bombilla4.isSelected()) {
            Bombilla4.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla3.setSelected(!Bombilla3.isSelected());
            if (Bombilla3.isSelected()) {
                Bombilla3.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla3.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
            Bombilla5.setSelected(!Bombilla5.isSelected());
            if (Bombilla5.isSelected()) {
                Bombilla5.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla5.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
        } else {
            Bombilla4.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla3.setSelected(!Bombilla3.isSelected());
            if (Bombilla3.isSelected()) {
                Bombilla3.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla3.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
            Bombilla5.setSelected(!Bombilla5.isSelected());
            if (Bombilla5.isSelected()) {
                Bombilla5.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla5.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
        }
        //if que controla la victoria, se muestra un mensaje al usuario en caso de que cumpla su objetivo. Posteriormente reseteamos las bombillas a apagadas.
        if (Bombilla1.isSelected() && Bombilla2.isSelected() && Bombilla3.isSelected() && Bombilla4.isSelected()
                && Bombilla5.isSelected() && Bombilla6.isSelected() && Bombilla7.isSelected()) {
            JOptionPane.showMessageDialog(this, "¡¡¡Felicidades has ganado!!!");
            //APAGAMOS TODAS LAS BOMBILLAS
            Bombilla1.setSelected(false);
            Bombilla2.setSelected(false);
            Bombilla3.setSelected(false);
            Bombilla4.setSelected(false);
            Bombilla5.setSelected(false);
            Bombilla6.setSelected(false);
            Bombilla7.setSelected(false);
            //CONFIGURAMOS EL COLOR DE APAGADO QUE ES GRIS EN ESTE CASO
            Bombilla1.setBackground(this.APAGADO);
            Bombilla2.setBackground(this.APAGADO);
            Bombilla3.setBackground(this.APAGADO);
            Bombilla4.setBackground(this.APAGADO);
            Bombilla5.setBackground(this.APAGADO);
            Bombilla6.setBackground(this.APAGADO);
            Bombilla7.setBackground(this.APAGADO);
        }
    }//GEN-LAST:event_Bombilla4ActionPerformed

    private void Bombilla5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bombilla5ActionPerformed
        if (Bombilla5.isSelected()) {
            Bombilla5.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla6.setSelected(!Bombilla6.isSelected());
            if (Bombilla6.isSelected()) {
                Bombilla6.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla6.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
            Bombilla4.setSelected(!Bombilla4.isSelected());
            if (Bombilla4.isSelected()) {
                Bombilla4.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla4.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
            
        } else {
            Bombilla5.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla6.setSelected(!Bombilla6.isSelected());
            if (Bombilla6.isSelected()) {
                Bombilla6.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla6.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
            Bombilla4.setSelected(!Bombilla4.isSelected());
            if (Bombilla4.isSelected()) {
                Bombilla4.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla4.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
        }
        //if que controla la victoria, se muestra un mensaje al usuario en caso de que cumpla su objetivo. Posteriormente reseteamos las bombillas a apagadas.
        if (Bombilla1.isSelected() && Bombilla2.isSelected() && Bombilla3.isSelected() && Bombilla4.isSelected()
                && Bombilla5.isSelected() && Bombilla6.isSelected() && Bombilla7.isSelected()) {
            JOptionPane.showMessageDialog(this, "¡¡¡Felicidades has ganado!!!");
            //APAGAMOS TODAS LAS BOMBILLAS
            Bombilla1.setSelected(false);
            Bombilla2.setSelected(false);
            Bombilla3.setSelected(false);
            Bombilla4.setSelected(false);
            Bombilla5.setSelected(false);
            Bombilla6.setSelected(false);
            Bombilla7.setSelected(false);
            //CONFIGURAMOS EL COLOR DE APAGADO QUE ES GRIS EN ESTE CASO
            Bombilla1.setBackground(this.APAGADO);
            Bombilla2.setBackground(this.APAGADO);
            Bombilla3.setBackground(this.APAGADO);
            Bombilla4.setBackground(this.APAGADO);
            Bombilla5.setBackground(this.APAGADO);
            Bombilla6.setBackground(this.APAGADO);
            Bombilla7.setBackground(this.APAGADO);
        }
    }//GEN-LAST:event_Bombilla5ActionPerformed

    private void Bombilla6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bombilla6ActionPerformed
        if (Bombilla6.isSelected()) {
            Bombilla6.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla5.setSelected(!Bombilla5.isSelected());
            if (Bombilla5.isSelected()) {
                Bombilla5.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla5.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
            Bombilla7.setSelected(!Bombilla7.isSelected());
            if (Bombilla7.isSelected()) {
                Bombilla7.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla7.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
        } else {
            Bombilla6.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla5.setSelected(!Bombilla5.isSelected());
            if (Bombilla5.isSelected()) {
                Bombilla5.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla5.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
            Bombilla7.setSelected(!Bombilla7.isSelected());
            if (Bombilla7.isSelected()) {
                Bombilla7.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla7.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
        }
        //if que controla la victoria, se muestra un mensaje al usuario en caso de que cumpla su objetivo. Posteriormente reseteamos las bombillas a apagadas.
        if (Bombilla1.isSelected() && Bombilla2.isSelected() && Bombilla3.isSelected() && Bombilla4.isSelected()
                && Bombilla5.isSelected() && Bombilla6.isSelected() && Bombilla7.isSelected()) {
            JOptionPane.showMessageDialog(this, "¡¡¡Felicidades has ganado!!!");
            //APAGAMOS TODAS LAS BOMBILLAS
            Bombilla1.setSelected(false);
            Bombilla2.setSelected(false);
            Bombilla3.setSelected(false);
            Bombilla4.setSelected(false);
            Bombilla5.setSelected(false);
            Bombilla6.setSelected(false);
            Bombilla7.setSelected(false);
            //CONFIGURAMOS EL COLOR DE APAGADO QUE ES GRIS EN ESTE CASO
            Bombilla1.setBackground(this.APAGADO);
            Bombilla2.setBackground(this.APAGADO);
            Bombilla3.setBackground(this.APAGADO);
            Bombilla4.setBackground(this.APAGADO);
            Bombilla5.setBackground(this.APAGADO);
            Bombilla6.setBackground(this.APAGADO);
            Bombilla7.setBackground(this.APAGADO);
        }
    }//GEN-LAST:event_Bombilla6ActionPerformed

    private void Bombilla7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bombilla7ActionPerformed
        if (Bombilla7.isSelected()) {
            Bombilla7.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla6.setSelected(!Bombilla6.isSelected());
            if (Bombilla6.isSelected()) {
                Bombilla6.setBackground(this.ENCENDIDO);// Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla6.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
        } else {
            Bombilla7.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            Bombilla6.setSelected(!Bombilla6.isSelected());
            if (Bombilla6.isSelected()) {
                Bombilla6.setBackground(this.ENCENDIDO); // Modificamos el color de la bombilla en funcion del su estado.
            } else {
                Bombilla6.setBackground(this.APAGADO); // Modificamos el color de la bombilla en funcion del su estado.
            }
        }
        //if que controla la victoria, se muestra un mensaje al usuario en caso de que cumpla su objetivo. Posteriormente reseteamos las bombillas a apagadas.
        if (Bombilla1.isSelected() && Bombilla2.isSelected() && Bombilla3.isSelected() && Bombilla4.isSelected()
                && Bombilla5.isSelected() && Bombilla6.isSelected() && Bombilla7.isSelected()) {
            JOptionPane.showMessageDialog(this, "¡¡¡Felicidades has ganado!!!");
            Bombilla1.setSelected(false);
            Bombilla2.setSelected(false);
            Bombilla3.setSelected(false);
            Bombilla4.setSelected(false);
            Bombilla5.setSelected(false);
            Bombilla6.setSelected(false);
            Bombilla7.setSelected(false);
            //CONFIGURAMOS EL COLOR DE APAGADO QUE ES GRIS EN ESTE CASO
            Bombilla1.setBackground(this.APAGADO);
            Bombilla2.setBackground(this.APAGADO);
            Bombilla3.setBackground(this.APAGADO);
            Bombilla4.setBackground(this.APAGADO);
            Bombilla5.setBackground(this.APAGADO);
            Bombilla6.setBackground(this.APAGADO);
            Bombilla7.setBackground(this.APAGADO);
        }
    }//GEN-LAST:event_Bombilla7ActionPerformed

    private void VolverEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverEmpezarActionPerformed
        if (VolverEmpezar.isSelected()) {
            //APAGAMOS TODAS LAS BOMBILLAS
            Bombilla1.setSelected(false);
            Bombilla2.setSelected(false);
            Bombilla3.setSelected(false);
            Bombilla4.setSelected(false);
            Bombilla5.setSelected(false);
            Bombilla6.setSelected(false);
            Bombilla7.setSelected(false);
            VolverEmpezar.setSelected(false);
            //CONFIGURAMOS EL COLOR DE APAGADO QUE ES GRIS EN ESTE CASO
            Bombilla1.setBackground(this.APAGADO);
            Bombilla2.setBackground(this.APAGADO);
            Bombilla3.setBackground(this.APAGADO);
            Bombilla4.setBackground(this.APAGADO);
            Bombilla5.setBackground(this.APAGADO);
            Bombilla6.setBackground(this.APAGADO);
            Bombilla7.setBackground(this.APAGADO);
        }
    }//GEN-LAST:event_VolverEmpezarActionPerformed

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
            java.util.logging.Logger.getLogger(ApartadoBPuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApartadoBPuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApartadoBPuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApartadoBPuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApartadoBPuzzle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Bombilla1;
    private javax.swing.JToggleButton Bombilla2;
    private javax.swing.JToggleButton Bombilla3;
    private javax.swing.JToggleButton Bombilla4;
    private javax.swing.JToggleButton Bombilla5;
    private javax.swing.JToggleButton Bombilla6;
    private javax.swing.JToggleButton Bombilla7;
    private javax.swing.JToggleButton VolverEmpezar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
