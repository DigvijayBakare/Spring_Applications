<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success</title>
    <style>
            body {
                font-family: Arial, sans-serif;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
                background-color: #f1f1f1;
            }
            .success-container {
                background-color: #6AC36A;
                border-radius: 10px;
                text-align: center;
                padding: 20px;
                width: 400px;
                box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
            }
            .success-container h1 {
                color: white;
                margin: 0;
                font-size: 24px;
            }
            .success-container p {
                background-color: white;
                padding: 20px;
                border-radius: 0 0 10px 10px;
                margin: 0;
                font-size: 16px;
                color: #333;
                margin-bottom: 20
            }
            .continue-button {
                background-color: #6AC36A;
                border: none;
                color: white;
                padding: 10px 20px;
                border-radius: 5px;
                font-size: 16px;
                cursor: pointer;
                text-decoration: none;
                display: block; /* Set display to block to prevent overlap */
                width: 100%; /* Make the button take full width */
                box-sizing: border-box; /* Ensure padding doesn't affect width */
                margin-top: 10px;
                box-shadow: 0px 4px 5px rgba(0, 0, 0, 0.2);
            }
            .continue-button:hover {
                background-color: #57A857;
            }
            .success-icon {
                font-size: 50px;
                color: white;
                margin-bottom: 10px; /* Add space below the icon */
            }
        </style>
</head>
<body>
    <!-- <h1>Hello JSP</h1> -->
    <!-- <h2>${student}</h2> -->
    <div class="success-container">
            <div class="success-icon">✔</div>
            <h1>SUCCESS</h1>
            <p>Congratulations, your account has been successfully created.</p>
            <!-- <button class="continue-button">Continue</button> -->
            <a href="home" class="continue-button">Continue</a>
        </div>
</body>
</html>
