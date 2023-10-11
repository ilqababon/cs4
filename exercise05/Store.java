import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name = name;
    this.earnings = 0;
    // Initialize itemList as a new ArrayList
    this.itemList = new ArrayList();
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    if (index > itemList.size()) {
        System.out.printf("There are only %d items in the store %n", itemList.size());
    }
    else {
        // get Item at index from itemList and add its cost to earnings
        this.earnings += itemList.get(index).getCost();
        // print statement indicating the sale
        System.out.println("This item has been sold.");
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    Boolean found = false;
    int indexFound = 0;
    for (int i = 0; i < itemList.size(); i++) {
        if (itemList.get(i).getName() == name) {
            found = true;
            indexFound = i;
        }
    }
    if (!found) {
        System.out.println("This store does not sell this item");
    }
    else {
        this.earnings += itemList.get(indexFound).getCost();
        System.out.println("This item has been sold");
    }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    if (!(itemList.contains(i))) {
        System.out.println("This store does not sell this item.");
    }
    else {
        // get Item i from itemList and add its cost to earnings
        this.earnings += i.getCost();
        // print statement indicating the sale
        System.out.println("This item has been sold");
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for (int i = 0; i < itemList.size(); i++) {
        if (itemList.get(i).getType() == type) {
            System.out.println(itemList.get(i).getName());
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    for (int i = 0; i < itemList.size(); i++) {
        if (itemList.get(i).getCost() <= maxCost) {
            System.out.println(itemList.get(i).getName());
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    for (int i = 0; i < itemList.size(); i++) {
        if (itemList.get(i).getCost() >= minCost) {
            System.out.println(itemList.get(i).getName());
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for (int i = 0; i < storeList.size(); i++) {
        System.out.printf("%s earned %2f. %n", storeList.get(i).name, storeList.get(i).earnings);
    }
  }
}
