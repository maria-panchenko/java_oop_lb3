import java.io.File;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String path = "D:/univer/optimiz"; // замените на путь к нужному каталогу
        File directory = new File(path);
        Stack<File> stack = new Stack<>();

        // получаем список файлов и папок в каталоге
        File[] files = directory.listFiles();

        // добавляем каждый элемент в стек
        for (File file : files) {
            stack.push(file);
        }

        while (!stack.empty()) {
            File file = stack.pop();
            System.out.println(file.getName());
        }
        // теперь в стеке хранятся все элементы каталога
        // можно выполнять с ними нужные операции
    }
}