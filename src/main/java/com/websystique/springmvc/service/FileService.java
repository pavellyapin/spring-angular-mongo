package com.websystique.springmvc.service;

import java.io.File;
import java.util.List;

import com.mongodb.MongoClient;





public interface FileService {
	

	void createNewMongoCollection(MongoClient mongoClient);
	
	List<String> getFilesUploaded();
	


	
}
