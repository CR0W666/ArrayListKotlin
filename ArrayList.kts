package arraylist

class PirateArrrayList(private var numbers: IntArray) {
    
    //returns the size of the List
    fun size(): Int {
        return numbers.size
    }

    //returns if the list is empty
    fun isEmpty(): Boolean {
        return numbers.isEmpty()
    }

    fun indexOf(number: Int): Int {
        for (i in numbers.indices) {
            if (numbers[i] == number) return i
        }
        return -1
    }

    fun toArray(): IntArray {
        return numbers
    }

    fun get (pos: Int): Int {
        return if (pos < numbers.size) numbers[pos]
        else -1
    }

    fun add (num: Int) {
        val newArr = numbers.copyOf(numbers.size + 1)
        newArr[newArr.size-1] = num
        numbers = newArr
    }

    fun set (pos: Int,num: Int) {
        numbers[pos] = num
    }

    fun contains(num: Int): Boolean {
        for (i in numbers.indices){
            if(numbers[i] == num ) return true
        }
        return false
    }

    fun lastIndexOf(num: Int): Int{
        for(i in numbers.size-1 downTo 0)
            if(numbers[i] == num){
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