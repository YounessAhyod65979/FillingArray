public class Main {

    public static void main(String[] args) {

        int[] element = new int[10];

        for (int i = 0; i < element.length; i++)
        
        {
            element[i] = 9 - i;
        }

        for (int number : element)
        {

            System.out.println(number);
        }
    }
}
