import java.awt.Color;

import javax.swing.*;
public class PokeGUI {
    public static void main(String[] args) {
        Pokemon Lucario=new Pokemon(40,50,50,"Fight","Lucario","Sinnoh");
        Pokemon Charizard=new Pokemon(50, 30, 20, "Fire","Charizard","Kanto");
        Pokemon Pikachu= new Pokemon(30, 10, 40, "Electric","Pikachu","Kanto");
        Pokemon Luxray= new Pokemon(30, 40, 33, "Electric","Luxray","Sinnoh");
        Pokemon Alakazam=new Pokemon(40, 50, 50, "Psychich","Alakazam","Sinnoh"); 

        Pokemon pokedex[]= new Pokemon[5];
        pokedex[0]=Lucario;
        pokedex[1]=Charizard;
        pokedex[2]=Pikachu;
        pokedex[3]=Luxray;
        pokedex[4]=Alakazam;

        JFrame frame=new JFrame();
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setBounds(300,300,500,350);
        frame.setVisible(true);

        //ImageIcon iconpikachu = new ImageIcon("Pikachu.png");



        String namePokemon=JOptionPane.showInputDialog(frame, "Choose a Pokemon");   //take an input from a box GUI
        boolean found=false;
        for (Pokemon pokemon:pokedex){
            if(pokemon.getName().equals(namePokemon)){
                String description = "*Name*: " + pokemon.getName() +
                  " *Attack*: " + pokemon.getAttack() +
                  " *Defence*: " + pokemon.getDefence() +
                  " *Health*: " + pokemon.getHealth() +
                  " *Type*: " + pokemon.getType() +
                  " *Region*: " + pokemon.getRegion() +
                  "\n" + // Add a newline for better formatting
                  pokemon.sayHello();
                JOptionPane.showMessageDialog(frame,description);
                found=true;
                if(found==true){
                    frame.setVisible(false);
                    break;
                }
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Pokemon not found in Pokedex.");
            frame.setVisible(false);
        }
    }
}