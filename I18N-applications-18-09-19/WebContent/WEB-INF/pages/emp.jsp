<%@page import="java.util.ResourceBundle"%>
<%ResourceBundle rb= ResourceBundle.getBundle("login",request.getLocale());%>
<form method="post" action="SubmitServlet">
<div>
<label><%=rb.getString("login.userName") %></label>
<input type="text">
</div>
<div>
<label><%=rb.getString("login.password") %></label>
<input type="text">
</div>
<div>
<button ><%=rb.getString("login.button") %></button>
</div>
</form>