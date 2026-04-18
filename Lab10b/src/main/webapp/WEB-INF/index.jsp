<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<title>Student Marks</title>



<script>

function validateForm() {

    let roll = document.forms["form"]["rollno"].value;

    let name = document.forms["form"]["name"].value;



    let s1 = document.forms["form"]["sub1"].value;

    let s2 = document.forms["form"]["sub2"].value;

    let s3 = document.forms["form"]["sub3"].value;

    let s4 = document.forms["form"]["sub4"].value;

    let s5 = document.forms["form"]["sub5"].value;



    if (roll=="" || name=="" || s1=="" || s2=="" || s3=="" || s4=="" || s5=="") {

        alert("All fields must be filled!");

        return false;

    }



    if (s1>100 || s2>100 || s3>100 || s4>100 || s5>100) {

        alert("Marks should be <= 100");

        return false;

    }



    return true;

}

</script>



</head>

<body>



<h2>Enter Student Details</h2>



<form name="form" action="ResultServlet" method="post" onsubmit="return validateForm()">



Roll No: <input type="text" name="rollno"><br><br>

Name: <input type="text" name="name"><br><br>



Sub1: <input type="number" name="sub1"><br><br>

Sub2: <input type="number" name="sub2"><br><br>

Sub3: <input type="number" name="sub3"><br><br>

Sub4: <input type="number" name="sub4"><br><br>

Sub5: <input type="number" name="sub5"><br><br>



<input type="submit" value="Calculate Result">



</form>



</body>

</html>