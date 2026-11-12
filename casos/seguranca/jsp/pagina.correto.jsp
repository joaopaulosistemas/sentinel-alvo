<%-- correto: sentinel-xss-jsp-unescaped-output --%>
<html>
<p><c:out value="${param.nome}" /></p>
</html>
