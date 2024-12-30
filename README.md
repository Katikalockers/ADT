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

THE EXAMPLE OUTPUT:  
Please enter the file (e.g. C:\Users\CAMT-STD\Downloads\class_roaster67.csv)  
enter: C:\Users\CAMT-STD\Downloads\class_roaster67.csv  

Please enter an option for sorting  
n: Student ID  
f: First Name  
l: Last Name  
s: Search by First Name  
x: Exit  
enter: l  
672115044 VIDCHAYADA  ABHICHARTTIBUTRA  
672115039 METAVEE  AEINJANG  
672115041 RAPHEEPHAT  AEIPHINGCHAI  
672115008 CHANYA  BUNRUEANG  
672115028 NINA  BURGER  
662115016 NATTHAPHUM  CHAIKHAN  
672115013 NATTHAN  CHAMPATHIP  
672115042 RANTICHA  CHUMJAI  
672115016 NATTHAPAT  JAGKHURUANG  
672115049 ANAWAT  JANDEE  
672115007 CHANCHAKORN  JULLAPECH  
672115004 JITTIPAT  KAEWIJIT  
662115039 MANAPAT  KAEWLAI  
672115005 CHETSADA  KANKARN  
672115001 KATIKA  KANTHASON  
672115018 DALANPHOP  KEAWSIRIPONG  
662115007 CHONCHANUN  KHACHONPHURITHANAKUL  
672115045 VIRAWIT  KONGTHONG  
672115046 SATTAPORN  KOWARAKUN  
672115047 SAMAKOM  MAKHIAO  
672115037 PHUTAWAN  MUEANGMA  
672115006 CHANLACHAT  PANYOYAI  
672115009 CHIDNUCHA  POBKEEREE  
672115024 TAT  PUTJORN  
672115014 NATTIKORN  SAE-SUE  
672115011 NATTHAPOOM  SAENGKAEW  
622115040 SUCHANUN  SIRIJANYA  
672115010 NATANON  SOMBOON  
672115019 THINNAPOP  SRISOMBOON  
672115015 NATTAPON  SUKKEAW  
672115012 NUT  SUPAPORN  
672115002 KRITTAMETH  TANSUWAN  
672115020 TECHIT  WONGKITI  
672115048 SUKRITPONG  WONGPANYA  
672115043 WASINPAT  YANIN  
672115044 VIDCHAYADA  ABHICHARTTIBUTRA  
672115039 METAVEE  AEINJANG  
672115041 RAPHEEPHAT  AEIPHINGCHAI  
672115008 CHANYA  BUNRUEANG  
672115028 NINA  BURGER  
662115016 NATTHAPHUM  CHAIKHAN  
672115013 NATTHAN  CHAMPATHIP  
672115042 RANTICHA  CHUMJAI  
672115016 NATTHAPAT  JAGKHURUANG  
672115049 ANAWAT  JANDEE  
672115007 CHANCHAKORN  JULLAPECH  
672115004 JITTIPAT  KAEWIJIT  
662115039 MANAPAT  KAEWLAI  
672115005 CHETSADA  KANKARN  
672115001 KATIKA  KANTHASON  
672115018 DALANPHOP  KEAWSIRIPONG  
662115007 CHONCHANUN  KHACHONPHURITHANAKUL  
672115045 VIRAWIT  KONGTHONG  
672115046 SATTAPORN  KOWARAKUN  
672115047 SAMAKOM  MAKHIAO  
672115037 PHUTAWAN  MUEANGMA  
672115006 CHANLACHAT  PANYOYAI  
672115009 CHIDNUCHA  POBKEEREE  
672115024 TAT  PUTJORN  
672115014 NATTIKORN  SAE-SUE  
672115011 NATTHAPOOM  SAENGKAEW  
622115040 SUCHANUN  SIRIJANYA  
672115010 NATANON  SOMBOON  
672115019 THINNAPOP  SRISOMBOON  
672115015 NATTAPON  SUKKEAW  
672115012 NUT  SUPAPORN  
672115002 KRITTAMETH  TANSUWAN  
672115020 TECHIT  WONGKITI  
672115048 SUKRITPONG  WONGPANYA  
672115043 WASINPAT  YANIN  
  
Please enter an option for sorting  
n: Student ID  
f: First Name  
l: Last Name  
s: Search by First Name  
x: Exit  
enter: s  
enter the first name to search for: katika  
672115001 KATIKA  KANTHASON  
Found in index 14  
  
Please enter an option for sorting  
n: Student ID  
f: First Name  
l: Last Name  
s: Search by First Name  
x: Exit  
enter: x  
Stopping the program.  
