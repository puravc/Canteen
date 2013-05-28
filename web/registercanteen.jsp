<%-- 
    Document   : both
    Created on : May 27, 2013, 4:57:20 AM
    Author     : akash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
        <%@taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <jsp:include page="header.jsp"></jsp:include>
        
    
    
    <div class="page-header" >
        <h1 style="color: black;text-align: center ">Register as a User</h1>
    </div>
    <div id="register" >
     <s:actionerror theme="bootstrap"/>
            <s:actionmessage theme="bootstrap"/>
            <s:fielderror theme="bootstrap"/>


            <s:form action="canreg" enctype="multipart/form-data" theme="bootstrap" cssClass="form-horizontal " style="margin-left:400px" >
                <s:textfield
                        label="Username"
                        name="username"
                        placeholder="Enter the College Id"
                        />

                <s:password
                        label="Password"
                        
                        name="password"/>
                <s:password
                        label="Re-enter Password"
                        
                        name="rpassword"/>

                <s:textfield
                        label="Name"
                        name="name"
                        placeholder="Enter your fullname"
                        tooltip="Enter your Name here"/>
                
               
                <s:textfield
                        label="Email"
                        name="email"
                        tooltip="Enter your Name here"/>
                
               <s:textfield
                        label="Phone"
                        name="phone"
                        
                        tooltip="Enter your Name here"/>
               
               
                
                <s:submit cssClass="btn-primary" style="margin-left:230px"/>
            </s:form>
    
 
    <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
