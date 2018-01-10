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

    public Image(String fileName, char dir, Location location, boolean isBlocked){
        //set all variables passed into the class variable
        this.name = fileName;
        this.dir = dir;
        this.location = location;
        this.nextImage = nextImage;
        this.isBlocked = isBlocked;        
    }
    
    // set the image
    public String setNextImage(Image image) {
        this.nextImage = image;
    }

    // get the image
    public String getName() {
        return name;
    }
    
    // get the direction
    public char getDir(){
        return dir;
    }
    
    // get location
    public Location getLocation(){
        return location;
    }
    
    // get the next image
    public Image getNextImage(){
        return nextImage;
    }

    // see if can move
    public boolean isBlocked() {
        return isBlocked;
    }
}
