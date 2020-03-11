<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/header.inc"%>

    <h1 class="mt-4 text-center">BMI-beregner: resultat</h1>

    <div class="row mt-4">
        <div class="col-lg-4">
        </div>
        <div class="col-lg-4">
            <table class="table">
                <tr>
                    <td>Din højde</td>
                    <td>${requestScope.height} cm</td>
                </tr>
                <tr>
                    <td>Din vægt</td>
                    <td>${requestScope.weight} kg</td>
                </tr>
                <tr>
                    <td>BMI</td>
                    <td>${requestScope.bmi}</td>
                </tr>
                <tr>
                    <td>BMI kategori</td>
                    <td>${requestScope.kategori}</td>
                </tr>
            </table>

            <!-- Måske er dette ikke en god idé, men det kan være praktisk -->

            <a href="FrontController?taget=redirect&destination=index">Gå til forsiden</a>

            <%=Util.BmiHelper.calcBMI(190.0, 85.0) %>


        </div>
        <div class="col-lg-4">
        </div>
    </div>

<%@include file="../includes/footer.inc"%>