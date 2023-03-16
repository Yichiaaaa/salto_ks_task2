

Feature: Invite and create site users
@Regression
@SuperSiteUser
  Scenario Outline: Site super user can create site user allow access of locks
    Given login as "site super user" with "ts@my-clay.com" and "123456Ab"
    When on "peopple" screen 
    Then user click on create user enter "<firstname>", "<lastname>" and click on next user land on "ROLES&RIGHT"
    Then user select "<usertype>", enter "<email>", and click on next user is on "ACCESS GROUP"
    Then user click on invite 
    Then user log out
    
      Examples: 
  | usertype     | firstname | lastname        | email                    |
  | superSiteuser|Test First |Last Name        | qaengineer8888@gmail.com |
  | siteuser     |Test second|Second Last Name | qaengineer1111@gmail.com |

