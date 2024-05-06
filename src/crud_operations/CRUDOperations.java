package crud_operations;

import java.util.Arrays;

public class CRUDOperations {
	
	    private String[] data;
	    private int size;

	    public CRUDOperations(int capacity) {
	        data = new String[capacity];
	        size = 0;
	    }

	    // CREATE operation: Add an item to the array
	    public void create(String item) {
	        if (size < data.length) {
	            data[size++] = item;
	        } else {
	            System.out.println("Array is full. Cannot add more items.");
	        }
	    }

	    // READ operation: Retrieve an item from the array
	    public String read(int index) {
	        if (index >= 0 && index < size) {
	            return data[index];
	        } else {
	            return null; // Or throw an exception
	        }
	    }

	    // UPDATE operation: Modify an item in the array
	    public boolean update(int index, String newItem) {
	        if (index >= 0 && index < size) {
	            data[index] = newItem;
	            return true; // Return true if update was successful
	        } else {
	            return false; // Return false if index is out of bounds
	        }
	    }

	    // DELETE operation: Remove an item from the array
	    public boolean delete(int index) {
	        if (index >= 0 && index < size) {
	            for (int i = index; i < size - 1; i++) {
	                data[i] = data[i + 1];
	            }
	            data[--size] = null;
	            return true; // Return true if delete was successful
	        } else {
	            return false; // Return false if index is out of bounds
	        }
	    }

	    public static void main(String[] args) {
	        CRUDOperations crud = new CRUDOperations(5);

	        crud.create("Apple");
	        crud.create("Banana");
	        crud.create("Orange");

	        System.out.println("Initial data: " + Arrays.toString(crud.data));

	        System.out.println("Reading item at index 1: " + crud.read(1));

	        System.out.println("Updating item at index 0: " + crud.update(0, "Pineapple"));
	        System.out.println("After update: " + Arrays.toString(crud.data));

	        System.out.println("Deleting item at index 2: " + crud.delete(2));
	        System.out.println("After delete: " + Arrays.toString(crud.data));
	    }
	}


