package com.epam.jwd.app;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Random;
import java.util.logging.LogManager;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.epam.jwd.model.Point;

public class Main {

	private static final Logger logger = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) throws SecurityException, IOException {
		
		String log4jConfPath = "logger.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		Random rand = new Random();
		
		Point[] points = new Point[10];
		logger.info("создали массив точек");
		
		for (int i = 0; i < 10; i++){
		points[i]=new Point(rand.nextInt(30),rand.nextInt(30));
		}
		logger.info("инициализировали массив точек");
		
		for (int i = 0; i < 10; i++){
		System.out.println(points[i].toString());
		logger.info(String.format("вывели %d точку на экран", i + 1) );
		}

	}

}
