package syntax.Classes;

public class ClassesOne
{
    /* FIELDS */
    // module code: CO4225 (two letters, four numbers) = String
    private String code;    // instance variable; should be private by default

    // module title: Programming I (String)
    private String title;

    // number of credits: typical 20, common 10 or 40 (any multiple of 5)
    private int credits = 20;    // todo: work out how this can be set to a different value

    // store tutor name
    private String tutorName;

    // level of module (calculate)

    /* CONSTRUCTORS */
    public ClassesOne(String code, String title)
    {
        this.code = code;
        this.title = title;
    }

    public ClassesOne(String code, String title, int credits)
    {
        this(code, title);
        this.credits = credits;
    }

    /* GETTERS AND SETTERS */
    // accessors/getters
    public String getCode()
    {
        return code;
    }

    public String getTitle()
    {
        return title;
    }

    public String getTutorName()
    {
        return tutorName;
    }

    public int getLevel()
    {
        // extract level from the module code
        char levelChar = code.charAt(2);
        return Integer.valueOf(String.valueOf(levelChar));
    }

    public int getCredits()
    {
        return credits;
    }

    // setters
    public void setTutorName(String tutorName)
    {
        this.tutorName = tutorName;
    }

}
