
public class Loader {
    public static void main(String[] args) {

        printArr(arrOfArr(43));
    }


    //init array
    private static boolean[][] arrOfArr(int sizeArr) {
        //correction num
        sizeArr = Math.abs(sizeArr);
        if (sizeArr < 3) {
            System.out.println("incorrect size. Auto correction to 3");
            sizeArr = 3;
        } else if (sizeArr % 2 == 0) {
            sizeArr += 1;
            System.out.println("Incorrecr size. Auto correction to " + sizeArr);
        }

        boolean[][] resultArr = new boolean[sizeArr][sizeArr];

        for (int i = 0; i <= sizeArr / 2; i++) {
            resultArr[i][i] = true;
            resultArr[i][sizeArr - 1 - i] = true;
            resultArr[sizeArr - 1 - i][i] = true;
            resultArr[sizeArr - 1 - i][sizeArr - 1 - i] = true;
        }
        return resultArr;
    }

    public static void printArr(boolean[][] arrBool) {
        String sign = "X";
        for (boolean[] internalArr : arrBool) {
            for (boolean itemArr : internalArr) {
                System.out.print(itemArr ? sign : " ");
            }
            System.out.println();
        }
    }
}
