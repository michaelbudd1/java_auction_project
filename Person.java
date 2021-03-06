/**
 * Maintain details of someone who participates in an auction.
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Person
{
    // The name of this person.
    private final String name;

    /**
     * Create a new person with the given name.
     * @param name The person's name.
     */
    public Person(String name)
    {
        this.name = name;
    }

    /**
     * @return The person's name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
    * @return the persons name when toString is called
    **/
    public String toString()
    {
        String details = getName();
     
        return details;
    }
}
