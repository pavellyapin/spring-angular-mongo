package com.websystique.springmvc.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.BasicDBObject;


public class FileUtils {	
	
	public BasicDBObject parseLinetoFile(String line)
	
	{
		
		String str[] = line.split(",");  
    	
    	BasicDBObject movie = new BasicDBObject();
    	
    	movie.put("movie_title", str[11]);
    	movie.put("actor1_name", str[10]);
    	movie.put("actor2_name", str[6]);
    	movie.put("actor3_name", str[14]);            	
    	movie.put("actor1_fb_likes", str[7]);
    	movie.put("actor2_fb_likes", str[24]);
    	movie.put("actor3_fb_likes", str[5]);
    	movie.put("director_name", str[1]);
    	movie.put("director_fb_likes", str[4]);
    	movie.put("color", str[0]);
    	movie.put("critic_num_for_reviews", str[2]);
    	movie.put("duration", str[3]);
    	movie.put("gross", str[8]);
    	movie.put("genres", str[9]);
    	movie.put("num_votes_users", str[12]);
    	movie.put("cast_total_fb_likes", str[13]);
    	movie.put("face_number_poster", str[15]);
    	movie.put("plot_keywords", str[16]);
    	movie.put("movie_imdb_link", str[17]);
    	movie.put("num_users_reviews", str[18]);
    	movie.put("language", str[19]);
    	movie.put("coutry", str[20]);
    	movie.put("content_rating", str[21]);
    	movie.put("budget", str[22]);
    	movie.put("title_year", str[23]);
    	movie.put("imbd_score", str[25]);
    	movie.put("aspect_ratio", str[26]);
    	movie.put("movie_fb_lieks", str[27]);
    	movie.put("content_rating", str[21]);
    	
    	return movie;
		
		
		
	}

}
