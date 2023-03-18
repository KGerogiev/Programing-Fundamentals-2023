package Exercise.P02Articles;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    // getters and setters
    public String getTitle(){
        return this.title;
    }

    public void setTitle(String tite){
        this.title = title;
    }

    public String getContent(){
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }


    //методи
    //•	Edit (new content) – change the old content with the new one
    public void editContent (String newContent){
        this.content = newContent;
    }
    //•	ChangeAuthor (new author) – change the author
    public void changeAuthor(String newAuthor){
        this.author = newAuthor;
    }
    //•	Rename (new title) – change the title of the article
    public void rename(String newTitle){
        this.title = newTitle;
    }
    //override ToString
    //"{title} - {content}: {author}"

    @Override
    public String toString() {
        return this.title + " - " + this.content +
                ": " + this.author;
    }
}
