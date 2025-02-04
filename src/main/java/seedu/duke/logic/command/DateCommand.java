package seedu.duke.logic.command;

import seedu.duke.logic.exception.IllegalValueException;
import seedu.duke.logic.Parser;
import seedu.duke.records.Calories;
import seedu.duke.records.Record;
import seedu.duke.records.RecordList;
import seedu.duke.records.biometrics.Biometrics;
import seedu.duke.records.exercise.Exercise;
import seedu.duke.records.exercise.ExerciseList;
import seedu.duke.records.food.Food;
import seedu.duke.records.food.FoodList;
import seedu.duke.storage.Storage;
import seedu.duke.ui.Ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DateCommand extends Command {

    public static void sortDateForExercise(ArrayList<Exercise> list) {
        Collections.sort(list, new Comparator<Exercise>() {
            /**
             * This method compares two date strings.
             *
             * @return sorted array list by date.
             */
            public int compare(Exercise e1, Exercise e2) {
                LocalDate o1Date = LocalDate.parse(Parser.getDateNoDateTracker(e1.getDateString()),
                        DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                LocalDate o2Date = LocalDate.parse(Parser.getDateNoDateTracker(e2.getDateString()),
                        DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                return o2Date.compareTo(o1Date);
            }
        });
    }

    public static void sortDateForCalories(ArrayList<Calories> list) {
        Collections.sort(list, new Comparator<Calories>() {
            /**
             * This method compares two date strings.
             *
             * @return sorted array list by date.
             */
            public int compare(Calories c1, Calories c2) {
                LocalDate o1Date = LocalDate.parse(Parser.getDateNoDateTracker(c1.getDate()),
                        DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                LocalDate o2Date = LocalDate.parse(Parser.getDateNoDateTracker(c2.getDate()),
                        DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                return o2Date.compareTo(o1Date);
            }
        });
    }

    public static void sortDateForFood(ArrayList<Food> foodArrayList) {
        Collections.sort(foodArrayList, new Comparator<Food>() {
            @Override
            public int compare(Food f1, Food f2) {
                LocalDate f1Date = LocalDate.parse(Parser.getDateNoDateTracker(f1.getDateString()),
                        DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                LocalDate f2Date = LocalDate.parse(Parser.getDateNoDateTracker(f2.getDateString()),
                        DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                return f2Date.compareTo(f1Date);
            }
        });
    }

    public static void sortDateForAll(ArrayList<Record> recordArrayList) {
        Collections.sort(recordArrayList, new Comparator<Record>() {
            @Override
            public int compare(Record r1, Record r2) {
                LocalDate r1Date = LocalDate.parse(Parser.getDateNoDateTracker(r1.getDateString()),
                        DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                LocalDate r2Date = LocalDate.parse(Parser.getDateNoDateTracker(r2.getDateString()),
                        DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                return r2Date.compareTo(r1Date);
            }
        });
    }


    @Override
    public void execute() throws IllegalValueException {

    }

    @Override
    public void setData(Ui ui, Storage storage, Biometrics biometrics, ExerciseList exerciseList, FoodList foodList,
                        RecordList recordList) {

    }
}
