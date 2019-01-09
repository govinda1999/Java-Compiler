import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.io.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;

 class Editor extends javax.swing.JFrame {

    public Editor() {
        initComponents();
        text = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        t_area = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_m = new javax.swing.JMenu();
        new_i = new javax.swing.JMenuItem();
        open_i = new javax.swing.JMenuItem();
        save_i = new javax.swing.JMenuItem();
        exit_i = new javax.swing.JMenuItem();
        edit_m = new javax.swing.JMenu();
        copy_i = new javax.swing.JMenuItem();
        paste_i = new javax.swing.JMenuItem();
        cut_i = new javax.swing.JMenuItem();
        run_m = new javax.swing.JMenu();
        compile_i = new javax.swing.JMenuItem();
        view_m = new javax.swing.JMenu();
        themes_i = new javax.swing.JMenuItem();
        foreground_i = new javax.swing.JMenuItem();
        help_m = new javax.swing.JMenu();
        about_i = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 100));
        setUndecorated(true);
        setSize(new java.awt.Dimension(500, 500));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jScrollPane1.setViewportBorder(new javax.swing.border.MatteBorder(null));

        t_area.setColumns(20);
        t_area.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        t_area.setRows(5);
        t_area.setBackground(new Color(20,20,20));
        t_area.setForeground(Color.WHITE);
        t_area.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t_area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_areaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_areaKeyTyped(evt);
            }
        });
        t_area.setCaretColor(t_area.getForeground());
        jScrollPane1.setViewportView(t_area);

        file_m.setText("File");

        new_i.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        new_i.setText("New...");
        new_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_iActionPerformed(evt);
            }
        });
        file_m.add(new_i);

        open_i.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open_i.setText("Open...");
        open_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_iActionPerformed(evt);
            }
        });
        file_m.add(open_i);

        save_i.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save_i.setText("Save");
        save_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_iActionPerformed(evt);
            }
        });
        file_m.add(save_i);

        exit_i.setText("Exit...");
        exit_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_iActionPerformed(evt);
            }
        });
        file_m.add(exit_i);

        jMenuBar1.add(file_m);

        edit_m.setText("Edit");

        copy_i.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copy_i.setText("Copy");
        copy_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copy_iActionPerformed(evt);
            }
        });
        edit_m.add(copy_i);

        paste_i.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        paste_i.setText("Paste");
        paste_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paste_iActionPerformed(evt);
            }
        });
        edit_m.add(paste_i);

        cut_i.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cut_i.setText("Cut");
        cut_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cut_iActionPerformed(evt);
            }
        });
        edit_m.add(cut_i);

        jMenuBar1.add(edit_m);

        run_m.setText("Run");

        compile_i.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        compile_i.setText("Compile and Run");
        compile_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compile_iActionPerformed(evt);
            }
        });
        run_m.add(compile_i);

        jMenuBar1.add(run_m);

        view_m.setText("View");

        themes_i.setText("Background");
        themes_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themes_iActionPerformed(evt);
            }
        });
        view_m.add(themes_i);

        foreground_i.setText("Foreground");
        foreground_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foreground_iActionPerformed(evt);
            }
        });
        view_m.add(foreground_i);

        jMenuBar1.add(view_m);

        help_m.setText("Help");

        about_i.setText("About");
        about_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_iActionPerformed(evt);
            }
        });
        help_m.add(about_i);

        jMenuBar1.add(help_m);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("f");

        pack();
    }// </editor-fold>                        

    private void new_iActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        t_area.setText("");
    }                                     

    private void exit_iActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        System.exit(0);
    } 

    private void formKeyPressed(java.awt.event.KeyEvent evt) {                                
        
    } 
     private void t_areaKeyPressed(java.awt.event.KeyEvent evt) {                                  
      
    }                                 
                                     

    private void open_iActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        JFileChooser j= new JFileChooser();
        int r = j.showOpenDialog(null); 
    if (r == JFileChooser.APPROVE_OPTION) {  
        File fi = new File(j.getSelectedFile().getAbsolutePath());
    try {
            
           
            String s_ = "", sl = ""; 

            FileReader fr = new FileReader(fi); 
            
            BufferedReader br = new BufferedReader(fr); 

            sl = br.readLine(); 

            while ((s_ = br.readLine()) != null) { 
        sl = sl + "\n" + s_; 
        } 
                t_area.setText(sl); 
        }
            catch (IOException ev) { 
            JOptionPane.showMessageDialog(new JFrame(),ev.getMessage()); 
            } 
    } 
        else{
             JOptionPane.showMessageDialog(new JFrame(), "The user cancelled the operation");
        }

    }                                      
    
    private void save_iActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        JFileChooser j = new JFileChooser("f:");  
    int r = j.showSaveDialog(null); 
        if (r == JFileChooser.APPROVE_OPTION) { 
            File fi = new File(j.getSelectedFile().getAbsolutePath()); 
                try { 
                    FileWriter wr = new FileWriter(fi, false); 
                try (BufferedWriter w = new BufferedWriter(wr)) {
                    w.write(t_area.getText());
                    w.flush();
                } 
                } 
        catch (IOException ev) { 
                    JOptionPane.showMessageDialog(new JFrame(), ev.getMessage()); 
                    } 
    } 
        else{
            JOptionPane.showMessageDialog(new JFrame(), "The user cancelled the operation");
        }
    }                                      

    
    private void t_areaKeyTyped(java.awt.event.KeyEvent evt) {                                
        // TODO add your handling code here:
        if(evt.getKeyChar()==' '||evt.getKeyChar()=='\n'){
            text.add(data);
            text.add(evt.getKeyChar()+"");
            data="";
            //System.out.println(text);
        }
        else{
            data=data+evt.getKeyChar();
        }
    }                               
                                

    private void copy_iActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        String selection = t_area.getSelectedText();
        StringSelection content = new StringSelection(selection);
        clip.setContents(content,content);
    }                                      

    private void cut_iActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String selection = t_area.getSelectedText();
        StringSelection content = new StringSelection(selection);
        clip.setContents(content,content);
        t_area.replaceRange("", t_area.getSelectionStart(), t_area.getSelectionEnd());
    }                                     

    private void paste_iActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        Transferable clip_data = clip.getContents(clip);
        try{
            if(clip_data.isDataFlavorSupported(DataFlavor.stringFlavor)){
                String paste_data=(String) (clip_data.getTransferData(DataFlavor.stringFlavor));
                t_area.replaceSelection(paste_data);
            }
        }catch(UnsupportedFlavorException | IOException e){
            System.out.println(e);
        }
    }                                       

    private void compile_iActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String str1 = JOptionPane.showInputDialog("Enter Main Class Name");
        try{
          FileWriter fi = new FileWriter("run.bat");
          fi.write("@echo off\ntitle "+str1+"\ncolor 7\njavac "+str1+".java\njava "+str1+"\npause >nul");
          fi.close(); 
        }
        catch(Exception e){
            System.out.println(e);
        }
        Runtime builder_ = Runtime.getRuntime();
        try {
            Process p1= builder_.exec("cmd /c start run.bat");
            //p1.wait();
            InputStream is = p1.getInputStream();
            int i=0;
            while((i=is.read())!=-1) {
                System.out.println((char)i);
            }
        }
        catch(IOException e) {
            System.out.println(e);
        }
        catch(Exception Ex){
            System.out.println(Ex);
        }
    }                                         

    private void themes_iActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    String str1 = JOptionPane.showInputDialog("Enter r value of rgb color for Background");
     String str2 = JOptionPane.showInputDialog("Enter g value of rgb color for Background");
      String str3 = JOptionPane.showInputDialog("Enter b value of rgb color for Background");
      int r= Integer.parseInt(str1);
      int g= Integer.parseInt(str2);
      int b= Integer.parseInt(str3);
        //System.out.println(r +" "+g +" "+b);
        Color c = new Color(r,g,b);
      t_area.setBackground(c);
   
    }                                        

    private void foreground_iActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
     String str1 = JOptionPane.showInputDialog("Enter r value of rgb color for Foreground");
     String str2 = JOptionPane.showInputDialog("Enter g value of rgb color for Foreground");
      String str3 = JOptionPane.showInputDialog("Enter b value of rgb color for Foreground");
      int r= Integer.parseInt(str1);
      int g= Integer.parseInt(str2);
      int b= Integer.parseInt(str3);
        //System.out.println(r +" "+g +" "+b);
        Color c = new Color(r,g,b);
      t_area.setForeground(c);
      t_area.setCaretColor(t_area.getForeground());
    }       
    private void about_iActionPerformed(java.awt.event.ActionEvent evt) {                                        
        JOptionPane.showMessageDialog(new JFrame(),"Mini Project\nCreated using Swing and batch files");
    }                                     

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                     
    private javax.swing.JMenuItem about_i;
    private javax.swing.JMenuItem compile_i;
    private javax.swing.JMenuItem copy_i;
    private javax.swing.JMenuItem cut_i;
    private javax.swing.JMenu edit_m;
    private javax.swing.JMenuItem exit_i;
    private javax.swing.JMenu file_m;
    private javax.swing.JMenuItem foreground_i;
    private javax.swing.JMenu help_m;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem new_i;
    private javax.swing.JMenuItem open_i;
    private javax.swing.JMenuItem paste_i;
    private javax.swing.JMenu run_m;
    private javax.swing.JMenuItem save_i;
    private javax.swing.JTextArea t_area;
    private javax.swing.JMenuItem themes_i;
    private javax.swing.JMenu view_m;
    // End of variables declaration                   
    String data="";
    ArrayList<String> text ;
    final Clipboard clip =Toolkit.getDefaultToolkit().getSystemClipboard();
}



public class Project {

    public static void main(String[] args) {
       Editor obj = new Editor();
       obj.setVisible(true);
    }
    
}