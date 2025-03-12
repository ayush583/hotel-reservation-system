# Hotel Reservation System

## Overview
A simple Java-based console application for managing hotel room reservations using MySQL.

## Features
- Reserve, view, update, and delete reservations.
- Retrieve room numbers by reservation ID.
- Graceful exit system.

## Technologies Used
- Java (JDBC for database connectivity)
- MySQL (Database storage)

## Database Setup
Create the `reservations` table:
```sql
CREATE TABLE reservations (
    reservation_id INT AUTO_INCREMENT PRIMARY KEY,
    guest_name VARCHAR(255) NOT NULL,
    room_number INT NOT NULL,
    contact_number VARCHAR(20) NOT NULL,
    reservation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

## Installation & Usage
1. Clone the repo:
   ```sh
   git clone https://github.com/yourusername/HotelReservationSystem.git
   ```
2. Configure MySQL credentials in `HotelReservationSystem.java`.
3. Compile and run:
   ```sh
   javac HotelReservationSystem.java
   java HotelReservationSystem
   ```

## Future Enhancements
- GUI implementation
- User authentication
- Improved error handling

## Author
Ayush Vahane

