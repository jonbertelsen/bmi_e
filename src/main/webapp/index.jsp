<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="includes/header.inc"%>

    <h1 class="mt-4 text-center">BMI-beregner</h1>

    <div class="row mt-4">
        <div class="col-lg-4">
        </div>
        <div class="col-lg-4">

            <form action="FrontController" method="post">

                <input type="hidden" name="taget" value="resultat"/>

                <div class="form-group">
                    <label for="height">Indtast højde i cm:</label>
                    <input id="height" name="height" type="text" class="form-control" aria-describedby="heightHelp">
                    <small id="heightHelp" class="form-text text-muted">Du skal ikke være flov over din vægt
                        makker</small>
                </div>
                <div class="form-group">
                    <label for="weight">Indtast vægt i kg:</label>
                    <input id="weight" name="weight" type="text" class="form-control">
                </div>

                <button type="submit" class="btn btn-primary">Beregn vægt</button>

            </form>

            <%
                String role;
                if (session.getAttribute("role") != null) {
                    role = (String) session.getAttribute("role");
                    out.print("Rolle: " + role);
                } else
                {
                    out.print("Du er ikke logget på makker");
                }
            %>

            <h1>Er jeg logget på?</h1>
            <h3>${requestScope.user_status}</h3>

            <a href="FrontController?taget=redirect&distination=index">I feel lucky today</a>

        </div>
        <div class="col-lg-4">
        </div>

<%@include file="includes/footer.inc"%>