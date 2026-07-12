package syntax.TypeChecking;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Widget widget1 = new Widget("Basic widget");
        AdvancedWidget widget2 = new AdvancedWidget("Advanced widget", 3);
        SuperAdvancedWidget widget3 = new SuperAdvancedWidget("Super widget", 3, 2);
        SuperAdvancedWidget widget4 = new SuperAdvancedWidget("Super widget 2", 5, 8);

        ArrayList<Widget> widgets = new ArrayList<>();
        widgets.add(widget1);
        widgets.add(widget2);
        widgets.add(widget3);
        widgets.add(widget4);

        int countOfAdvancedWidgets = 0;
        int countOfSuperWidgets = 0;
        int countOfAdvancedButNotSuperWidgets = 0;
        int sumOfSuperAdvancedWidgetSuperiority = 0;

        for (Widget widget : widgets)
        {
            // exact match of class, disregards subclasses
            if (widget instanceof AdvancedWidget)
            {
                countOfAdvancedWidgets++;
            }

            // type checking - matches any class or subclass
            if (widget instanceof SuperAdvancedWidget)
            {
                countOfSuperWidgets++;

                // increment the sum of superiority

                //                                       cast
                sumOfSuperAdvancedWidgetSuperiority += ((SuperAdvancedWidget)widget).getSuperiority();
            }

            if (widget.getClass() == AdvancedWidget.class)
            {
                countOfAdvancedButNotSuperWidgets++;
            }
        }

        System.out.println("There are " + countOfAdvancedWidgets + " advanced widgets");
        System.out.println("There are " + countOfSuperWidgets + " super advanced widgets");
        System.out.println("There are " + countOfAdvancedButNotSuperWidgets + " advanced widgets that aren't super");

        if (countOfSuperWidgets > 0)
        {
            int averageSuperiority = sumOfSuperAdvancedWidgetSuperiority / countOfSuperWidgets;
            System.out.println("The average superiority of super widgets is " + averageSuperiority);
        }

    }
}
