/*
 Homework #4
 The Fundamentals of Java
 Chapter 4 - Data Structure
 */
package homework4;
import java.util.*;

/*
 * This code written by : Azka S. Firdaus
 * Monday, 07 September 2020
 */
public class Homework4 {

    public static void main(String[] args) {
        String[] keys = {"Title", "Artist", "Year Released", "Genre"};
        String[] values = {"High Hopes", "Panic! At The Disco", "2018", "Pop rock"};
        
        //Put all variables into a single Data Structure(Map)
        Map<String,String> favSong = new HashMap<>();
        for (int i=0; i<keys.length; i++) {
            favSong.put(keys[i],values[i]);
        }
        
        //Printing out the result using a single for loop
        System.out.println("My Favorite Song");
        for (String key : keys) {
            System.out.print(key + " : ");
            System.out.println(favSong.get(key));
        }
        //Original code from Homework#2
        //String title = "\"High Hopes\"";
        //String artist = "Panic! At The Disco";
        //int year_released = 2018;
        //String genre = "Pop rock";
        //System.out.print("My favorite song is " + favSong.get("title"));
        //System.out.System.out.println(" by " + favSong.get("artist") + ".");
        //System.out.print("It is a " + favSong.get("genre") + " song");
        //System.out.System.out.println(" released in " + favSong.get("year_released") + ".");
    }
    
}
