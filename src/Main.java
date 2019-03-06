import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/** @author Avdonin N.
 * @see #main(String[])
 * @see #calculator()
 * @see #stringArray()
 *
 *
 *
 *
 *
 *
 * */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int number = Integer.parseInt(reader.readLine()); // пользователь вводит номер задания

        switch (number) {
            case 1:
                calculator(); break;
            case 2:
                stringArray(); break;
            default:
                System.out.println("The invalid number of task");

        }

    }

    public static void calculator() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, choose the operation: 1 - Sum, 2 - Difference, 3 - Multiplication, 4 - Division");
        int operation = Integer.parseInt(reader.readLine()); //даем пользователю выбрать одну из четырех числовых операций

        System.out.println("Enter the first number:");   //просим пользователя ввести два числа
        double number1 = Double.parseDouble(reader.readLine());
        System.out.println("Enter the second number:");
        double number2 = Double.parseDouble(reader.readLine());

        switch (operation) {          //с введенными пользователем числами происходит выбранная числовая операция
            case 1:
                System.out.printf("Sum is: " + "%.4f", number1 + number2);
                break;
            case 2:
                System.out.printf("Difference is: " + "%.4f", number1 - number2);
                break;
            case 3:
                System.out.printf("Multiplication is: " + "%.4f", number1 * number2);
                break;
            case 4:
                System.out.printf("Division is: " + "%.4f", number1 / number2);
                break;
            default:
                System.out.println("The invalid number of the operation");
        }
    }

    public static void stringArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, set the size of the array:");
        String[] array = new String[Integer.parseInt(reader.readLine())]; //пользователь указывает количество слов в массиве

        for (int i = 0; i < array.length; i++){          //пользователь заполняет массив строками
            System.out.println("Type the word №" + (i+1) + ": ");
            array[i] = reader.readLine();

        }

        int maxLenght = 0;
        int numb = 0;
        for (int i = 0; i < array.length; i++){          //идет поиск самого длинного слова
            if(maxLenght < array[i].length())
            {numb = i;
                maxLenght = array[i].length();
            }
        }
        System.out.println("The longest word in the array is: " + array[numb]);
    }
}
