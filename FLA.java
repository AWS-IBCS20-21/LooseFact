import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class FLA {
  public static void main(String[] args){
    HashMap<String, String> Svoc = new HashMap<String, String>();
    Svoc.put("to come", "volver");
    Svoc.put("to leave", "salir");
    Svoc.put("to fix", "arreglar");
    Svoc.put("to feel", "sentirse");
    Svoc.put("to sit", "sentirse");
    Svoc.put("to eat", "comer");
    Svoc.put("to drink", "beber");
    Svoc.put("to sleep", "dormir");
    Svoc.put("to break", "romper");
    Svoc.put("to see", "ver");
    ArrayList<String> Spv = new ArrayList<String>(Svoc.values());
    ArrayList<String> Env = new ArrayList<String>(Svoc.keySet());
    ArrayList<String> Q = new ArrayList<String>();
    ArrayList<String> Q2 = new ArrayList<String>();
    Random r = new Random();
    int sizeA = Env.size();
    for (int i=0; i<sizeA; i++) {
      int choice = r.nextInt(Env.size());
      Q.add(Env.get(choice));
    }
    for (int i=0; i<sizeA; i++) {
      String bb = Q.get(i);
      Q2.add(Svoc.get(bb));
    }
    JFrame Spanish = new JFrame("Study Spanish");
    Spanish.setVisible(true);
    Spanish.setSize(500,500);
    Spanish.setLayout(null);

  JLabel Flash = new JLabel("Translate the english words that will appear here.");
  Spanish.add(Flash);
  Flash.setBounds(100, 25, 310, 50);

 TextArea Ans = new TextArea("Type the spanish translation here.", 170, 30);
   Spanish.add(Ans);
   Ans.setBounds(130, 205, 240, 50);

  JButton S = new JButton("Start");
   Spanish.add(S);
   S.setBounds(180, 90, 150, 70);

    JLabel TA = new JLabel("The correct answer will appear here.");
  Spanish.add(TA);
  TA.setBounds(150, 275, 250, 50);
  TA.setVisible(true);


  JButton SUB = new JButton("Submit");
   Spanish.add(SUB);
   SUB.setBounds(180, 350, 150, 70);
   SUB.setVisible(false);

   JLabel WAID = new JLabel("");
 Spanish.add(WAID);
 TA.setBounds(150, 275, 250, 50);
 TA.setVisible(false);

   S.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     Ans.setText("");
     S.setVisible(false);
     Flash.setVisible(true);
     TA.setVisible(true);
     Q2.add(Svoc.get(Q.get(0)));
     Flash.setText(Q2.get(0));
     Q2.remove(Q2.get(0));

   }
   });

   Ans.addTextListener(new TextListener(){
     public void textValueChanged(TextEvent e) {
       if (Ans.getText().trim().length() == 0){
         SUB.setVisible(false);
       }
       else{
         SUB.setVisible(true);
       }
     }
   });

  SUB.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){
    String Ans1 = Ans.getText();
    WAID.setText(Ans1);
    Ans.setText("");
    if (Q.size() == 0){
      int ab = Env.size();
      Ans.setText("You got " + Env.size() + " correct out of 10.");
    }
    if (Ans.getText() == "You got " + Env.size() + " correct out of 10."){
      Svoc.put("to come", "volver");
      Svoc.put("to leave", "salir");
      Svoc.put("to fix", "arreglar");
      Svoc.put("to feel", "sentirse");
      Svoc.put("to sit", "sentirse");
      Svoc.put("to eat", "comer");
      Svoc.put("to drink", "beber");
      Svoc.put("to sleep", "dormir");
      Svoc.put("to break", "romper");
      Svoc.put("to see", "ver");
      Random r = new Random();
      int sizeA = Env.size();
      for (int i=0; i<sizeA; i++) {
        int choice = r.nextInt(Env.size());
        Q.add(Env.get(choice));
      }
      for (int i=0; i<sizeA; i++) {
        String bb = Q.get(i);
        Q2.add(Svoc.get(bb));
      }
      Ans.setText("");
      TA.setText("");
      Flash.setText("");
      S.setVisible(true);
      SUB.setVisible(false);
    }
    if (Ans1 == Q.get(0)){
      Q2.add(Svoc.get(Q.get(0)));
      TA.setText("True. " + Q.get(0));
      Q.remove(Q.get(0));
      Flash.setText(Q2.get(0));
      Q2.remove(Q2.get(0));
    }
    if (Ans1 != Q.get(0)) {
      Q2.add(Svoc.get(Q.get(0)));
      TA.setText("False. " + Q.get(0));
      Q.remove(Q.get(0));
      Env.remove(Env.get(0));
      Flash.setText(Q2.get(0));
      Q2.remove(Q2.get(0));
    }


  }
  });
  Spanish.addWindowListener(new WindowAdapter(){
     public void windowClosing(WindowEvent windowEvent){
       System.exit(0);
     }
   });


  }
}
