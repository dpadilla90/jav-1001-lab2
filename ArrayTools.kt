fun main() {
    //Encrpt function #1
    fun encrypt(inputString: String, shiftAmount: Int): String {
        val array1 = inputString.toCharArray()

        // Modifying the original array
        for (i in 0 until shiftAmount) {
            val temp = array1[array1.size - 1] // Store the last element temporarily

            for (j in array1.size - 1 downTo 1) {
                array1[j] = array1[j - 1] // Shift each element to the right
            }

            array1[0] = temp // Place the stored element at the beginning
        }
        val shiftedString = array1.joinToString("") //array1 es converted back to a string
        return shiftedString //returns shifted string
    }
    
    val encryptedString: String = encrypt("Carlos", 3) //store result in val
    println(encryptedString) // print result

    //Average function #2
    fun arrayAvg(inputArray: Array<Int>): Double {
        var total = 0.0 // initialize total as double
        for (element in inputArray) {
            total += element // Accumulate the sum ef elements in the array
        }
        return (total / inputArray.size) //Calculate the average divding the total by the array size
    }
    
    println("The average of the array is ${arrayAvg(arrayOf(1, 2, 3, 4, 5, 6))}") //print result
    


    //Array Contain Function #3
    fun arrayContains (inputArray: Array<Int>, searchValue: Int): Boolean {
        for (element in inputArray) {
            if (element == searchValue) {
                return true
        
            }
        }
        return false
    }

    print(arrayContains(arrayOf(1,2,3,4,5,6),0))

}
