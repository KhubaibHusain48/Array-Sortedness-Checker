
---

# 📊 Array Sortedness Checker

This Java project determines whether a given array is sorted in **increasing** or **decreasing** order. It uses modular code design with multiple classes inside the `IsSortedArray` package.

## 🗂️ Project Structure

* **`UtilityClass`**: Handles user input to create the array.
* **`Increase`**: Contains the method to check if the array is strictly decreasing.
* **`Decrease`**: Contains the method to check if the array is strictly increasing.
* **`MainClass`**: The main driver program that runs the checks and prints the result.

## 🚀 How to Run

### Prerequisites

* Java Development Kit (JDK) installed (version 8 or above)

### Steps

1. Organize the following files in a folder named `IsSortedArray`:

   * `UtilityClass.java`
   * `Increase.java`
   * `Decrease.java`
   * `MainClass.java`
2. Compile all the Java files:

   ```bash
   javac IsSortedArray/*.java
   ```
3. Run the main program:

   ```bash
   java IsSortedArray.MainClass
   ```

## 💻 Sample Run

```
Enter the size of the array: 5
Enter the element 1: 10
Enter the element 2: 8
Enter the element 3: 6
Enter the element 4: 4
Enter the element 5: 2
Array is Sorted
```

```
Enter the size of the array: 5
Enter the element 1: 2
Enter the element 2: 4
Enter the element 3: 6
Enter the element 4: 8
Enter the element 5: 10
Array is Sorted
```

```
Enter the size of the array: 5
Enter the element 1: 2
Enter the element 2: 5
Enter the element 3: 3
Enter the element 4: 8
Enter the element 5: 10
Array is not Sorted
```

## 🔑 Concepts Demonstrated

* Array handling and user input
* Checking order using iteration and conditional logic
* Modular programming with classes and packages

