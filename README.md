# JavaFX Registration Form
This simple JavaFX application functions as a registration form with input validation using regular expressions (Regex).

## Features
- Fields: First Name, Last Name, Email, Date of Birth, and Zip Code.
- Input validation using Regex:
  - First & Last Name: 2–25 alphabetic characters
  - Email: Farmingdale emails only (e.g., "ex@farmingdale.edu")
  - Date of Birth: MM/DD/YYYY format
  - Zip Code: 5-digit number
- Live field validation triggered on focus loss
- "Add" button remains disabled until all inputs are valid
