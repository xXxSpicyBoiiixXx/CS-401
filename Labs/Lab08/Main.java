/*
# FILE: Main.java
# USAGE: --
# DESCRIPTION: Main driver function for the game
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 11/08/2020
REVISION: --
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        execute();
    }

    /*
     * Reads input from a file, there are three test cases that are listed
     * 10names.txt, 100names.txt, 1000names.txt
     * If there is no files then there will be a print statement that say there is none in that file path
     * Now if there is but it is not a text file then you will get a response as such
     * @return path, the path of the file
     */
    private static Path getPath() throws IOException
    {
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(stream);
        System.out.println("Please type the path to the file to use: ");
        Path path;
        while(true)
        {
            path = Paths.get(buffer.readLine());
            if(!path.toFile().exists())
                System.out.println("The specified path doesn't exist");
            else if(!isTextFile(path))
                System.out.println("The specified path isn't a text file!");
            else
                return path;
        }
    }
    /*
     * This checks if the file is indeed a text file.
     * @param path this is the path that will be given from the Path function
     */
    private static boolean isTextFile(Path path)
    {
        return path.toString().substring(path.toString().length() - 3).equals("txt");
    }
    private static ArrayList<String> readNames(Path path) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader(path.toFile()));
        ArrayList<String> people = new ArrayList<>();
        String name;
        while((name = br.readLine()) != null)
            people.add(name);
        Collections.shuffle(people);
        return people;
    }

    /*
     * Prints out the welcoming menu as well as options
     * 1. status: This will give the status of the game
     * 2. alive: Displays who is alive
     * 3. graveyard: Displays who has died
     * 4. kill: This command will kill a name from the circular list
     * 5. exit: This will exit out of the game and give a exiting message
     */
    private static void execute() throws Exception
    {
        CircleGame circle = new CircleGame(readNames(getPath()));
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(stream);
        System.out.println("Welcome to the Elimination game!");
        System.out.println("Please type a command!");
        commands();
        String[] command;
        while(true)
        {
            command = buffer.readLine().split("\\s");
            if(command.length > 2)
                System.out.println("The command is illegal!");
            else
            {
                switch(command[0].toLowerCase())
                {
                    case "status":
                        circle.status();
                        break;
                    case "alive":
                        circle.alivePlayers();
                        break;
                    case "graveyard":
                        circle.graveyard();
                        break;
                    case "kill":
                        try
                        {
                            circle.kill(command[1]);
                        }
                        catch(NoInformationException e)
                        {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "help":
                        commands();
                        break;
                    case "exit":
                        System.out.println("Thanks for playing!");
                        return;
                    default:
                        System.out.println("The command is illegal!");
                        break;
                }
            }
        }
    }

    /*
     * Prints out the commands available to the user
     */
    private static void commands()
    {
        System.out.println("\"status\": Lists the number of alive and dead players in the current round.");
        System.out.println("\"alive\": List the names of people who are still alive.");
        System.out.println("\"graveyard: Lists the names of people who are dead int eh order they died.");
        System.out.println("\"kill <name>\": Kills the specified person.");
        System.out.println("\"help\": Lists the commands");
        System.out.println("\"exit\": Ends the applications");
    }
}