/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maplab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @version Spring 2019
 * @author Kyle
 */
public class MapProblems {
    
    /**
     * Modify and return the given map as follows: if the key "a" has a value,
     * set the key "b" to have that value, and set the key "a" to have the value
     * "". Basically "b" is confiscating the value and replacing it with the
     * empty string.
     *
     * @param map to be edited
     * @return map
     */
    public Map<String, String> confiscate(Map<String, String> map) {

        // checks to make sure that map contains a key "a" and that "a" has a
        // value
        if(map.containsKey("a") && map.get("a") != null){
            // put "b" key to the "a" key value
            map.put("b", map.get("a"));
            // put "a" key value to nothing
            map.put("a", "");
            
        }
        return map;
    }
    /**
     * Modify and return the given map as follows: if the key "duck" has a
     * value, set the key "goose" to have that same value. In all cases remove
     * the key "swan", the rest of the map should not change.
     *
     * @param map to be edited
     * @return map
     */
    public Map<String, String> mapBird1(Map<String, String> map) {
        
        // if "duck" has value then put the key to "goose" with "duck" as value
        if(map.containsKey("duck") && map.get("duck") != null){
            map.put("goose", map.get("duck"));
        }
        // remove key "swan" for all cases
        map.remove("swan");
        return map;
    }

    /**
     * Given a map of bird keys and topping values, modify and return the map as
     * follows: if the key "turkey" has a value, set that as the value for the
     * key "chicken". If the key "vulture" has a value, set that as the value
     * for the key "buzzard".
     *
     * @param map to be edited
     * @return map
     */
    public Map<String, String> mapBird2(Map<String, String> map) {
        
        // Case 1: Change the key "turkey" and its value to put as the value for
        // the key "chicken"
        if(map.containsKey("turkey") && map.get("turkey") != null){
            map.put("chicken", map.get("turkey"));
        }
        
        // Case 2: Change the key "vulture" and its value to put as the value for
        // the key "buzzard"
        if(map.containsKey("vulture") && map.get("vulture") != null){
            map.put("buzzard", map.get("vulture"));
        }
        return map;
    }

    /**
     * Given an array of strings, return a Map<String, Integer> with a key for
     * each different string, with the value the number of times that string
     * appears in the array.
     *
     * @param strings array
     * @return map
     */
    public Map<String, Integer> wordCount(ArrayList<String> strings) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for(String key : strings){
            Integer count = hashMap.get(key);
            
            if(count == null)
                count = 0;
            
            hashMap.put(key, count+1);
        }
        return hashMap;
    }

    /**
     * Given an ArrayList of Strings, create a new map that creates a key for
     * each String by multiplying it's length by 7. If a key is already being
     * used do not add the new value.
     *
     * @param str ArrayList of Strings
     * @return new Map
     */
    public Map<Integer, String> intMap(ArrayList<String> str) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        for(String string : str){
            if(!hashMap.containsKey(7*string.length())){
                hashMap.put(7*string.length(),string);
            }
        }
        return hashMap;
    }

    /**
     * Caiomhe has tons of Student Records that need to be organized. She wants
     * you to put all these Records into a Map. The StudentRecord class already
     * has a hashCode method that should be used to create keys. Store all the
     * StudentRecord objects in a new map and then return it.
     *
     * @param students ArrayList of StudentRecord objects
     * @return map
     */
    public Map<Integer, StudentRecord> recordMap(ArrayList<StudentRecord> students) {
        HashMap<Integer, StudentRecord> hashMap = new HashMap<>();
        
        for(StudentRecord student : students){
            hashMap.put(student.hashCode(), student);
        }
        return hashMap;
    }
}
