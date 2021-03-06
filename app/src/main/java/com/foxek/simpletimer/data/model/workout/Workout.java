package com.foxek.simpletimer.data.model.workout;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "trainings")
public class Workout {

    @ColumnInfo(name = "training_name")
    public String training_name;

    @PrimaryKey
    public int uid;

//    @Ignore
    @ColumnInfo(name = "intervalNumber")
    public int intervalNumber;

    public Workout(String training_name, int uid, int intervalNumber) {
        this.training_name = training_name;
        this.intervalNumber = intervalNumber;
        this.uid = uid;
    }

    public String getTraining_name() {
        return training_name;
    }

    public void setTraining_name(String name) {
        this.training_name = name;
    }
}
