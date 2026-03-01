/*Si on lance le premier programme avec b = 0
res = a / b;
Le programme s'est-il exécuté correctement ?

Non

Le message "Fin du programme" est-il apparu ?

Non Le programme s’arrête  au moment de la division.

Quelle exception a été levée ?

ArithmeticException

Message:

java.lang.ArithmeticException: / by zero

*/
/* le bloc try / catch
try {
    res = a / b;
    System.out.println("le résultat de " + a + " divisé par " + b + " est " + res);
}
catch (ArithmeticException e) {
    System.out.println("oop ! un problème dans la division");
    System.out.println("le message officiel est " + e.getMessage());
}

System.out.println("Fin du programme");

Si b = 0 :
 Le programme affiche-t-il qu’il y a un problème ? :
 Oui est le message :
    oop ! un problème dans la division
    le message officiel est / by zero
Le message "Fin du programme" apparaît-il ?
Oui:Parce que l’exception est attrapée (catch), donc le programme continue.
 
 */
/*

Ajout du bloc finally
finally {
    System.out.println("le bloc finally sera toujours exécuté");
    System.out.println("et c'est là que l'on fermera par exemple les fichiers");
}
 Le bloc finally a-t-il été exécuté ?

 Oui

Le bloc finally s’exécute toujours, qu’il y ait exception ou non.

4) Si on met catch en commentaire

Si on enlève le catch :

L’exception n’est plus traitée 

Le programme s’arrête brutalement

MAIS le bloc finally s’exécute quand même

L’exception a-t-elle été traitée ?

 Non

 5) Si on entre une lettre au lieu d’un nombre

Exemple :

a = 5
b = x
Que se passe-t-il ?

Le programme plante pendant la lecture :
b = clavier.nextInt();
Quelle exception est lancée ?
InputMismatchException
 */



// correction 
import java.util.Scanner;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) throws Exception {
          Scanner clavier = new Scanner(System.in);

        try {
            int a, b, res;

            a = clavier.nextInt();
            b = clavier.nextInt();

            res = a / b;

            System.out.println("le résultat de " + a + " divisé par " + b + " est " + res);
        }
        catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro !");
        }
        catch (InputMismatchException e) {
            System.out.println("Erreur : vous devez entrer un nombre !");
        }
        finally {
            System.out.println("Fin du programme");
        }
           clavier.close();
       
    }
}
