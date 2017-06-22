'use strict';


angular.module('myApp').controller('FileController', ['$scope', 'FileService', function($scope, FileService){
	
	
	$scope.filelist = [];
	
	$scope.uploadFile = function(){
        var file = $scope.myFile;
        
        console.log('uploadFile');
        console.dir(file);
        
        var uploadUrl = "'http://localhost:8080/ang/fileUpload";
        FileService.uploadFileToUrl(file, uploadUrl);
        fetchUploadedFiles();
     };	
     
 	$scope.createCollection = function(){
 		
 		console.log("<createCollection>");
        console.log($scope.currentItems);

     };	
	
	   fetchUploadedFiles();

	    function fetchUploadedFiles(){
	    	console.log("fetchUploadedFiles");
	        FileService.fetchUploadedFiles()
	            .then(
	            function(d) {
	            	console.log(d);
	            	$scope.filelist = d;
	            },
	            function(errResponse){
	                console.error('Error while fetching Files');
	            }
	        );
	    }
    
 }]); 
