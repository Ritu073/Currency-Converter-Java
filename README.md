<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
</head>
<body>

<h1>Currency Converter</h1>
<p>A Java-based console application that converts amounts between different currencies using predefined exchange rates. This program supports conversions among six major currencies, simplifying the conversion process by using INR as an intermediary.</p>

<h2>Features</h2>
<ul>
    <li><strong>Convert between any two of the supported currencies:</strong> USD, EUR, GBP, CAD, AUD, and INR.</li>
    <li><strong>Predefined exchange rates:</strong> The rates are hardcoded for simplicity.</li>
    <li><strong>Console-based interaction:</strong> Easy-to-use console prompts guide the user through the currency conversion process.</li>
</ul>

<h2>Supported Currencies</h2>
<ul>
    <li><strong>USD</strong> - United States Dollar</li>
    <li><strong>EUR</strong> - Euro</li>
    <li><strong>GBP</strong> - British Pound</li>
    <li><strong>CAD</strong> - Canadian Dollar</li>
    <li><strong>AUD</strong> - Australian Dollar</li>
    <li><strong>INR</strong> - Indian Rupee</li>
</ul>

<h2>Exchange Rates</h2>
<p>The exchange rates are based on the following conversions to INR (Indian Rupee):</p>
<ul>
    <li><strong>USD to INR:</strong> 84.10</li>
    <li><strong>EUR to INR:</strong> 90.82</li>
    <li><strong>GBP to INR:</strong> 109.02</li>
    <li><strong>CAD to INR:</strong> 60.52</li>
    <li><strong>AUD to INR:</strong> 55.63</li>
</ul>

<h2>Getting Started</h2>
<h3>Prerequisites</h3>
<ul>
    <li>Java Development Kit (JDK) installed on your system</li>
    <li>A Java-compatible IDE or a text editor with console support</li>
</ul>

<h2>Usage</h2>
<ul>
    <li>Follow the prompts to select the source and target currencies.</li>
    <li>Enter the amount to convert.</li>
    <li>The program will display the converted amount.</li>
</ul>

<h3>Example</h3>
<p>To convert 100 GBP to CAD, follow these steps:</p>
<ul>
    <li>Select <code>3</code> for GBP as the source currency.</li>
    <li>Select <code>4</code> for CAD as the target currency.</li>
    <li>Enter <code>100</code> as the amount.</li>
    <li>The output will display the converted amount in CAD.</li>
</ul>

<h2>Code Structure</h2>
<p>The program consists of a <code>switch</code> statement in two steps:</p>
<ol>
    <li><strong>Conversion to INR:</strong> Converts the source currency to INR using predefined exchange rates.</li>
    <li><strong>Conversion from INR:</strong> Converts the INR amount to the target currency.</li>
</ol>

<h2>Future Improvements</h2>
<ul>
    <li><strong>Live Exchange Rates:</strong> Integrate with an API to fetch real-time exchange rates.</li>
    <li><strong>Error Handling:</strong> Enhance validation for more robust user interaction.</li>
    <li><strong>Additional Currencies:</strong> Support more currencies beyond the six currently available.</li>
</ul>

</body>
</html>
