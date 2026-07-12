package syntax.TypeChecking;

public class AdvancedWidget extends Widget
{
    private int advancedness;

    public AdvancedWidget(String name, int advancedness)
    {
        super(name);
        this.advancedness = advancedness;
    }

    public int getAdvancedness()
    {
        return advancedness;
    }
}
