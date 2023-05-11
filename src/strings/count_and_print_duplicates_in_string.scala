import scala.collection.mutable.HashMap;

object duplicate_in_string {
    def main(args: Array[String]) = {
        var frequency_map = new HashMap[String, Int]();

        println("Enter input string.");
        var input_string = scala.io.StdIn.readLine();

        val words = input_string.split(' ');
        for (word <- words) {
           if (frequency_map.contains(word)) {
            frequency_map.addOne(word, frequency_map.get(word).get+1);
           } 
           else {
                frequency_map.addOne(word, 1);
           }
        }        

        for ((key, value) <- frequency_map) {
            if (value > 1) {
                printf("%s :: %s.\n", key, value);
            }
        }
    }
}