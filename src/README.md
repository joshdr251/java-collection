# Java Collection

A collection of small, standalone Java programs built as learning projects to practice core Java fundamentals — loops, arrays, user input, and program logic.

Each program is **completely independent** of the others and can be compiled and run on its own. The only shared component is `Kon.java`, a simple utility class for reading console input, which is used by both programs.
 
---

## 📦 | Programs

### 🚢 Battleship
A text-based Battleship game played in the console. The player enters grid coordinates to find and sink all ships hidden on a 4×7 board. The game tracks hits and missed shots and ends once all ship parts are destroyed.

**Highlights:**
- Grid-based coordinate input
- Hit, miss, and already-hit detection
- Tracks total missed shots until victory
---

### 💳 Cash Dispenser
A simple ATM simulation. The user must enter the correct PIN to gain access, then can withdraw money from a starting balance of 1000. The program prevents overdrafts and lets the user decide when to end the session.

**Highlights:**
- PIN authentication loop
- Balance tracking with overdraft protection
- Clean session end handling
---

### 🔧 Kon *(shared utility)*
A small helper class that provides a clean `readInt()` method for reading integer input from the console — including input validation and error messages. Both programs above depend on this file, but it is not a program itself.
 
---

## 🛠️ | Technologies

- Java (no external libraries)
- Console I/O via `java.util.Scanner` (wrapped in `Kon.java`)
---

## 🚀 | Installation & How to Run

1. Clone the repository
```bash
   git clone https://github.com/YOUR_USERNAME/Java_Collection.git
   cd Java_Collection
```

2. Compile and run a program of your choice:
   **Battleship:**
```bash
  javac Kon.java Battleship.java
  java Battleship
  ```

**Cash Dispenser:**
```bash
  javac Kon.java Cash_Dispenser.java
  java Cash_Dispenser
```

> `Kon.java` must always be compiled alongside the program that uses it.

Each program is standalone — you only need to compile the files relevant to the program you want to run.

**Battleship:**
```bash
javac Kon.java Battleship.java
java Battleship
```

**Cash Dispenser:**
```bash
javac Kon.java Cash_Dispenser.java
java Cash_Dispenser
```

> `Kon.java` must always be compiled alongside the program that uses it.


## 📕 | Notes

- Developed using IntelliJ IDEA with Java
- All programs are independent — there is no shared state or dependency between `Battleship` and `Cash_Dispenser`
- This is an ongoing learning project

## 🪲 | Bugs
* Feel free to report any bugs
