<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Commande</title>

</head>
<body>
	<%@ include file="deconnexion.jsp" %>

	<div>
		<form action="/2018.07.04.processus.achat.wepapp/ControleurServlet" method="post">
			<table>
				<tr>
					<td><input type="text" name="libelle" 
						placeholder="Libelle"></td>
					<td><input type="number" name="qte" 
						placeholder="Quantite"></td>
					<td><input type="number" name="prix"
						placeholder="prix"></td>
					<td>
      				<select name="perisableSelect" id="peri">
         					<option selected value="<c:out value="non"/>" >non</option>
							<option value="<c:out value="oui"/>" >oui</option>
      				</select>
					</td>
						
					<td><input type="submit" value="Ajouter" name="action"></td>
				</tr>
			</table>
		</form>

		<form action="/2018.07.04.processus.achat.wepapp/ControleurServlet" method="post">
		<table class="table1" cellspacing="0" cellpadding="0">
			<tr>
				<th>Libelle</th>
				<th>Qte</th>
				<th>Prix</th>
				<th>perisable</th>
				<th>Supprimer</th>
			</tr>
			<c:forEach items="${ligneCommande}" var="p">
				<tr>
					<td>${p.libelle}</td>
					<td>${p.qte}</td>
					<td>${p.prix}</td>
					<td>${p.perissable}</td>
					<td><a href="javascript:confirmer('personne.david?action=delete&nom=${p.libelle}')"><img src="img/supp.jpg" alt="supprimer_Image" />
					</a></td>
				</tr>
			</c:forEach>
			<tr><td>fournisseur</td><td><input type="text" name="fourniseur"placeholder="fournisseur"></td></tr>
			<tr><td><input type="submit" value="Commander" name="action"></td></tr>
		</table>
		</form>
	</div>
</body>
</html>