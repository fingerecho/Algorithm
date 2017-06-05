package cn.com.fangself.javautils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PicutureIO {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		BufferedImage  img = new BufferedImage(110,35,BufferedImage.TYPE_INT_RGB);
		Graphics g = img.getGraphics();
		
		g.setColor(Color.white);
//		g.drawRect(110, 35, 110, 35);
		g.fillRect(0, 0, 110, 35);
		g.setColor(Color.red);
		g.drawLine(0, 0, 110, 35);
		g.setFont(new Font("华文行楷",Font.BOLD,30));
		g.setColor(Color.gray);
		g.fill3DRect(0, 0, 30, 50, false);
		g.setColor(Color.cyan);
		g.drawString("中国人1", 0, 32);
		ImageIO.write(img, "jpg", new FileOutputStream("D:\\myCodeOnGithub\\JavaAlgorithm\\JavaUtilsTest\\src\\cn\\com\\fangself\\javautils\\a.jpg"));
	}

}
