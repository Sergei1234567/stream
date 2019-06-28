import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Scratch {

    public static void main(String[] args) {
        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Lennon", "London"));
        artists.add(new Artist("Coy", "Moscow"));
        artists.add(new Artist("Jack", "NY"));
//        int count = 0;
//        Iterator<Artist> iterator = artists.iterator();
//        while (iterator.hasNext()) {
//            Artist artist = iterator.next();
//            if (artist.isFrom("London")) {
//                count++;
//            }
//        }
        long count = artists.stream()
                .filter(artist -> artist.isFrom("NY"))
                .count();
        System.out.println(count);

        List<String> collected = Stream.of("a", "b", "c")
                .collect(Collectors.toList());
        System.out.println(collected);
    }

}

class Artist {

    private String name;
    private String city;

    public Artist(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isFrom(String s) {
        return this.getCity().equals(s);
    }


}