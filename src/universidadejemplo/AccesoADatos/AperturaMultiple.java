/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoADatos;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author bruno
 */
public class AperturaMultiple {
    public static JDesktopPane escritorio;
    
    
    public AperturaMultiple(JDesktopPane escritorio){
    AperturaMultiple.escritorio = escritorio;
}
    public void abrirInternal(JInternalFrame jInternalFrame){
                if(jInternalFrame.isVisible()){
                    jInternalFrame.toFront();
                    jInternalFrame.requestFocus();                  
                }else{                   
                    escritorio.add(jInternalFrame);
                    jInternalFrame.setVisible(true);
                    jInternalFrame.setLocation(275, 100);
                }
            }
    
}
