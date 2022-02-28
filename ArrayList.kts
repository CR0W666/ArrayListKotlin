package arraylist

class PirateArrrayList(private var elements: Any?[]) {
    
    //returns the size of the List
    fun size(): Int {
        return elements!.size
    }

    //returns if the list is empty
    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }

    fun indexOf(element: Any): Int {
        for (i in elements.indices) {
            if (elements[i] == element) return i
        }
        return -1
    }

    fun toArray(): Any?[] {
        return elements
    }

    fun get (pos: Int): Any {
        return if (pos < elements.size) elements[pos]
        else -1
    }

    fun add (element: Any) {
        val newArr = elements.copyOf(elements.size + 1)
        newArr[newArr.size-1] = element
        elements = newArr
    }

    fun set (pos: Int,element: Any) {
        elements[pos] = element
    }

    fun contains(element: Any): Boolean {
        for (i in elements.indices){
            if(elements[i] == element ) return true
        }
        return false
    }

    fun lastIndexOf(element: Any): Int{
        for(i in elements.size-1 downTo 0)
            if(elements[i] == element){
                return i
            }
        return -1
    }
}

fun main() {
    val arrayList = PirateArrrayList(intArrayOf(420, 69, 0, 616))
    println("Size: " + arrayList.size())
    println("Is Empty: " + arrayList.isEmpty())
    println("Index of 69: " + arrayList.indexOf(69))
    println("To Array: " + arrayList.toArray().contentToString())
    println("Get real num of the beast: " + arrayList.get(3))
    arrayList.add(9001)
    arrayList.set(0,123)
    println("Updated: " + arrayList.toArray().contentToString())
    println("Contains fake devil number: " + arrayList.contains(666))
    println("lastIndexOf 2: " + arrayList.lastIndexOf(2))
    println("lastIndexOf 0: " + arrayList.lastIndexOf(0))
}
main()