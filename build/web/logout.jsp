<%
        String name=null,phone=null,address=null,email=null,password=null,bought=null,kart=null,current=null;
        session.setAttribute("namekey",name);
        session.setAttribute("addresskey",address);
        session.setAttribute("emailkey",email);
        session.setAttribute("passwordkey",password);
        session.setAttribute("phonekey",phone);
        session.setAttribute("currentkey",current);
        session.setAttribute("kartkey",kart);
        response.sendRedirect("index.jsp");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
