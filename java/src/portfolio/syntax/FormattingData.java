package syntax;

import java.text.DecimalFormat;

public class FormattingData
{
    public static void main(String[] args)
    {
        double result = 10.0 / 3.0;

        DecimalFormat formatter = new DecimalFormat("0.0#");    // hash = show if significant

        String formattedResult = formatter.format(result);

        System.out.println(formattedResult);

        // Rounding will occur to the number of specified decimal points
    }
}
