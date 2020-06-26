<html>
<head><title>
forms</title></head>
<body>
The <form> Element
The HTML <form> element defines a form that is used to collect user input: 
An HTML form contains form elements.
Form elements are different types of input elements, like text fields, checkboxes, radio buttons, submit buttons, and more.

 
The <input> Element
The <input> element is the most important form element.
The <input> element can be displayed in several ways, depending on the type attribute.
Here are some examples:

Text Input
<input type="text"> defines a one-line input field for text input:
Example
<form>
  First name:<br>
  <input type="text" name="firstname"><br>
  Last name:<br>
  <input type="text" name="lastname">
</form>
Radio Button Input
<input type="radio"> defines a radio button.
Radio buttons let a user select ONE of a limited number of choices:
Example
<form>
  <input type="radio" name="gender" value="male" checked> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
  <input type="radio" name="gender" value="other"> Other
</form>
The Submit Button
<input type="submit"> defines a button for submitting the form data to a form-handler.
The form-handler is typically a server page with a script for processing input data.
The form-handler is specified in the form's action attribute:
Example
<form action="/action_page.php">
  First name:<br>
  <input type="text" name="firstname" value="Mickey"><br>
  Last name:<br>
  <input type="text" name="lastname" value="Mouse"><br><br>
  <input type="submit" value="Submit">
</form>
The Action Attribute
The action attribute defines the action to be performed when the form is submitted.
Normally, the form data is sent to a web page on the server when the user clicks on the submit button.
In the example above, the form data is sent to a page on the server called "/action_page.php". This page contains a server-side script that handles the form data:

Example
<form action="/action_page.php">
If the action attribute is omitted, the action is set to the current page.
The Target Attribute
The target attribute specifies if the submitted result will open in a new browser tab, a frame, or in the current window.
The default value is "_self" which means the form will be submitted in the current window.
To make the form result open in a new browser tab, use the value "_blank":

Example
<form action="/action_page.php" target="_blank">

The Method Attribute
The method attribute specifies the HTTP method (GET or POST) to be used when submitting the form data:

Example
<form action="/action_page.php" method="get">
or:

Example
<form action="/action_page.php" method="post">
//When to Use GET?
The default method when submitting form data is GET.
However, when GET is used, the submitted form data will be visible in the page address field:
/action_page.php?firstname=Mickey&lastname=Mouse

Notes on GET:
Appends form-data into the URL in name/value pairs
The length of a URL is limited (about 3000 characters)
Never use GET to send sensitive data! (will be visible in the URL)
Useful for form submissions where a user wants to bookmark the result
GET is better for non-secure data, like query strings in Google

When to Use POST?
Always use POST if the form data contains sensitive or personal information. The POST method does not display the submitted form data in the page address field.

Notes on POST:
POST has no size limitations, and can be used to send large amounts of data.
Form submissions with POST cannot be bookmarked

The Name Attribute
Each input field must have a name attribute to be submitted.
If the name attribute is omitted, the data of that input field will not be sent at all.
This example will only submit the "Last name" input field:

Example
<form action="/action_page.php">
  First name:<br>
  <input type="text" value="Mickey"><br>
  Last name:<br>
  <input type="text" name="lastname" value="Mouse"><br><br>
  <input type="submit" value="Submit">
</form>

Grouping Form Data with <fieldset>
The <fieldset> element is used to group related data in a form.
The <legend> element defines a caption for the <fieldset> element.

Example
<form action="/action_page.php">
  <fieldset>
    <legend>Personal information:</legend>
    First name:<br>
    <input type="text" name="firstname" value="Mickey"><br>
    Last name:<br>
    <input type="text" name="lastname" value="Mouse"><br><br>
    <input type="submit" value="Submit">
  </fieldset>
</form>

 The <select> Element
The <select> element defines a drop-down list:

Example
<select name="cars">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="fiat">Fiat</option>
  <option value="audi">Audi</option>
</select>

The <option> elements defines an option that can be selected.
By default, the first item in the drop-down list is selected.
To define a pre-selected option, add the selected attribute to the option:

Example
<option value="fiat" selected>Fiat</option>
Visible Values:
Use the size attribute to specify the number of visible values:

Example
<select name="cars" size="3">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="fiat">Fiat</option>
  <option value="audi">Audi</option>
</select>
Allow Multiple Selections:
Use the multiple attribute to allow the user to select more than one value:

Example
<select name="cars" size="4" multiple>
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="fiat">Fiat</option>
  <option value="audi">Audi</option>
</select>
The <textarea> Element
The <textarea> element defines a multi-line input field (a text area):

Example
<textarea name="message" rows="10" cols="30">
The cat was playing in the garden.
</textarea>
The rows attribute specifies the visible number of lines in a text area.
The cols attribute specifies the visible width of a text area.
This is how the HTML code above will be displayed in a browser:

You can also define the size of the text area by using CSS:

Example
<textarea name="message" style="width:200px; height:600px">

</textarea>
 
The <button> Element
The <button> element defines a clickable button:

Example
<button type="button" onclick="alert('Hello World!')">Click Me!</button>

Input Type Password
<input type="password"> defines a password field:

Example
<form>
  User name:<br>
  <input type="text" name="username"><br>
  User password:<br>
  <input type="password" name="psw">
</form>
Input Type Reset
<input type="reset"> defines a reset button that will reset all form values to their default values:

Example
<form action="/action_page.php">
  First name:<br>
  <input type="text" name="firstname" value="Mickey"><br>
  Last name:<br>
  <input type="text" name="lastname" value="Mouse"><br><br>
  <input type="submit" value="Submit">
  <input type="reset">
</form>
Input Type Date
The <input type="date"> is used for input fields that should contain a date.
Depending on browser support, a date picker can show up in the input field.

Example
<form>
  Enter a date before 1980-01-01:
  <input type="date" name="bday" max="1979-12-31"><br>
  Enter a date after 2000-01-01:
  <input type="date" name="bday" min="2000-01-02"><br>
</form>
Input Type Datetime-local
The <input type="datetime-local"> specifies a date and time input field, with no time zone.

Depending on browser support, a date picker can show up in the input field.

OperaSafariChromeFirefoxInternet Explorer
Example
<form>
  Birthday (date and time):
  <input type="datetime-local" name="bdaytime">
</form>
Input Type Email
The <input type="email"> is used for input fields that should contain an e-mail address.
Depending on browser support, the e-mail address can be automatically validated when submitted.
Some smartphones recognize the email type, and adds ".com" to the keyboard to match email input.

OperaSafariChromeFirefoxInternet Explorer
Example
<form>
  E-mail:
  <input type="email" name="email">
</form>
Input Type File
The <input type="file"> defines a file-select field and a "Browse" button for file uploads.

OperaSafariChromeFirefoxInternet Explorer
Example
<form>
  Select a file: <input type="file" name="myFile">
</form>

Input Type Month
The <input type="month"> allows the user to select a month and year.
Depending on browser support, a date picker can show up in the input field.

OperaSafariChromeFirefoxInternet Explorer
Example
<form>
  Birthday (month and year):
  <input type="month" name="bdaymonth">
</form>
Input Type Number
The <input type="number"> defines a numeric input field.
You can also set restrictions on what numbers are accepted.
The following example displays a numeric input field, where you can enter a value from 1 to 5:

OperaSafariChromeFirefoxInternet Explorer
Example
<form>
  Quantity (between 1 and 5):
  <input type="number" name="quantity" min="1" max="5">
</form>

Input Type Tel
The <input type="tel"> is used for input fields that should contain a telephone number.
Note: The tel type is currently only supported in Safari 8.
OperaSafariChromeFirefoxInternet Explorer
Example
<form>
  Telephone:
  <input type="tel" name="usrtel">
</form>
Input Type Url
The <input type="url"> is used for input fields that should contain a URL address.
Depending on browser support, the url field can be automatically validated when submitted.
Some smartphones recognize the url type, and adds ".com" to the keyboard to match url input.
OperaSafariChromeFirefoxInternet Explorer
Example
<form>
  Add your homepage:
  <input type="url" name="homepage">
</form>
Input Type Week
The <input type="week"> allows the user to select a week and year.
Depending on browser support, a date picker can show up in the input field.
OperaSafariChromeFirefoxInternet Explorer
Example
<form>
  Select a week:
  <input type="week" name="week_year">
</form>






















css forms
CSS Forms
The look of an HTML form can be greatly improved with CSS:

First Name 
Your name..
Last Name 
Your last name..
Country Try it Yourself »
Styling Input Fields
Use the width property to determine the width of the input field:

First Name 
Example
input {
    width: 100%;
}
The example above applies to all <input> elements. If you only want to style a specific input type, you can use attribute selectors:

input[type=text] - will only select text fields
input[type=password] - will only select password fields
input[type=number] - will only select number fields
etc..

Padded Inputs
Use the padding property to add space inside the text field.

Tip: When you have many inputs after each other, you might also want to add some margin, to add more space outside of them:

First Name 
Last Name 
Example
input[type=text] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
}
Note that we have set the box-sizing property to border-box. This makes sure that the padding and eventually borders are included in the total width and height of the elements. 
Read more about the box-sizing property in our CSS Box Sizing chapter.

Bordered Inputs
Use the border property to change the border size and color, and use the border-radius property to add rounded corners:

First Name 
Example
input[type=text] {
    border: 2px solid red;
    border-radius: 4px;
}
If you only want a bottom border, use the border-bottom property:

First Name 
Example
input[type=text] {
    border: none;
    border-bottom: 2px solid red;
}
Colored Inputs
Use the background-color property to add a background color to the input, and the color property to change the text color:


John
Example
input[type=text] {
    background-color: #3CBC8D;
    color: white;
}
Focused Inputs
By default, some browsers will add a blue outline around the input when it gets focus (clicked on). You can remove this behavior by adding outline: none; to the input.

Use the :focus selector to do something with the input field when it gets focus:


Example
input[type=text]:focus {
    background-color: lightblue;
}
 
Example
input[type=text]:focus {
    border: 3px solid #555;
}
Input with icon/image
If you want an icon inside the input, use the background-image property and position it with the background-position property. Also notice that we add a large left padding to reserve the space of the icon:


Search..
Example
input[type=text] {
    background-color: white;
    background-image: url('searchicon.png');
    background-position: 10px 10px; 
    background-repeat: no-repeat;
    padding-left: 40px;
}
Animated Search Input
In this example we use the CSS transition property to animate the width of the search input when it gets focus. You will learn more about the transition property later, in our CSS Transitions chapter.


Search..
Example
input[type=text] {
    -webkit-transition: width 0.4s ease-in-out;
    transition: width 0.4s ease-in-out;
}

input[type=text]:focus {
    width: 100%;
}
Styling Textareas
Tip: Use the resize property to prevent textareas from being resized (disable the "grabber" in the bottom right corner):


Some text...

Example
textarea {
    width: 100%;
    height: 150px;
    padding: 12px 20px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    background-color: #f8f8f8;
    resize: none;
}
Styling Select Menus

Example
select {
    width: 100%;
    padding: 16px 20px;
    border: none;
    border-radius: 4px;
    background-color: #f1f1f1;
}
Styling Input Buttons
 
Example
input[type=button], input[type=submit], input[type=reset] {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 16px 32px;
    text-decoration: none;
    margin: 4px 2px;
    cursor: pointer;
}
</body>
/* Tip: use width: 100% for full-width buttons */