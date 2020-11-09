/*
# FILE: CircleGame.java
# USAGE: --
# DESCRIPTION: File of the game that will interact with the circular lists.
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 11/08/2020
REVISION: --
*/

import java.util.ArrayList;

public class CircleGame
{
    private CircularList<String> alive;
    private int round;
    private ArrayList<String> dead;
    private boolean gameOver;

    /*
     * Takes an array of people from a text file and places them in a circular linked list
     * This circular list is people that are dead
     * @param people, this is an array that is taken from the inputted files
     */
    public CircleGame(ArrayList<String> people)
    {
        prepare(people);
        dead = new ArrayList<>();
        status();
    }

    /*
     * Takes an array of people from a text file and places them in a circular linked list
     * This circular list is people that are alive
     * @param people, this is an array that is take from the inputted files
     */
    private void prepare(ArrayList<String> people)
    {
        alive = new CircularList<>(people);
        alive.tail.next = alive.head;
        round = 1;
    }

    /*
     * Prints out the status of the game at any given moment
     */
    public void status()
    {
        if(alive.size() != 0)
            System.out.println("##### Round " + round + " #####");
        else
            System.out.println("##### Final Status #####");
        if(alive == null)
            System.out.println("Remaining Players: " + 0 + "\n");
        else
            System.out.println("Remaining Players: " + alive.size());
        if(dead == null)
            System.out.println("Dead Players: " + 0 + "\n");
        else
            System.out.println("Dead Players: " + dead.size() + "\n");
    }

    /*
     * Prints out the players that are alive
     */
    public void alivePlayers()
    {
        System.out.println("##### Remaining Players #####");
        CLNode<String> current = alive.head;
        while(true)
        {
            if(current != null)
            {
                System.out.println(current.information);
                if(current.next == alive.head)
                    break;
                current = current.next;
            }
            else
                break;
        }
        System.out.println();
    }

    /*
     * Prints out the players that are in the graveyard
     */
    public void graveyard()
    {
        System.out.println("##### Graveyard #####");
        for(int i = 0; i < dead.size(); i++)
        {
            System.out.println("Round " + (i + 1) + ": " + dead.get(i));
        }
        System.out.println();
    }

    /*
     * Kills a player from the circular list of people alive
     * @param name, this is the name that will be passed through to be removed from the alive list
     */
    public void kill(String name) throws NoInformationException
    {
        if(gameOver)
        {
            System.out.println("Game Over!!");
            return;
        }

        if(!alive.exists(name))
            throw new NoInformationException("\"" + name + "\"" + " was not found! You have to use the same case as the name the file!");
        if(name.equals(alive.tail.information))
            dead.add(alive.remove().information);
        else if(name.equals(alive.head.information))
        {
            dead.add(alive.removeHead().information);
            alive.tail.next = alive.head;
        }
        else
            dead.add(alive.remove(name).information);
        if(alive.size() != 1)
        {
            round++;
            alive.tail.next = alive.head;
            System.out.println(name + " was successfully assassinated!");
        }
        else
        {
            System.out.println(alive.head.information + " is the last one standing! Congratulations " + alive.head.information + "!\n");
            gameOver = true;
        }
    }
}