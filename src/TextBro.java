import java.awt.*;
import java.awt.*;
import javax.swing.*;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VIJAY KRISHAN PANDEY
 */
class TextBro {
    
    RSyntaxTextArea syntaxTextArea = new RSyntaxTextArea(20, 60);
    TextBro(JFrame frame,String str){
        syntaxTextArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_CPLUSPLUS);
        JFrame fr=new JFrame();
               fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               fr.setSize(400,400);
               fr.setLayout(new FlowLayout());
               
        JScrollPane jScrollPane1=new JScrollPane();
        JScrollPane jScrollPane2=new JScrollPane();
         syntaxTextArea.setColumns(20);
        syntaxTextArea.setRows(5);
        jScrollPane1.setViewportView(syntaxTextArea);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(fr.getContentPane());
        fr.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
       
        fr.add(jScrollPane2);
        syntaxTextArea.setText(str);
        fr.setVisible(true);
    }
    
}
