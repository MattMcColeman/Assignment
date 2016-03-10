import javafx.collections.*;
import java.util.*;
import java.io.*;

public class DataSource
{
	public static ObservableList<Student> getAllStudents()
	{
		ObservableList<Student> prob= FXCollections.observableArrayList();
		try
		{
			Scanner sc = new Scanner(new File("WordProbabilities"));
			while (sc.hasNext())
			{
				String fName = sc.next();
				Double val = Double.parseDouble(sc.next());
				String type = "";
				if (val > 0.75 )
				{
					type = "Spam";
				}
				else 
				{
					type = "ham";
				}
				prob.add(new Student(fName,type,val));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return prob;
	}
}