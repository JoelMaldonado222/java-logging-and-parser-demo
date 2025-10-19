# Java Logging and Parser Demo

A simple yet practical Java project demonstrating how to **generate, format, and parse log files** using the `java.util.logging` framework and `BufferedReader` for data extraction and error analysis.

---

## 🧩 Project Overview
This mini-application is divided into two parts:

### 1️⃣ Log Generation (`LogDemo.java`)
- Utilizes **`java.util.logging`** to record events at three severity levels: `INFO`, `WARNING`, and `SEVERE`.
- Configured with:
  - **ConsoleHandler** → displays logs in the console.
  - **FileHandler** → writes logs to a file named `app.log`.
  - **SimpleFormatter** → provides readable, timestamped output.
- Automatically generates **100+ log entries** simulating normal operations and critical events.

### 2️⃣ Log Parsing (`LogParser.java`)
- Reads the generated log file using **`BufferedReader`**.
- Extracts and displays only the `SEVERE` (critical) log entries.
- Counts and reports the total number of `SEVERE` events.
