<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Livraison</title>
</head>
<body>
	<%@ include file="deconnexion.jsp" %>

	<div id="col1">

		<c:if test="${not empty model.commande}">

			<form action="/2018.07.04.processus.achat.wepapp/ControleurServlet"
				method="post">

				     <h4> Id_commande : ${model.commande.idCommande}</h4>
				        
					 <h4>Date commande : ${model.commande.dateCommande}</h4> 
					 
					  <h4>Fournisseur : ${model.commande.fournisseur}</h4>
					
					<label for="date" class="col1_label"> date de livraison</label> <input
					type="date" name="date"
					placeholder="date" required /> <br />
					
					<p>
      				<label for="livre">payée</label>
      				<select name="payeSelect" id="livre">
         					<option selected value="<c:out value="non"/>" >non</option>
							<option value="<c:out value="oui"/>" >oui</option>
      				</select>
   					 </p>
					
					 <input
					type="submit" value="Enregistrer" name="action" class="col1_input">
				    <input type="hidden" value="${model.commande.idCommande}" name="idCommande"/>
			</form>

		</c:if>



	</div>

	<div>
		<table class="table1" cellspacing="0" cellpadding="0">
			<tr>
				<th>Id_commande</th>
				<th>Date commande</th>
				<th>Fournisseur</th>
				<th>Modifier</th>
			</tr>
			<c:forEach items="${model.commandes}" var="p">
				<tr>
					<td>${p.idCommande}</td>
					<td>${p.dateCommande}</td>
					<td>${p.fournisseur}</td>

					<td><a
						href="/2018.07.04.processus.achat.wepapp/VueAchatLivraison.david?action=modifier&idcommande=${p.idCommande}"><img
							src="img/edit.jpg" alt="edit_Image" /></a></td>
				</tr>

			</c:forEach>
		</table>
	</div>
</body>
</html>