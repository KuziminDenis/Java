package stepIt.Homework2;

public class Decrease {
    public static void main(String[] args) {
        int Array[] = new int[]{20,10,44,3,5};

        System.out.print("Вывод массива: ");
        for(int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }

        for(int i = 0; i < Array.length; i++){
            Array[i] = Array[i]%25;
        }
        System.out.print("\nНовый массив: ");
        for(int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
    }
}
