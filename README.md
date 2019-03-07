# List_inArraySlots 
By: Matthew Chan and David Qiu

## `List_inArraySlots` class
A list of items, of type `int`, whose size may change when needed, represented by an array.

### Fields
- `private int[] list`
   - the array encapsulated
- `private int capacity`
   - the current capacity (amount of spaces available to store items) of the list
- `private int lastIndex`
   - the index of the last populated item in the list; starts at -1

### Constructor(s)
- `public List_inArraySlots()`
   - creates a new instance of default capacity; starts with capacity 8
- `public List_inArraySlots(int size)`
   - creates a new instance of specified size

### Methods
- `public void add(int element)`
   - adds an element to the end of the list
- `public void add(int index, int element)`
   - adds an element to a specific index within the list
- `public void remove(int index)`
   - removes the item at the specified index
- `public E get(int index)`
   - returns the item at the specified index
- `public void set(int index, int element)`
   - overwrites the element at the specified index
- `public int size()`
   - returns the amount of items in the list

## `UserOfList` class
Demonstrates the capabilities of `List_inArraySlots`.
