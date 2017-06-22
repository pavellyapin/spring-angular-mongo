<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>  
    <title>File Input</title>  
    <style>
      .username.ng-valid {
          background-color: lightgreen;
      }
      .username.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .username.ng-dirty.ng-invalid-minlength {
          background-color: yellow;
      }
      



    </style>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
     <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
  </head>
     <body ng-app = "myApp">
	
      <div ng-controller = "FileController" align="center">
         <input type = "file" file-model = "myFile"/>
         <button ng-click = "uploadFile()">upload me</button>
           
      
		 <div class="sample" >  
		     
		     <select size="7" ng-model="currentItems" multiple  
		         ng-multiple="true"  
		         ng-options="opt as opt for opt in filelist"></select>  
		     
		   </div>
		   <button ng-click = "createCollection()">Create Collection</button>
	</div>
      
      
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
      <script src="<c:url value='/static/js/app.js' />"></script>
      <script src="<c:url value='/static/js/service/file_service.js' />"></script>
      <script src="<c:url value='/static/js/controller/file_controller.js' />"></script>
      
   </body>
</html>