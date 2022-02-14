/**
 * Refer to Main
 */

package Lab04B;

/***
 * Class Lecturer extends Instructor blueprint - overrides cope
 */
public class Lecturer extends Instructor {

    /***
     * Constructor for Lecturer, exact same as Instructor
     * @param age supplies age to constructor
     * @param mail supplies initial unreadMail to constructor
     */
    public Lecturer(int age, int mail) {
        super(age, mail);
    }

    /***
     * function deletes 60% of all unreadMail
     */
    @Override
    public void cope() {
        //System.out.println("Lecturer cope!" + getUnreadMail());
        reduceMail((int)(getUnreadMail() * 0.6)); //cast int since mult by 0.6 gives double
    }

}
