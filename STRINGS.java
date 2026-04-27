import java.util.ArrayList;
import java.util.Collections;

public class STRINGS {
    length()
    charAt()
    substring()
    indexOf()
    lastIndexOf()
    toUpperCase()
    toLowerCase()
    trim()
    equals()
    equalsIgnoreCase()
    startsWith()
    endsWith()
    contains()
    replace()
    split()
    valueOf()
    add (String str)
    set()
    remove()
    clear()
    get()
    size()
    isEmpty()
    subList()
    toArray()
    StringBuilder
    StringBuffer
    sort()
    sort()+Comp
    reverse()
    shuffle()
    Collections.sort(lista);
    max()
    min()
    frequency()
    binarySearch()
    fill()
    copy()


    for (String elem : lista) {
    System.out.println(elem);
}
 
// No se puede usar lista.remove()
// dentro de un for-each

for (int i = 0; i < lista.size(); i++) {
    System.out.println(
        i + ": " + lista.get(i)
    );
}
 
ArrayList<Integer> nums = new ArrayList<>();
nums.add(5); nums.add(1); nums.add(8); nums.add(3);
// nums = [5, 1, 8, 3]
 
Collections.sort(nums);
// nums = [1, 3, 5, 8]
 
Collections.reverse(nums);
// nums = [8, 5, 3, 1]
 
Collections.shuffle(nums);
// nums = [3, 8, 1, 5]  (aleatorio)

ArrayList<Integer> lista = new ArrayList<>();
lista.add(4); lista.add(2); lista.add(4);
lista.add(7); lista.add(4); lista.add(1);
// lista = [4, 2, 4, 7, 4, 1]
 
int max = Collections.max(lista); // 7
int min = Collections.min(lista); // 1
int freq = Collections.frequency(lista, 4); // 3
 
// binarySearch requiere lista ordenada:
Collections.sort(lista);
// lista = [1, 2, 4, 4, 4, 7]
int pos = Collections.binarySearch(lista, 4);
// pos = 2 (alguna ocurrencia de 4)
// si no existe → valor negativo

}
