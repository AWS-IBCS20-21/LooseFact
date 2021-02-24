import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Restaurant{
   public static void main(String[] args){
     JFrame myFrame = new JFrame("The Thing");
     myFrame.setVisible(true);
     myFrame.setSize(800,800);
     myFrame.setLayout(null);

     JLabel Name = new JLabel("A Sketchy Tavern");
     myFrame.add(Name);
     Name.setBounds(350, 25, 250, 50);

     JLabel MName = new JLabel("Menu");
     myFrame.add(MName);
     MName.setBounds(25, 80, 200, 50);

     JCheckBox one = new JCheckBox("The Sludge of Mordor", false);
     myFrame.add(one);
     one.setBounds(25, 120, 200, 50);

     JCheckBox two = new JCheckBox("Bloody Valkere", false);
     myFrame.add(two);
     two.setBounds(25, 150, 200, 50);

     JCheckBox three = new JCheckBox("Shrieking Pie", false);
     myFrame.add(three);
     three.setBounds(25, 180, 200, 50);

     JCheckBox four = new JCheckBox("Ominous Looking Meat", false);
     myFrame.add(four);
     four.setBounds(25, 210, 200, 50);

     JCheckBox five = new JCheckBox("Orc's Eye", false);
     myFrame.add(five);
     five.setBounds(25, 240, 200, 50);

     JCheckBox six = new JCheckBox("Injurious Lemonade", false);
     myFrame.add(six);
     six.setBounds(25, 270, 200, 50);

     JLabel HM2 = new JLabel("How Many?");
     myFrame.add(HM2);
     HM2.setBounds(350, 125, 200, 50);

     TextArea HM1 = new TextArea(100, 30);
     myFrame.add(HM1);
     HM1.setBounds(320, 175, 150, 50);

     JButton HM3 = new JButton("Done");
     myFrame.add(HM3);
     HM3.setBounds(350, 235, 70, 50);

     JLabel UName = new JLabel("Name?");
     myFrame.add(UName);
     UName.setBounds(650, 80, 200, 50);

     TextArea U1 = new TextArea(100, 30);
     myFrame.add(U1);
     U1.setBounds(600, 130, 150, 50);

     JButton U2 = new JButton("Done");
     myFrame.add(U2);
     U2.setBounds(640, 190, 70, 50);

     //myCheckBox.addActionListener(new ActionListener(){
     //public void actionPerformed(ActionEvent e){
    //wut.addElement("ergh");
     //}
     //});


    JComboBox<String> myComboBox = new JComboBox<String>();
    myComboBox.addItem("has");
    myComboBox.addItem("euou");
    myComboBox.addItem("hwll");
    myFrame.add(myComboBox);

    //JScrollBar myScrollBar =new JScrollBar();
    //myFrame.add(myScrollBar);


    //myTextArea.addTextListener(new TextListener(){
      //public void textValueChanged(TextEvent e) {
        //myLabel.setText(myTextArea.getText());
      //}
    //});

     myFrame.addWindowListener(new WindowAdapter(){
       public void windowClosing(WindowEvent windowEvent){
         System.exit(0);
       }
     });
   }
}
