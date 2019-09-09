public enum catColor {
    RED("Red"),
    BLACK("Black"),
    WHITE("White"),
    BROWN("Brown"),
    RAINBOW("Rainbow");

    private String nameCl;

    catColor(String name) {
        this.nameCl = name;
    }

    public String getNameCl() {
        return nameCl;
    }
}
