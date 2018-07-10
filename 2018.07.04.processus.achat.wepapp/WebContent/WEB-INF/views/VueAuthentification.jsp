<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title>Authentification</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css" />
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				
				<div class="wrap">
					<p class="form-title">Authentification</p>
					<form class="login" method="post" action="/2018.07.04.processus.achat.wepapp/ControleurServlet">
						<input type="text" placeholder="Email" name="email" />
						<input type="password" placeholder="Password" name="password"/>
						<input type="submit"value="Valider" class="btn btn-success btn-sm"  name="signUp"/>
					</form>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>
