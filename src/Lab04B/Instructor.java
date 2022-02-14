/**
 * Refer to Main
 */

package Lab04B;

/***
 * Abstract class - used as blueprint for Grad, Lecturer and Faculty
 */
public abstract class Instructor {

    private int age;
    private int unreadMail;
    private int eccen = 0;

    /***
     * constructor used to build Instructor-like object
     * @param age supplies age to constructor
     * @param mail supplies initial mail to constructor
     */
    public Instructor(int age, int mail) {
        this.age = age;
        this.unreadMail = mail;
    }

    /***
     * unreadMail Getter
     * @return returns int of unreadMail
     */
    public int getUnreadMail() {
        return this.unreadMail;
    }

    /***
     * age Getter
     * @return returns int of age
     */
    public int getAge() {
        return this.age;
    }

    /***
     * eccen Getter
     * @return returns int of eccen
     */
    public int getEccen() {
        return this.eccen;
    }

    /***
     * Abstract fct, requires unique implementation for each subclass
     */
    abstract public void cope(); //need new implementation for each subclass

    /***
     * function for stress, bound to unreadMail with an upper limit of 1000
     * @return returns int between 0-1000
     */
    public int stress() {
        if (this.unreadMail <= 1000) {
            return this.unreadMail;
        }
        ///System.out.println("Exceeded 1000!");
        return 1000;
    }

    /***
     * function for respect, difference between age and eccentricity, 0 if difference is negative
     * @return returns positive int
     */
    public int respect() {
        if (this.age - this.eccen >= 0) {
            return this.age - this.eccen;
        }
        return 0;
    }

    /***
     * function subtracts amount of mail from unreadMail class var; never below 0
     * @param readMail supplies function with amount of mail to subtract
     */
    public void reduceMail(int readMail) {
        int change = this.unreadMail - readMail;
        if (change >= 0)
            this.unreadMail = change; //we good
        else
            this.unreadMail = 0;    //if change is negative, default to 0
    }

    /***
     * eccen Setter;
     * function adds or subtracts certain amount from eccen class var;
     * accepts pos or neg change, always keeps class var positive
     * @param eccentricities supplies eccen to add or remove
     */
    public void addToEccentricities(int eccentricities) {
        if (this.eccen + eccentricities >= 0)
            this.eccen += eccentricities;
        else
            this.eccen = 0;         //default back to 0
    }

    /***
     * function supplies object with certain amount of mail to add to unreadMail class var;
     * 20% chance to add or substract 2 eccen from class var;
     * checks to see if stress is higher than respect, calls cope() if so
     * @param newMail supplies function with mail to add
     */
    public void getMail(int newMail) {
        if(newMail <= 0){
            System.out.println("Cannot add 0 or negative number of mail!");
        }
        else {
            this.unreadMail += newMail;
            if (Math.random() < 0.2) {
                if (Math.random() < 0.5) {  //50/50 add or remove 2
                    addToEccentricities(2);     //use our own add to make sure we dont go below 0!
                } else {
                    addToEccentricities(-2);
                }
            }
            System.out.println(stress() + " > " + respect()); //check stress vs respect each mail time
            if (stress() > respect()) {
                System.out.println("Cope!");
                cope();
            }
        }
    }

}
