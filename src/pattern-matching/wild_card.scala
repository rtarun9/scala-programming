object wild_card {
    def wild_card_match(value: Any): Unit = {
        value match {
            case 9 => println("Number 9 was input.");
            case 'a' => println("a was input.");
            case _ => println("Wild card can match with anything!");
        }
    }

    def main(args: Array[String]): Unit = {
        wild_card_match(3333);
        wild_card_match('a');
        wild_card_match(99.0);
    }
}