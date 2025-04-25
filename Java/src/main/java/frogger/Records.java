package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactored Records class that uses FroggerID record
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record using FroggerID
     * 
     * @param id The FroggerID record to add
     * @return false if record exists, true if added successfully
     */
    public boolean addRecord(FroggerID id) {
        if (records.contains(id)) {
            return false;
        }
        records.add(id);
        return true;
    }

    /**
     * Alternative method that creates FroggerID from components
     * (Kept for backward compatibility if needed)
     */
    public boolean addRecord(String firstName, String lastName, String phoneNumber,
                           String zipCode, String state, String gender) {
        return addRecord(new FroggerID(firstName, lastName, phoneNumber, 
                                     zipCode, state, gender));
    }
}