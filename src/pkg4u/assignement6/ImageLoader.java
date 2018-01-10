package pkg4u.assignement6;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ratid6445
 */
public class ImageLoader {

    public static BufferedImage loadImage(String file) {
        // load the images
        BufferedImage image;
        try {
            // get the images from the file
            image = ImageIO.read(new File("images/" + file));
            //return the image
            return image;
            // exception thread
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        //returns null to avoid errors
        return null;
    }
}
