<%@ page import="java.util.*" %>
<%@ page import="cd.*" %>
<% ServletContext app = getServletContext(); %>

<html>
<head>
<title>Output</title>
</head>

<body>
<% 
   List cds = (List)app.getAttribute("cds"); 

   Iterator iter = cds.iterator();
   while (iter.hasNext()) {
	   CD cd = (CD)iter.next();
	   out.println(cd.getTitle());
   }
%>
</body>
</html>
