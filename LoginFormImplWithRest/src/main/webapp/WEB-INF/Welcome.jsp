    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="/global.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<!--JS -->
<script  src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="   crossorigin="anonymous"></script>
<script src="bootstable.min.js"></script>
<div style="text-align:right; font-size:18px; width:95%; margin-top:1%">
<div style="width:70%; margin: auto;">
 <script type="text/javascript">
 function savedAlert(){
	 alert("Record Saved");
 }
 </script>
</head>
<body>

    <div class="example1">
      <form:form method="POST" action="/addemployee" modelAttribute = "employee">
        <h2 class="form-heading">Add Employee</h2>

        <div class="example1">
            <input id = "empname" name="empname" value = "${employee.name}" type="text" class="form-control" placeholder="Employee Name" autofocus="false" required="" oninvalid="this.setCustomValidity('Please Enter  name')"/><br><br>
            <input id = "qualification" name="qualification" type="text" class="form-control" placeholder="Qualification" autofocus="false" required="" oninvalid="this.setCustomValidity('Please Enter  qualification')"/><br><br>
            <input id = "presentaddress" name="presentaddress" type="text" class="form-control" placeholder="Present Address" autofocus="false" required="" oninvalid="this.setCustomValidity('Please Enter  address')"/><br><br>
            <input id = "permenentaddress" name="permenentaddress" type="text" class="form-control" placeholder="Permenent Address" autofocus="false" required="" oninvalid="this.setCustomValidity('Please Enter permenent address')"/><br><br>
            <button class="btn btn-lg btn-primary btn-block" type="submit" onclick="function:savedAlert()">ADD</button>
            
        </div>
      </form:form>
    </div>
<br><br>
<form:form class="example" method = "POST" action="/retrieve" style="margin:auto;max-width:300px">

  <input type="text" placeholder="Search.." name="search2" required="invalid input">
  
  <button type="submit"><i class="fa fa-search"></i></button>
</form:form><br><br>

<div class="container">
</div>

</body>
</html>