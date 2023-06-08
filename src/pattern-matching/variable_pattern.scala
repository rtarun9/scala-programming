object variable_pattern {
    def variable_match(value: Any): Unit = {
        value match {
            case n => print("n: ", n);
        }
    }

    def main(args: Array[String]): Unit = {
        variable_match(3333);
        variable_match(100);
        variable_match('a');
        variable_match(99.0);
        variable_match(9);
    }
}