/**
 * Refer to Main
 */

package Lab04B;

/***
 * Class Grad extends Instructor blueprint - overrides cope and stress methods
 */
public class Grad extends Instructor {

    /***
     * Constructor for Grad, exact same as Instructor
     * @param age supplies age to constructor
     * @param mail supplies initial unreadMail to constructor
     */
    public Grad(int age, int mail){
        super(age,mail);
    }

    /***
     * Gets rid of all unreadMail, then either adds or subtracts 3 eccentricities
     */
    @Override
    public void cope() {
        reduceMail(getUnreadMail()); //read all the mail!
        if(Math.random() < 0.5){     //50/50 add or remove 3
            addToEccentricities(3);
        }
        else
            addToEccentricities(-3);
    }

    /***
     * function for stress, bound to unreadMail with an upper limit of 1500
     * @return returns int between 0-1500
     */
    @Override
    public int stress(){               //Higher stress cap
        if(getUnreadMail() <= 1500){
            return getUnreadMail();
        }
        //System.out.println("Exceeded 1500!");
        return 1500;
    }
}
