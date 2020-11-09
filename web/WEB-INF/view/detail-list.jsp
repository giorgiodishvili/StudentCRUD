<%--
  Created by IntelliJ IDEA.
  User: Giorgi
  Date: 11/9/2020
  Time: 12:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Details</title>
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
</div>
<div id="container">
    <div id="content">

        <table>

            <tr>
                <th>Age:</th>
                <th>Hobby:</th>
                <th>Courses:</th>
                <th>Action</th>

            </tr>

            <tr>
                <c:url value="/studentDetail/showFormForUpdateDetail/${studentID}/${detail.id}" var="updateLink">
                </c:url>

                <td><c:out value="${detail.age} "/></td>
                <td><c:out value="${detail.hobby}"/></td>
                <td>Courses</td>
                <td><a href="${updateLink}">Add/Update</a></td>
            </tr>


        </table>
    </div>
</div>

</body>
</html>
