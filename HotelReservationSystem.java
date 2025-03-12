import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;


public class HotelReservationSystem {

    private static final String url = "jdbc:mysql://localhost:3306/hotel_database";

    private static final String username = "root";

    private static final String password = "Aman@123";

    public static void main (String [] args) throws ClassNotFoundException, SQLException{

        try{
            Class.forName("com.mysql.jdbc.DriverManager");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());

        }

        try{
            Connection con = DriverManager.getConnection(url, username, password);
            while(true){
                System.out.println();
                System.out.println("Hotel Management System");
                Scanner sc = new Scanner(System.in);
                System.out.println("1. Reserve a room");
                System.out.println("2. View Reservations");
                System.out.println("3. Get Room Number");
                System.out.println("4. Update Reservation");
                System.out.println("5. Delete Reservation");
                System.out.println("0. Exit");
                int choice = sc.nextInt();

                switch(choice) {
                    case 1:
                        reserveRoom(con, sc);
                        break;
                    case 2:
                        viewReservations(con);
                        break;
                    case 3:
                        getRoomNumber(con, sc);
                        break;
                    case 4:
                        updateReservation(con, sc);
                        break;
                    case 5:
                        deleteReservation(con, sc);
                        break;
                    case 0:
                        exit();
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid Choice. Try again");
                }
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }


    }
}
