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
   <form action="read2" method="post" class="form-inline">
      <table class="table tab;e-bordered" style="width: 400px">
         <caption><b>&nbsp;폼 연습 #2</b></caption>
            <tr>
               <th width="100" bgcolor="#ddd">이 름</th>
               <td>
                  <input type="text" name="name" class="form-control"
                  required="required" autofocus="autofocus">
               </td>
            </tr>
            
            <tr>
               <th width="100" bgcolor="#ddd">성 별</th>
               <td>
                  <div class="form-group">
                     <!-- label : o 정확히 안눌러도 체크됨 -->
                     <label><input type="radio" 
                     name="gender" value="남자" checked="checked"> 남자 </label>
                     <label><input type="radio" 
                     name="gender" value="여자"> 여자 </label>
                  </div>
               </td>
            </tr>
            
            <tr>
               <th width="100" bgcolor="#ddd">주 소</th>
               <td>
                  <input type="text" name="address" class="form-control"
                  required="required">
               </td>
            </tr>
            
            <tr>
               <td colspan="2" align="center">
                  <button type="submit" class="btn btn-info">서버에 전송</button>
               </td>
            </tr>
      </table>
   </form>
</body>
</html>