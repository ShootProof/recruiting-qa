Thank you in advance for reviewing my answer. 

# Exercise I (90 mins) 

I spent time being as thorough as possible. Came up with a draft, revisited and revised it several times.

## User Story 1 : As a Studio User, I want to track client referrals so that I can provide great customer experience and grow my client base

* Questions on the story:
  * Is there any backend dependency that this front end ticket requires? If there is it would be great to link the backend stories to this ticket. 
That will help QA understand more of payload, behavior and logic
  * Looks like we are only adding a new section referral on the existing Contact Edit Page? Or there are fields that exist today but will be removed or updated after this story?
If so any impact on the existing system?
  * Is this new Referral section required or optional for a contact? Looking at the visual the section is optional(does not have * marked) but a statement of so will definitely help confirm
  * The Acceptance Criteria (AC) says: "Typing in either text field searches the studio’s existing contact list by name and email". 
    * Is there a visual to show how the list looks like when I type in either text field?
    * What if the studio only has the current contact? If I click on "+" from either Referred By or Referred these Contacts what is supposed to happen? 
    * When searching by name would the app tries match any string in any of first, middle and last names? Or just first name? 
    * What if I type in invalid email format or characters not accepted by the system?
    * If a contact info is changed would that change (say name) reflect on the list under either Refer section? I believe so but a callout on AC would be nice.
    * What if a user accidentally types in the same contact who the Edit page is associated with under either new text field? Will the same contact be supposed to show up? For example if I load a contact edit page for Mary and then I try add Mary as her own Referrer and Referee?
    * How many contacts a user can add under either Refer section? What would the UI look like if the list is very long?
    * What if a user tries adding a same contact under both Referrer and Referee? For example I try add a same Mike under both sections?
  * The AC also says "the correct relationship should appear on both contacts' info pages". Is there a visual that illustrates what will be displayed on info page?
  * From where would I come to Contact Edit Page?
  * Where would a user be directed to respectively when she/he clicks on Save and Cancel buttons?
  * What are the error messages that a user will see when saving changes?
  * What browser types/versions are we supposed to support? Are we doing responsive for desktop and mobile? A link to such info would help QA determine testing scope
  * What are the styling requirements ..for example .. font/size/color/spacing and etc?
  * What if the response returns an error code such as 400, 403, 500 and the list can go on? What error messages are expected and where/how will they be displayed?


* Test cases:
  * Verify when page is loaded the existing contact info is properly populated
  * Verify that a user can add contacts under both new text fields: land on correct page, all changes are saved, contacts show up on contact info page.
  * Verify that a user can add contacts under either but not both new text fields.
  * Verify a user can save without adding any contact under either new text field (if UX confirms Referral section is optional)
  * Verify a user clicks Cancel button and lands on the correct page with all changes being discarded.
  * Verify the expected behavior (once UX adds that in) on typing in either field when no other existing contacts are present
  * Verify a user cannot add the same contact who the Edit page is associated with under either new text field
  * Verify a user cannot add a same contact as both Referrer and Referee? 
  * Verify a user cannot save a page if any required field is not provided
  * Verify when adding many contacts under either Referrer or Referee the UI would show an expandable list (needs UX to confirm and provide a visual)
  * Verify proper error messages show up when invalid value are provided (length, allowed characters and etc)
  * Verify an unauthenticated user cannot edit a contact
  * Verify an unauthorized user cannot edit a contact that does not belong to him/her
  * Besides functional testing depending on business/technical needs and site volume we may need to do security and/or performance testing

## User Story 2 : As a studio, I want to create a contact to manage information necessary for my photography business.

* Questions on the story:
  * First / last name and email fields
    * What is the max allowed length for each field?
    * What are the allowed characters for each field?
    * Would the app automatically capitalize either name?
    * What are the exact error messages when any of the three field is empty/too long, has invalid characters, a user adds an email that already exists and etc?
	* What is the styling on error messages? 
  * Phone
	* What is the expected phone number format? Would the app automatically populate "-" at the right places?
	* Would we allow fake numbers such as "000-000-0000"? Or in another world what are the validation rules?
	* What are the exact error messages when an invalid phone numbe is provided? 
	* Where to locate error messages?
	* What is the styling on error messages? 
  * Date of Birth 
	* How far a dob can go in the past? For example can I choose year 1800?
	* What is considered a valid birthday? For example we would probably only allow create a contact who is at least 18 years old?
  * Address/City/Postcode/Country/State
	* If I enter info into one field what other fields are required? For example can I just provide country/state and leave address empty? Or can I provide an address without contry, state or zipcode? What are the validation rules? How about I provide a non-existent state?
	* Does the app need to verify if the address exists, zip code / post code is valid?
	* Where would the State field be displayed? A visual will help
	* What are the validation rules on each field?
  * Business Name
	* No AC is specified for Business Name field
	* What is the max allowed length?
	* What are the allowed characters?
	* What and where is the error message when the validation fails? 
  * Notes
	* No AC is specified for notes field
	* What is the max allowed length?
	* What and where is the error message when that max length is exceeded? 
  * Tags
	* I would suggest move AC for tags into a different story as what are done for other sections (galleries, contracts and etc) on the right hand side
	* How many tags can a user add? Would the tag list be collapsed if the list contains a certain numbers of tags? What would UI look like?
	* Would a user type in any tag or the app will provide a fixed list for the user to choose from?
	* AC says: "A contact will only have tags saved if the contact is saved". What info a contact has will have him/her to be considered saved? Is that as long as all the three required info (first name, last name and emmail) is saved then we can say a contact is saved? Or we need to check all info on the left hand side on the screenshot before tags info can be saved? Do we need to also check if referrals sections is successfully saved before persisting tags?
  * Is there any backend dependency that this front end ticket requires?
  * From where would I come to Contact Edit Page?
  * Where would a user be directed to respectively when she/he clicks on Save and Cancel buttons?
  * What browser types/versions are we supposed to support? Are we doing responsive for desktop and mobile? A link to such info would help QA determine testing scope
  * What are the styling requirements ..for example .. font/size/color/spacing and etc?
  * What if the response returns an error code such as 400, 403, 500 and the list can go on? What error messages are expected and where/how will they be displayed?
* Test cases:
  	* Verify when page is loaded with all the expected fields 
	* Verify that a user can add contacts by only providing first name, last name and email, all changes are saved and the user is redirected to the correct destination page.
	* Verify that a user can add contacts by providing required + optional info.
	* Verify a user clicks Cancel button and lands on the correct page with all changes being discarded.
	* Verify a user cannot add an existing contact 
	* Verify a user cannot save a page if any required field is not provided
	* Verify a user cannot save a page if invalid input is provided for any field, and proper errors show up (validation rules / error UI have to be fleshed out with UX.
	And I see there will be several test cases to cover all the validation)
	* Verify an unauthenticated user cannot edit a contact
	* Verify an unauthorized user cannot edit a contact that does not belong to him/her
	* Besides functional testing depending on business/technical needs and site volume we may need to do security and/or performance testing

# Exercise II (2 hours) 

The design came straight up with no delay: use page object pattern, set up tests, pages, locators, util folders. The main idea is that a test interacts with one or more pages. Each page interacts with locators

What I spent most of time are:
* Set up eclipse on my home machine. The latest build for some reason behaved oddly, for example I had to restart the ide multiple times in order to link to github, and to add jars onto classpath within the ide. 
* I have not programmed with java / testng for quite a while. So it took me some time although not long to warm up. The reason why I chose the combo is I really like the clarity testng provides through xml file and annotations. On top of that java / testng both hava huge user community and anyone can get great support in a short time. 
* The bottom most button is out of viewport and becomes no clickable on the chrome session initiated by selenium. So I did a bit research to find the right solution. 
  * BTW the bottom most button used to be "GET STARTED" but it is now "CREATE YOUR FREE GALARIES". I saw the former earlier in the day Weds but the latter during the night on the same day. Maybe an A/B test which seems to be the right guess per the findings from the recruiting company.
  * Also there are actually three GET STARTED buttons on the home page. The 3rd will show up at the top right corner when we scroll down and the 1st GET STARTED button is not within the viewport. My test code does not interact with that 3rd button.

All of the above especially the first two contributed to the extended effort.

To run the project we will need: 
* TestNG  http://testng.org/doc/download.html - I used Eclipse, installed TestNG plugin and added its library onto the classpath
* Selenium Java Client https://www.seleniumhq.org/download/ - Required jars are included under libs folder
* Selenium Standalone Server https://www.seleniumhq.org/download/ 
* chromedriver https://www.seleniumhq.org/download/


# Exercise III (6 minutes)
* $.meta.totalItems  - Write a JsonPath that gets totalItems from meta
* $.contact[?(@.galleriesCount>=2)]  - Write a JsonPath that gets the whole contact object for contacts with at least two galleries
* $.contact[?(@.name=='Adrastea Shahriar')].tags[*]  - Write a JsonPath that gets the tags for the contact object where the contact name is "Adrastea Shahriar"
