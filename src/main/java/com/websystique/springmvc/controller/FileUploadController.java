package com.websystique.springmvc.controller;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.websystique.springmvc.configuration.MongoConfiguration;
import com.websystique.springmvc.service.FileService;

 
@RestController
public class FileUploadController {
	
		
	@Autowired
	MongoConfiguration mongoConfig;
	
	@Autowired
    FileService fileService;
	private static final Logger logger = Logger.getLogger(FileUploadController.class);
	
	static String UPLOADED_FILES_DIR = "webapps/ang/files_uploaded/";
	
	
	   //-------------------Get Folder Content--------------------------------------------------------
    
    @RequestMapping(value = "/getFileList/", method = RequestMethod.GET)
    public ResponseEntity<List<String>> getUploadedFiles() {
    	logger.debug("<Start>");
        List<String> fileList = fileService.getFilesUploaded();
        
        if(fileList == null || fileList.isEmpty()){
        	logger.debug("ResponseEntity<List<String>> getUploadedFiles() <No Content>");
            return new ResponseEntity<List<String>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<String>>(fileList, HttpStatus.OK);
    }
	
    
    //-------------------Upload File--------------------------------------------------------
    @RequestMapping(value = "/fileUpload/", method = RequestMethod.POST)
    public @ResponseBody String continueFileUpload(MultipartHttpServletRequest request,
            HttpServletResponse response) throws IOException{    
    	logger.debug("<continueFileUpload> Start");
    	
    	MultipartFile file = request.getFile("file");      	
    	String fileName = file.getOriginalFilename();
    	
    	logger.debug("fileName:" + fileName);
    	
    	int idx = fileName.lastIndexOf("\\");
    	logger.debug("fileName:" + fileName);
    	fileName =  idx >= 0 ? fileName.substring(idx + 1) : fileName;
    	logger.debug("fileName:" + fileName);
    	
    	try{
    	byte[] myArray = file.getBytes();    	    	  	   	
    	FileUtils.writeByteArrayToFile(new File(UPLOADED_FILES_DIR + fileName), myArray);   
    	}
    	catch(Exception exec)
    	{
    		logger.error("Error while creating file",exec);
    		
    	}    	    	
    	
    	return null;    	
        
    }

}