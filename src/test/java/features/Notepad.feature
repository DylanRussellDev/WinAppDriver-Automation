Feature: Notepad Scenarios

@NotepadTest
Scenario: Launch Notepad app and click on About Notepad
  Given the Notepad app is opened in Windows
  When the Help menu item is opened
  Then click About Notepad
  And click the OK button