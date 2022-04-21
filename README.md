## Problem Description

The year is 2050 and the world as we know it has been taken over by robots. Created as once friendly robots, have now turned against humankind, especially software engineers like yourself. Their mission is to transform everyone into mindless zombies for their entertainment. You as a resistance member (and the last survivor who knows how to code), was designated to develop a system to meet the following requirements.

## Requirements

You will develop a ***REST API*** (yes, we care about architecture design even in the midst of a robot apocalypse!) which will store information about the survivors, as well as the resources they own.

In order to accomplish this, the API must fulfil the following use cases:


- **Add survivors to the database**

  A survivor must have a **name**, **age**, **gender**, **ID** and **last location** (latitude, longitude).

  A survivor also has an inventory of resources (which you need to declare upon the registration of the survivor). This can include Water, Food, Medication and Ammunition.


- **Update survivor location**

  A survivor must have the ability to update their last location, storing the new latitude/longitude pair in the base (no need to track locations, just replacing the previous one is enough).

- **Flag survivor as infected**

  In a chaotic situation like this, it's inevitable that a survivor may get transformed into a zombie. When this happens, we need to flag the survivor as infected.
  
  A survivor is marked as infected when at least three other survivors report their contamination.

- **Connect to the Robot CPU system**
  Connect to the robot CPU system to get a list of all robots and their known locations. Robots have two categories (Flying robots and land robots). You need to sort this information in a meaningful and intuitive way for humans to understand and process. You can use this link to get the list of robots

  `
  https://robotstakeover20210903110417.azurewebsites.net/robotcpu
  `

- **Reports**

  The API must also provide the following information:

    - Percentage of infected survivors.
    - Percentage of non-infected survivors.
    - List of infected survivors
    - List of non-infected survivors
    - List of robots

## Notes

 - No authentication is needed.
 - We still care about proper programming and architecture techniques; you must showcase that you're worthy of surviving the robot apocalypse through the sheer strength of your skills.
 - Don't forget to make at least a minimal documentation of the API endpoints and how to use them.
 - From the problem description above you can either do a very bare bones solution or add optional features that are not described.
 - Once done, please check this into a GitHub repo. Please ensure that you have a 
comprehensive readme that details how to run the application.
---------------------------------------

# Solution
In order to accomplish this challenge, I decided to use Spring boot + Rest Api option. 

## How to get started
After cloning the repository, import the project in any IDE and run below class  

>  Run **RobotApocalypseApplication.java** which is under package com.robot.apocalypse in any IDE (Eclipse, Intellij, STS)
  
# API endpoints documention:

| TYPE         | Endpoint                                  | Result |
|--------------|-------------------------------------------|----------| 
| GET      | /api/survivors/                           | Return all survivors |
| GET      | /api/survivors/{id}                       | Return survivors of id |
| POST       | /api/survivors/register                   | Creates a new survivor |
| PUT | /api/survivors/{id}/location              | Updates a survivor's location |
| PUT | /api/survivors/{id}/reportInfection/{id2} | The second survivor reports the first one as infected |
| GET | /survivors/reports                        | Reports the percentage of infected, percentage of non infected, list of infected, list of non infected survivors and List of Robot |


Example of a request to create a survivor:
```
{
    "name": "Akhil",
    "age": 29,
    "gender": "Male",
    "location": {
      "latitude": 30.7333,
      "longitude": 76.7794
    },
    "resources": {
      "water": 5,
      "ammunition": 500,
      "medication": 4,
      "food": 10
    }
}
```

# Postman collection file for above APIs
The postman collection file contains in the project directory. Refer the file name below :
> Robot-Appocalypse-App.postman_collection.json