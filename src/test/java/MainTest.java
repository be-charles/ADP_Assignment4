import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MainTest {
    //Collection is the core interface that all collections implement.
    //ArrayList implements List which implements Collection. Add() is an example of a method that Collection contains which returns a boolean that indicates whether the item was added
    @Test
    public void collectionAddTest(){
        ArrayList<User> users = new ArrayList<>();
        Assert.assertEquals(true, users.add(new User()));        //We expect the item to be added and return true
    }

    //Map is used to give values a unique key which will be used to retrieve the value.
    //Map is very similar to Dictionary with the key difference being that Dictionary is an abstract class while Map is an interface
    //HashMap implements the Map interface
    @Test
    public void mapRetrieveValueByKeyTest(){
        HashMap<Long, String> map = new HashMap<>();
        String value = "A";
        Long key = 21822L;
        map.put(key, value);
        Assert.assertEquals(value, map.get(key));
    }

    //List extends collection so that it may store an ordered collection of items which allows us to retrieve items by index. Items may be duplicates of other items
    //Array list implements the List interface
    @Test
    public void listRetrieveValueByIndexTest(){
        ArrayList<User> users = new ArrayList<>();
        User userOne = new User();
        User userTwo = new User();
        userOne.setAge(1);
        userOne.setName("A");
        userTwo.setAge(2);
        userTwo.setName("B");
        users.add(userOne);     //index = 0
        users.add(userTwo);     //index = 1
        Assert.assertEquals(userTwo, users.get(1));     //get user @ index 1 (userTwo)
    }

    //Set extends collection so that it may store unique items
    //HashSet implements Set
    @Test
    public void setAttemptDuplicateInsert(){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        //HashSet.add() returns a boolean which tells us if the value was added(true) or not(false). By adding a duplicate item, we expect the add method call to return a fail(false)
        Assert.assertEquals(false, hashSet.add(1));
    }
}