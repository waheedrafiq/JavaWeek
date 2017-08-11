/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author waheedrafiq
 */
public class JavaGUI extends JApplet {
    
    private static final int JFXPANEL_WIDTH_INT = 300;
    private static final int JFXPANEL_HEIGHT_INT = 250;
    private static JFXPanel fxContainer;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e) {
                }
                
                JFrame frame = new JFrame("Rafiq Java GUI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                JApplet applet = new JavaGUI();
                applet.init();
                
                frame.setContentPane(applet.getContentPane());
                
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
                applet.start();
            }
        });
    }
    
    @Override
    public void init() {
        fxContainer = new JFXPanel();
        fxContainer.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
   
      
        add(fxContainer, BorderLayout.CENTER); 
       
        // create JavaFX scene
        Platform.runLater(new Runnable() {
            
            @Override
            public void run() {
                createScene();
            }
        });
    }
    
    private void createScene() {
        Button btn = new Button();
        btn.setText("Say 'Hi Waheed '");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            // here is how you call upon the Jpanel form 
            @Override
            public void handle(ActionEvent event) {
                
                System.out.println("calling the fourm.... ");
                // create a new object  c
                Container c = getContentPane();
                // remove anything that should not be there 
                c.removeAll();
                // create a new object from class JPanel form 
                
                nJanePannel n = new nJanePannel();
                // set the boundaries ie Width , Height , postion X and Y 
                n.setBounds(200,200,600,600);
                // make is Visble 
                n.setVisible(true);
                // add the component JPanel to the form 
                n.add(n);
              
               int num1 = 786;
               short myShort = 847;
               long myLong = 9453;
               double  myDouble = 33.45;
               
               float myf = 33.45f;
               
               char myChar ='W';
               
               byte myByte = 127;
               
               System.out.println(num1);
               System.out.println(myShort);
               System.out.println(myLong);
               System.out.println(myDouble);
               System.out.println(myf);
               System.out.println(myChar);
               System.out.println(myByte);
                 
               
                
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        fxContainer.setScene(new Scene(root));
    }
    
}
