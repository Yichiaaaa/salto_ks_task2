

Feature: Site user has access to see the locks 
  


@smoke      
@SiteUser
  Scenario Outline: login as site user and check available locks
    Given login as "<usertype>" with "<email>" and "<password>"
    When on "settings" screen
    Then user can see "<firstname>" "<lastname>" "<email>" and "<usertype>"
    When on "lock" screen 
    Then user can see available locks 
    Then user log out
  


    Examples: 
  | usertype     | firstname | lastname        | email                    |password  |
  | superSiteuser|Test First |Last Name        | qaengineer8888@gmail.com |test12345@|
  | siteuser     |Test second|Second Last Name | qaengineer1111@gmail.com |test12345@|


