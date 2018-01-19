/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexfinalproject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author Alex
 */
public class TermProject extends JFrame{

    /**
     * @param args the command line arguments
     */
    JLabel line0;
    JLabel line1;
    JLabel line2;
    JLabel line3;
    JLabel line4;
    JLabel line5;
    JLabel line6;
    JLabel line7;
    JLabel line8;
    JLabel line9;
    JLabel line10;
    JLabel line11;
    JLabel line12;
    JLabel line13;
    JLabel line14;
    JLabel line15;
    JLabel line16;
    JLabel line17;
    JLabel line18;
    JLabel line19;
    JLabel line20;
    //--------------------------------------------------------------------------    
    JButton Go;
    JCheckBox Save;
    //--------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------
    JTextArea PlaybyPlay;
    
    JTextField Combat1;
    JTextField Armor1;
    JTextField Speed1;
    JTextField HPMax1;
    JTextField CritThresh1;
    JTextField CritPenalty1;
    JTextField CritSpdPenalty1;
    JTextField Combat2;
    JTextField Armor2;
    JTextField Speed2;
    JTextField HPMax2;
    JTextField CritThresh2;
    JTextField CritPenalty2;
    JTextField CritSpdPenalty2;
    
    //--------------------------------------------------------------------------
    JComboBox Unit1CB;
    JComboBox Species1CB;
    JComboBox Unit2CB;
    JComboBox Species2CB;
    
    public TermProject(){
        
        // Creates the 800x640 window, puts my name in the window bar. 
        this.setBounds(0, 0, 800, 640);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Alex Avetisov CSC 150 Term Project");
        this.setLayout(null);
        createInterface();
        this.setVisible(true);
    }
    private void createInterface(){      
        
//Combatant 1 Lines--------------------------------------------------------------
       line0 = new JLabel("Combatant 1");
       line0.setBounds(200,20,120,20);
       add(line0);
       
       line1 = new JLabel("Unit Type");
       line1.setBounds(40, 60, 120, 20);
       add(line1);
       
       line2 = new JLabel("Species");
       line2.setBounds(40, 100, 120, 20);
       add(line2);
       
       line3 = new JLabel("Combat");
       line3.setBounds(40, 140, 120, 20);
       add(line3);
       
       line4 = new JLabel("Armor");
       line4.setBounds(40, 180, 120, 20);
       add(line4);
       
       line5 = new JLabel("Speed");
       line5.setBounds(40, 220, 120, 20);
       add(line5);
       
       line5 = new JLabel("Hit Points Maximum");
       line5.setBounds(40, 260, 120, 20);
       add(line5);
       
       line6 = new JLabel("Critical Hit Threshold");
       line6.setBounds(40, 300, 120, 20);
       add(line6);
       
       line7 = new JLabel("Critical hit Penalty");
       line7.setBounds(40, 340, 120, 20);
       add(line7);
       
       line8 = new JLabel("Critical Speed Penalty");
       line8.setBounds(40, 380, 130, 20);
       add(line8);
       
//Combatant 2 Lines-------------------------------------------------------------
       line18 = new JLabel("Combatant 2");
       line18.setBounds(600, 20, 200, 20);
       add(line18);
       
       line9 = new JLabel("Unit Type");
       line9.setBounds(400, 60, 130, 20);
       add(line9);
       
       line10 = new JLabel("Species");
       line10.setBounds(400, 100, 130, 20);
       add(line10);
       
       line11 = new JLabel("Combat");
       line11.setBounds(400, 140, 130, 20);
       add(line11);
       
       line12 = new JLabel("Armor");
       line12.setBounds(400, 180, 130, 20);
       add(line12);
       
       line13 = new JLabel("Speed");
       line13.setBounds(400, 220, 130, 20);
       add(line13);
       
       line14 = new JLabel("Hit Point Maximum");
       line14.setBounds(400, 260, 130, 20);
       add(line14);
       
       line15 = new JLabel("Critical Hit Threshold");
       line15.setBounds(400, 300, 130, 20);
       add(line15);
       
       line16 = new JLabel("Critical Hit Penalty");
       line16.setBounds(400, 340, 130, 20);
       add(line16);
       
       line17 = new JLabel("Critical Speed Penalty");
       line17.setBounds(400, 380, 130, 20);
       add(line17);
  
       //Play By Play
       line19 = new JLabel("Play by Play");
       line19.setBounds(320, 435, 130, 20);
       add(line19);
       
//JTextFields------------------------------------------------------------------
       
    //Combatant 1---------------------------------------------------------------
       final JTextField Combat1 = new JTextField();
        add(Combat1);
        Combat1.setBounds(200, 140, 50, 20);
        
        final JTextField Armor1 = new JTextField();
        add(Armor1);
        Armor1.setBounds(200, 180, 50, 20);
       
        final JTextField Speed1 = new JTextField();
        add(Speed1);
        Speed1.setBounds(200, 220, 50, 20);
        
        final JTextField HPMax1 = new JTextField();
        add(HPMax1);
        HPMax1.setBounds(200, 260, 50, 20);
        
        final JTextField CritThresh1 = new JTextField();
        add(CritThresh1);
        CritThresh1.setBounds(200, 300, 50, 20);
        
        final JTextField CritPenalty1 = new JTextField();
        add(CritPenalty1);
        CritPenalty1.setBounds(200, 340, 50, 20);
        
        final JTextField CritSpdPenalty1 = new JTextField();
        add(CritSpdPenalty1);
        CritSpdPenalty1.setBounds(200, 380, 50, 20);
        
    //Combatant 2---------------------------------------------------------------
          final JTextField Combat2 = new JTextField();
        add(Combat2);
        Combat2.setBounds(600, 140, 50, 20);
        
        final JTextField Armor2 = new JTextField();
        add(Armor2);
        Armor2.setBounds(600, 180, 50, 20);
       
        final JTextField Speed2 = new JTextField();
        add(Speed2);
        Speed2.setBounds(600, 220, 50, 20);
        
        final JTextField HPMax2 = new JTextField();
        add(HPMax2);
        HPMax2.setBounds(600, 260, 50, 20);
        
        final JTextField CritThresh2 = new JTextField();
        add(CritThresh2);
        CritThresh2.setBounds(600, 300, 50, 20);
        
        final JTextField CritPenalty2 = new JTextField();
        add(CritPenalty2);
        CritPenalty2.setBounds(600, 340, 50, 20);
        
        final JTextField CritSpdPenalty2 = new JTextField();
        add(CritSpdPenalty2);
        CritSpdPenalty2.setBounds(600, 380, 50, 20);

        //Play by Play text section at the bottom.
        PlaybyPlay = new JTextArea();
        JScrollPane scroller = new JScrollPane(PlaybyPlay);
        scroller.setBounds(50, 465, 680, 100);
        add(scroller);
        setVisible(true);
        
        
//Combo Boxes-------------------------------------------------------------------
    // Combatant 1 Combo Boxes--------------------------------------------------
        // Combatant 1 Unit List
        String[] Unit1list= {"Infantry"};
        Unit1CB= new JComboBox(Unit1list);
        add(Unit1CB);
        Unit1CB.setBounds(200, 60, 90, 20);
        
        // Combatant 1 Species List
        String[] Species1List= {"Human", "Orc"};
        Species1CB= new JComboBox(Species1List);
        add(Species1CB);
        Species1CB.setBounds(200, 100, 90, 20);
        
    //Combatant 2 Combo Boxes---------------------------------------------------
        // Combatant 2 Unit List
        String[] Unit2list = {"Infantry"};
        Unit2CB= new JComboBox(Unit2list);
        add(Unit2CB);
        Unit2CB.setBounds(600, 60, 90, 20);

        // Combatant 2 Species List
        String[] Species2List= {"Human", "Orc"};
        Species2CB= new JComboBox(Species2List);
        add(Species2CB);
        Species2CB.setBounds(600, 100, 90, 20);
        
//Save Check Box----------------------------------------------------------------
        Save = new JCheckBox();
        add(Save);
        Save.setBounds(50,570,20,20);
        
        
        line20 = new JLabel("Save output to file");
        add(line20);
        line20.setBounds(70,505,150,150);
        
        
//Go Button---------------------------------------------------------------------
        JButton Go = new JButton("Go");
        add(Go);
        Go.setBounds(617, 569, 100, 30);
        Go.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e)
        {
//Fills text boxes----------------------------------------------------------
        Combat1.setText("25");
        Combat2.setText("25");
        Armor1.setText("10");
        Armor2.setText("10");
        Speed1.setText("5");
        Speed2.setText("5");
        HPMax1.setText("100");
        HPMax2.setText("100");
        CritThresh1.setText("50");
        CritThresh2.setText("50");
        CritPenalty1.setText("0");
        CritPenalty2.setText("0");
        CritSpdPenalty1.setText("0");
        CritSpdPenalty2.setText("0");
//Starts duel when Go button is pressed.------------------------------------
        int combatC1 = 25;
        int armorC1 = 10;
        int speedC1 = 5;
        int HPC1 = 100;
        int CritThreshC1 = 50;
        int CritPenaltyC1 = 0;
        int CritSpdPenaltyC1 = 0;
        
    
        //Combatant 2 stats
        int combatC2 = 25;
        int armorC2 = 10;
        int speedC2 = 5;
        int HPC2 = 100;
        int CritThreshC2 = 50;
        int CritPenaltyC2 = 0;
        int CritSpdPenaltyC2 = 0;
        int turn = 0;

    while(HPC1 > 0 && HPC2 > 0){
        int damageC1 = combatC1 * (int)(Math.random()*99)/(100-armorC2) +1; 
        int damageC2= combatC2 * (int)(Math.random()*99)/(100-armorC1) + 1;
        turn += 1;

        if(armorC2 < (int)(Math.random()*99)+1 && HPC1 > 0 && HPC1 <= CritThreshC1 && damageC1 - CritPenaltyC1 > 0 && turn % speedC1 == 0){
            damageC1 -= CritPenaltyC1;
            HPC2 -= damageC1;
            PlaybyPlay.append("Combatant 1 did " + damageC1 + "damage!\n");
            PlaybyPlay.append("Combatant 2 has " + HPC2 + "hit points left!\n");
            
        }
        else if(armorC2 < (int)(Math.random()*99+1) && HPC1 > 0 && turn % speedC1 == 0){
            HPC2 -= damageC1;
            PlaybyPlay.append("Combatant 1 did " + damageC1 + " damage!\n");
            PlaybyPlay.append("Combatant 2 has " + HPC2 + " hit points left!\n");
        }
        else {
            PlaybyPlay.append("Combatant 1 didn't hit.\n");
                    }
    
        if(armorC1 < (int)(Math.random()*99)+1 && HPC2 > 0 && HPC2 <= CritThreshC1 && damageC2 - CritPenaltyC2 > 0 && turn % speedC2 == 0){
            damageC2 -= CritPenaltyC2;
            HPC1 -= damageC2;
            PlaybyPlay.append("Combatant 2 did " + damageC2 + "damage!\n");
            PlaybyPlay.append("Combatant 1 has " + HPC1 + "hit points left!\n");
        }
            else if(armorC1 < (int)(Math.random()*99+1) && HPC2 > 0 && turn % speedC2 == 0){
            
            HPC1 -= damageC2;
            PlaybyPlay.append("Combatant 2 did " + damageC2 + " damage!\n");
            PlaybyPlay.append("Combatant 1 has " + HPC1 + " hit points left!\n");
        }
                    else
                        PlaybyPlay.append("Combatant 2 didn't hit.\n");
    }
    
        Combat1.setText(Integer.toString(combatC1));
        Combat2.setText(Integer.toString(combatC2));
        Armor1.setText(Integer.toString(armorC1));
        Armor2.setText(Integer.toString(armorC2));
        Speed1.setText(Integer.toString(speedC1));
        Speed2.setText(Integer.toString(speedC1));
        HPMax1.setText(Integer.toString(HPC1));
        HPMax2.setText(Integer.toString(HPC2));
        CritThresh1.setText(Integer.toString(CritThreshC1));
        CritThresh2.setText(Integer.toString(CritThreshC2));
        CritPenalty1.setText(Integer.toString(CritPenaltyC1));
        CritPenalty2.setText(Integer.toString(CritPenaltyC2));
        CritSpdPenalty1.setText(Integer.toString(CritSpdPenaltyC1));
        CritSpdPenalty2.setText(Integer.toString(CritSpdPenaltyC1));
        
    if(HPC1 > 0 && HPC2 <= 0){
        PlaybyPlay.append("Combatant 1 has won!\n");

        
    }
        else if(HPC1 <= 0 && HPC2 > 0){
                PlaybyPlay.append("Combatant 2 has won!\n");

        }
                else{
                        PlaybyPlay.append("The match has resulted in a draw!\n");
               
        }

        }

        });
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TermProject();
    }

}


                
  

