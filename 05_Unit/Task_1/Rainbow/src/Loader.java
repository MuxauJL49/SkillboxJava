
public class Loader {
    private static final String text = "Red Orange Yellow Green Cyan Blue Violet";

    public static void main(String[] args) {

        String[] colorsArr = text.split(" ");

        for (int i = 0; i < ((colorsArr.length - 1) / 2); i++) {
            var tmpVar = colorsArr[i];
            int tmpPosItem = colorsArr.length - 1 - i;
            colorsArr[i] = colorsArr[tmpPosItem];
            colorsArr[tmpPosItem] = tmpVar;
        }

        for(var colorItem : colorsArr){
            try{
                String c = Color.valueOf(colorItem.toUpperCase()).getColor();
                System.out.println(c + "It is " + colorItem + Color.RESET.getColor());
            }catch (IllegalArgumentException argExp){
                System.out.println("It is " + colorItem);
            }
        }
    }
}
