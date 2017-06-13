/**
 * Has a main function to run the program
 * Have to have a specific file format(attached)
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;

public class CheckBook
{
    public static void main(String[] args)
    {
        String fileName = "checkFile.txt";
        int checkNumber = 0;
        String payee = "";
        float dollarAmount = 0;
        String reason = "";
        
        try
        {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = in.readLine()) != null)
            {
                for (int n = 0; n < 4; n++)
                {
                    if (n == 0)
                    {
                        checkNumber = Integer.parseInt(line);
                    }
                    if (n == 1)
                    {
                        line = in.readLine();
                        payee = line;
                    }
                    if (n == 2)
                    {
                        line = in.readLine();
                        dollarAmount = Float.parseFloat(line);
                    }
                    if (n == 3)
                    {
                        line = in.readLine();
                        reason = line;
                    }
                }
                Check newCheck = new Check(checkNumber, payee, reason, dollarAmount);
                newCheck.printCheck();
            }   
        }
        catch (IOException e)
        {
            System.out.println("There was an Error, check that the file name is correct and the data is in the correct format");
        }
    }
}