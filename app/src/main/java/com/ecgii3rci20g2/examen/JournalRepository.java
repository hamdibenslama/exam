package com.ecgii3rci20g2.examen;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;


    public class JournalRepository {

        private JournaleDao mJournalDao;
        private LiveData<List<Journale>> mAllJournale;

        JournalRepository(Application application) {
            JournalRoomDatabase db = JournalRoomDatabase.getDatabase(application);
            mJournalDao = db.journalDao();
            mAllJournale = mJournalDao.getAllJournale();
        }

        LiveData<List<Journale>> getAllJournals() {
            return mAllJournale;
        }

        public void insert (Journale Journale) {
            new insertAsyncTask(mJournalDao).execute(Journale);
        }

        private static class insertAsyncTask extends AsyncTask<Journale, Void, Void> {

            private JournaleDao mAsyncTaskDao;

            insertAsyncTask(JournaleDao dao) {
                mAsyncTaskDao = dao;
            }

            @Override
            protected Void doInBackground(final Journale... params) {
                mAsyncTaskDao.insert(params[0]);
                return null;
            }
        }
        private static class deleteAllJournalsAsyncTask extends AsyncTask<Void, Void, Void> {
            private JournaleDao mAsyncTaskDao;

            deleteAllJournalsAsyncTask(JournaleDao dao) {
                mAsyncTaskDao = dao;
            }

            @Override
            protected Void doInBackground(Void... voids) {
                mAsyncTaskDao.deleteAll();
                return null;
            }
        }
        public void deleteAll()  {
            new deleteAllJournalsAsyncTask(mJournalDao).execute();
        }

    }

