<%-- 
    Document   : index
    Created on : 19 May, 2013, 1:31:44 PM
    Author     : Purav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
         <s:form action="saveForm" method="post">
             <s:textfield label="Uname" key="username" placeholder="username"/>
             <s:textfield key="email"/>
             <s:password label="password" key="password"/>
            <s:submit/>
        </s:form>
    </body>
</html>
