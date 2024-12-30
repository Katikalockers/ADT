# ADT  
This program reads student data from CSV file and allows to perform sorting ang search.  
Features: -Sort by Student ID  
          -Sort by First Name  
          -Sort by Last Name  
          -Search by First Name  
Usage: 1.Input the CSV file (information in the following format "StudentID, FirstName, LastName)  
      2.Run the program  
      3.Choose an option n: Student ID  
                        f: First Name
                        l: Last Name  
                        s: Search by First Name  
                        x: Exit  
      4.Perform the operation  
        -if choose n,f or l, the program will sort and display the student list based on your selection  
        -if choose s, the program will prompt you to enter a first name to search for. It will then display the students that match the search and show the index  
      5.Exit, choose x to stop the  program  

Test Cases: 1. Sort by Student ID  
              Input: Choose n to sort by Student ID.  
              Expected Output: The list of students will be displayed in ascending order by Student ID.  
            2.Sort by First Name  
              Input: Choose f to sort by First Name.  
              Expected Output: The list of students will be displayed in alphabetical order by First Name.  
            3.Sort by Last Name  
              Input: Choose l to sort by Last Name.  
              Expected Output: The list of students will be displayed in alphabetical order by Last Name.    
            4.Search for a First Name  
              Input: Choose s to search by First Name and enter a first name (e.g., Katika).  
              Expected Output: The program will display the student(s) with the first name Katika along with their index in the list.  
            5.Invalid Option  
              Input: Enter an invalid option (e.g., p).  
              Expected Output: The program will display Invalid option. and prompt the user for input again  
