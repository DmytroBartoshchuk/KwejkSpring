package pl.akademiakodu.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by DmytroBartoshchuk on 31.03.2017.
 */
@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "Chris Ramacciotti", false, 1),
            new Gif("ben-and-mike", "Ben Jakuben", true,2),
            new Gif("book-dominos", "Craig Dennis", false,3),
            new Gif("compiler-bot", "Ada Lovelace", true,1),
            new Gif("cowboy-coder", "Grace Hopper", false,3),
            new Gif("infinite-andrew", "Marissa Mayer", true,2)
    );

    public Gif findByName(String name){
        for (Gif gif : ALL_GIFS){
            if ( gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

    public List<Gif> findById(Integer id){
        List<Gif> gifs = new ArrayList<>();
        for (Gif gif: ALL_GIFS){
            if (gif.getIdcategory() == id)
                gifs.add(gif);
        }
        return gifs;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public List<Gif> getFavorites(){
        List<Gif> gifs = new ArrayList<>();
        for (Gif gif: ALL_GIFS){
            if (gif.isFavorite())
                gifs.add(gif);
        }
        return gifs;
    }
}
