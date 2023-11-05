package com.mycompany.psjava17;
/**
 * Luis Fernando Cespedes Garcia
 * Proposito: Resolver la condicion de pago de una persona
 */
import javax.swing.JOptionPane;
public class PsJava17 {
    public static void main(String[] args) {
        int T1;
        int T2;
        T1=Integer.parseInt(JOptionPane.showInputDialog("¿Tiene seguro medico? \n1.-Si \n2.-No"));
        T2=Integer.parseInt(JOptionPane.showInputDialog("¿Tiene seguro social? \n1.-Si \n2.-No"));
        if (T1==1&&T2==1){
            JOptionPane.showMessageDialog(null,"No necesita pagar nada");}
        else if (T1==1&&T2==2){
            JOptionPane.showMessageDialog(null,"Paga el 30%");}
        else if (T1==2&&T2==1){
            JOptionPane.showMessageDialog(null,"Paga el 60%");}
        else if (T1==2&&T2==2){
            JOptionPane.showMessageDialog(null,"Paga todo");}        
    }
    }
