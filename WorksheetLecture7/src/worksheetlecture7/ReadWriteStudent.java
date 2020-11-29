/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheetlecture7;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class ReadWriteStudent
{
    static ArrayList<Student> studentlist;
    static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args)
	{
		studentlist = new ArrayList<Student>();
		int choice;
		do
		{
			System.out.println("1. Add Student To List");
			System.out.println("2. View all Students");
			System.out.println("3. Read Student List From File");
			System.out.println("4. Write List to File");
			System.out.println("5. Quit");
			System.out.print("Your choice :");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1: addStudentToList();break;
			case 2: viewStudents();break;
			case 3: readStudentsFromFile(); break;
			case 4: copyListToFile();break;
			case 5: System.out.println("bye");
			}
		} while (choice!=5);
	}
	
    public static void viewStudents()
    {
        for(Student s:studentlist)
                System.out.println(s.toString());
    }    
    public static void addStudentToList(){
	{
		System.out.print("Enter student name :");
		String name = sc.nextLine();
		System.out.print("Enter marks for " + name + " : ");
		double marks = sc.nextDouble();
		sc.nextLine();
		Student s = new Student(name, marks);
		studentlist.add(s);
	}
    }
    public static void copyListToFile()
    {
        System.out.print("Enter file name : ");
        String fileName = sc.nextLine();
      
        
        FileWriter newFw = null;
        BufferedWriter newBw = null;
        
        try
        {
                newFw = new FileWriter(fileName);
                newBw = new BufferedWriter(newFw);
                
                for(int i =0;i<studentlist.size();i++){
                    newBw.write(studentlist.get(i).getName()+","+studentlist.get(i).getMarks());
                    newBw.newLine();          
                }
               
        }
        catch(IOException ioe)
        {
                System.out.println("Error unexpected");
        }
        finally
        {
                try{
                    if (newBw!=null)
                        newBw.close();
                    
                    if (newFw!=null)
                        newFw.close();
                }
                catch(IOException ioe){
                    System.out.println("Unexpected error");
                }
        }
    }
   public static void readStudentsFromFile()
{
	System.out.print("Enter file name: ");
	String fileName = sc.nextLine();
	FileReader fr = null;
	BufferedReader br = null;
  	try
	{
	 	fr = new FileReader(fileName);
		br = new BufferedReader(fr);
			
		String line;
		line = br.readLine();
		while (line != null) 
		{
			StringTokenizer st = new StringTokenizer(line, ",");
			String name = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			Student s = new Student(name, score);
			studentlist.add(s);
			line = br.readLine(); 
		}
	  }
	  catch (FileNotFoundException e)
	  {
	    System.out.println("File '" + fileName + "' does not exist");
	    return;
	  }
	  catch (IOException ioe)
	  {
		System.out.println("Error in reading");
	  }
	  finally
	  {
		try
		{
			if (fr != null)
				fr.close();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
	  } 
}


}


