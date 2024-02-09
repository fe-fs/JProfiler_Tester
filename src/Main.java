/*Modulo 04 - Assignment
        * Java Jprofiler Tester App
        * Name: Fernanda Frederico Ribeiro da Silva
        * Class: Software Development II CEN-4025C-24671
        * Professor: Walauskis
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        System.out.println("ArrayList Test");
        processList(arrayList);
        System.out.println("\nLinkedList Test");
        processList(linkedList);
        System.out.println("\nHashtable Test");
        processHashtable(hashtable);
    }


   /**processList method
 * Processes a list of integers by adding and then removing elements.
 * The method takes a List<Integer> as an argument.
 * It first adds 2,000,000 random integers to the list,
 * and then removes each element from the list one by one.
 * Progress is printed every 500,000 operations.
    *
 * This method works with both ArrayList and LinkedList as they both implement the List interface
 * @param list The list to be processed. This can be any class that implements the List interface.
 */
    public static void processList(List<Integer> list) {
        //record time setup
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime startTime = LocalDateTime.now();
        //print start time
        System.out.println("Start Time: " + dtf.format(startTime));

        Random random = new Random();
        // Add 2,000,000 random elements
        for (int i = 0; i < 2000000; i++) {
            list.add(random.nextInt());
            if (i % 500000 == 0) { // Print progress every 500,000 operations
                System.out.println("Added " + i + " elements to the List.");
            }
        }

        // Remove each element
        for (int i = 0; i < 2000000; i++) {
            list.remove(0);
            if (i % 500000 == 0) { // Print progress every 500,000 operations
                System.out.println("Removed " + i + " elements from the List.");
            }
        }

        //print end time
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("End Time: " + dtf.format(endTime));
    }
    /**processHashtable method
     *method which adds 2,000,000 random integers into a Hashtable, then deletes each one from the Hashtable
     * This code will take a significant amount of time to run due to the large number of additions and removals performed on the Hashtable.*/
    public static void processHashtable(Hashtable<Integer, Integer> hashtable) {
        //record time setup
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime startTime = LocalDateTime.now();
        //print start time
        System.out.println("Start Time: " + dtf.format(startTime));

        Random random = new Random();
        // Add 2,000,000 random elements
        for (int i = 0; i < 2000000; i++) {
            hashtable.put(i, random.nextInt());
            if (i % 500000 == 0) { // Print progress every 500,000 operations
                System.out.println("Added " + i + " elements to the Hashtable.");
            }
        }
            // Remove each element
            for (int i = 0; i < 2000000; i++) {
                hashtable.remove(i);
                if (i % 500000 == 0) { // Print progress every 500,000 operations
                    System.out.println("Removed " + i + " elements from the Hashtable.");
                }
            }

        //print end time
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("End Time: " + dtf.format(endTime));
        }
    }
