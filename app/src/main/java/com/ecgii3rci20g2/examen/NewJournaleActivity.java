package com.ecgii3rci20g2.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewJournaleActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.android.Examen.REPLY";

    private EditText mEditJournalView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_journale);
        mEditJournalView = findViewById(R.id.edit_journal);

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(mEditJournalView.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String Journal = mEditJournalView.getText().toString();
                    replyIntent.putExtra(EXTRA_REPLY, Journal);
                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }
        });
    }
}