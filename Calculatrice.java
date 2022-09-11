package maous.xyz;

import java.util.Scanner;

public class Calculatrice {
    public static void main(String args[]){
        int premier_nombre, second_nombre;
        boolean arret_du_programme = false;
        Scanner scanner = new Scanner(System.in);


        while(arret_du_programme != true){
            System.out.println("Calculatrice");
            System.out.println("Veuillez entrez votre premier nombre : ");
            premier_nombre = scanner.nextInt();
            System.out.println("Veuillez entrez votre second nombre : ");
            second_nombre = scanner.nextInt();
            int addition = premier_nombre + second_nombre;
            int soustraction = premier_nombre - second_nombre;
            double division = premier_nombre / second_nombre;
            int multiplication = premier_nombre * second_nombre;
            System.out.println(premier_nombre + " + " + second_nombre + " = " + addition);
            System.out.println(premier_nombre + " - " + second_nombre + " = " + soustraction);
            System.out.println(premier_nombre + " / " + second_nombre + " = " + division);
            System.out.println(premier_nombre + " * " + second_nombre + " = " + multiplication);
            System.out.println("Souhaitez-vous arrêter le programme? Tapez 1 si vous voulez arrêtez, tapez 2 si vous voulez continuer : ");
            int response = scanner.nextInt();
            if(response == 1){
                System.out.println("Vous avez décider d'arrêter la calculatrice");
                arret_du_programme = true;
            }
            else if(response == 2){
                System.out.println("Vous avez décider de continuer la calculatrice");
                continue;
            }
        }
    }
}
