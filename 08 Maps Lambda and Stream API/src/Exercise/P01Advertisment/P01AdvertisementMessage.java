package Exercise.P01Advertisment;

import java.lang.reflect.Array;
import java.util.*;

public class P01AdvertisementMessage {

    static class Advertisment {
        String phrases;
        String events;
        String author;
        String city;

        public String getPhrases(){
            return phrases;
        }
        public String getEvents(){
            return events;
        }
        public String getAuthor(){
            return author;

        }
        public String getCity(){
            return city;
        }

        public Advertisment(String phrases, String events, String author, String city){
            this.phrases = phrases;
            this.events = events;
            this.author = author;
            this.city = city;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nubmebrMessages = Integer.parseInt(scanner.nextLine());

        List<String> phrases = new ArrayList<>(Arrays.asList(
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        ));
        List<String> events = new ArrayList<>(Arrays.asList(
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        ));
        List<String> authors = new ArrayList<>(Arrays.asList(
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        ));
        List<String> cities = new ArrayList<>(Arrays.asList(
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
        ));

        Random rnd = new Random();

        for (int i = 1; i <= nubmebrMessages; i++) {
            String currentPhrase = phrases.get(rnd.nextInt(phrases.size()));
            String currentEvent = events.get(rnd.nextInt(events.size()));
            String currentAuthor = authors.get(rnd.nextInt(authors.size()));
            String currentcCity = cities.get(rnd.nextInt(cities.size()));

            Advertisment advert = new Advertisment(currentPhrase, currentEvent, currentAuthor, currentcCity);
            String output = makeAdvert(advert);
            System.out.println(output);
        }
    }

    public static String makeAdvert (Advertisment advertisment){
        String advert = String.format("%s %s %s – %s",
                advertisment.getPhrases(),advertisment.getEvents(), advertisment.getAuthor(), advertisment.getCity());
     return advert;
    }
}
