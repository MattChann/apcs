# in-place selection sort

Rearrange
an unordered `ArrayList<Integer>`
and use it as the data in an `OrderedList_inArraySlots`.

The re-use is probably contrary to Java's conventions
for its built-in classes. But as a pedagogical tool,
it has the advantage of allowing
the User program to check that the sort
is done in-place.

## count the cost

0. If the number of the elements in the input triples,
the time required to run the reigning champ algorithm
will grow by __three times. This is because the reining champ algorithm has to check three times as many elements.__

0. If the number of the elements in the input triples,
the number of times that the reigning champ algorithm
will be invoked 
will grow by __three times. This is because the algorithm will be invoked the same number of times as the number of elements. Since the number of elements triples, so too does the amount of times the reigning champ algorithm is invoked.__

0. If the number of the elements in the input triples,
the time required for the selection sort
will grow by __nine times. Since the number of times the reigning champ algorithm is invoked grows by three times and the time it takes to run reach reigning champ algorithm also grows by three times, the time required for the selection sort grows by 3 * 3 times which is nine.__
