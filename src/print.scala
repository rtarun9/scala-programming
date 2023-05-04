object print_obj {
    def main(args: Array[String]) : Unit = {
        val name = "Scala Lang";
        val city = "Unknown";
        val phone_number = 9999;

        printf("Name :: %s.\nCity :: %s.\nPhone Number :: %d.\n", name, city, phone_number);
    }
}