public enum Text {
    BBC("World's first malaria vaccine released in Kenya\n" +
            "Tulip Mazumdar\n" +
            "Global Health Correspondent\n" +
            "The world's first malaria vaccine is being rolled out in Kenya from Friday.\n" +
            "It is the third African country to take part in the scheme after Ghana and Malawi.\n" +
            "Across the three countries, more than 300,000 children under the age of two are expected to be given the " +
            "vaccine each year.\n" +
            "The RTS,S vaccine has been 30 years in the making, and it works by training the immune system to attack " +
            "the malaria parasite, which is spread by mosquito bites.\n" +
            "Earlier smaller trials showed that nearly four in 10 babies aged between the ages of five and 17 months, " +
            "who received all four doses of the vaccine, were protected.\n" +
            "The World Health Organization (WHO) says this could be a game changer, but says the vaccine needs to be " +
            "used alongside bed nets and insecticides.\n" +
            "Malaria kills more than 400,000 people a year - more than half of them children in sub-Saharan Africa."),

    ENUM_IN_JAVA("Enumerations serve the purpose of representing a group of named constants in a programming language." +
            " For example the 4 suits in a deck of playing cards may be 4 enumerators named Club, Diamond," +
            " Heart, and Spade, belonging to an enumerated type named Suit. Other examples include natural " +
            "enumerated types (like the planets, days of the week, colors, directions, etc.).\n" +
            "Enums are used when we know all possible values at compile time, such as choices on a menu, " +
            "rounding modes, command line flags, etc. It is not necessary that the set of constants in an enum " +
            "type stay fixed for all time.\n" +
            "In Java (from 1.5), enums are represented using enum data type. Java enums are more powerful " +
            "than C/C++ enums . In Java, we can also add variables, methods and constructors to it. The main " +
            "objective of enum is to define our own data types(Enumerated Data Types).");

    private String text;

    Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
