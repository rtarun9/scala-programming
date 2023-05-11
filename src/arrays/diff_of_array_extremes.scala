package scala.math;

object diff_of_array_extremes {
    def main(args: Array[String]) = {
        val array = Array(8, 123, 9999, 333, -134, 222, 55, 3, 3, 2, 1);

        val min = array.min;
        val max = array.max;

        println("The min and max of the array is :: " + min + " : " + max);
        println("Diff of max and min is :: " + (max - min))
    }
}