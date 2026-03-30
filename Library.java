/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements {
  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      collection = new Hashtable<>();
      System.out.println("You have built a library: 📖");
    }

    public void addBook(String title, boolean isAvailable) {
      collection.put(title, isAvailable);
    }

    public void addTitle(String title) {
      collection.put(title, true);
    }
    public String removeTitle(String title){
      returnBook(title);
      return title;
    }

    public void checkOut(String title) {
      collection.put(title, false);
    }

    public void returnBook(String title) {
      collection.put(title, true);
    }
    public boolean containsTitle(String title){
      return collection.containsKey(title);
    }
    // returns true if the title appears as a key in the Libary's collection, false otherwise
    public boolean isAvailable(String title){
      return collection.get(title);
    } // returns true if the title is currently available, false otherwise
    public void printCollection(){ // prints out the entire collection in an easy-to-read way (including checkout status)
      for (String title : collection.keySet()) {
        System.out.println(title + ": " + (collection.get(title) ? "Available" : "Checked Out"));
      }
}





    public static void main(String[] args) {
      new Library();
    }


  }