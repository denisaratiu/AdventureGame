/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4u.assignement6;

import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author haynal
 */
public class BufferedImage{
    private BufferedImage load(String file){
        // get the buffered images
    BufferedImage image = null;
    try{
        image = ImageIO.read(new File(file));
    }catch(Exception e){
    e.printStackTrace();
    }
    return image;
    }
}
