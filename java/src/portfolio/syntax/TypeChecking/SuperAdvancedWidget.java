package syntax.TypeChecking;

public class SuperAdvancedWidget extends AdvancedWidget
{
    private int superiority;

    public SuperAdvancedWidget(String name, int advancedness, int superiority)
    {
        super(name, advancedness);
        this.superiority = superiority;
    }

    public int getSuperiority()
    {
        return superiority;
    }
}
