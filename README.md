## ioetExercise
<details>
  <summary>Overview of the solution</summary>
  I developed my solution using Java, because it is the language I use for the backend in my current job.<br>
  This is how my solution works:<br>
<ul>
<li>The program starts reading every line of the text file, then I split the line in the name of the employee and the worked range using the "=" as separator.</li>
<li>With the name splitted, I assign this name to the employee.</li>
<li>With the worked range, I start to split every range into days and hours together using the "," as separator</li>
<li>Once I have the day and hours worked, I split it again into day acronym and hours.</li>
<li>The day acronym is compared to an array of the days of the week and the days of the weekend, to know how much to pay for hour.</li>
<li>The hours worked are united by the sign "-", so I split these hours into startHour and finishHour.</li>
<li>I transform the startHour to minutes, then I check if the startHour belongs to morning, afternoon or night.</li>
<li>I repeat the same above process for finishHour, and now I can subtract the finishHour minus the startHour.</li>
<li>With the result of the the subtraction, I only have to multiply this value according to the range and the day obtained.</li>
<li>Finally I assign the value of the above operation to the employee salary.</li>
</ul>
  </details>
<details><summary>Architecture explanation</summary>
For this exercise, I divided my program in the following packages:<br>
classes, data, handler, main and tests.<br>
The classes package contains:<br>
<ul>
<li>Employee</li>
<ul>
<li>This class has the attributes name and salary; and the method SalaryToPay.</li>
</ul>
<li>dataHandler</li>
<ul>
<li>This class has the attributes dayAcronym and the boolean weekOrWeekend; and the method priceForDay.</li>
</ul>
<li>HourWorked</li>
<ul>
<li>This class has the attributes startHour and finishHour.</li>
</ul>
</ul>
The data package contains:<br>
<ul>
<li>data.txt</li>
<ul>
<li>This is the text file where the data is located.</li>
</ul>
</ul>
The handler package contains:<br>
<ul>
<li>dataHandler</li>
<ul>
<li>This class has the methods readFile, splitName, splitWork, weekWorked, getAcronymdayWorked and getRangeWorked.</li>
</ul>
<li>hourHandler</li>
<ul>
<li>This class has the attributes WEEK and WEEKEND; and the methods: getStartHour, getFinishHour, convertToMinutes, getPriceWeekday and getPriceWeekend.</li>
</ul>
</ul>
The main package contains:<br>
<ul>
<li>Main</li>
<ul>
<li>This class calls some of the previous classes to calculate the salary and print the result in console.</li>
</ul>
</ul>
Finally, the tests package contains:<br>
<ul>
<li>DataHandlerTest</li>
<ul>
<li>This class tests the methods of the dataHandler class.</li>
</ul>
<li>HourHandlerTest</li>
<ul>
<li>This class tests the methods of the hourHandler class.</li>
</ul>
</ul>
  </details>
<details><summary>Approach and methodology</summary>
I started creating a Java project using Eclipse Photon, then I created a repository in my Github account to host this project.<br>
I worked in my local project, creating new functionality in order to obtain the expected result, which is the salary of the employee. Everytime I developed new functionality, I committed these changes to my Github repository.<br>
In the development process, the first thing I did was create the Employee, DayWorked and HourWorked classes. Next, I created the dataHandler and HourHandler classes, since in this classes I put all the logic to handle the text file and the data obtained of it. To prove everything said above, I created a Main class, and for keep the text file, I created the data package. When the solution was finished, I started with the test process, I used Junit 4 and I saved all the test classes in the tests package.<br>
Finally, I edited the README file in my Github repository to explain what I did to succeed in this exercise.
  </details>
<details><summary>Intructions to run the program</summary>
My program was made using Eclipse Phothon, so I recommend using the same Eclipse to run this program without problems.<br>
The java version that I used is 1.8.0_271.<br>
To change the data, you can edit the data.txt file that is located in data package.<br>
Moreover, you can process a text file you want, just make sure that the name of the file is data.txt and the location is the data package.<br>
To start the program, go to main package, open the Main class and run this class.<br>
  </details>
