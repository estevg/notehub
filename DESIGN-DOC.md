# NoteHub

Link: [Link to this doc](#)

Author(s): Esteban Vega

Status: [Draft, Ready for review, In Review, Reviewed]

Last Updated: 2023-06-21

## Contents

- Goals
- Non-Goals
- Background
- Overview
- Detailed Design
  - Solution 1
    - Frontend
    - Backend
  - Solution 2
    - Frontend
    - Backend
- Functional requirements
- Technical requirements
- Considerations
- Metrics

## Links

## Objective

The goal of the project is to develop a notes application for the Android platform using the Kotlin programming language. The application will follow the MVVM (Model-View-View Model) architecture and will use the Room library for data persistence. In addition, sync functionality will be integrated with Google to allow users to have a backup of their notes in the cloud. Access to the application will be through a login using the Google account.

## Goals

- Provide users with an intuitive and easy to use notes application on Android devices.

- Implement an MVVM architecture to ensure clear separation of responsibilities and easy maintainability of the code.

- Use the Room library to store and manage notes in a local database.

- Implement synchronization with Google to allow users to back up their notes and access them from multiple devices.

- Integrate Google login for secure and convenient authentication.

## Non-Goals

The implementation of additional functionalities other than note management and synchronization with Google is not contemplated.

## Background

## Overview

## Detailed Design

[First proposal](https://www.figma.com/community/file/1090245813253623841)

[Second proposal](https://www.figma.com/community/file/1014161465589596715)

### Solution 1

#### Frontend

#### Backend

### Solution 2

#### Frontend

#### Backend

## Functional requirements

- Google login screen for secure user authentication.

- Main screen of the application showing the list of existing notes.

- Functionality to create, read, update and delete notes.

- Note detail screen showing the full content of a selected note.

- Auto sync option with Google Drive to backup and restore user's notes.

- Option to enable or disable automatic synchronization.

- Ability to search for notes by title or content.

- Option to sort notes by date created or modified.

- Option to customize the application theme.

## Technical requirements

- The application must be developed using the Kotlin programming language.

- The application must follow the MVVM architecture.

- The application must use the Room library for data persistence.

- The application must use the Google Drive API to implement synchronization with Google.

- The application must use the Google Sign-In API to implement user authentication.

- Use of Material Design for a modern and consistent user interface.

## Considerations

- Ensure privacy and security of user data during synchronization with Google.

- Perform extensive testing on different devices and connection scenarios to ensure optimal application performance.

- Design an intuitive and attractive user interface to enhance the user experience.

## Metrics

- Measure application response time and performance.

- Track the success rate of synchronization with Google.

- Collect user feedback on the usability and functionality of the application for future improvements.
