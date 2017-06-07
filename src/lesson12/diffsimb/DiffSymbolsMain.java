package lesson12.diffsimb;

/**
 * Списал, разбираясь, у Сергея
 */

public class DiffSymbolsMain {
    public static void main(String[] args) {
        String text = "Когда появлются хвосты по дз, то это большая проблема потому как при их наличии не знаешь за что браться..." + " Going to do all!";
        DiffSimb searcher1 = new DiffSimb();
        EnSimb searcher2 = new EnSimb();
        System.out.println(text);

        System.out.print("Первое слово с максимальным кол-вом символов: ");
        System.out.println(searcher1.search(text, "[a-zA-Z0-9-w_]+"));
        System.out.println();

        System.out.println("Слова содержащие только символы латинского алфавита: ");
        System.out.println(searcher2.enSearch(text, "[a-zA-Z]+"));

    }
}


