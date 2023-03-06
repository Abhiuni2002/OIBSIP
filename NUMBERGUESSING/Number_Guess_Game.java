import java.util.*;
import javax.swing.*;
public class Number_Guess_Game{
    public static void main(String args[]){
        System.out.println("Welcome to Game");
        int round=0;
        int userscore=0;
        int compscore=0;

        // JFrame frame=new JFrame("Number Guessing");
        // frame.setVisible(true);
        // frame.setSize(400,600);
        
        JOptionPane.showMessageDialog(null,"Welcome to Game\n");
        JOptionPane.showMessageDialog(null,"======================*****INSTRUCTIONS*****======================\n" +
                "1 - It is a five Round Number Guessing Game.\n" +
                "2 - User have to Guess the Number between 1 to 100 (Including 1 & 100).\n" +
                "3 - If the user guessing number is greater than computer then User get 1 point.\n" +
                "4 - If the user guessing number is lesser than computer then Computer get 1 point.\n" +
                "5 - If the user guessing number is same as computer then none will get point.\n" +
                "6 - Those who get more points in the game they win the game.");
        System.out.print("Start the Game\n");
        try{
          while(round!=5){
              round++;
              int compans=(int)(Math.random()*100+1);
              String userinp=JOptionPane.showInputDialog(null,"Round: "+round+"\n"+"Guess the number:","ex-"+5);
              int userans=Integer.parseInt(userinp);

              JOptionPane.showMessageDialog(null,"User input is: "+userans+"\nComputer input is: "+compans);
              System.out.println("Computer input is: "+compans);
              System.out.println("User input is: "+userans);

              if(userans>compans){
                JOptionPane.showMessageDialog(null,"Round "+round+" won by User");
                userscore++;
              }else if(userans<compans){
                JOptionPane.showMessageDialog(null,"Round "+round+" won by computer");
                compscore++;
              }else{
                JOptionPane.showMessageDialog(null,"Round "+round+" Tei");
              }
          }
          System.out.println("User score is: "+userscore);
          System.out.println("Computer score is: "+compscore);


          System.out.println("FINAL SCORE");
          int score=0;
          if(userscore>compscore){
            score=userscore-compscore;
            System.out.println("User won the game by: "+score+"points");
            JOptionPane.showMessageDialog(null,"User won the game by :"+score+"points");
          }else if(userscore<compscore){
            score=compscore-userscore;
            System.out.println("Computer won the game by: "+score);
            JOptionPane.showMessageDialog(null,"Computer won the game by: "+score+"points");
          }else{
            System.out.println("None won the game Tie occur");
            JOptionPane.showInputDialog(null,"None won the game Tie occur");
          }
        }catch(Exception e){
            System.out.println("Game crashed");
            JOptionPane.showMessageDialog(null,"Crashed");
        }
    }
}