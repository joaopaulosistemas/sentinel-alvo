<html>
<%-- alvo: sentinel-xss-jsp-unescaped-output --%>
<p><%= request.getParameter("nome") %></p>
</html>
