object wild_card {
    def constant_match(value: Any): Unit = {
        value match {
            case 9 => println("Number 9 was input.");
            case 'a' => println("a was input.");
            case 100 => println("10 was matched!");
            case default => println("Default case : same as wild card when placed at the bottom.");
        }
    }

    def main(args: Array[String]): Unit = {
        constant_match(3333);
        constant_match(100);
        constant_match('a');
        constant_match(99.0);
        constant_match(9);
    }
}