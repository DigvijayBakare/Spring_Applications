<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error Occurred</title>
    <link rel="stylesheet" href="styles.css"> <!-- Link to CSS file -->
    <style>
        /* Basic Reset */
        body, h1, p {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        /* Body Style */
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa; /* Light background */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh; /* Full viewport height */
        }

        /* Error Box Style */
        .error-container {
            background-color: #f8d7da; /* Light red background */
            color: #721c24; /* Dark red text */
            border: 1px solid #f5c6cb; /* Border color */
            padding: 20px;
            border-radius: 5px;
            max-width: 400px;
            text-align: center;
        }

        /* Heading Style */
        .error-container h1 {
            font-size: 24px;
            margin-bottom: 10px;
        }

        /* Paragraph Style */
        .error-container p {
            font-size: 16px;
            margin-bottom: 15px;
        }

        /* Button Style */
        .error-container button {
            background-color: #721c24; /* Dark red button */
            color: white; /* White text */
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .error-container button:hover {
            background-color: #a71d2a; /* Darker red on hover */
        }
    </style>
</head>
<body>

<div class="error-container">
    <h1>Error Occurred</h1>
    <p>${msg}</p>
    <!-- <p>Oops! Something went wrong. Please try again later.</p> -->
    <button onclick="window.history.back();">Go Back</button>
</div>

</body>
</html>