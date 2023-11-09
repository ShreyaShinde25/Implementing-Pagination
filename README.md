# Pagination
This repository demonstrates the implementation of pagination using Angular on the front end and Spring Boot on the backend, utilizing a dataset generated from Mockaroo. The application showcases several features and functionalities aimed at efficient data display and retrieval.

## Features
* **Dynamic adjustment of pages:** For example, Displays 10 entities per page from a dataset of 100 users, spanning across 10 pages. Changing the display size to 20 entries per page will dynamically reconfigure the pagination to 5 pages.
* **Disabled navigation buttons:** When the cursor is on the first page, the "previous" button is disabled. Similarly, if the cursor is on the last page, the "next" button is disabled.
* **Search Functionality:** Allows users to search for specific users by name across different pages. Fetches and displays search results efficiently within the pagination structure. 

## Implementation
**Frontend** (*Angular*)
The Angular frontend interacts with the Spring Boot backend to display and navigate through the paginated user data. It leverages Angular's components and services to handle the user interface and communication with the server.

**Backend** (*Spring Boot*)
The Spring Boot backend is responsible for providing paginated user data to the frontend. The RESTful API endpoint /users handles requests for user data, supporting parameters for name search, page number, and display size.

## Dataset 
The dataset of 100 users is generated using Mockaroo and inserted into MySql database, providing realistic data for testing and demonstration purposes.
