# Assignment: Introduction to Object-Oriented Programming (OOP)

## Objective
This assignment aims to provide students with a foundational understanding of Object-Oriented Programming (OOP) in Python. It will cover the basics of OOP concepts, classes, objects, methods, and attributes.

## Assignment Instructions

### Part 1: Theoretical Component

1. **Research and Write a Report:**
   - **Topic 1:** Definition and History of OOP
     - Define Object-Oriented Programming (OOP).
     - Provide a brief history of OOP, including its origin and evolution.
     - Mention key contributors to the development of OOP and notable languages that support OOP.
   - **Topic 2:** Comparison with Procedural Programming
     - Compare and contrast OOP with procedural programming.
     - Discuss the advantages and disadvantages of each paradigm.
     - Provide examples of when OOP is preferred over procedural programming and vice versa.
   - **Topic 3:** Overview of OOP Languages
     - Provide an overview of popular OOP languages, focusing on Python.
     - Highlight the key features that make Python suitable for OOP.

2. **Deliverable:**
   - A written report (approximately 3-5 pages) covering the above topics. The report should be well-researched, clearly written, and properly cited.
   - **Submission:** Upload your report to Google Docs and submit the link. Ensure that you have given edit access to `chikwajacobos@gmail.com` for the Google Docs Link.

### Part 2: Practical Component

1. **Programming Task:**
   - **Task 1:** Create a simple class named `Car` in Python.
     - The `Car` class should have the following attributes: `make`, `model`, `year`, and `color`.
     - The class should also have methods to:
       - Display the details of the car.
       - Update the color of the car.
   - **Task 2:** Instantiate multiple objects of the `Car` class.
     - Create at least three different car objects with varying attributes.
     - Use the method to display the details of each car.
     - Update the color of one car object and display the updated details.
   - **Task 3:** Create a simple program that prompts the user to input details for a new car, creates a `Car` object with those details, and then displays the car's information.

2. **Code Example:**
   - Here is an example of how the `Car` class might look in Python:

     ```python
     class Car:
         def __init__(self, make, model, year, color):
             self.make = make
             self.model = model
             self.year = year
             self.color = color

         def display_details(self):
             print(f"Make: {self.make}")
             print(f"Model: {self.model}")
             print(f"Year: {self.year}")
             print(f"Color: {self.color}")

         def update_color(self, new_color):
             self.color = new_color

     # Example usage
     car1 = Car("Toyota", "Corolla", 2020, "Red")
     car1.display_details()
     car1.update_color("Blue")
     car1.display_details()
     ```

3. **Deliverable:**
   - Submit the Python source code for the `Car` class and the main program that demonstrates the functionality.
   - Include a brief explanation of how the code works, focusing on the concepts of classes, objects, methods, and attributes.
   - **Submission:** Upload your code to a GitHub repository and submit the link to the repository.

### Submission Process
- **Google Form Submission:** Submit both your Google Docs link (for the theoretical part) and your GitHub repository link (for the practical part) through the following Google Form: [Assignment Submission Form](https://forms.gle/i59qu7FQrU7t68pW8).
  - Ensure that you have given edit access to `chikwajacobos@gmail.com` for the Google Docs Link.
  - Ensure that the GitHub repository is public or accessible via the provided link.

## Due Date
- The assignment is due on **Tuesday, 27th of August**. Ensure both the Google Docs link and the GitHub repository link are submitted via the Google Form by the end of the day.

## Evaluation Criteria
- **Theoretical Component (50%):**
  - Clarity and depth of the report.
  - Correctness and relevance of the information provided.
  - Proper citation and referencing.

- **Practical Component (50%):**
  - Correct implementation of the `Car` class and its methods.
  - Ability to create and manipulate objects.
  - Code quality, including readability, comments, and adherence to best practices.
