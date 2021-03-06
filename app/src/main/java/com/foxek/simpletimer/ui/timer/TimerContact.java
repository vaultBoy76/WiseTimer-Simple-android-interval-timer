package com.foxek.simpletimer.ui.timer;

import com.foxek.simpletimer.ui.base.MvpPresenter;
import com.foxek.simpletimer.ui.base.MvpView;

import io.reactivex.Observable;
import io.reactivex.Single;

interface TimerContact {
    interface View extends MvpView {

        void startWorkoutActivity();

        void showPauseInterface();

        void showPlayInterface();

        void showCurrentCounter(String time);

        void showCounterType(int type);

        void showCounterNumber(String number);

    }

    interface Presenter extends MvpPresenter<TimerContact.View> {

        void prepareIntervals(int workoutId);

        void pauseButtonPressed();

        void resetButtonPressed();
    }

    interface Interactor {

        Single<Integer> fetchIntervalList(int workoutId);

        Observable<Integer> IntervalFinishedCallback();

        Observable<Integer> onTickCallback();

        boolean getTimerState();

        int getIntervalSize();

        void setTimerState(boolean timerState);

        void loadIntervalListToTimer();

        void continueTimer();

        void stopTimer();

        void indicateEndOfWorkout();

        void indicateEndOfInterval();

        void indicateLastSeconds();
    }
}
