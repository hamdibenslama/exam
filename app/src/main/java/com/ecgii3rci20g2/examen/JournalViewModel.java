package com.ecgii3rci20g2.examen;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;




    public class JournalViewModel extends AndroidViewModel {

        private JournalRepository mRepository;

        private LiveData<List<Journale>> mAllJournale;

        public JournalViewModel (Application application) {
            super(application);
            mRepository = new JournalRepository(application);
            mAllJournale = mRepository.getAllJournals();
        }

        LiveData<List<Journale>> getAllJournale() { return mAllJournale; }

        public void insert(Journale Journale) { mRepository.insert(Journale); }
    }



