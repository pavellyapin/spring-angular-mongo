'use strict';


	angular.module('myApp').service('FileService', ['$http', '$q', function ($http,$q) {
		
		var REST_SERVICE_URI = 'http://localhost:8080/ang/fileUpload/';
		var FILE_SERVICE_URI = 'http://localhost:8080/ang/getFileList/';
		
		 var factory = {
				 fetchUploadedFiles: fetchUploadedFiles,
				 uploadFileToUrl:uploadFileToUrl
			    };

			    return factory;

	   function uploadFileToUrl(file, uploadUrl){
            var fd = new FormData();
            fd.append('file', file);
         
            var deferred = $q.defer();
	        $http.post(REST_SERVICE_URI, fd ,{
                transformRequest: angular.identity,
                headers: {'Content-Type': undefined}
             })
	            .then(
	            function (response) {
	                deferred.resolve(response.data);
	            },
	            function(errResponse){
	                console.error('Error while creating User');
	                deferred.reject(errResponse);
	            }
	        );
	        return deferred.promise;
         }	
		
		   function fetchUploadedFiles() {
			   
			   console.log('fetchUploadedFiles(Service)');
		        var deferred = $q.defer();
		        $http.get(FILE_SERVICE_URI)
		            .then(
		            function (response) {
		                deferred.resolve(response.data);
		            },
		            function(errResponse){
		                console.error('Error while fetching Files');
		                deferred.reject(errResponse);
		            }
		        );
		        return deferred.promise;
		    }


}]);
