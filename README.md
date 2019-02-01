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

* This exercise should not take you more than two or three hours to complete. If
  your solution is taking longer, that's okay—be honest and let us know how long
  it took and why you think it took that long.
* Be as thorough as you wish.
* All exercises are to be performed as if you were on the job.
* You may submit your response in one of the following ways:
  * Package an archive (ZIP, tarball, etc.) of your files and deliver it to
    your contact.
    * If working with a recruiter, deliver it to them.
    * If working with ShootProof directly, deliver to <careers+qa@shootproof.com>.
  * Fork our repository and open a pull request.


## Exercise 1: Test plan

Below you will find two key inputs for this exercise:

* An actual screenshot of the contact edit page a photographer would use when
  editing a contact within ShootProof's Studio Panel
* Acceptance criteria for the contact edit view

These materials are representative of what you would be working with in our QA
team.  A business analyst would have written the acceptance criteria, and
a developer would have implemented the contact edit page to meet its
requirements.

As a member of our QA team, you would be responsible to confirming that this
particular view meets its requirements and functions in a manner free of
defects.

Given these inputs, draft up a test plan for testing the contact edit view.
You may use any format and structure; whatever is familiar and representative
of your work style.

## Exercise 2: Test automation

You’ve been tasked to write automated tests that check the behavior of the ShootProof
marketing site home page. There’s a “GET STARTED” button on
https://www.shootproof.com/ that you’ll need to click.

### Locating the "Get Started" button

Using the automation tool/language of your choice, how would you locate that button?
Please note what tool/language your solution uses.

### Locating the _other_ "Get Started" button

How would you locate the other “GET STARTED” button, which appears at the bottom of the page?

## (Optional) Exercise 3: JsonPath

ShootProof is using Karate for API testing. Part of this work is writing JsonPath selectors
(https://github.com/json-path/JsonPath#filter-operators) to select a particular part of a
JSON object. (The concept should be familiar if you’ve used relative XPath.)

### Source data

Use the JSON data below for the following questions:

```
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

### Questions

Complete the following exercises using the JSON below. You may use http://jsonpath.herokuapp.com/ to check your work.

* Write a JsonPath that gets `totalItems` from `meta`.
* Write a JsonPath that gets the whole contact object for contacts with at least 2 galleries
* Write a JsonPath that gets the tags for the contact object where the contact name is "Adrastea Shahriar"
