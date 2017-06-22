package com.websystique.springmvc.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;



@Service("fileService")
public class FileServiceImpl implements FileService{
	
	
    FileUtils fileUtils;
	
	static String UPLOADED_FILES_DIR = "webapps/ang/files_uploaded";	
	private static final Logger logger = Logger.getLogger(FileServiceImpl.class);	
	
	@Override
	public void createNewMongoCollection(MongoClient mongoClient) {
		
		logger.debug("<Start>" + mongoClient==null);	
		 
		DBCollection filmCollection = mongoClient.getDB("pavel").getCollection("films");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("webapps/ang/file.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String line =  null;
        try {
			while((line=br.readLine())!=null){	  
			    	filmCollection.save(fileUtils.parseLinetoFile(line));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	@Override
	public List<String> getFilesUploaded() {
		
		logger.debug("getFilesUploaded() <Start>" + UPLOADED_FILES_DIR);
		List<String> fileList = new ArrayList<String>();
		
		File folder = new File(UPLOADED_FILES_DIR);
		
		logger.debug("getFilesUploaded() <Start>" + folder);
		
		if(folder.exists())
		{
			File[] listOfFiles = folder.listFiles();
		
		logger.debug("getFilesUploaded() <List of files>" + listOfFiles);

	    for (int i = 0; i < listOfFiles.length; i++) {
	    	logger.debug("getFilesUploaded() <loop>");
	      if (listOfFiles[i].isFile()) {	
	    	  logger.debug("getFilesUploaded() <if>" + listOfFiles[i].getName());
	    	  fileList.add(listOfFiles[i].getName());	        
	      } 
	     }
		}
		else
		{
			logger.error("getFilesUploaded() Folder not found.");
		}
		
		logger.error("getFilesUploaded()" + fileList.size());
		return fileList;
	}
	}
