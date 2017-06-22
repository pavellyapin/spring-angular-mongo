package com.mongo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="actors")
public class Actor
{
			
		private String name;
		
		private int facebook_likes;
		
		public Actor()
		{}
		
		
		@PersistenceConstructor
		public Actor(String name, int facebook_likes)
		{
				super();
				
				this.name = name;
				this.facebook_likes = facebook_likes;
		}


		public String getName()
		{
				return name;
		}

		public void setName(String name)
		{
				this.name = name;
		}


		@Override
		public String toString()
		{
				return "Actor [name=" + name + ", facebook_likes=" + facebook_likes + "]";
		}


		public int getFacebook_likes() {
			return facebook_likes;
		}


		public void setFacebook_likes(int facebook_likes) {
			this.facebook_likes = facebook_likes;
		}
		
}