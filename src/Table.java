import java.util.HashMap;
import java.util.Map;

public class Table {
    public int seats;
    public String description;
    private Map<Integer, Boolean> tables;

    public Table(Table[] tableNumber, int seats, String description) {
        this.seats = seats;
        this.description = description;
    }
    public void tableNumber(int numberOfTables) {
        tables = new HashMap<>();
        for (int i = 1; i <= numberOfTables; i++) {
            tables.put(i, true);
        }
    }
    public boolean bookTable(int tableNumber) {
        if (isAvailable(tableNumber)) {
            tables.put(tableNumber, false); 
            return true;
        }
        return false;
    }

    public boolean isAvailable(int tableNumber) {
        return tables.getOrDefault(tableNumber, false);
    }

    
}
