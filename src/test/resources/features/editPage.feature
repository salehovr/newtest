@page_editor @smoke

Feature: Edit page functionality
  As a user, I should be able to edit page

  Scenario Outline: User can select body text sizes
    Given User is on page editor page
    When User adds random text
    And Selects body text as "<selected text style>"
    Then User should see "<expected text style>" as a result

    Examples:
    | selected text style | expected text style |
    | Large Heading       | h2                  |
    | Regular Heading     | h3                  |
    | Small Heading       | h4                  |
    | Extra Small Heading | h5                  |
    | Body Text           | p                   |
    | Quoted Text         | blockquote          |





