# Quality Assurance Exercise

# Overview

Here at ShootProof, we prefer to have a good idea of a candidate's technical
experience and analysis skills before proceeding with portions of our recruiting
process.  We believe that the exercises below will illustrate a candidate's
approach to working with technologies and methodologies commonly used in our
QA team here at ShootProof.

# Guidelines

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
    * If working with ShootProof directly, deliver to <careers+qa@shootproof.com>.
  * Fork our repository and open a pull request.

# Exercise: Testing a product backlog item as a scrum development team member

* It's your first week at ShootProof. Your cross-functional scrum team, which includes specialists in design and sotware engineering, has refined and planned a user story. Unfortunately you've missed these working meetings.
* Here's what they've recorded:
___
## User story: As a studio, I want to sign up my studio for a shootproof trial.

>Acceptance Criteria:
>* Fast, correctly, and with no training

>Value Path:
>
>Photographer learns about ShootProof -> Visits shootproof.com -> **Signs up for trial** -> Tries the product -> Purchases plan

>Dev team notes:
>* API needs updates to include trial duration period
>* Frontend needs to update fonts and images for signup page
>* Designs are not finalized, but will need to be consistent with the rest of the site
>* Testing should include at least some automation, so we always know new studios can sign up
>* Testing should include regression of regular login

___

## Your task

### Answer the following questions

* What are some questions you'd ask your team to ensure test coverage?
  * Who would you ask each of these questions? All scrum team members are available.
  * Make assumptions about the answers you'd get. Note your assumptions. 
* Once you determine how to facilitate test coverage, given your assumptions,
  * How would you communicate your plan?
  * How would you accomplish execution of that plan?


### Automate the following test case 

Provide an automated test case to check that a visitor to <https://www.shootproof.com> can proceed to the Signup screen.  Use the tool and language of your choice (Selenium, etc.).

A complete submission will:

* Load <https://www.shootproof.com/>
* Click one of the "Get Started" buttons
* Check that the ShootProof signup form appears (check the URL, the page contents, or both as you see fit)
  * The test should fail if your check(s) are not met (i.e., use assertions)
* Explain why you chose the language and framework that you did
* If the code and approach is not obvious, describe the approach and decisions
  made

In the event that you cannot provide working code, please provide a written
description of how you would locate and click this button.  Pseudocode is acceptable,
but working code is preferred.

# (Optional) Exercise: JsonPath

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
