[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/paV3BV1l)
## Project Name
What Day App

## Student Details

| Name            |   BITS ID       | Email                           |
| --------------- | --------------- | ---------------                 |
| Priya Rathi     | 2022A7PS1096G   | f20221096@goa.bits-pilani.ac.in |
| Vageesha Gupta  | 2022A7PS1107G   | f20221107@goa.bits-pilani.ac.in |

## Description of App
The "What Day" app allows users to input a calendar date and returns the corresponding day of the week for that date. The app checks for invalid inputs, such as out-of-range dates, non-numeric formats, and incorrect dates like February 29 in a non-leap year. The app provides clear error messages, guiding users to correct any mistakes in the input.

## Implementation 
1. Model Implementation: The first step involved implementing the logic to validate the input date. This included checking for out-of-range dates and months, ensuring the input was in a proper numeric format, and validating dates like February 29 in non-leap years. I utilized the Android Calendar API for the core functionality to ensure accuracy in determining the day of the week.
2. UI Integration: After the model was implemented and tested, I integrated it with the user interface. This involved setting up an onClickListener for the button, which, when clicked, would pass the user input to the model, retrieve the day of the week or an error message, and display it on the UI.
3. Testing: I ran several test cases to ensure the app handled various inputs correctly, including edge cases like invalid dates or non-numeric inputs. The tests verified that the model and UI worked together seamlessly, providing accurate results and clear error messages.

We utilized ChatGPT as a resource during development. Whenever we encountered difficulties or needed clarification on certain coding aspects, we consulted ChatGPT for guidance. This helped us understand complex issues and proceed with the implementation confidently, without directly copying solutions. 
Link: https://chatgpt.com

We consulted the Stack Overflow website whenever we faced technical errors or challenges during development. The community-driven insights and solutions provided there were invaluable in resolving issues and advancing the project.
Link : https://stackoverflow.com

## Testing
We did not follow a strict test-driven development (TDD) approach. Instead, we first wrote the core code, focusing on validating dates and handling errors. After implementing this logic, we tested it to ensure accuracy. Once confident in the logic, we moved on to implement the UI and then ran the app against multiple test cases to verify the functionality.

This collaborative and iterative approach allowed us to catch and address issues early, ensuring a smooth final integration with the UI. The app performed well, and no crashes occurred during testing.

## Time Taken

Approximately 4 hours were taken to complete the assignment.

## To what extent did you use pair programming on this assignment

5(used pair programming thoroughly)

## Rate this assignment
3/10(not very difficult)

