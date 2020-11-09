<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Giorgi
  Date: 11/9/2020
  Time: 12:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>CRM _ Customer RElationship Manager</h2>
    </div>
</div>
<div id="container">
    <h3>Save Student</h3>
    <form:form action="saveStudent" modelAttribute="student" method="post">
        <!-- need to associate this data with customer id; -->
        <form:hidden path="id"/>

        <table>
            <tbody>
            <tr>
                <td><label>First Name:</label></td>
                <td><form:input path="firstName"/></td>
            </tr>
            <tr>
                <td><label>Last Name:</label></td>
                <td><form:input path="lastName"/></td>
            </tr>
            <tr>
                <td><label>Email:</label></td>
                <td><form:input path="email"/></td>
            </tr>


            <tr>
                <td><label></label></td>
                <td><input type="Submit" value="Save" class="save"/></td>
            </tr>
            </tbody>

        </table>


    </form:form>
    <div style="clear; both;" ;></div>
    <p>
        <a href="${pageContext.request.contextPath}/student/list">Back To List</a>
    </p>
</div>
</body>
</html>
