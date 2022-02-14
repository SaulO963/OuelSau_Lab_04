/**
 * Refer to Main
 */

package Lab04B;

/***
 * Class Faculty extends Instructor blueprint - overrides cope
 */
public class Faculty extends Instructor {

    /***
     * Constructor for Faculty, exact same as Instructor
     * @param age supplies age to constructor
     * @param mail supplies initial unreadMail to constructor
     */
    public Faculty(int age, int mail) {
        super(age, mail);
    }

    /***
     * function will add 30 eccen to eccen class var
     */
    @Override
    public void cope() {
        addToEccentricities(30);
    }

    /***
     * function for respect, returns sum of age and eccen
     * @return returns int sum of age and eccen
     */
    @Override
    public int respect() {
        return getAge() + getEccen();
    }

}
