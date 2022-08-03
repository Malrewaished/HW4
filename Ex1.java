public class Ex1 {
    public static void main(String[] args) {

        try {
            int array[] = {10, 20, 30, 40, 50, 60, 70};
            System.out.println(array[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);

        }
    }
}