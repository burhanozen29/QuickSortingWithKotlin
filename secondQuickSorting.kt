
import java.util.*

/**
 * Created by Burhan Özen on 31.10.2017.
 */
class secondQuickSorting {

 
  var numberList : IntArray? = null
    var length : Int? = null
    var counterJ : Int = 0


    fun sort(inputArr:IntArray){

        numberList = inputArr
        var length : Int = inputArr.size
        quickSort(0,length-1)

    }

    fun quickSort(lowNum:Int,highNum:Int){

        var i : Int = lowNum
        var j : Int = highNum
        var pivot = numberList!!.get(lowNum)

        while (i<j){
            while(numberList!!.get(i) > pivot){
                i++
                counterJ++
            }
            while(numberList!!.get(j) < pivot){
                j--
            }
            
            if (j>=i){
               val temp : Int = numberList!!.get(i)
       		 numberList!![i] = numberList!![j]
      		  numberList!![j] = temp
                i++
                j--
            }
        }
        if (lowNum < j)
            quickSort(lowNum, j);
        if (i < highNum)
            quickSort(i, highNum);

    }


    fun main(args:Array<String>){

        val rand = Random()
        println("Numbers automatically generated: ")
        val numb : Int = rand.nextInt(100)
        var numberList = IntArray(numb+1, {i: Int -> rand.nextInt(100) })
        println ("Non-sorted List: " + numberList.asList() )

        sort(numberList)
        println(" Sorted List: " + numberList.asList())
        println("$counterJ times.")

    }

}
