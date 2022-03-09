package com.company;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public void insert(int item) {
        if (items.length == count) {  //If the array is full,resize it
            int[] newItems = new int[count *2]; //New array, twice the size
            for (int i = 0; i < count; i++) //Copy all the existing items
                newItems[i] = items[i];
            items = newItems; //Set "items" to this new array
        }
        items[count++] = item; // Add the new item at the end
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) // Validate the index first
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++) //Shift the items to the left
            items[i] = items[i + 1];

        count--;
    }
    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }


}
