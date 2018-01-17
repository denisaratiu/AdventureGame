package pkg4u.assignement6;


import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ratid6445
 */
public class Image {

    //name the image file 
    private String name;
    // direction image is facing
    private char dir;
    // get the location
    private Location location;
    // see if is blocked or not
    private boolean isBlocked;
    // if the front is not blocked, get the next image
    private Image nextImage;
   
    // get the image
    public String getName(String fileName) {
        this.name = fileName;
        return name;
    }
    
    // get the direction
    public char getDir(char dir){
        this.dir = dir;
        return dir;
    }
    
    // get location
    public Location getLocation(Location location){
        this.location = location;
        return location;
    }
    
    // get the next image
    public Image getNextImage(Image nextImage){
        this.nextImage = nextImage;
        return nextImage;
    }

    // see if can move
    public boolean isBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
        return isBlocked;
    }
}
