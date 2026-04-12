# PROG5121 POE - Part 1
## Registration and Login System

###  Student Details
- Name: Shaun Rikhotso
- Student Number: ST10520428

---

## Project Description
This project is a Java console application that allows users to register and log in using a username, password, and South African phone number.

The system validates all user inputs according to specific rules before allowing registration and login.

---

##  Features

### Registration
The user must enter:
- Username
- Password
- Cell phone number

Validation rules:
- Username must contain "_" and be no more than 5 characters
- Password must:
  - Be at least 8 characters long
  - Contain a capital letter
  - Contain a number
  - Contain a special character
- Phone number must:
  - Start with +27
  - Be correctly formatted

---

###  Login
- User logs in using registered username and password
- System checks credentials
- Displays success or failure message

---

##  Methods Used (Login Class)

- `checkUserName()` → validates username
- `checkPasswordComplexity()` → validates password
- `checkCellPhoneNumber()` → validates phone number using regex
- `registerUser()` → handles registration process
- `loginUser()` → verifies login details
- `returnLoginStatus()` → returns login message

---

## Unit Testing
JUnit tests were created to verify:
- Username validation
- Password validation
- Phone number validation
- Login success and failure

---

##  How to Run

1. Open project in NetBeans
2. Run the `Main` class
3. Follow prompts to register and login

---

##  Notes
- The program uses object-oriented programming principles
- Input validation prevents incorrect data entry
- Error handling is implemented to avoid system crashes
