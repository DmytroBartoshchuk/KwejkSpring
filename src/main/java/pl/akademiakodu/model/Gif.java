package pl.akademiakodu.model;

/**
 * Created by DmytroBartoshchuk on 31.03.2017.
 */
public class Gif {
    public int getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(int idcategory) {
        this.idcategory = idcategory;
    }

    private String name;
    private String username;
    private boolean favorite;
    private int idcategory;

   public Gif(){}

    public Gif(String name, String username, boolean favorite, int idcategory) {
        this.name = name;
        this.username = username;
        this.favorite = favorite;
        this.idcategory = idcategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
