Spring Boot Pattern Application

Overview

This is a Spring Boot application that generates ASCII art patterns for any given English alphabet characters. The application takes an input string from the browser (such as "MADHU") and prints the corresponding letter patterns.

Features

Supports all 26 uppercase English letters (A-Z).

Uses loops to generate patterns dynamically.

Provides a REST API endpoint (/patterns/generate) to fetch patterns via HTTP requests.

Formats the output using <pre> tags for better visualization in browsers.

How It Works

A user requests a pattern through the browser:

http://localhost:8080/patterns/generate?input=MADHU

The application processes each letter and generates ASCII art.

The output is returned in a formatted <pre> tag.

Project Structure

1. PatternApplication (Main Class)

This is the entry point of the Spring Boot application.

2. PatternController (REST Controller)

Handles HTTP requests (GET /patterns/generate?input=MADHU).

Calls PatternService to generate patterns.

3. PatternService (Business Logic)

Converts each letter in the input into an ASCII pattern.

Uses generateCharacterPattern(char c) to create a 7x7 grid pattern.

Uses shouldPrintCharacter(char c, int i, int j, int size) to determine which positions should be filled for each letter.

Example Output for "MADHU"

M     M  AAAAA  DDDD   H   H  U   U  
MM   MM  A   A  D   D  H   H  U   U  
M M M M  AAAAA  D   D  HHHHH  U   U  
M  M  M  A   A  D   D  H   H  U   U  
M     M  A   A  DDDD   H   H   UUU   

Each letter follows a specific loop-based logic for pattern printing.

How to Run the Application

Clone the repository or copy the code.

Run the Spring Boot application:

mvn spring-boot:run

Open a browser and enter:

http://localhost:8080/patterns/generate?input=HELLO

See the ASCII pattern for "HELLO" displayed.

Customization

Modify the size variable in generateCharacterPattern to change pattern size.

Add custom symbols instead of letters for styling.

This application is ideal for learning loops, ASCII patterns, and Spring Boot REST APIs! 🚀

