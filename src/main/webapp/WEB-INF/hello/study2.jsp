<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>   
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Jua&family=Lobster&family=Nanum+Pen+Script&display=swap" rel="stylesheet">
</head>
<style type="text/css">
	body{
	font-family: 'Jua';
	font-size: 2em;
	}
</style>
<body>
	<h1>go1 페이지로부터 포워드된 jsp 파일</h1>
	이 름 : ${name } <br>
	주 소 : ${addr } <br>
	<hr>
	<h3>resources 폴더의 c6.png이미지 출력</h3>
	<img src="res/c6.png" width="130">
	<h3>avata폴더의 s6.JPG 이미지 출력</h3>
	<img src="avata/s6.JPG" width="130">
	<h3>image 폴더의 12.jpg 이미지 출력</h3>
	<img src="image/12.jpg" width="130">
 	</body>
</html>