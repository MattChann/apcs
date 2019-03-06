# List_inArraySlots 
By: Matthew Chan and David Qiu

## `List_inArraySlots<E>` class
A list of items of type E whose size may change when needed, represented by an array.

### Fields
- `private E[] list`
   - the array encapsulated
- `private int size`
   - the current size (amount of spaces available to store items) of the array

### Constructor(s)
- `public List_inArraySlots()`
   - creates a new instance of default size
- `public List_inArraySlots(int size)`
   - creates a new instance of specified size

### Methods
- `public void add(E element)`
   - adds an element to the end of the list
- `public void add(int index, E element)`
   - adds an element to a specific index within the list
- `public void remove(int index)`
   - removes the item at the specified index
- `public E get(int index)`
   - returns the item at the specified index
- `public void set(int index, E element)`
   - overwrites the element at the specified index
- `public int length()`
   - returns the amount of items in the list

## `UserOfList` class
Demonstrates the capabilities of `List_inArraySlots<E>`.
