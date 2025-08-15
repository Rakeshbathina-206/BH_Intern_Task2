# Java Collections & Sorting — Employee List

**Simple internship task:** create an `Employee` class, store employees in a collection, and show sorting using `Comparator` (salary desc, name asc).

---

## Project summary

This small Java project demonstrates how to use Java Collections (`ArrayList`) and `Comparator` to sort custom objects. It includes an `Employee` class (name, age, salary), sample data, and two sorted views:

* Sort by **salary (descending)**
* Sort by **name (ascending)**

It’s perfect as a short demo for learning Collections, lambda comparators, and `List.sort()`.

---

## Folder structure

```
java-employee-sorting/
├── src/
│   └── Main.java
├── screenshots/
│   └── output.png
├── README.md
└── LICENSE
```

> Add your screenshots (e.g. `output.png`) to the `screenshots/` folder before pushing.

---

## Files

* `src/Main.java` — single-file runnable example that contains `main()` and the `Employee` inner class.
* `screenshots/output.png` — (optional) screenshot showing program output.
* `README.md` — this file.
* `LICENSE` — your chosen license (e.g., MIT).

---

## How to run (Java 8+)

1. Open terminal in the project root.
2. Compile:

   ```bash
   javac -d out src/Main.java
   ```
3. Run:

   ```bash
   java -cp out Main
   ```

Or run directly in your IDE (Eclipse / IntelliJ / VS Code): import as a Java project and run `Main`.

---

## Example code (core parts)

```java
// sorting by salary (descending)
bySalaryDesc.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

// sorting by name (ascending)
byNameAsc.sort(Comparator.comparing(Employee::getName));
```

If you want salary ties broken by name:

```java
Comparator<Employee> cmp = Comparator
    .comparingDouble(Employee::getSalary).reversed()
    .thenComparing(Employee::getName);
list.sort(cmp);
```

---

## Sample output

```
Sorted by salary (desc):
Employee{name='Deepak', age=26, salary=60000.00}
Employee{name='Anitha', age=28, salary=52000.50}
... 

Sorted by name (asc):
Employee{name='Anitha', age=28, salary=52000.50}
Employee{name='Bhanu', age=22, salary=52000.50}
...
```

---

## What I built — short story (what / why / how)

* **What:** A minimal Java demo that creates `Employee` objects, stores them in an `ArrayList`, and prints two sorted lists.
* **Why:** To practice Java Collections, building custom comparators, and to show how sorting can be customized for real objects. This is commonly needed in applications (leaderboards, payroll listing, directory views).
* **How:** Implemented `Employee` with fields + constructor + `toString()`. Used `List.sort()` with `Comparator.comparing...` and `.reversed()` to produce required orderings.

---

## Notes & improvements

* Currently uses in-code sample data. You can extend to:

  * Read employees from a CSV or user input.
  * Add more robust tie-breakers (age, name case-insensitive).
  * Separate `Employee` into its own `Employee.java` file for larger projects.
  * Add unit tests (JUnit) to assert sorting behavior.

---

## Submission checklist (for GitHub)

* [ ] `src/` contains your Java files
* [ ] `README.md` (this file) included
* [ ] `screenshots/` includes program output images (optional)
* [ ] `LICENSE` added (e.g., MIT)
* [ ] Push to a **new GitHub repository** and paste the repo link in the submission form

---

## License

Choose a license (e.g., **MIT**). Add `LICENSE` file to repo.

