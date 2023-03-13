package com.example.practicalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAddClock(View view) {

        ContentValues values = new ContentValues();

        values.put(ClockContentProvider.name, ((EditText) findViewById(R.id.clockName)).getText().toString());
        values.put(ClockContentProvider.price, ((EditText) findViewById(R.id.clockPrice)).getText().toString());

        getContentResolver().insert(ClockContentProvider.CONTENT_URI, values);

        Toast.makeText(getBaseContext(), "New Record Inserted", Toast.LENGTH_LONG).show();
    }

    @SuppressLint("Range")
    public void onClickRetrieveClocks(View view) {
        String URL = "content://com.example.practicalexam/clocks";

        Uri clocks = Uri.parse(URL);
        Cursor cursor = getContentResolver().query(clocks, null, null, null, null);
//        Cursor c = managedQuery(clocks, null, null, null, "id");

        if (cursor.moveToFirst()) {
            do{
                Toast.makeText(this,
                        cursor.getString(cursor.getColumnIndex(ClockContentProvider.id)) +
                                ", " +  cursor.getString(cursor.getColumnIndex( ClockContentProvider.name)) +
                                ", " + cursor.getString(cursor.getColumnIndex( ClockContentProvider.price)),
                        Toast.LENGTH_SHORT).show();
            } while (cursor.moveToNext());
        }
    }
}