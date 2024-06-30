import java.util.Scanner;

public class Jeu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le joueur 1 : ");
        String j1= sc.nextLine();
        System.out.print("Saisir le joueur 2 : ");
        String j2= sc.nextLine();
        int joueur=1;
        int alu=13;
        int retire=0;

        while (alu>0){
            System.out.print("*************  ");
            if (joueur==1){
                System.out.print(j1);
                joueur++;
            }
            else{
                System.out.print(j2);
                joueur--;
            }
            System.out.println("  *************");

            System.out.print("Alumettes : ");
            for(int i=alu; i>0; i--){
                System.out.print("| ");
            }
            System.out.println();
            while (retire<1 || retire>3){
                System.out.print("Saisir le nombre a retirer : ");
                retire = sc.nextInt();
                while (retire>alu){
                    System.out.print("Saisir le nombre a retirer : ");
                    retire = sc.nextInt();
                }
                if (retire==1){
                    alu--;
                }
                else if (retire==2){
                    alu-=2;
                }
                else if (retire==3){
                    alu-=3;
                }
                else {
                    continue;
                }
            }
            retire=0;
        }
        System.out.print("Le joueur ");
        if (joueur!=1){
            System.out.print(j1);
        }
        else{
            System.out.print(j2);
        }
        System.out.print(" a perdu");
    }
}
