<%--
  Created by IntelliJ IDEA.
  User: Giorgi
  Date: 11/8/2020
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Student List</title>
</head>
<body>

<div id="wrapper">
    <div id="header">
        <a href="${pageContext.request.contextPath}/student/list">Student Management</a>
    </div>
</div>
<div id="contianer">
    <div id="content">
        <input type="button" value="Add Customer"
               onclick="window.location.href='showFormForAdd'; return false;"
               class="add-button"
        />

        <table>

            <tr>
                <th>First Name:</th>
                <th>Last Name:</th>
                <th>Email:</th>

            </tr>
            <c:forEach var="tempStudent" items="${students}">

                <c:url var="updateLink" value="/studentDetail/detail/${tempStudent.id}">

                </c:url>


                <tr>
                    <td>${tempStudent.firstName}</td>
                    <td>${tempStudent.lastName}</td>
                    <td>${tempStudent.email}</td>
                    <td><a href=${updateLink}>Details </a></td>
                </tr>


            </c:forEach>

        </table>
    </div>
</div>
</body>
</html>
