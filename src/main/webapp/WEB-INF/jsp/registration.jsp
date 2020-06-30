<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <title><spring:message code="registration" /></title>
</head>
<body>
    <h1><spring:message code="registration" /></h1>
    <style>
        .error{
        color: #ff0000;
        }

        .errorblock{
            color: #000;
            background-color: #ffeeee;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;

        }

    </style>

    <form:form modelAttribute="registration">
        <form:errors path="*" cssClass="errorblock" element="div"/>
        <table>
            <tr>
                <td>
                    <spring:message code="name" />
                </td>
                <td>
                    <form:input path="name" />
                </td>
                <td>
                    <form:errors path="name" cssClass="error" />
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="submit" value="Add Registration">
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
