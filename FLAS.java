import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class FLAS {
  public static void main(String[] args){
    HashMap<String, String> Svoc = new HashMap<String, String>();
    Svoc.put("to come", "volver");
    Svoc.put("to leave", "salir");
    Svoc.put("to fix", "arreglar");
    Svoc.put("to feel", "sentarse");
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
    ArrayList<String> NUM = new ArrayList<String>();
    ArrayList<String> NUM2 = new ArrayList<String>();
    NUM.add("1");
    NUM.add("2");
    NUM.add("3");
    NUM.add("4");
    NUM.add("5");
    NUM.add("6");
    NUM.add("7");
    NUM.add("8");
    NUM.add("9");
    NUM.add("10");
    NUM2.add("1");
    NUM2.add("2");
    NUM2.add("3");
    NUM2.add("4");
    NUM2.add("5");
    NUM2.add("6");
    NUM2.add("7");
    NUM2.add("8");
    NUM2.add("9");
    NUM2.add("10");
    Random r = new Random();
    int sizeA = Env.size();
    for (int i=0; i<sizeA; i++) {
      int choice = r.nextInt(Env.size());
      Q.add(Env.get(choice));
      Env.remove(Env.get(choice));
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

   JButton RS = new JButton("Restart");
    Spanish.add(RS);
    RS.setBounds(180, 350, 150, 70);
    RS.setVisible(false);

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
    if (Q.size() > 0){
      if (!WAID.getText().equals(Q.get(0))) {
        Q2.add(Svoc.get(Q.get(0)));
        TA.setText("False. " + Q.get(0));
        Q.remove(Q.get(0));
        NUM.remove(NUM.get(0));
        Flash.setText(Q2.get(0));
        Q2.remove(Q2.get(0));
      }
      else {
        Q2.add(Svoc.get(Q.get(0)));
        TA.setText("True. " + Q.get(0));
        Q.remove(Q.get(0));
        Flash.setText(Q2.get(0));
        Q2.remove(Q2.get(0));
      }
      }
  if (Q.size() == 0){
      int ab = Env.size();
      Ans.setText("You got " + NUM.size() + " correct out of 10.");
    }
    if (Ans.getText().equals("You got " + NUM.size() + " correct out of 10.")){
      RS.setVisible(true);
      SUB.setVisible(false);

    }


  }
  });

  RS.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){
    Env.add("to fix");
    Env.add("to see");
    Env.add("to break");
    Env.add("to eat");
    Env.add("to come");
    Env.add("to leave");
    Env.add("to feel");
    Env.add("to sit");
    Env.add("to drink");
    Env.add("to sleep");
    Env.add("to leave");
    NUM.add("1");
    NUM.add("2");
    NUM.add("3");
    NUM.add("4");
    NUM.add("5");
    NUM.add("6");
    NUM.add("7");
    NUM.add("8");
    NUM.add("9");
    NUM.add("10");
    Random r = new Random();
    int sizeA = Env.size();
    for (int i=0; i<sizeA; i++) {
      int choice = r.nextInt(Env.size());
      Q.add(Env.get(choice));
      Env.remove(Env.get(choice));
    }
    for (int i=0; i<sizeA; i++) {
      String bb = Q.get(i);
      Q2.add(Svoc.get(bb));
    }
    Ans.setText("");
    RS.setVisible(false);
    Flash.setVisible(true);
    TA.setVisible(true);
    Q2.add(Svoc.get(Q.get(0)));
    Flash.setText(Q2.get(0));
    Q2.remove(Q2.get(0));

  }
  });
  Spanish.addWindowListener(new WindowAdapter(){
     public void windowClosing(WindowEvent windowEvent){
       System.exit(0);
     }
   });


  }
}
