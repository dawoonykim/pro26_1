<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login2</title>
</head>
<body>
	<h1>여기는 login2</h1>
	<form action="http://localhost:8080/pro26_1/test/login2.do"
		method="post">
		<table align="center">
			<tr>
				<td>
					<p align="left">아이디</p>
				</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>
					<p align="left">이름</p>
				</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><input type="submit" value="로그인"></td>
				<td><input type="reset" value="초기화"></td>
			</tr>
		</table>
	</form>
</body>
</html>