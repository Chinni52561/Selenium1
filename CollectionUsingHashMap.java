package myself;


	import java.util.HashMap;
	import java.util.Collection;

	public class CollectionUsingHashMap {
	    public static void main(String[] args) {
	        // Create a HashMap
	        HashMap<Integer, String> hashMap = new HashMap<>();

	        // Add some key-value pairs to the HashMap
	        hashMap.put(1, "Leela");
	        hashMap.put(2, "Pravallika");
	        hashMap.put(3, "Nandam");
	       

	        // Get the collection view of values from the HashMap
	        Collection<String> values = hashMap.values();

	        // Print the values
	        System.out.println("Values in the HashMap are :");
	        for (String value : values) {
	            System.out.println(value);
	        }
	    }
	

}
