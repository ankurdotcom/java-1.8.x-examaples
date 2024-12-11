package com.example.cts;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
 
public class App {
    public static void main( String[] args )
    {
    List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8, -2);

    // can you sort list of integers in reverse Order
    // Output expected 9,8,7,6,5,4,3,2,1,-2
      System.out.println("Input List => " + list);

      // List<Integer> outList = new LinkedList<>(Collections.sort(list););

      //   for(int i = list.size() - 1 ; i >= 0 ; i--){
      //     outList.add(list.get(i));
      //   }

      // Sort The list
      // revert the list
      List<Integer> outlist = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

      // int sum = list.stream().reduce()
        
      
      System.out.println("Output List =>" + outlist);


List<String> listofStrings = Arrays.asList("anna","john","marcos","helena","yasmin");


        List<Person> people = new ArrayList<Person>() {{
            add(new Person(1, "Dixie", "O'Finan", "dofinan0@huffingtonpost.com", "Female", 91));
            add(new Person(2, "Harmon", "Marling", "hmarling1@moonfruit.com", "Male", 38));
            add(new Person(3, "Dallas", "Beynon", "dbeynon2@rambler.ru", "Male", 61));
            add(new Person(4, "Carlyle", "Lachaize", "clachaize3@youtu.be", "Male", 10));
            add(new Person(5, "Eula", "Pimm", "epimm4@google.com.hk", "Female", 54));
            add(new Person(6, "Andrus", "Endricci", "aendricci5@google.ru", "Male", 19));
            add(new Person(7, "Charley", "Molyneux", "cmolyneux6@un.org", "Male", 60));
            add(new Person(8, "Vidovic", "Wasling", "vwasling7@oaic.gov.au", "Male", 38));
            add(new Person(9, "Pavia", "De la Harpe", "pdelaharpe8@yale.edu", "Female", 11));
            add(new Person(10,"Jeramie", "Borrell", "jborrell9@craigslist.org", "Male", 5));
            add(new Person(11,"Sorcha", "Plant", "splanta@friendfeed.com", "Female", 57));
            add(new Person(12,"Allister", "Olfert", "aolfertb@ehow.com", "Male", 68));
            add(new Person(13,"Jeane", "Everitt", "jeverittc@soup.io", "Female", 76));
            add(new Person(14,"Towny", "Gisbye", "tgisbyed@salon.com", "Male", 41));
            add(new Person(15,"Wolfie", "Doniso", "wdonisoe@typepad.com", "Male", 2));
            add(new Person(16,"Cassaundra", "McGuiney", "cmcguineyf@weibo.com", "Female", 70));
            add(new Person(17,"Lisha", "Melbourn", "lmelbourng@guardian.co.uk", "Female", 6));
            add(new Person(18,"Zsa zsa", "Shutt", "zshutth@cloudflare.com", "Female", 9));
            add(new Person(19,"Rafferty", "Dumingo", "rdumingoi@comsenz.com", "Male", 93));
            add(new Person(20,"Rollins", "Skellion", "rskellionj@miibeian.gov.cn", "Male", 3));
            add(new Person(21,"Jens", "Mackin", "jmackink@washington.edu", "Male", 47));
            add(new Person(22,"Beverlie", "Martinon", "bmartinonl@github.io", "Female", 3));
            add(new Person(23,"Adrienne", "Townsend", "atownsendm@fc2.com", "Female", 68));
            add(new Person(24,"Goldi", "Padly", "gpadlyn@vistaprint.com", "Female", 38));
            add(new Person(25,"Fabio", "Sinderson", "fsindersono@livejournal.com", "Male", 72));
        }};


        
        
   
    }
}
 
class Person {
 
  final Integer id;
  final String firstName;
  final String lastName;
  final String email;
  final String gender;
  final Integer age;
 
  public Person(Integer id, String firstName, String lastName, String email, String gender,
      Integer age) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.gender = gender;
    this.age = age;
  }
 
  public Integer getId() {
    return id;
  }
 
  public String getFirstName() {
    return firstName;
  }
 
  public String getLastName() {
    return lastName;
  }
 
  public String getEmail() {
    return email;
  }
 
  public String getGender() {
    return gender;
  }
 
  public Integer getAge() {
    return age;
  }
 
  @Override
  public String toString() {
    return "Person{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", email='" + email + '\'' +
        ", gender='" + gender + '\'' +
        ", age=" + age +
        '}';
  }
}
 