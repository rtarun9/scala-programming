object into_to_string_builder {
    def main(args: Array[String]) : Unit = {
        // Scala strings are immutable, but with a string builder
        // we can append, insert and remote characters. Then, we can 
        // convert the mutable string builder into a immutable string.

        var x = new StringBuilder("");

        for(i <- 0 to 9 by 1) {
            x.append(i.toString)
        }

        x.delete(0,3); 

        print("Result :: " + x.toString)
    }
}