
//Arrays - once created can not change size
import java.util.Arrays;
String[]
int[]
double[]

String[] items = {"One", "Two", "Three"}
System.out.println(Arrays.toString(items)); // output [One, Two, Three]

System.out.println(items.length) //output 3

String[] favoriteItems;
//constructor
public Function() {
  favoriteItems = new String[10];
}

//setter
public void setFavoriteItems(int Index, String newItem) {
  favoriteItems[Index] = newItem; // reassigns array index value
}


//ArrayList
import java.util.ArrayList;
generic datatypes must be used in < >
ArrayList<Integer> ArrayList<Double> ArrayList<Character>
ArrayList<String> names = new ArrayList<String>();

// ArrayLists can hold mixed value types but is not preferred
ArrayList assortment = new ArryaList<>();

//add items to ArrayList
// .add() - adds to end of array list
arrayListOfItems.add(item); 
//add at specific index, items at that index and above will be shifted one index higher
//error will occur if that index does not already exist
arrayListOfItems.add(index#, item);

// .get() - access index value
arrayListOfItems.get(#);

// .set() - change value at index
arrayListOfItems.set(index#, value);

// .remove() - removes SINGLE item from array, can be index# or value
arrayListOfItems.remove(1); || arrayListOfItems.remove("hello");

// find index # of a value - .indexOf();
arrayListOfItems.indexOf("hello");

take an array list and add up each value:
 for (int i = 0; i < expenses.size(); i++) {
      total += expenses.get(i);
    }





//A HashMap uses key value pairs
HashMap<String, String> fossilDirectory = new HashMap<>();

//A HashSet is an unordered list of unique values
HashSet<String> supplies = new HashSet<>();