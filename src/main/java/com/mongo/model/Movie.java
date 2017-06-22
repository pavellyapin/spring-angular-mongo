package com.mongo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="films")
public class Movie
{
			
		
		
		@DBRef(db="directors")
		private Director director;
		
		@DBRef(db="actors")
		private List<Actor> actors = new ArrayList<>();
		
		private String color;
		
		private int critic_num_for_reviews;
		
		private int duration;
		
		private int gross;
		
		private String genres;
		
		private String movie_title;
		
		private int num_votes_users;
		
		private int cast_total_fb_likes;
		
		private int face_number_poster;
		
		private String plot_keywords;
		
		private String movie_imdb_link;
		
		private int num_users_reviews;
		
		private String language;
		
		private String coutry;
		
		private String content_rating;
		
		private int budget;
		
		private int title_year;
		
		private float imbd_score;
		
		private float aspect_ratio;
		
		private int movie_fb_lieks;	

		
		public Movie()
		{}
		
		
		@PersistenceConstructor
		public Movie(Director director, 
					 List<Actor> actors,
					 String color,
					 int critic_num_for_reviews,
					 int duration,
					 int gross,
					 String genres,
					 String movie_title,
					 int num_votes_users,
					 int cast_total_fb_likes,
					 int face_number_poster,
					 String plot_keywords,
					 String movie_imdb_link,
					 int num_users_reviews,
					 String language,
					 String coutry,
					 String content_rating,
					 int budget,
					 int title_year,
					 float imbd_score,
					 float aspect_ratio,
					 int movie_fb_lieks
					 )
		{
				super();
				
				this.director = director;
				this.actors = actors;
				this.color = color;
				this.critic_num_for_reviews = critic_num_for_reviews;
				this.duration = duration;
				this.gross = gross;
				this.genres = genres;
				this.movie_title = movie_title;
				this.num_votes_users = num_votes_users;
				this.cast_total_fb_likes = cast_total_fb_likes;
				this.face_number_poster = face_number_poster;
				this.plot_keywords = plot_keywords;
				this.movie_imdb_link = movie_imdb_link;
				this.num_users_reviews = num_users_reviews;
				this.language = language;
				this.coutry = coutry;
				this.content_rating = content_rating;
				this.budget = budget;
				this.title_year = title_year;
				this.imbd_score = imbd_score;
				this.aspect_ratio = aspect_ratio;
				this.movie_fb_lieks = movie_fb_lieks;
		}





		@Override
		public String toString()
		{
				return "Movie [name=" + movie_title + "]";
		}

		public List<Actor> getActors()
		{
				return actors;
		}


		public void setActors(List<Actor> actors)
		{
				this.actors = actors;
		}
		
		public Director getDirector() {
			return director;
		}


		public void setDirector(Director director) {
			this.director = director;
		}

		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public int getCritic_num_for_reviews() {
			return critic_num_for_reviews;
		}


		public void setCritic_num_for_reviews(int critic_num_for_reviews) {
			this.critic_num_for_reviews = critic_num_for_reviews;
		}


		public int getDuration() {
			return duration;
		}


		public void setDuration(int duration) {
			this.duration = duration;
		}


		public int getGross() {
			return gross;
		}


		public void setGross(int gross) {
			this.gross = gross;
		}


		public String getGenres() {
			return genres;
		}


		public void setGenres(String genres) {
			this.genres = genres;
		}


		public String getMovie_title() {
			return movie_title;
		}


		public void setMovie_title(String movie_title) {
			this.movie_title = movie_title;
		}


		public int getNum_votes_users() {
			return num_votes_users;
		}


		public void setNum_votes_users(int num_votes_users) {
			this.num_votes_users = num_votes_users;
		}


		public int getCast_total_fb_likes() {
			return cast_total_fb_likes;
		}


		public void setCast_total_fb_likes(int cast_total_fb_likes) {
			this.cast_total_fb_likes = cast_total_fb_likes;
		}


		public int getFace_number_poster() {
			return face_number_poster;
		}


		public void setFace_number_poster(int face_number_poster) {
			this.face_number_poster = face_number_poster;
		}


		public String getPlot_keywords() {
			return plot_keywords;
		}


		public void setPlot_keywords(String plot_keywords) {
			this.plot_keywords = plot_keywords;
		}


		public String getMovie_imdb_link() {
			return movie_imdb_link;
		}


		public void setMovie_imdb_link(String movie_imdb_link) {
			this.movie_imdb_link = movie_imdb_link;
		}


		public int getNum_users_reviews() {
			return num_users_reviews;
		}


		public void setNum_users_reviews(int num_users_reviews) {
			this.num_users_reviews = num_users_reviews;
		}


		public String getLanguage() {
			return language;
		}


		public void setLanguage(String language) {
			this.language = language;
		}


		public String getCoutry() {
			return coutry;
		}


		public void setCoutry(String coutry) {
			this.coutry = coutry;
		}


		public String getContent_rating() {
			return content_rating;
		}


		public void setContent_rating(String content_rating) {
			this.content_rating = content_rating;
		}


		public int getBudget() {
			return budget;
		}


		public void setBudget(int budget) {
			this.budget = budget;
		}


		public int getTitle_year() {
			return title_year;
		}


		public void setTitle_year(int title_year) {
			this.title_year = title_year;
		}


		public float getImbd_score() {
			return imbd_score;
		}


		public void setImbd_score(float imbd_score) {
			this.imbd_score = imbd_score;
		}


		public float getAspect_ratio() {
			return aspect_ratio;
		}


		public void setAspect_ratio(float aspect_ratio) {
			this.aspect_ratio = aspect_ratio;
		}


		public int getMovie_fb_lieks() {
			return movie_fb_lieks;
		}


		public void setMovie_fb_lieks(int movie_fb_lieks) {
			this.movie_fb_lieks = movie_fb_lieks;
		}

		
}