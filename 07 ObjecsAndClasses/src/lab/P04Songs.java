package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {

    static class Song {
        String typeList;
        String name;
        String time;

        public String getTypeList() {
            return typeList;
        }
        public String getName(){
            return name;
        }

        public Song (String typeList, String name, String time){
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String[] inputSongArr = input.split("_");  // favourite DownTown 3:14
            String typeName = inputSongArr[0];
            String name = inputSongArr[1];
            String time = inputSongArr[2];

            Song currentSong = new Song(typeName, name, time);
            songList.add(currentSong);

        }

       String command = scanner.nextLine();

        if (command.equals("all")){
            for (Song song : songList){
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songList){
                String currentTypeList = song.getTypeList();
                if (currentTypeList.equals(command)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
