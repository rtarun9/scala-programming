object reverse_array {
    def main(args: Array[String]) = {
        val first_array = Array[Int](1,2,3,4,5);

        println("First array :: ");
        for (i <- first_array) {
            printf("%d ", i);
        }

        println("\nReversed array :: ");
        val reversed = first_array.reverse;

        for (i <- reversed) {
            printf("%d ", i);
        }
    }
}