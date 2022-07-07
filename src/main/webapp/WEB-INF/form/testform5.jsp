<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 

<%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix= "fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>   
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Jua&family=Lobster&family=Nanum+Pen+Script&display=swap" rel="stylesheet">
<style type="text/css">
   body{
      font-family: 'Jua';
      font-size: 2rem;
   }
</style>
</head>
<body>
   <form action="form/result" method="post" class="form-inline">
      <table class="table table-bordered" style="width: 400px">
         <caption><b>&nbsp;ncs문제</b></caption>
            <tr>
               <th width="100" bgcolor="skyblue">이 름</th>
               <td>
                  <input type="text" name="name" class="form-control"
                  required="required" autofocus="autofocus">
               </td>
            </tr>
            
             <tr>
               <th width="60" bgcolor="skyblue">사 진</th>
               <td>
                 <select name="photo" class="form-control">
                 <option value="../res/c5.png">사진 1</option>
                 <option value="../res/c6.png">사진 2</option>
                 <option value="../res/c7.png">사진 3</option>
                 <option value="../res/c8.png">사진 4</option>
                 </select>
               </td>
            </tr>
            
            <tr>
               <th width="100" bgcolor="skyblue">자바</th>
               <td>
                  <input type="text" name="java" class="form-control"
                  required="required">
               </td>
            </tr>
            <tr>
               <th width="100" bgcolor="skyblue">스프링</th>
               <td>
                  <input type="text" name="spring" class="form-control"
                  required="required">
               </td>
            </tr>
            <tr>
               <td colspan="2" align="center">
                  <button type="submit" class="btn btn-info">결과</button>
               </td>
            </tr>
      </table>
   </form>
</body>
</html>