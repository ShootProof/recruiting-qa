# Quality Assurance Exercise

## Overview

Here at ShootProof, we prefer to have a good idea of a candidate's technical
experience and analysis skills before proceeding with portions of our recruiting
process.  We believe that the exercises below will illustrate a candidate's
approach to working with technologies and methodologies commonly used in our
QA team here at ShootProof.

## Guidelines

The exercise consists of several different parts designed to showcase your
problem-solving and solution-implementation talents. There is not a single
correct answer; this is *not* an exam. We simply want to see how you approach a
business problem and the steps you take to solve it.

* This exercise should not take you more than two hours to complete. If
  your solution is taking longer, that's okay—be honest and let us know how long
  it took and why you think it took that long.
* Be as thorough as you wish.
* All exercises are to be performed as if you were on the job.
* You may submit your response in one of the following ways:
  * Package an archive (ZIP, tarball, etc.) of your files and deliver it to
    your contact.
    * If working with a recruiter, deliver it to them.
    * If working with ShootProof directly, deliver to <careers+dev@shootproof.com>.
  * Fork our repository and open a pull request.

## Exercise 1: Test plan

Below you will find two key inputs for this exercise:

* A screenshot of the Contact Edit Page, which a photographer
  would use when editing a contact within ShootProof's Studio Panel
* Some user stories and acceptance criteria for the Contact Edit view

These materials are representative of what you would be working with in our QA
team.

You may first see the acceptance criteria and a visual comp in a
grooming meeting. With the rest of the team, you would be responsible for making
sure the team collectively understands what work needs to be delivered.

In particular, as a member of our QA team, you would be responsible for
determining what testing is appropriate.

**Given these inputs, draft a test plan.**

* You may use any format and structure; whatever is familiar and representative
of your work style.
* Include some questions you'd ask if you were in the grooming meeting.
* Include any testing concerns the team should consider before taking on this work.
* Don't write a lot of test cases as part of this exercise. You may include particular test cases that stand out to you as important and non-obvious.

### Implementation screenshot

![Contact edit screenshot](contact-edit-screenshot.png "Contact edit screenshot")

### User story 1:

As a Studio User, I want to track client referrals so that I can provide great customer experience and grow my client base.

#### Acceptance criteria:

* Add a Referrals section to the Contact Edit Screen
* The Referrals section has two parts:
  * Referred By
    * A contact can be “Referred By” at most one other contact
  * Referred these Contacts
    * A contact can refer many other contacts
* Typing in either text field searches the studio’s existing contact list by name and email
* When a referral relationship is added, the correct relationship should appear on both contacts' info pages
* A referral relationship can be deleted from either contact’s page

### User story 2:

As a studio, I want to create a contact to manage information necessary for my photography business.

#### Acceptance criteria:

* A contact must be created with the following fields:
  * first name
  * last name
  * email address
* A contact that does not contain required information will display an error message underneath the field
* A contact that has a country of United States of America will see a different fields
  * A contact will have a zip code vs postal code
  * A studio will be able to select a “STATE” from a dropdown list
* A contact that has a country other then United States of America will see different fields
  * A contact will have a postal code vs zip code
  * A studio will need to type in a “STATE"
* A contact that has a country of Canada will see different fields
  * A contact will have a postal code vs zip code
  * A studio will be able to select a “STATE” from a dropdown list
* A contact may have a tag added to it consisting of at least two alphanumeric characters
  * A contact will only have tags saved if the contact is saved

### Additional user stories in this epic:

* As a studio, I want to see the galleries that my contact is associated with to access them quickly for my business.
* As a studio, I want to see the contracts that my contact is associated with to access them quickly for my business.
* As a studio, I want to see the invoices that my contact is associated with to access them quickly for my business.
* As a studio, I want to see recent activity associated with the contact to allow me to understand how they engage my services.

## Exercise 2: Test automation

You’ve been tasked with writing automated tests that check the behavior of the ShootProof
marketing site home page. There’s a "Get Started" button on
<https://www.shootproof.com/> that you’ll need to click.

### Part 1: Locating the "Get Started" button

**Goal:** provide code or pseudocode to click the topmost "Get Started" button

Provide code for an automated test that clicks topmost "Get Started"
button on <https://www.shootproof.com>.  The code provided can be for an
automated test using the tool and language of your choice (Selenium, etc.).

A complete submission will:

* Locate the topmost "Get Started" button on the page
* Click the button
* Explain why you chose the language and framework that you did
* If the code and approach is not obvious, describe the approach and decisions
  made

In the event that you cannot provide working code, please provide a written
description of how you would locate and click this button.  Pseudocode is acceptable,
but working code is preferred.

### Part 2: Locating the _other_ "Get Started" button

**Goal:** provide code or pseudocode to click the "Get Started" button that
appears at the bottom of the page

Similarly, provide code for an automated test that clicks the bottommost "Get
Started" button on <https://www.shootproof.com/>.  As in the exercise above,
the code provided can be for an automated test using the took and language of
your choice (Selenium, etc.).

A complete submission will:

* Assert that a "Get Started" button exists at the bottom of the page
* Click the button
* Explain why you chose the language and framework that you did (if different
  from part one)
* If the code and approach is not obvious, describe the approach and decisions
  made

## (Optional) Exercise 3: JsonPath

**Goal:** locate specific values within a JSON object using JsonPath

ShootProof uses Karate for API testing. Part of this work is writing
[JsonPath selectors](https://github.com/json-path/JsonPath#filter-operators) to select a
particular part of a JSON object. The concept should be familiar if you’ve written
relative XPaths or SQL queries.

Using the JSON source data below, complete the following exercises.
You may use <http://jsonpath.herokuapp.com/> to check your work.

1. Write a JsonPath that gets `totalItems` from `meta`
1. Write a JsonPath that gets the whole `contact` object for contacts with at least two galleries
1. Write a JsonPath that gets the `tags` for the `contact` object where the contact name is "Adrastea Shahriar"

A complete submission will:

* Include a JsonPath statement for each of the three questions above

### Source data

Use the JSON data below for the following questions:

```JSON
{
   "meta": {
       "currentPage": 1,
       "totalPages": 1,
       "totalItems": 5,
       "rows": 5
   },
   "contact": [
       {
           "id": 5,
           "name": "Manuel Makarios",
           "email": "mmakarios@gmail.com",
           "tags": ["wedding"],
           "galleriesCount": 2
       },
       {
           "id": 6,
           "name": "Kyriake Žarko",
           "email": "zarkok@yahoo.com",
           "tags": [],
           "galleriesCount": 0
       },
       {
           "id": 7,
           "name": "Tsholofelo Wacława",
           "email": "Tsholofelo@test.com",
           "tags": ["wedding"],
           "galleriesCount": 1
       },
       {
           "id": 8,
           "name": "Adrastea Shahriar",
           "email": "adrastea.shahriar@mail.com",
           "tags": ["wedding", "family"],
           "galleriesCount": 5
       },
       {
           "id": 9,
           "name": "Jacob Klava",
           "email": "jklava7@aol.com",
           "tags": ["graduation", "family"],
           "galleriesCount": 3
       }
   ]
}
```
