
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VIJAY KRISHAN PANDEY
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    Vector<Submissionss> vect;
    String arr[][];
    JFrame fr;JComboBox<String> jComboBox1 ;
    JLabel jLabel4,sign,points,mem,lang,time;
    JTextField jTextField1,jTextField2,jTextField3,jTextField4;
    String sw="";
    String arr2[];
    ImageIcon im[];
    public View(JFrame jframe,Vector<Submissionss> v) throws IOException {
        initComponents();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        vect=new Vector(v);
        im=new ImageIcon[6];
        im[1]=new ImageIcon("Images/ce.jpg");
        im[2]=new ImageIcon("Imsges/tle.jpg");
        im[3]=new ImageIcon("Images/re.jpg");
        im[4]=new ImageIcon("Images/wa.jpg");
        im[5]=new ImageIcon("Imsges/ac.jpg");
        System.out.println(vect.size());
        fr=jframe;
        int size=vect.size();
        arr=new String[size][6];
        JLabel codechefLogo = new javax.swing.JLabel();
        JButton soluchan = new javax.swing.JButton();
        soluchan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    soluchanActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        sign = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        points = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        time = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        mem = new javax.swing.JLabel();
        lang = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        soluchan.setText("View Solution");

        sign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sign.setText("Status");

        
        
        URL url=new URL("https://s3.amazonaws.com/codechef_shared/sites/all/themes/abessive/logo.png");
        Image image=ImageIO.read(url);
        ImageIcon img=new ImageIcon(image);
        codechefLogo.setIcon(img);
        points.setHorizontalAlignment(SwingConstants.CENTER);
        time.setHorizontalAlignment(SwingConstants.CENTER);
        mem.setHorizontalAlignment(SwingConstants.CENTER);
        lang.setHorizontalAlignment(SwingConstants.CENTER);
        points.setText("Points");
        time.setText("Time");
        mem.setText("Memory");
        lang.setText("Language");
        soluchan.setText("View Solution");
        System.out.println("hiiiiii");
        int f=0;
        arr2=new String[v.size()];
        for(Submissionss i:vect){
        //  i.print();
        //  System.out.println(i.id);
          arr2[f]=i.id;
          arr[f][0]=i.id;
          arr[f][1]=i.score;
          arr[f][2]=i.time;
          arr[f][3]=i.memory;
          arr[f][4]=i.language;
          arr[f][5]=i.flag;
          f++;
           
        }
        System.out.println("start");
        for(int i=0;i<vect.size();i++){
            for(int j=0;j<6;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("end");
        jComboBox1 = new javax.swing.JComboBox<String>(arr2);
        
        jComboBox1.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                try {     
                    jComboBox1ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(codechefLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sign, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(points, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mem, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(lang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(soluchan, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(codechefLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sign, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(points, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soluchan))
                .addGap(61, 61, 61))
        );

        setVisible(true);
        System.out.println("vijay");
        jLabel4.setIcon(decider(arr[0][5]));
        jTextField1.setText(arr[0][1]);
        sw=arr[0][0];
        jTextField2.setText(arr[0][2]);
        jTextField3.setText(arr[0][3]);
        jTextField4.setText(arr[0][4]);
        System.out.println("vijay end");
        pack();
    }
 ImageIcon decider(String st) throws MalformedURLException, IOException{
     if(st.equals("1"))
         return new ImageIcon("Images/ce.jpg");
     else if(st.equals("2"))
         return new ImageIcon("Images/tle.jpg");
     else if(st.equals("3"))
          return new ImageIcon("Images/re.jpg");
     else if(st.equals("4"))
         return new ImageIcon("Images/wa.jpg");
     else if(st.equals("5"))
         return new ImageIcon("Images/ac.jpg");
     else
     {
         System.out.println("ka ho gaya");
         return null;
     }
 }
 
 public void  soluchanActionPerformed(java.awt.event.ActionEvent evt) throws IOException{
     String url33="https://www.codechef.com/viewplaintext/"+ sw;
     Document document=Jsoup.connect(url33).get();
     TextBro obj=new TextBro(this,document.select("pre").first().text());
 }
 
 public void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException{
     String str2=(String) jComboBox1.getSelectedItem();
     System.out.println(str2);
     sw=str2;
     int c=-1;
     for(int i=0;i<arr2.length;i++){
         if(arr2[i].equals(str2)){
            
        c=i;
        break;
         }
     }
     System.out.println("xbjbvdjv"+" "+c);
        jLabel4.setIcon(decider(arr[c][5]));
        jTextField1.setText(arr[c][1]);
        jTextField2.setText(arr[c][2]);
        jTextField3.setText(arr[c][3]);
        jTextField4.setText(arr[c][4]);
 }
    /**
     * This Smethod is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor..
     */
  /*  @SuppressWarnings("unchecked")
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
*/private void initComponents(){
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
}
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
