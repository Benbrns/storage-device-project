# Storage Device Project

A simple file system simulation written in Java.

This project models how storage devices, files, and directories work internally by using block allocation and recursive directory management.

## Features

- Simulated storage device with fixed-size blocks
- Block allocation and freeing system
- File creation and dynamic growth
- Recursive directory structure
- File and directory clearing
- Name validation system
- Object-oriented design using inheritance and abstraction

## Classes

### StorageDevice
Represents a storage device (SSD/USB/etc.) with:
- Fixed number of blocks
- Block allocation
- Block freeing
- Tracking used and available storage

### Entity
Abstract base class for:
- Files
- Directories

Handles:
- Name validation
- Storage reference
- Size calculations

### File
Represents a file stored on the storage device.
Supports:
- Growing in size
- Block allocation
- Clearing/freeing blocks

### Directory
Represents a folder that can contain:
- Files
- Other directories

Supports:
- Recursive size calculation
- Recursive clearing

## Concepts Practiced

- Object-Oriented Programming (OOP)
- Inheritance
- Abstract classes
- Encapsulation
- Recursive algorithms
- Storage management simulation

## Example

```java
StorageDevice ssd = new StorageDevice(100, 4096);

File file = new File(ssd, "notes.txt");
file.grow(5);

System.out.println(file.getSizeInBlocks());

Directory folder = new Directory(ssd, "documents");
folder.add(file);
```

## Repository

GitHub Repository:
https://github.com/Benbrns/storage-device-project

## Author

Ben
