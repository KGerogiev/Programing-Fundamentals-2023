package Exercise.P02Articles;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String article = scanner.nextLine(); // "{title}, {content}, {author}"
        String startTitle = article.split(", ")[0];
        String startiContent = article.split(", ")[1];
        String startiAuthor = article.split(", ")[2];
        int countCommands = Integer.parseInt(scanner.nextLine());

        Article myArticle = new Article(startTitle, startiContent, startiAuthor);


        for (int i = 1; i <= countCommands ; i++) {
            String command = scanner.nextLine();
            String[] commandLine = command.split(": ");

            //•	"Edit: {new content}"
            if (commandLine[0].equals("Edit")){
                String newContent = commandLine[1];
                myArticle.editContent(newContent);
            }
            //•	"ChangeAuthor: {new author}"
            if (commandLine[0].equals("ChangeAuthor")){
                String newAuthor = commandLine[1];
                myArticle.changeAuthor(newAuthor);
            }
            //•	"Rename: {new title}"
            if (commandLine[0].equals("Rename")){
                String newTitle = commandLine[1];
                myArticle.rename(newTitle);
            }

        }
        System.out.println(myArticle);
    }
}
