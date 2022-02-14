/**
 * Name: Saul Ouellet
 * Date: Feb 15th 2022
 * Description: Package implements an Instructor abstract class, then 3 subclasses called Grad,
 *  Lecturer, and Faculty. Instructor class implements various methods depending on the
 *   age, eccentricities, and unreadMail class variables. Each subclass implements a unique
 *   cope mechanism, plus some extra guidelines for the Grad and Faculty subclasses.
 */

package Lab04B;

/***
 * Main class
 */
public class Main {

    /***
     * It's a main, what else is there to say?
     * @param args supplies args to main
     */
    public static void main(String[] args) {

        Grad grad = new Grad(20, 0);
        Lecturer lect = new Lecturer(40, 0);
        Faculty facu = new Faculty(70, 0);

        Instructor[] group = {grad, lect, facu};

        for (int day = 1; day <= 10; day++) {
            System.out.println("================================");
            System.out.println("Day #" + day);
            for (int i = 0; i < group.length;i++) {
                System.out.println("--------------------------------");
                if(i == 0)System.out.println("GRAD");if(i == 1)System.out.println("LECT");if(i == 2)System.out.println("FACU");
                System.out.println(i + " Start mail: " + group[i].getUnreadMail());
                System.out.println(i + " Start Eccen: " + group[i].getEccen());
                System.out.println("Adding Mail: " + ((day*10)+50));
                group[i].getMail(((day * 10) + 50));
                System.out.println(i + " End mail: " + group[i].getUnreadMail());
                System.out.println(i + " End Eccen: " + group[i].getEccen());
                System.out.println("--------------------------------");
            }
            System.out.println("================================");
        }


    }
}
