public class PrintDot {

    public void printSymbol(int quantity) {

        char letter = '*';
        int number = quantity;
        int numberJ = number/2;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < numberJ; j++) {
                System.out.print(letter);
            }
            number--;
            numberJ--;
            System.out.println();
        }

    }
}
