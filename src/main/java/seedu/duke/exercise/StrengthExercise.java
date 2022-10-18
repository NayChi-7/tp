package seedu.duke.exercise;

public class StrengthExercise extends Exercise {
    private int set;

    public StrengthExercise(String exerciseName, int set, int repetitions, int caloriesBurnt) {
        super(exerciseName, repetitions, caloriesBurnt);
        this.set = set;
    }

    @Override
    public int getSet() {
        return set;
    }

    @Override
    public String saveExercise() {
        return "strength /" + getExerciseName() + " /"
                + getSet() + " /" + getRepetition() + " /" + getCaloriesBurnt() + " | " + getTaskStatusInNumber();
    }

    @Override
    public String toString() {
        return "Strength Exercise: " + getExerciseName() + System.lineSeparator()
                + "Sets: " + getSet() + System.lineSeparator()
                + "Repetitions: " + getRepetition() + System.lineSeparator()
                + "Calories Burnt: " + getCaloriesBurnt() + System.lineSeparator()
                + String.format("Status: %s", getTaskStatus());
    }
}