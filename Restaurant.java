import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class Restaurant{
   public static void main(String[] args){
     JFrame myFrame = new JFrame("A Shady Tavern");
     myFrame.setVisible(true);
     myFrame.setSize(800,500);
     myFrame.setLayout(null);

     JFrame J2 = new JFrame("Recipt");
     J2.setVisible(false);
     J2.setSize(400,500);
     J2.setLayout(null);

     JFrame J3 = new JFrame("The Black Market");
     J3.setVisible(false);
     J3.setSize(400,500);
     J3.setLayout(null);

     //main
     JLabel Name = new JLabel("Guess the Cost");
     myFrame.add(Name);
     Name.setBounds(350, 25, 250, 50);

     JLabel MName = new JLabel("Menu");
     myFrame.add(MName);
     MName.setBounds(25, 80, 200, 50);

     JCheckBox one = new JCheckBox("The Sludge of Mordor", false); //6 gold coins
     myFrame.add(one);
     one.setBounds(25, 120, 200, 50);

     JCheckBox two = new JCheckBox("Bloody Valkere", false); //10 gold coins
     myFrame.add(two);
     two.setBounds(25, 150, 200, 50);

     JCheckBox three = new JCheckBox("Shrieking Pie", false); //3 gold coins
     myFrame.add(three);
     three.setBounds(25, 180, 200, 50); //30 gold coins

     JCheckBox four = new JCheckBox("Ominous Looking Meat", false); //22 gold coins
     myFrame.add(four);
     four.setBounds(25, 210, 200, 50);

     JCheckBox five = new JCheckBox("Orc's Eye", false); //50 gold coins
     myFrame.add(five);
     five.setBounds(25, 240, 200, 50);

     JCheckBox six = new JCheckBox("Injurious Lemonade", false); //1 gold coin
     myFrame.add(six);
     six.setBounds(25, 270, 200, 50);

     JLabel HM2 = new JLabel("How Many?");
     myFrame.add(HM2);
     HM2.setBounds(350, 125, 200, 50);
     HM2.setVisible(false);

     TextArea HM1 = new TextArea(100, 30);
     myFrame.add(HM1);
     HM1.setBounds(320, 175, 150, 50);
     HM1.setVisible(false);

     JButton HM3 = new JButton("Done");
     myFrame.add(HM3);
     HM3.setBounds(350, 235, 70, 50);
     HM3.setVisible(false);

     JLabel UName = new JLabel("Name?");
     myFrame.add(UName);
     UName.setBounds(650, 80, 200, 50);

     TextArea U1 = new TextArea(100, 30);
     myFrame.add(U1);
     U1.setBounds(600, 130, 150, 50);

     JLabel T1 = new JLabel("Which Table?");
     myFrame.add(T1);
     T1.setBounds(630, 200, 200, 50);

     JComboBox<String> T3 = new JComboBox<String>();
     T3.addItem("The table next to the vengeful looking man.");
     T3.addItem("The table packed with mercenaries.");
     T3.addItem("The seemingly empty table.");
     myFrame.add(T3);
     T3.setBounds(580, 230, 200, 70);
     T3.setVisible(true);

     JLabel B1 = new JLabel("Budget");
     myFrame.add(B1);
     B1.setBounds(70, 330, 200, 50);

     TextArea B2 = new TextArea(100, 30);
     myFrame.add(B2);
     B2.setBounds(25, 380, 150, 50);

     JLabel B3 = new JLabel("gold coins.");
     myFrame.add(B3);
     B3.setBounds(195, 380, 200, 50);

     JButton Fin = new JButton("Done");
     myFrame.add(Fin);
     Fin.setBounds(450, 350, 150, 70);

     JCheckBox ONE = new JCheckBox("", false);
     myFrame.add(ONE);
     ONE.setBounds(1, 1, 1, 1);
     ONE.setVisible(false);

     JCheckBox TWO = new JCheckBox("", false);
     myFrame.add(TWO);
     TWO.setBounds(1, 1, 1, 1);
     TWO.setVisible(false);

     JCheckBox THREE = new JCheckBox("", false);
     myFrame.add(ONE);
     THREE.setBounds(1, 1, 1, 1);
     THREE.setVisible(false);

     JCheckBox FOUR = new JCheckBox("", false);
     myFrame.add(ONE);
     FOUR.setBounds(1, 1, 1, 1);
     FOUR.setVisible(false);

     JCheckBox FIVE = new JCheckBox("", false);
     myFrame.add(ONE);
     FIVE.setBounds(1, 1, 1, 1);
     FIVE.setVisible(false);

     JCheckBox SIX = new JCheckBox("", false);
     myFrame.add(ONE);
     SIX.setBounds(1, 1, 1, 1);
     SIX.setVisible(false);

     JLabel on = new JLabel("Menu");
     myFrame.add(MName);
     MName.setBounds(25, 80, 200, 50);


          //Recipt
          JLabel B = new JLabel("Budget:");
          J2.add(B);
          B.setBounds(25, 15, 200, 50);

          JLabel F1 = new JLabel("The Sludge of Mordor:");
          J2.add(F1);
          F1.setBounds(25, 45, 200, 50);

          JLabel F2 = new JLabel("Bloody Valkere:");
          J2.add(F2);
          F2.setBounds(25, 75, 200, 50);

          JLabel F3 = new JLabel("Shrieking Pie:");
          J2.add(F3);
          F3.setBounds(25, 105, 200, 50);

          JLabel F4 = new JLabel("Ominous Looking Meat:");
          J2.add(F4);
          F4.setBounds(25, 135, 200, 50);

          JLabel F5 = new JLabel("Orc's Eye:");
          J2.add(F5);
          F5.setBounds(25, 165, 200, 50);

          JLabel F6 = new JLabel("Injurious Lemonade:");
          J2.add(F6);
          F6.setBounds(25, 195, 200, 50);

          JLabel C1 = new JLabel("0");
          J2.add(C1);
          C1.setBounds(200, 15, 55, 50);

          JLabel C2 = new JLabel("0");
          J2.add(C2);
          C2.setBounds(200, 45, 55, 50);

          JLabel C3 = new JLabel("0");
          J2.add(C3);
          C3.setBounds(200, 75, 55, 50);

          JLabel C4 = new JLabel("0");
          J2.add(C4);
          C4.setBounds(200, 105, 55, 50);

          JLabel C5 = new JLabel("0");
          J2.add(C5);
          C5.setBounds(200, 135, 55, 50);

          JLabel C6 = new JLabel("0");
          J2.add(C6);
          C6.setBounds(200, 165, 55, 50);

          JLabel C7 = new JLabel("0");
          J2.add(C7);
          C7.setBounds(200, 195, 55, 50);

          JLabel M1 = new JLabel("gold coins");
          J2.add(M1);
          M1.setBounds(255, 15, 70, 50);

          JLabel M2 = new JLabel("gold coins");
          J2.add(M2);
          M2.setBounds(255, 45, 70, 50);

          JLabel M3 = new JLabel("gold coins");
          J2.add(M3);
          M3.setBounds(255, 75, 70, 50);

          JLabel M4 = new JLabel("gold coins");
          J2.add(M4);
          M4.setBounds(255, 105, 70, 50);

          JLabel M5 = new JLabel("gold coins");
          J2.add(M5);
          M5.setBounds(255, 135, 70, 50);

          JLabel M6 = new JLabel("gold coins");
          J2.add(M6);
          M6.setBounds(255, 165, 70, 50);

          JLabel M7 = new JLabel("gold coins");
          J2.add(M7);
          M7.setBounds(255, 195, 70, 50);

          JLabel O = new JLabel("Overall, you now have:");
          J2.add(O);
          O.setBounds(25, 225, 200, 50);

          JLabel C8 = new JLabel("0");
          J2.add(C8);
          C8.setBounds(200, 225, 55, 50);

          JLabel M8 = new JLabel("gold coins");
          J2.add(M8);
          M8.setBounds(255, 225, 70, 50);

          JLabel D1 = new JLabel("You have a debt of");
          J2.add(D1);
          D1.setBounds(25, 275, 200, 50);

          JLabel D2 = new JLabel("0");
          J2.add(D2);
          D2.setBounds(200, 275, 55, 50);

          JLabel D3 = new JLabel("gold coins");
          J2.add(D3);
          D3.setBounds(255, 275, 70, 50);

          JButton D4 = new JButton("Pay off your debt");
          J2.add(D4);
          D4.setBounds(130, 365, 150, 70);

          //debt
          JLabel WTS = new JLabel("What would you like to sell?");
          J3.add(WTS);
          WTS.setBounds(120, 15, 200, 50);

          JLabel De1 = new JLabel("Debt:");
          J3.add(De1);
          De1.setBounds(25, 55, 200, 50);

          JLabel Mo = new JLabel("0");
          J3.add(Mo);
          Mo.setBounds(70, 55, 55, 50);

          JLabel Mo2 = new JLabel("gold coins");
          J3.add(Mo2);
          Mo2.setBounds(130, 55, 70, 50);

          JCheckBox De2 = new JCheckBox("Your Clothes: 5 gold coins", false);
          J3.add(De2);
          De2.setBounds(25, 85, 200, 50);

          JCheckBox De3 = new JCheckBox("Your fingers: 10 gold coins", false);
          J3.add(De3);
          De3.setBounds(25, 115, 220, 50);

          JCheckBox De4 = new JCheckBox("Your eye: 30 gold coins", false);
          J3.add(De4);
          De4.setBounds(25, 145, 200, 50);

          JCheckBox De5 = new JCheckBox("Your arm: 50 gold coins", false);
          J3.add(De5);
          De5.setBounds(25, 175, 200, 50);

          JCheckBox De6 = new JCheckBox("Your lung: 90 gold coins", false);
          J3.add(De6);
          De6.setBounds(25, 205, 200, 50);

          JCheckBox De7 = new JCheckBox("Your soul: can pay off any debt", false);
          J3.add(De7);
          De7.setBounds(25, 235, 230, 50);

          JButton Fin3 = new JButton("Done");
          J3.add(Fin3);
          Fin3.setBounds(120, 350, 150, 70);
          Fin3.setVisible(false);

          JLabel DONE = new JLabel("You are now finished.");
          J3.add(DONE);
          Fin3.setBounds(120, 350, 150, 70);
          Fin3.setVisible(false);

          JLabel FuH = new JLabel("");
          J3.add(FuH);
          FuH.setBounds(1, 1, 1, 1);
          FuH.setVisible(false);
     //actions

     one.addItemListener(new ItemListener() {
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {
          one.addComponentListener(new ComponentAdapter(){
            public void componentShown(ComponentEvent e) {
              ONE.setSelected(true);
                }
          });
          one.setVisible(false);
          one.setVisible(true);
          HM2.setVisible(true);
          HM1.setVisible(true);
          HM3.setVisible(false);
          two.setVisible(false);
          three.setVisible(false);
          four.setVisible(false);
          five.setVisible(false);
          six.setVisible(false);

        }

        else {
          HM2.setVisible(false);
          HM1.setVisible(false);
          HM3.setVisible(false);
          two.setVisible(true);
          three.setVisible(true);
          four.setVisible(true);
          five.setVisible(true);
          six.setVisible(true);
          two.setSelected(false);
          three.setSelected(false);
          four.setSelected(false);
          five.setSelected(false);
          six.setSelected(false);
          C2.setText("0");
          C3.setText("0");
          C4.setText("0");
          C5.setText("0");
          C6.setText("0");
          C7.setText("0");
          ONE.setSelected(false);
          TWO.setSelected(false);
          THREE.setSelected(false);
          FOUR.setSelected(false);
          FIVE.setSelected(false);
          SIX.setSelected(false);
        };
    }
});

two.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {
   if(e.getStateChange() == ItemEvent.SELECTED) {
     two.addComponentListener(new ComponentAdapter(){
       public void componentShown(ComponentEvent e) {
         TWO.setSelected(true);
           }
     });
     HM2.setVisible(true);
     HM1.setVisible(true);
     HM3.setVisible(false);
     one.setVisible(false);
     three.setVisible(false);
     four.setVisible(false);
     five.setVisible(false);
     six.setVisible(false);
     //MeNu.add(2);
   }
   else {
     HM2.setVisible(false);
     HM1.setVisible(false);
     HM3.setVisible(false);
     one.setVisible(true);
     three.setVisible(true);
     four.setVisible(true);
     five.setVisible(true);
     six.setVisible(true);
     one.setSelected(false);
     three.setSelected(false);
     four.setSelected(false);
     five.setSelected(false);
     six.setSelected(false);
     C2.setText("0");
     C3.setText("0");
     C4.setText("0");
     C5.setText("0");
     C6.setText("0");
     C7.setText("0");
     ONE.setSelected(false);
     TWO.setSelected(false);
     THREE.setSelected(false);
     FOUR.setSelected(false);
     FIVE.setSelected(false);
     SIX.setSelected(false);
   };
}
});

three.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {
   if(e.getStateChange() == ItemEvent.SELECTED) {
     three.addComponentListener(new ComponentAdapter(){
       public void componentShown(ComponentEvent e) {
         THREE.setSelected(true);
           }
     });
     HM2.setVisible(true);
     HM1.setVisible(true);
     HM3.setVisible(false);
     one.setVisible(false);
     two.setVisible(false);
     four.setVisible(false);
     five.setVisible(false);
     six.setVisible(false);
     //MeNu.add(3);
   }
   else {
     HM2.setVisible(false);
     HM1.setVisible(false);
     HM3.setVisible(false);
     one.setVisible(true);
     two.setVisible(true);
     four.setVisible(true);
     five.setVisible(true);
     six.setVisible(true);
     one.setSelected(false);
     two.setSelected(false);
     four.setSelected(false);
     five.setSelected(false);
     six.setSelected(false);
     C2.setText("0");
     C3.setText("0");
     C4.setText("0");
     C5.setText("0");
     C6.setText("0");
     C7.setText("0");
     ONE.setSelected(false);
     TWO.setSelected(false);
     THREE.setSelected(false);
     FOUR.setSelected(false);
     FIVE.setSelected(false);
     SIX.setSelected(false);
   };
}
});

four.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {
   if(e.getStateChange() == ItemEvent.SELECTED) {
     four.addComponentListener(new ComponentAdapter(){
       public void componentShown(ComponentEvent e) {
         FOUR.setSelected(true);
           }
     });
     HM2.setVisible(true);
     HM1.setVisible(true);
     HM3.setVisible(false);
     one.setVisible(false);
     three.setVisible(false);
     two.setVisible(false);
     five.setVisible(false);
     six.setVisible(false);
     //MeNu.add(4);
   }
   else {
     HM2.setVisible(false);
     HM1.setVisible(false);
     HM3.setVisible(false);
     one.setVisible(true);
     three.setVisible(true);
     two.setVisible(true);
     five.setVisible(true);
     six.setVisible(true);
     one.setSelected(false);
     three.setSelected(false);
     two.setSelected(false);
     five.setSelected(false);
     six.setSelected(false);
     C2.setText("0");
     C3.setText("0");
     C4.setText("0");
     C5.setText("0");
     C6.setText("0");
     C7.setText("0");
     ONE.setSelected(false);
     TWO.setSelected(false);
     THREE.setSelected(false);
     FOUR.setSelected(false);
     FIVE.setSelected(false);
     SIX.setSelected(false);
   };
}
});

five.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {
   if(e.getStateChange() == ItemEvent.SELECTED) {
     five.addComponentListener(new ComponentAdapter(){
       public void componentShown(ComponentEvent e) {
         FIVE.setSelected(true);
           }
     });
     HM2.setVisible(true);
     HM1.setVisible(true);
     HM3.setVisible(false);
     one.setVisible(false);
     three.setVisible(false);
     four.setVisible(false);
     two.setVisible(false);
     six.setVisible(false);
   }
   else {
     HM2.setVisible(false);
     HM1.setVisible(false);
     HM3.setVisible(false);
     one.setVisible(true);
     three.setVisible(true);
     four.setVisible(true);
     two.setVisible(true);
     six.setVisible(true);
     one.setSelected(false);
     three.setSelected(false);
     four.setSelected(false);
     two.setSelected(false);
     six.setSelected(false);
     C2.setText("0");
     C3.setText("0");
     C4.setText("0");
     C5.setText("0");
     C6.setText("0");
     C7.setText("0");
     ONE.setSelected(false);
     TWO.setSelected(false);
     THREE.setSelected(false);
     FOUR.setSelected(false);
     FIVE.setSelected(false);
     SIX.setSelected(false);
   };
}
});

six.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {
   if(e.getStateChange() == ItemEvent.SELECTED) {
     six.addComponentListener(new ComponentAdapter(){
       public void componentShown(ComponentEvent e) {
         SIX.setSelected(true);
           }
     });
     HM2.setVisible(true);
     HM1.setVisible(true);
     HM3.setVisible(false);
     one.setVisible(false);
     three.setVisible(false);
     four.setVisible(false);
     five.setVisible(false);
     two.setVisible(false);
   }
   else {
     HM2.setVisible(false);
     HM1.setVisible(false);
     HM3.setVisible(false);
     one.setVisible(true);
     three.setVisible(true);
     four.setVisible(true);
     five.setVisible(true);
     two.setVisible(true);
     one.setSelected(false);
     three.setSelected(false);
     four.setSelected(false);
     five.setSelected(false);
     two.setSelected(false);
     C2.setText("0");
     C3.setText("0");
     C4.setText("0");
     C5.setText("0");
     C6.setText("0");
     C7.setText("0");
     ONE.setSelected(false);
     TWO.setSelected(false);
     THREE.setSelected(false);
     FOUR.setSelected(false);
     FIVE.setSelected(false);
     SIX.setSelected(false);
   };
}
});

HM1.addTextListener(new TextListener(){
  public void textValueChanged(TextEvent e) {
    if (HM1.getText().trim().length() == 0){
      HM3.setVisible(false);
    }
    else{
      HM3.setVisible(true);
    }
  }
});





HM3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){

  if (ONE.isSelected() == true) {
       String O1 = HM1.getText();
       int O2 = Integer.parseInt(O1) * 6;
       String O3 =Integer.toString(O2);
       C2.setText(O3);

     }
  if (TWO.isSelected() == true) {
      String O4 = HM1.getText();
      int O5 = Integer.parseInt(O4) * 10;
      String O6 =Integer.toString(O5);
      C3.setText(O6);

  }
  if (THREE.isSelected() == true) {
      String O7 = HM1.getText();
      int O8 = Integer.parseInt(O7) * 3;
      String O9 =Integer.toString(O8);
      C4.setText(O9);

  }
  if (FOUR.isSelected() == true) {
      String O10 = HM1.getText();
      int O11 = Integer.parseInt(O10) * 22;
      String O12 =Integer.toString(O11);
      C5.setText(O12);

  }
  if (FIVE.isSelected() == true) {
      String O13 = HM1.getText();
      int O14 = Integer.parseInt(O13) * 50;
      String O15 =Integer.toString(O14);
      C6.setText(O15);

  }
  if (SIX.isSelected() == true) {
      String O16 = HM1.getText();
      int O17 = Integer.parseInt(O16) * 1;
      String O18 =Integer.toString(O17);
      C7.setText(O18);

  }
HM1.setText("");
HM2.setVisible(false);
HM1.setVisible(false);
HM3.setVisible(false);
one.setVisible(true);
two.setVisible(true);
three.setVisible(true);
four.setVisible(true);
five.setVisible(true);
six.setVisible(true);
}
});



     //actions



     Fin.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
     J2.setVisible(true);
     myFrame.setVisible(false);
     String BI = B2.getText();
     C1.setText(BI);
     int BI2 = Integer.parseInt(BI);

     String p1 = C2.getText();
     int e1 = Integer.parseInt(p1);

     String p2 = C3.getText();
     int e2 = Integer.parseInt(p2);

     String p3 = C4.getText();
     int e3 = Integer.parseInt(p3);

     String p4 = C5.getText();
     int e4 = Integer.parseInt(p4);

     String p5 = C6.getText();
     int e5 = Integer.parseInt(p5);

     String p6 = C7.getText();
     int e6 = Integer.parseInt(p6);

     int Over = BI2 - e1 - e2 - e3 - e4 - e5 - e6;

     String Over1 =Integer.toString(Over);
     C8.setText(Over1);
     D2.setText(Over1);
     Mo.setText(Over1);

     if (Over>=0){
       D1.setVisible(false);
       D2.setVisible(false);
       D3.setVisible(false);
       D4.setVisible(false);
     }


     }
     });

     De2.addItemListener(new ItemListener() {
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {
              String mo1 = Mo.getText();
              int mo2 = Integer.parseInt(mo1) + 5;
              String mo3 =Integer.toString(mo2);
              Mo.setText(mo3);
        }
        else {
          String mo1 = Mo.getText();
          int mo2 = Integer.parseInt(mo1) - 5;
          String mo3 =Integer.toString(mo2);
          Mo.setText(mo3);
        };
    }
});

De3.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {
   if(e.getStateChange() == ItemEvent.SELECTED) {
         String mo1 = Mo.getText();
         int mo2 = Integer.parseInt(mo1) + 10;
         String mo3 =Integer.toString(mo2);
         Mo.setText(mo3);
   }
   else {
     String mo1 = Mo.getText();
     int mo2 = Integer.parseInt(mo1) - 10;
     String mo3 =Integer.toString(mo2);
     Mo.setText(mo3);
   };
}
});

De4.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {
   if(e.getStateChange() == ItemEvent.SELECTED) {
         String mo1 = Mo.getText();
         int mo2 = Integer.parseInt(mo1) + 30;
         String mo3 =Integer.toString(mo2);
         Mo.setText(mo3);
   }
   else {
     String mo1 = Mo.getText();
     int mo2 = Integer.parseInt(mo1) - 30;
     String mo3 =Integer.toString(mo2);
     Mo.setText(mo3);
   };
}
});

De5.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {
   if(e.getStateChange() == ItemEvent.SELECTED) {
         String mo1 = Mo.getText();
         int mo2 = Integer.parseInt(mo1) + 50;
         String mo3 =Integer.toString(mo2);
         Mo.setText(mo3);
   }
   else {
     String mo1 = Mo.getText();
     int mo2 = Integer.parseInt(mo1) - 50;
     String mo3 =Integer.toString(mo2);
     Mo.setText(mo3);
   };
}
});

De6.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {
   if(e.getStateChange() == ItemEvent.SELECTED) {
         String mo1 = Mo.getText();
         int mo2 = Integer.parseInt(mo1) + 90;
         String mo3 =Integer.toString(mo2);
         Mo.setText(mo3);
   }
   else {
     String mo1 = Mo.getText();
     int mo2 = Integer.parseInt(mo1) - 90;
     String mo3 =Integer.toString(mo2);
     Mo.setText(mo3);
   };
}
});

De7.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {
   if(e.getStateChange() == ItemEvent.SELECTED) {
         FuH.setText(Mo.getText());
         Mo.setText("0");
         De2.setSelected(false);
         De3.setSelected(false);
         De4.setSelected(false);
         De5.setSelected(false);
         De6.setSelected(false);

   }
   else {
     Mo.setText(D2.getText());
   };
}
});


  Fin3.setVisible(true);
  Fin3.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){
    String YAA = Mo.getText();
    int YAA2 = Integer.parseInt(YAA);
    if(YAA2 >= 0){
      WTS.setVisible(false);
      De1.setVisible(false);
      Mo.setVisible(false);
      Mo2.setVisible(false);
      De2.setVisible(false);
      De3.setVisible(false);
      De4.setVisible(false);
      De5.setVisible(false);
      De6.setVisible(false);
      De7.setVisible(false);
      Fin3.setVisible(false);
      DONE.setVisible(true);
    }
  }
  });








     D4.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
    J3.setVisible(true);
    J2.setVisible(false);
     }
     });

     myFrame.addWindowListener(new WindowAdapter(){
       public void windowClosing(WindowEvent windowEvent){
         System.exit(0);
       }
     });

     J2.addWindowListener(new WindowAdapter(){
       public void windowClosing(WindowEvent windowEvent){
         System.exit(0);
       }
     });

     J3.addWindowListener(new WindowAdapter(){
       public void windowClosing(WindowEvent windowEvent){
         System.exit(0);
       }
     });
   }
}
