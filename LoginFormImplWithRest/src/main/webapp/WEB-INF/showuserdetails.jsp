<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/global.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<script>
function enableFields(){
	document.getElementById("name").disabled=false;
	document.getElementById("qualification").disabled=false;
	document.getElementById("presentaddr").disabled=false;
	document.getElementById("permentaddres").disabled=false;
}
</script>
</head>
<body>
<div class="row">
    <div class="col-md-12">
<form:form method="POST" action="/update" modelAttribute = "employee">
      <table class="table table-bordered" id="editableTable">
        <thead>
          <tr>
        <th>Firstname1111</th>
        <th>Qualification</th>
        <th>Present Address</th>
        <th>Permenent Address</th>
          </tr>
        </thead>
        <tbody>
          <tr data-id="1">
            <td ><input type="text" id = "name" name="name" value="${employee.name}" disabled="disabled"/> </td>
            <td><input type="text" id = "qualification" name="qualification" value="${employee.qualification}" disabled="disabled"/>  </td>
            <td><input type="text" id = "presentaddr" name="presentaddr" value="${employee.presentaddr}" disabled="disabled"/> </td>
            <td><input type="text" id = "permentaddres" name="permentaddres" value="${employee.permentaddres}" disabled="disabled"/> </td>
            <td>
              <a class="button button-small edit" title="Edit" href="javascript:enableFields();">
                <i class="fa fa-pencil"></i>
              </a>
              
              <!-- <a class="button button-small edit" title="Delete">
                <i class="fa fa-trash"></i>
              </a> -->
            </td>
          </tr>          
        </tbody>
      </table>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Update</button>
</form:form>
    </div>
  </div>

</body>
</html>