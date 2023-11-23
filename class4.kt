import java.util.Scanner
fun main(){
    /**
     * Data types practice
     */
    val byteMaxValue= Byte.MAX_VALUE
    println(byteMaxValue)
    val byteMinValue = Byte.MIN_VALUE
    println(byteMinValue)
    val shortMaxValue = Short.MAX_VALUE
    println("Short Max value :${shortMaxValue}")
    val shortMinValue = Short.MIN_VALUE
    println("Short Min value : $shortMinValue")
    val shortBitsValue = Short.SIZE_BITS
    println("Short Bits value: $shortBitsValue")
    val shortBytesValue = Short.SIZE_BYTES
    println("Short Bytes value : $shortBytesValue")
    val intMaxV = Int.MAX_VALUE
    println("Int max value: $intMaxV")
    val intMinV = Int.MIN_VALUE
    println("Int max value: $intMaxV")
    val intBitsV = Int.SIZE_BITS
    println("Int max value: $intBitsV")
    val intBytesV = Int.SIZE_BYTES
    println("Int max value: $intBytesV")
    val floatMaxV = Float.MAX_VALUE
    println("Float max value: $floatMaxV")
    val floatMinV = Float.MIN_VALUE
    println("Float min value: $floatMinV")
    val doubleMaxV = Double.MAX_VALUE
    println("Double max value: $doubleMaxV")
    val doubleMinV = Double.MIN_VALUE
    println("Double max value: $doubleMinV")
    val doubleBitsV = Double.SIZE_BITS
    println("Double bits value: $doubleBitsV")
    val doubleBytesV = Double.SIZE_BYTES
    println("Double bytes value: $doubleBytesV")
    val longMaxV = Long.MAX_VALUE
    println("Long max value: $longMaxV")
    val longMinV = Long.MIN_VALUE
    println("Long max value: $longMinV")
    val longBitsV = Long.SIZE_BITS
    println("Long max value: $longBitsV")
    val longBytesV = Long.SIZE_BYTES
    println("Long max value: $longBytesV")
    val charMaxV = Char.MAX_VALUE
    println("Char max value: $charMaxV")
    val charMinV = Char.MIN_VALUE
    println("Char max value: $charMinV")
    val charBitsV = Char.SIZE_BITS
    println("Char max value: $charBitsV")
    val charBytesV = Char.SIZE_BYTES
    println("Char max value: $charBytesV")
    val byteMaxV = Byte.MAX_VALUE
    println("Bytes max value: $byteMaxV")
    val byteMinV = Byte.MIN_VALUE
    println("Bytes min value: $byteMinV")
    val byteBitsV = Byte.SIZE_BITS
    println("Bytes Bits value: $byteBitsV")
    val byteBytesV = Byte.SIZE_BYTES
    println("Bytes Bytes value: $byteBytesV")
    //val booleanMaxV = Boolean.
    val int:Int = 10
    println(int)
    val byte:Byte = 127
    println(byte)
    val short:Short = 2554
    println(short)
    val long:Long = 1222336545522122211
    println(long)
    val float:Float = 10.0f
    println(float)
    val double:Double = 20.12
    println(double)
    val str :String = "Rakib"
    println(str)
    val bool:Boolean = true
    println(bool)
    /**
     * Leap year
     */
   var sc = Scanner(System.`in`)
   println("Enter a Year : ")
   var year:Int = sc.nextInt()
   if(year!=0){
       if(year%4==0){
           println("$year is a leap year.")
       }
       else if(year%100==0){
           println("$year is not a leap year.")
       }
       else if(year%400 == 0){
           println("")
   }


}
