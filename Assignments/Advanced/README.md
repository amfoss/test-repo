# test-repo
This is a test repo, please fork me!!! \(^_^)/
This repository contains a simple test on Java Lambdas and Git.
<hr>

Please follow the below mentioned instructions:

1. Fork this repository
2. Clone the forked the repository to your machine 
3. Create a new branch from the development branch
4. Create a new folder :file_folder: and name it ```Java``` 
5. Go into the Java directory
6. Create a java file called Student
    * Create a class Student
    * Create the following fields and methods-
        1. String -> name [private]
        2. String -> rollNumber [private]
        3. String -> favoriteFruit [private]
        4. float -> height [private]
        5. float -> weight [private]
    * Create getters and setters for these fields
    * Create a argumented-constructor which takes in all the declared fields, and a no-arg constructor(default constructor)
    * Create a driver class which contains a main method.
    * Create a non-static method called ```studentConsumer()``` in the driver class. The method takes two in arguments, which are as follows:
        1. An ```ArrayList<T>``` of students
        2. A ```Consumer<T>``` functional interface
    * Inside the method body write the logic to consume the students in present in the ```ArrayList<T>```
        by making use of the ```accept(T t)``` method of the ```Consumer<T>``` functional interface.
    * Create an ArrayList of students and populate the list by taking input from the user.
    * Call the ```studentConsumer()``` method inside the main thread, pass in the list of students and also write the logic to print the details of each student from the list.
    * Once the program executes and displays the output, commit the file ```.java``` file only.
7. Now create a text file and write the name of your favorite fruit, song, and dessert.
8. Commit the text file as well.
9. Create a ```.gitignore``` file and add ```*.class``` entry into it.
10. Commit this file as well.
11. Finally, squash the last three commits into a single commit and send a pull request. 

:sparkles: Yay!! You're done. :sparkles: 
