<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Giorgi
  Date: 11/9/2020
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail form</title>
</head>
<body>
<div id="container">
    <h3>Save detail</h3>
    <form:form action="/studentcrud_war_exploded/studentDetail/updateStudentDetail/${studentId}"
               modelAttribute="studentDetail" method="post">
    <!-- need to associate this data with customer id; -->

        <form:hidden path="id"/>


    <table>
        <tbody>
        <tr>
            <td><label>Age: </label></td>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td><label>Hobby: </label></td>
            <td><form:input path="hobby"/></td>
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
</body>
</html>
