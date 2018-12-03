package Day1

//https://adventofcode.com/2018/day/1

/*
+1, +1, +1 results in  3
+1, +1, -2 results in  0
-1, -2, -3 results in -6
Starting with a frequency of zero, what is the resulting frequency after all of the changes in frequency have been applied?
*/


import java.io.File


fun readFileReturnList(startpoint: Int, filename: String): List<Int> {

    var returnList = mutableListOf<Int>(startpoint)

    File(filename).forEachLine {

        returnList.add(it.toString().replace("+","").toInt())

    }

    return returnList
}

fun main(args: Array<String>) {

    val startingFrequency = 0
    val filename = "src/Day1/input.txt"
    val resultingFrequency = readFileReturnList(startingFrequency, filename).sum()

    println("For a Starting Frequency of $startingFrequency the Resulting Frequency is $resultingFrequency")

}