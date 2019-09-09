public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        System.out.print(sumDigits(container.count));

    }

    public static int sumDigits(int number)
    {
        if(number < 0){
            number *= -1;
        }

        String numStr = Integer.toString(number);
        int result = 0;

        for(int i = 0; i < numStr.length(); i++){
            result += Character.getNumericValue(numStr.charAt(i));
        }
        return result;
    }
}
