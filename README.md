🎓 Student Feedback Registration Form with Automation
📌 Project Overview

This project is developed as part of DevOps Laboratory (CA-2). It includes a Student Feedback Form built using frontend technologies and automated testing using Selenium, integrated with Jenkins for continuous execution.

---
🛠️ Technologies Used

* HTML, CSS, JavaScript (Frontend - VS Code)
* Java with Selenium WebDriver (Automation - Eclipse)
* Jenkins (CI/CD Integration)

---

📋 Features of the Project

🔹 Frontend (VS Code)

* Attractive Student Feedback Form
* Background image integration
* Clean and responsive design

🔹 Validation (JavaScript)

* Name cannot be empty
* Email format validation
* Mobile number validation
* Gender selection required
* Department selection required
* Feedback must have minimum 10 words

---

🧪 Selenium Automation (Eclipse)

Automated test cases include:

1. ✔️ Valid form submission
2. ✔️ Reset button functionality
3. ✔️ Invalid email validation
4. ✔️ Empty field validation

Selenium automatically opens browser, performs actions, and verifies output.

---

⚙️ Jenkins Integration

* Jenkins job created to automate test execution
* Configured build using batch command
* Integrated Selenium JAR execution
* Verified build status (SUCCESS/FAILURE)

---

📂 Project Structure

FeedbackAutomation/
│── src/
│   └── com.feedback.test/
│       └── FeedbackTest.java
│── index.html
│── style.css
│── script.js
│── FeedbackTest.jar

---

▶️ How to Run

🔹 Run Frontend
Open index.html in browser

🔹 Run Selenium
java -jar FeedbackTest.jar

🔹 Run via Jenkins
Click "Build Now" → Check Console Output

---

⚠️ Challenges Faced

* Java version mismatch (Java 8 vs Java 17)
* ChromeDriver compatibility issue
* Selenium dependency errors in Jenkins

---

✅ Conclusion

This project demonstrates end-to-end development, validation, automation testing, and CI/CD integration. It provides hands-on experience with DevOps tools and testing workflows.

---

👩‍💻 Developed By

Shrishti Duddalwar
