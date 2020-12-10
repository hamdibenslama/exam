package com.ecgii3rci20g2.examen;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class JournalListAdapter extends RecyclerView.Adapter<JournalListAdapter.JournalViewHolder> {

        private final LayoutInflater mInflater;
        private List<Journale> mJournals; // Cached copy of Journals

        JournalListAdapter(Context context) { mInflater = LayoutInflater.from(context); }

        @Override
        public JournalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
            return new JournalViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(JournalViewHolder holder, int position) {
            if (mJournals != null) {
                Journale current = mJournals.get(position);
                holder.JournalItemView.setText(current.getMid());
            } else {
                // Covers the case of data not being ready yet.
                holder.JournalItemView.setText("No Journal");
            }
        }

        void setJournals(List<Journale> Journals){
            mJournals = Journals;
            notifyDataSetChanged();
        }

        // getItemCount() is called many times, and when it is first called,
        // mJournals has not been updated (means initially, it's null, and we can't return null).
        @Override
        public int getItemCount() {
            if (mJournals != null)
                return mJournals.size();
            else return 0;
        }

        class JournalViewHolder extends RecyclerView.ViewHolder {
            private final TextView JournalItemView;

            private JournalViewHolder(View itemView) {
                super(itemView);
                JournalItemView = itemView.findViewById(R.id.textView);
            }
        }
    }

