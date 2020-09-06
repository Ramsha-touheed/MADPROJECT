package com.example.medicine.alarm;

import com.ramsha.medicinetime.BasePresenter;
import com.ramsha.medicinetime.BaseView;
import com.ramsha.medicinetime.data.source.History;
import com.ramsha.medicinetime.data.source.MedicineAlarm;


public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
