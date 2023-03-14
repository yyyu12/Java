package person;

/**
 * @author Yang, Yuanhua
 * @version 1.0
 * @since March 26th, 2022
 * The class Person includes a enum type Gender with two values in it (MALE and FEMALE)
 * The constructor will initialize the five instance variables in the class, which are 
 * the Person's surname (String), givenName (String), occupation (String), gender (Gender), and year of birth (int).
 * It also includes a method called toString that will convert the object into a readable format to the standard output
 * At last, Person class has a method called sameAs that will compares whether the attributes of two Person classes are the same
 */

public class Person {

    public enum Gender {MALE, FEMALE};

    private String surname, givenName;
    private String occupation;
    private Gender gender;
    private int birthYear;

    /**
     * The constructor of Person
     * @param surname a String type showing the person's surname
     * @param givenName a String type showing the person's givenName
     * @param occupation a String type showing the person's occupation
     * @param gender a enum type Gender showing the person's gender
     * @param birthYear an int type showing the person's year of birth
     */
    public Person(String surname, String givenName, String occupation, Gender gender, int birthYear) {
        this.surname = surname;
        this.givenName = givenName;
        this.occupation = occupation;
        this.gender = gender;
        this.birthYear = birthYear;
    }
    
    /**
     * The method toString will convert the Person object into a certain format of string that will be displayed on the standard output
     * No parameter is required
     * @return the string representing the person object
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Surname:" + surname + '\n');
        sb.append("Given name: " + givenName + '\n');
        sb.append("Occupation: " + occupation + '\n');
        if (gender == Gender.MALE) sb.append("Gender: male\n");
        if (gender == Gender.FEMALE) sb.append("Gender: female\n");
        sb.append("Birth year: " + birthYear + '.');
        return sb.toString();
    }

    /**
     * The method sameAs(Person that) will compare this person object has the same attributes as that person object
     * @param that Another Person object to be compared
     * @return true if this and that have same attributes, false if this and that have different attributes
     */
    public boolean sameAs(Person that) {
        if (that != null) {
            return surname.equals(that.surname) && givenName.equals(that.givenName) && occupation.equals(that.occupation) && gender == that.gender && birthYear == that.birthYear;
        }
        else {return false;}
    }

}
