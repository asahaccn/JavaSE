

A linked list of characters can be used to do this.

In this instance, think of an array list as an array with unlimited length. For this, instead of adding values to the END of the array, we will add them to the BEGINNING of the linked list

LinkedList<Character> linkedList = new LinkedList<Character>();
String str = "Hello World";

for (int i = 0; i < str.length(); i++) {
    linkedList.addFirst(str.charAt(i));
}

//whenever it is time to print the value....
for (char c : linkedList) {
    //Print it out, one character at a time
    System.out.print(c);
}

Whenever you have to add more characters to it, just use linkedList.addFirst() to append it to the beginning.
